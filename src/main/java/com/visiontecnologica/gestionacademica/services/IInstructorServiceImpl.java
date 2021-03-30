/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.visiontecnologica.gestionacademica.services;

import com.visiontecnologica.gestionacademica.dao.IInstructorDao;
import com.visiontecnologica.gestionacademica.model.Instructor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lenin
 */
@Service
public class IInstructorServiceImpl implements IInstructorService {
    
    @Autowired
    IInstructorDao instructorDao;        

    @Override
    public List<Instructor> listaInstructores() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return instructorDao.findAll();
    }

    @Override
    public Instructor consultarInstructor(Long idInstructor) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         return instructorDao.findById(idInstructor).orElse(null);
    }
  
}
