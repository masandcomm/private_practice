/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ltslab.nst.ordinacija.service.impl;

import java.util.ArrayList;
import java.util.List;
import net.ltslab.nst.ordinacija.domain.City;
import net.ltslab.nst.ordinacija.dto.CityDto;
import net.ltslab.nst.ordinacija.repository.CityRepository;
import net.ltslab.nst.ordinacija.service.CityService;
import net.ltslab.nst.ordinacija.util.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bobanlukic
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    CityRepository cityRepository;

    @Autowired
    CityMapper cityMapper;

    @Override
    public List<CityDto> allCities() {
        return cityMapper.citiesToCityDtos(cityRepository.findAll());
    }

    @Override
    public CityDto getCityByZipCode(Long zipCode) {
        return cityMapper.cityToCityDto(cityRepository.findOne(zipCode));
    }

    @Override
    public boolean addCity(CityDto cityDto) {
        City city = cityMapper.cityDtoToCity(cityDto);
        if (cityRepository.findOne(city.getZipCode()) == null) {
            cityRepository.saveAndFlush(city);
            return true;
        }
        return false;
    }

}
