package io.zipcoder.interfaces;

import java.util.ArrayList;

public abstract class People<TypeOfPerson extends Person> {
    protected ArrayList<TypeOfPerson> personList;

    public People() {
        personList = new ArrayList<>();
    }

    public void add(TypeOfPerson person) {
        personList.add(person);
    }

    public TypeOfPerson findById(long id) { //changed per leon's lecture
        for (TypeOfPerson person: personList
             ) {
            if(person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public void removeByPerson(TypeOfPerson person) {
        personList.remove(person);
    }

    public  void removeById(long id) {
        personList.remove(findById(id));
    }

    public Integer getCount() {
        return personList.size();
    }

    public abstract TypeOfPerson[] getArray();

    public void removeAll() {
        personList.clear();
    }
}
