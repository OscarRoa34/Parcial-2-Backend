package co.edu.uptc.ParcialBackendJson.services;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import co.edu.uptc.ParcialBackendJson.models.Person;

public class CsvController {

    private PropertiesService p = new PropertiesService();

    public ArrayList<Person> unpackCsv() throws FileNotFoundException, IOException {
        ArrayList<Person> persons = new ArrayList<Person>();

        try (FileInputStream fis = new FileInputStream(p.getProperties("people_filepath"));
                BufferedReader br = new BufferedReader(new InputStreamReader(fis, StandardCharsets.UTF_8))) {
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                Person person = new Person(Integer.parseInt(parts[0]), parts[1], parts[2], parts[3], parts[4], parts[5],
                        parts[6], parts[7], parts[8]);

                persons.add(person);
            }
        }
        return persons;
    }
}