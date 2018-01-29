/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ltslab.nst.ordinacija.repository;

import java.util.List;
import net.ltslab.nst.ordinacija.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author bobanlukic
 */
public interface CityRepository extends JpaRepository<City, Long> {
    
    List<City> findByZipCode(Long zipCode);
    
    List<City> findByName(String name);
    
}
