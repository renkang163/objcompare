package com.rk.beans;

/**
 * @PackgeName: com.rk.beans
 * @ClassName: People
 * @Author: renkang
 * Date: 2020/7/3 16:42
 * project name: objcompare
 * @Version:
 * @Description:
 */
public class People {
    @ColumnBase(columnName = "序号")
    private int id;
    @ColumnBase(columnName = "姓名")
    private String name;

    public People(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
