package epsi.software.sakila.services;

import epsi.software.sakila.entities.Country;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CountryService {

    Country create(Country country);
    Country read(Long id);
    List<Country> readAll();
    Country update(Country country);
    boolean delete(Long id);
}
