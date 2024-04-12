package epsi.software.sakila.controllers;

import ch.qos.logback.classic.Logger;
import epsi.software.sakila.entities.Country;
import epsi.software.sakila.services.CountryService;
import epsi.software.sakila.services.CountryServiceImpl;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/country")
public class CountryController {

    private static final Logger log = (Logger) LoggerFactory.getLogger(CountryController.class);
    private CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping(path="/all")
    public List<Country> readAll() {
        return countryService.readAll();
    }

    @GetMapping(path="/id/{id}")
    public Country read(@PathVariable Long id) {
        Country result = countryService.read(id);
        if (result == null) {
            log.error("Country with id " + id + " not found");
            return null;
        } else {
            return result;
        }
    }
}
