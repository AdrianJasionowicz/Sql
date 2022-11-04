package pl.twojstary.demo;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface SoczekRepository extends CrudRepository<Soczek, Integer> {

    List<Soczek> findAll();
}
