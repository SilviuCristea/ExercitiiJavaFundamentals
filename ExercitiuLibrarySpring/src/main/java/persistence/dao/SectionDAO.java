package persistence.dao;

import org.hibernate.Session;
import config.HibernateUtil;
import org.springframework.stereotype.Repository;
import persistence.entities.Section;

@Repository
public class SectionDAO {
    public void insert(Section section){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(section);
        session.getTransaction().commit();
        session.close();

    }
}
