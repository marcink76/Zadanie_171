package pl.javastart.exercise.streams;

import java.util.ArrayList;
import java.util.List;

public class FilteringMachineTwo {

    // metoda powinna zwrócić imiona wszystkich niedorosłych osób (mniej niż 18 lat)
    public List<String> findKidNames(List<Person> ppl) {
        List<String> nameList = new ArrayList<>();

        for (Person people : ppl) {
            if (people.getAge() < 18) {
                nameList.add(people.getName());
            }
        }
        return nameList;
    }

    public List<User> convertPeopleToUsers(List<Person> people) {
        List<User> userList = new ArrayList<>();
        for (Person person : people) {
            userList.add(new User(person.getName(), person.getAge(), person.getName() + "_" + person.getAge()));
        }
        return userList;
    }
}
