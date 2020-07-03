package com.rk.beans;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @PackgeName: com.rk.beans
 * @ClassName: ColumnBase
 * @Author: renkang
 * Date: 2020/6/29 13:31
 * project name: objcompare
 * @Version:
 * @Description:
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ColumnBase {
    public String columnName();
}
