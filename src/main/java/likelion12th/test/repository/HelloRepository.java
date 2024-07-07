package likelion12th.test.repository;


import jakarta.persistence.EntityManager;
import likelion12th.test.domain.Hello;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class HelloRepository {

    private final EntityManager em;

    public Hello addHello(Hello hello) {
        em.persist(hello);
        return hello;
    }

    public Hello getHello(Long id) {
        try {
            return em.createQuery("SELECT h FROM Hello h WHERE h.id = :id", Hello.class).setParameter("id", id).getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
}
