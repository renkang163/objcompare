package com.rk.serviceImpl;

import com.rk.beans.ColumnBase;
import com.rk.exception.BusinessServiceException;
import com.rk.service.ObjService;

import java.lang.reflect.Field;

/**
 * @PackgeName: com.rk.serviceImpl
 * @ClassName: ObjServiceImpl
 * @Author: renkang
 * Date: 2020/7/3 16:34
 * project name: objcompare
 * @Version:
 * @Description:
 */
public class ObjServiceImpl implements ObjService {


    @Override
    public String changeData(Object sourceobj, Object newobj) {
        Class sourceClazz = sourceobj.getClass();
        Class newClazz = newobj.getClass();

        if (!sourceClazz.getName().equals(newClazz.getName())) {
            System.out.println("source:" + sourceClazz.getName());
            System.out.println("new:" + newClazz.getName());
            System.out.println("两个类不一致!");
            throw new BusinessServiceException(10001, "两个类不一致");
        }

        StringBuilder builder = new StringBuilder();
        Field[] fields = sourceobj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            ColumnBase columnBase = field.getAnnotation(ColumnBase.class);
            Object valueObj1 = null;
            Object valueObj2 = null;
            if (columnBase != null) {
                try {
                    valueObj1 = field.get(sourceobj);
                    valueObj2 = field.get(newobj);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                if (valueObj1 == null) {
                    valueObj1 = "";
                }
                if (valueObj2 == null) {
                    valueObj2 = "";
                }
                if (!valueObj1.equals(valueObj2)) {
                    builder.append("{" + columnBase.columnName() + "}" + "[" + valueObj1 + "]->[" + valueObj2 + "] ");
                }
            }
        }
        return builder.toString();
    }
}
