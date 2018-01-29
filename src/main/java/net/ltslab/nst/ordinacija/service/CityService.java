/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ltslab.nst.ordinacija.service;

import java.util.List;
import net.ltslab.nst.ordinacija.domain.City;

/**
 *
 * @author bobanlukic
 */

public interface CityService {
    List<City> getAllCities();
    City getCityById(Long id);
    void addOrUpdateCity(City city);
    void deleteCity(Long id);
}