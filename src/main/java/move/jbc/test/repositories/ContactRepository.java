package move.jbc.test.repositories;

import move.jbc.test.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>
//implements ContactDAO
{

    List<Contact> findByFirstname(String firstName);
//    List<Contact> findByFirstname(String firstName);
//    List<Contact> findByfirstName(String firstName);

//    private SessionFactory sessionFactory;
//    @Autowired
//    public ContactRepository(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }

//    @PersistenceContext
//    private EntityManager em;
//    public void saveCustomer(Contact customer) {
//        em.persist(customer);
//    }


}
