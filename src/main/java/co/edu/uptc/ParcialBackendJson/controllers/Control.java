package co.edu.uptc.ParcialBackendJson.controllers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uptc.ParcialBackendJson.models.Person;
import co.edu.uptc.ParcialBackendJson.services.CsvController;
import co.edu.uptc.ParcialBackendJson.services.FilterService;

@RestController
@RequestMapping
public class Control {

    FilterService fs = new FilterService();
    CsvController cs = new CsvController();

    @GetMapping("/Early-Childhood")
    public List<Person> showEarlyChildhood() throws FileNotFoundException, IOException {
        return fs.filterEarlyChildhood(cs.unpackCsv());
    }

    @GetMapping("/Childhood")
    public List<Person> showChildhood() throws FileNotFoundException, IOException {
        return fs.filterChildhood(cs.unpackCsv());
    }

    @GetMapping("/Adolescence")
    public List<Person> showAdolescence() throws FileNotFoundException, IOException {
        return fs.filterAdolescents(cs.unpackCsv());
    }

    @GetMapping("/Youth")
    public List<Person> showYouth() throws FileNotFoundException, IOException {
        return fs.filterYouth(cs.unpackCsv());
    }

    @GetMapping("/Adulthood")
    public List<Person> showAdulthood() throws FileNotFoundException, IOException {
        return fs.filterAdulthood(cs.unpackCsv());
    }

    @GetMapping("/OldAge")
    public List<Person> showOldAge() throws FileNotFoundException, IOException {
        return fs.filterOldAge(cs.unpackCsv());
    }
}
