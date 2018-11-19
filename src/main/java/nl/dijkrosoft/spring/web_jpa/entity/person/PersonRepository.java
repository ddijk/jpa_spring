package nl.dijkrosoft.spring.web_jpa.entity.person;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}
