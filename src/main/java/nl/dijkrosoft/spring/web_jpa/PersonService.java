package nl.dijkrosoft.spring.web_jpa;

import nl.dijkrosoft.spring.web_jpa.entity.person.Person;
import nl.dijkrosoft.spring.web_jpa.entity.person.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("/person")
    public Person getPerson() {

        final Iterable<Person> all = personRepository.findAll();

        if (all.iterator().hasNext()) {

            return all.iterator().next();
        } else {

            Person p = new Person("Nobody", 45);
            return p;
        }
    }

    @GetMapping("/persons")
    public List<Person> getAllPersons() {

        final Iterable<Person> all = personRepository.findAll();

        List<Person> allPersons = new ArrayList<>();

        all.forEach(allPersons::add);

        return allPersons;
    }

    @PostMapping("/person")
    public Person create(@RequestBody Person p) {

        return personRepository.save(p);
    }

    @DeleteMapping("/person")
    public void delete(@RequestBody Person p) {
        personRepository.delete(p);
    }

    @PutMapping
    public void update(@RequestBody Person p) {
        personRepository.save(p);
    }
}
