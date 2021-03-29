/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.visiontecnologica.gestionacademica.services;

import com.visiontecnologica.gestionacademica.dao.ICursoDao;
import com.visiontecnologica.gestionacademica.model.Curso;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lenin
 */
@Service
public class ICursoServiceImpl implements ICursoService{
    
      @Autowired
      ICursoDao cursoDao;
      

    @Override
    @Transactional(readOnly = true)
    public List<Curso> listaCursos() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         return cursoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Curso consultarCurso(Long idCurso) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return cursoDao.findById(idCurso).orElse(null);
    }

    @Override
    @Transactional
    public void guardarCurso(Curso curso) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          this.cursoDao.save(curso);
    }

    @Override
    @Transactional
    public void eliminarCurso(Long idCurso) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.cursoDao.deleteById(idCurso);
    }

    @Override
    @Transactional
    public void modificarCurso(Curso curso, Long idCurso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
