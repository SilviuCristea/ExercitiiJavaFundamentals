package business.service;

import business.dto.PersonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import persistence.dao.PersonDAO;
import persistence.entities.Person;

@Service
public class PersonService {

    @Autowired
    PersonDAO personDAO;

    public void insert(PersonDTO personDTO){
        Person person = new Person();
        person.setName(personDTO.getName());
        person.setFirstName(personDTO.getFirstName());
        person.setYearOfBirth(personDTO.getYearOfBirth());
        personDAO.insert(person);
    }
}
