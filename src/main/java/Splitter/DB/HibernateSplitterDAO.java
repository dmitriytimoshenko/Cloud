package Splitter.DB;

import Splitter.DAO.SplitterDAO;
import Splitter.entity.Splitter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class HibernateSplitterDAO implements SplitterDAO {


    private SessionFactory sessionFactory;

    @Autowired
    public HibernateSplitterDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }


    @Transactional
    public void addSplitter(Splitter splitter) {

        currentSession().save(splitter);
    }
}
