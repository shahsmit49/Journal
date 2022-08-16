package service;

import org.hibernate.Session;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactory {

	static Session sessionObj;
    static org.hibernate.SessionFactory sessionFactoryObj;
 
    public static org.hibernate.SessionFactory buildSessionFactory() {
        // Creating Configuration Instance & Passing Hibernate Configuration File
//        Configuration configObj = new Configuration();
//        configObj.configure("hibernate.cfg.xml");
 
        // Since Hibernate Version 4.x, ServiceRegistry Is Being Used
//        ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build(); 
// 
//        // Creating Hibernate SessionFactory Instance
//        sessionFactoryObj = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(serviceRegistryObj);
//        
//        return sessionFactoryObj;
        
        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder() .configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
        return metadata.getSessionFactoryBuilder().build();
    }
    
}
