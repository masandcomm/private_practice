/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.ltslab.nst.ordinacija.repository;

import java.util.List;
import net.ltslab.nst.ordinacija.domain.Patient;
import net.ltslab.nst.ordinacija.domain.enums.BloodType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author bobanlukic
 */

public interface PatientRepository extends JpaRepository<Patient, Long> {

    public List<Patient> findByBloodType(BloodType bloodType);

    public List<Patient> findByFirstName(String firstName);

    public List<Patient> findByFirstNameAndBloodType(String firstName, BloodType bloodType);

      
}