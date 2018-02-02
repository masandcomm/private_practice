/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ltslab.nst.ordinacija.dao;

import java.util.List;
import net.ltslab.nst.ordinacija.domain.Vitals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bobanlukic
 */
@Repository
public interface VitalsDao extends JpaRepository<Vitals, Long>{

    public List<Vitals> findByPatientId(Long patientId);
    
}