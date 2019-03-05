package io.zipcoder.interfaces;

import java.util.ArrayList;

public class People {
    ArrayList<Person> personList;

    public People() {
        personList = new ArrayList<Person>();
    }

    public void add(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        Person returnPerson = null;
        for (Person person: personList
             ) {
            if(person.getId() == id) {
                returnPerson = person;
            }
        }
        return returnPerson;
    }

    public void removeByPerson(Person person) {
        personList.remove(person);
    }

    public  void removeById(long id) {
        personList.remove(findById(id));
    }

    public Integer getCount() {
        return personList.size();
    }

    public Person[] getArray() {
        return personList.toArray(new Person[personList.size()]);
    }

    public void removeAll() {
        personList.clear();
    }
}
