/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.visiontecnologica.gestionacademica.services;

import com.visiontecnologica.gestionacademica.model.Curso;
import java.util.List;

/**
 *
 * @author Lenin
 */
public interface ICursoService {
     
    public List<Curso> listaCursos();
    
    public Curso consultarCurso(Long idCurso);
    
    public void guardarCurso(Curso curso);
    
    public void eliminarCurso(Long idCurso);
    
    public void modificarCurso(Curso curso,Long idCurso);
    
}
