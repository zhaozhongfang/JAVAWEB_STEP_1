package csii.com.cn.test;

import csii.com.cn.dao.UserDao;
import csii.com.cn.domain.User;
import org.junit.Test;

public class TestConnection {

    @Test
    public void test(){
        User user = new User();
        user.setUserName("张三");
        user.setPassword("123456");
        UserDao userDao = new UserDao();
        User testUser = userDao.getConnection(user);
        System.out.println(testUser);
<<<<<<< HEAD
        System.out.println("345234524244322343");
        System.out.println("3333");
=======
        System.out.println("12312312");

>>>>>>> 798d70b7204f1a663d38eeebddb1ecb23b9f601e
    }
}
