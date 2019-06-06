package Splitter.DB;

import Splitter.DAO.SplitterDAO;
import Splitter.entity.Splitter;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository("JPAsplitterDAO")
public class JPASplitterDAO implements SplitterDAO {

    @PersistenceContext(unitName = "splitterPU")
    private EntityManager em;

    @Transactional("transactionManagerJPA")
    public void addSplitter(Splitter splitter) {
        em.persist(splitter);
    }
}
