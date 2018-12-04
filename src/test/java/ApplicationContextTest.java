import com.withing.photographer.domain.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
import org.junit.*;

import java.io.*;
import java.sql.*;


public class ApplicationContextTest {

    Configuration configuration = new Configuration().configure();
    SessionFactory factory = configuration.buildSessionFactory();
    Session session = null;
    Transaction transcation = null;

    @Test
    public void PictureTest(){

        Picture picture = new Picture();
        picture.setBelongsId(1000005);
        picture.setPicturePath("123");
        picture.setCreateTime(new Date(System.currentTimeMillis()));
        try {
            session = factory.openSession();
            transcation = session.beginTransaction();
            Serializable object = session.save(picture);
            //提交事务
            transcation.commit();
        } catch (Exception e) {
            transcation.rollback();
            e.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }
    }

    @Test
    public void UserTest() {

        User user = new User();
        user.setName("withing");
        user.setPassword("asd6662580");
        user.setEmail("15601222722@163.com");
        user.setPhoneNumber("15601222722");
        user.setCreateTime(new Timestamp(System.currentTimeMillis()));
        user.setUseType(UserType.admin);

        //获取会话对象
        try {

            session = factory.openSession();
            transcation = session.beginTransaction();

            //打开事务:Hibernate默认数据操作是不提交事务的，所以我们要手动提交事务。

            //保存对象，持久化操作
            Serializable object = session.save(user);
//            User object = (User) session.save(user);
//            Integer id = object.getId();
//            User usp = session.get(User.class, object);

            //提交事务
            transcation.commit();
        } catch (Exception e) {
            transcation.rollback();
            e.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }

    }

}
