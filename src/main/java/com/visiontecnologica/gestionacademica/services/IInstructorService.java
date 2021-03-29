/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.visiontecnologica.gestionacademica.services;

import com.visiontecnologica.gestionacademica.model.Instructor;
import java.util.List;

/**
 *
 * @author Lenin
 */
public interface IInstructorService {
    
    public List<Instructor> listaInstructores();
    
    public Instructor consultarInstructor(Long idInstructor);
    
    public Instructor consultarInstructorPorCedula(String cedulainstructor);
    
}
