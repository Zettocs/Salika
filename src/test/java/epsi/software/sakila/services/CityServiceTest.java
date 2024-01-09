package epsi.software.sakila.services;

import epsi.software.sakila.entities.City;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CityServiceTest {

    @Autowired
    CityService cityService;
    @Test
    void read() {
        cityService.read(1L);
    }

    @Test
    void readAll() {
        cityService.readAll().stream().forEach(c -> System.out.println(c));
    }
    @Test
    void create() {
        City city = new City();
        city.setCity("Lille");
    }

    @Test
    void update() {
        City city = new City();
        city.setCity("Lille");
    }
}