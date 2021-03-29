/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.visiontecnologica.gestionacademica.dao;

import com.visiontecnologica.gestionacademica.model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author Lenin
 */
public interface IInstructorDao extends JpaRepository<Instructor,Long> {
    
     @Query(value = "Select * from instructores where  cedula = ?1", nativeQuery = true)
    Instructor consultarInstructorPorCedula(String cedulaInstructor);
    
}
