package com.ljnpng.annotation;

import com.ljnpng.annotation.annotation.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @Classname TableCreator
 * @Description Student注解处理器
 * @Author liaojp
 * @Date 2020/10/23 16:35
 */
public class TableCreator {
    private static final String CLASS_NAME = "com.ljnpng.annotation.dto.Student";

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName(CLASS_NAME);
        DBTable annotation = aClass.getAnnotation(DBTable.class);

        String tableName = annotation.value();
        if (tableName.length() < 1) {
            tableName = aClass.getSimpleName().toUpperCase();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE ").append(tableName).append(" (");
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            StringBuilder columnName = new StringBuilder();
            Annotation[] annotations = field.getAnnotations();
            if (annotations.length < 1) {
                continue;
            }

            if (annotations[0] instanceof SqlString) {
                SqlString sStr = (SqlString) annotations[0];
                columnName.append("\n ").append(sStr.name().length() < 1 ? field.getName() : sStr.name())
                        .append(" VARCHAR2(").append(sStr.value()).append(")")
                        .append(getConstraints(sStr.constraints()));
            } else if (annotations[0] instanceof SqlInteger) {
                SqlInteger sInt = (SqlInteger) annotations[0];
                columnName.append("\n ").append(sInt.name().length() < 1 ? field.getName() : sInt.name())
                        .append(" NUMBER")
                        .append(getConstraints(sInt.constraints()));
            } else if (annotations[0] instanceof SqlChar) {
                SqlChar sCh = (SqlChar) annotations[0];
                columnName.append("\n ").append(sCh.name().length() < 1 ? field.getName() : sCh.name())
                        .append(" CHAR")
                        .append(getConstraints(sCh.constraints()));
            } else if (annotations[0] instanceof SqlDate) {
                SqlDate sDate = (SqlDate) annotations[0];
                columnName.append("\n ").append(sDate.name().length() < 1 ? field.getName() : sDate.name())
                        .append(" DATE")
                        .append(getConstraints(sDate.constraints()));
            }

            sb.append(columnName).append(",");

        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(");");
        System.out.println(sb);
    }

    private static String getConstraints(Constraints constraints) {
        StringBuilder sb = new StringBuilder();
        if (!constraints.allowNull()) {
            sb.append(" NOT NULL");
        }
        if (constraints.primaryKey()) {
            sb.append(" PRIMARY KEY");
        }
        if (constraints.unique()) {
            sb.append(" UNIQUE");
        }
        return sb.toString();
    }
}
