package epsi.software.sakila.controllers;

import ch.qos.logback.classic.Logger;
import epsi.software.sakila.entities.City;
import epsi.software.sakila.services.CityService;
import epsi.software.sakila.services.CountryService;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/city")
public class CityController {

    private static final Logger log = (Logger) LoggerFactory.getLogger(CityController.class);
    private CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping(path="/all")
    public List<City> readAll() {
        return cityService.readAll();
    }

    @GetMapping(path="/cities/{id}")
    public City read(@PathVariable Long id) {
        City result = cityService.read(id);
        if (result == null) {
            log.error("City with id " + id + " not found");
            return null;
        } else {
            return result;
        }
    }

    @GetMapping(path="/contains/{string}")
    public List<City> read(@PathVariable String string) {
        List<City> result = cityService.contains(string);
        if (result == null) {
            log.error("City with name containing " + string + " not found");
            return null;
        } else {
            return result;
        }
    }
}
