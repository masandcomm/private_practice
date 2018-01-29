/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ltslab.nst.ordinacija.service.impl;

import java.util.List;
import net.ltslab.nst.ordinacija.domain.Vitals;
import net.ltslab.nst.ordinacija.repository.VitalsRepository;
import net.ltslab.nst.ordinacija.service.VitalsService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author bobanlukic
 */
public class VitalsServiceImpl implements VitalsService {
    
    @Autowired
    VitalsRepository vitalsRepository;

    @Override
    public List<Vitals> getAllVitals(Long patientId) {
        return vitalsRepository.findByPatientId(patientId);
    }

    @Override
    public Vitals getVitals(Long id) {
        return vitalsRepository.findOne(id);
    }

    @Override
    public void addOrUpdateCourse(Vitals vitals) {
        vitalsRepository.save(vitals);
    }

    @Override
    public void deleteCourse(Long id) {
        vitalsRepository.delete(id);
    }
    
}