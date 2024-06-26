package epsi.software.sakila.services;

import epsi.software.sakila.entities.City;

import java.util.List;

public interface CityService {

    City create(City city);
    City read(Long id);
    List<City> readAll();
    City update(City city);
    boolean delete(Long id);
    List<City> contains(String contains);

}
