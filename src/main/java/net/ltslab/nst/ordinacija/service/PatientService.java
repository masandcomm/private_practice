/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ltslab.nst.ordinacija.service;

import java.time.LocalDate;
import java.util.List;
import net.ltslab.nst.ordinacija.dto.PatientDto;

/**
 *
 * @author bobanlukic
 */
public interface PatientService {

    List<PatientDto> allPatients();

    PatientDto getPatientById(Long id);

    void addOrUpdatePatient(PatientDto patient);

    void deletePatient(Long id);

    void deletePatient(PatientDto patientDto);

    public List<PatientDto> scheduledForDate(LocalDate date);

    List<PatientDto> searchForPatients(String searchText);

    public boolean addPatient(PatientDto patientDto);

    public PatientDto getPatientDto(Long patientId);

}
