package nl.dijkrosoft.spring.web_jpa.entity;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
