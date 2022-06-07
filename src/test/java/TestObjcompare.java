import com.rk.beans.People;
import com.rk.service.ObjService;
import com.rk.serviceImpl.ObjServiceImpl;
import org.junit.Test;

/**
 * @PackgeName: PACKAGE_NAME
 * @ClassName: TestObjcompare
 * @Author: renkang
 * Date: 2020/7/3 16:42
 * project name: objcompare
 * @Version:
 * @Description:
 */
public class TestObjcompare {

    @Test
    public void testPeople() {
        People p1 = new People(1, "张三");
        People p2 = new People(2, "李四");

        ObjService objService = new ObjServiceImpl();
        String mark = objService.changeData(p2, p1);
        System.out.println(mark);
    }
}
