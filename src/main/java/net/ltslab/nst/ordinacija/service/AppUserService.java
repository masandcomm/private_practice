/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ltslab.nst.ordinacija.service;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import net.ltslab.nst.ordinacija.dto.AppUserDto;

/**
 *
 * @author bobanlukic
 */
public interface AppUserService {

    AppUserDto findByUsername(String username);

    AppUserDto findActiveByUsername(String username);

    List<AppUserDto> getAllUsers();

    List<AppUserDto> getAllActiveUsers();

    List<AppUserDto> getAllActiveDoctors();

    List<AppUserDto> getAllSuspendedUsers();
    
    void updateUser(AppUserDto appUserDto);

    void suspendUser(Long appUserId);

    void reactivateUser(Long appUserId);
    
    boolean addAppUser(AppUserDto appUserDto);

    AppUserDto getDoctor(HttpServletRequest request);

    AppUserDto getById(Long id);
}
