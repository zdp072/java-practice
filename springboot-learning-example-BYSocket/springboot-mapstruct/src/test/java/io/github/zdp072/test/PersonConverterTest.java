package io.github.zdp072.test;

import io.github.zdp072.converter.PersonConverter;
import io.github.zdp072.dataobject.Person;
import io.github.zdp072.dataobject.User;
import io.github.zdp072.dto.PersonDTO;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PersonConverterTest {

    @Test
    public void test() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Person person = new Person(1L, "zhige", "zhige.me@gmail.com", new Date(), new User(1));
        PersonDTO personDTO = PersonConverter.INSTANCE.domain2dto(person);
        assertNotNull(personDTO);
        assertEquals(personDTO.getId(), person.getId());
        assertEquals(personDTO.getName(), person.getName());
        assertEquals(personDTO.getBirth(), person.getBirthday());
        String format = sdf.format(personDTO.getBirth());
        assertEquals(personDTO.getBirthDateFormat(), format);
        assertEquals(personDTO.getBirthExpressionFormat(), format);

        List<Person> people = new ArrayList<>();
        people.add(person);
        List<PersonDTO> personDTOs = PersonConverter.INSTANCE.domain2dto(people);
        assertNotNull(personDTOs);
    }

}