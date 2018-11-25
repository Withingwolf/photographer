import com.withing.config.*;
import com.withing.domain.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.junit.*;
import org.springframework.context.*;
import org.springframework.context.annotation.*;
import org.springframework.orm.hibernate5.*;


public class ApplicationContextTest {

    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory factory = configuration.buildSessionFactory();
//        ServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
//        Metadata metadata = new MetadataSources(registry).buildMetadata();
//        SchemaExport export = new SchemaExport();
//        export.create(EnumSet.of(TargetType.DATABASE), metadata);

//        StandardServiceRegistry sr = new StandardServiceRegistryBuilder().configure().build();
//        SessionFactory factory = new MetadataSources(sr).buildMetadata().buildSessionFactory();
//        new SchemaExport(configuration).create(true, true);


        Session session = null;
        Transaction transcation = null;
        User userasd = new User();
        userasd.setName("withing");
        userasd.setPsw("asd6662580");
        try {
            //获取会话对象
            session = factory.openSession();
            //打开事务:Hibernate默认数据操作是不提交事务的，所以我们要手动提交事务。
//            transcation = session.beginTransaction();
            //保存对象，持久化操作
            session.save(userasd);

            //提交事务
//            transcation.commit();
        } catch (Exception e) {
            e.printStackTrace();
            //事务回滚
            transcation.rollback();
        } finally {
            session.close();
        }
    }

    @Test
    public void applicationtest() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HibernateConfig.class);
        LocalSessionFactoryBean localSessionFactoryBean = ctx.getBean(LocalSessionFactoryBean.class);
        org.hibernate.cfg.Configuration configuration = new Configuration().configure();
        System.out.println(configuration);
        System.out.println(localSessionFactoryBean);
    }
}
