package co.edu.uptc.ParcialBackendJson.services;

import java.util.ArrayList;

import co.edu.uptc.ParcialBackendJson.models.Person;

public class FilterService {

    private int calculateAge(Person person) {
        int birthYear = Integer.parseInt(person.getDateOfBirth().substring(0, 4));
        int age = 2024 - birthYear;
        return age;
    }

    public ArrayList<Person> filterEarlyChildhood(ArrayList<Person> persons) {
        ArrayList<Person> earlyChildhood = new ArrayList<Person>();
        for (Person person : persons) {
            if (calculateAge(person) > 0 && calculateAge(person) <= 5) {
                earlyChildhood.add(person);
            }
        }
        return earlyChildhood;
    }

    public ArrayList<Person> filterChildhood(ArrayList<Person> persons) {
        ArrayList<Person> childhood = new ArrayList<Person>();
        for (Person person : persons) {
            if (calculateAge(person) > 5 && calculateAge(person) <= 11) {
                childhood.add(person);
            }
        }
        return childhood;
    }

    public ArrayList<Person> filterAdolescents(ArrayList<Person> persons) {
        ArrayList<Person> adolescents = new ArrayList<Person>();
        for (Person person : persons) {
            if (calculateAge(person) > 11 && calculateAge(person) <= 18) {
                adolescents.add(person);
            }
        }
        return adolescents;
    }

    public ArrayList<Person> filterYouth(ArrayList<Person> persons) {
        ArrayList<Person> youth = new ArrayList<Person>();
        for (Person person : persons) {
            if (calculateAge(person) > 13 && calculateAge(person) <= 26) {
                youth.add(person);
            }
        }
        return youth;
    }

    public ArrayList<Person> filterAdulthood(ArrayList<Person> persons) {
        ArrayList<Person> adulthood = new ArrayList<Person>();
        for (Person person : persons) {
            if (calculateAge(person) > 26 && calculateAge(person) <= 59) {
                adulthood.add(person);
            }
        }
        return adulthood;
    }

    public ArrayList<Person> filterOldAge(ArrayList<Person> persons) {
        ArrayList<Person> oldAge = new ArrayList<Person>();
        for (Person person : persons) {
            if (calculateAge(person) > 59) {
                oldAge.add(person);
            }
        }
        return oldAge;
    }
}
