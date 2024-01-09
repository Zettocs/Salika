package epsi.software.sakila.services;

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
    }

    @Test
    void readAll() {
        cityService.readAll().stream().forEach(c -> System.out.println(c));
    }
}