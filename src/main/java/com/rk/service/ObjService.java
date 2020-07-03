package com.rk.service;

/**
 * @PackgeName: com.rk.service
 * @ClassName: ObjService
 * @Author: renkang
 * Date: 2020/7/3 16:35
 * project name: objcompare
 * @Version:
 * @Description:
 */
public interface ObjService {
    // 变化属性
   String changeData(Object sourceobj, Object newobj);
}
