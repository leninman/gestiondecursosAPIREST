/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.visiontecnologica.gestionacademica.dao;

import com.visiontecnologica.gestionacademica.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Lenin
 */
public interface ICursoDao extends JpaRepository<Curso,Long> {
    
}
