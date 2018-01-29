/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ltslab.nst.ordinacija.repository;

import java.util.List;
import net.ltslab.nst.ordinacija.domain.Vitals;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author bobanlukic
 */

public interface VitalsRepository extends JpaRepository<Vitals, Long>{

    public List<Vitals> findByPatientId(Long patientId);
    
}