/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.visiontecnologica.gestionacademica.controllers;

import com.visiontecnologica.gestionacademica.model.Curso;
import com.visiontecnologica.gestionacademica.model.CursoVO;
import com.visiontecnologica.gestionacademica.model.Instructor;
import com.visiontecnologica.gestionacademica.services.ICursoService;
import com.visiontecnologica.gestionacademica.services.IInstructorService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lenin
 */
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/app")
public class gestionController {

    @Autowired
    ICursoService cursoservice;

    @Autowired
    IInstructorService instructorservice;

    @GetMapping(path = "/consultacursos", produces = "application/json")
    public @ResponseBody
    List<CursoVO> consultaralumnos() {
        List<Curso> cursos = new ArrayList<>();
        List<CursoVO> cursosvo = new ArrayList<>();
        Instructor instructor;
        cursos = cursoservice.listaCursos();

        for (int i = 0; i < cursos.size(); i++) {
            instructor = instructorservice.consultarInstructor(cursos.get(i).getIdInstructor());
            CursoVO cursovo = new CursoVO();
            cursovo.setIdCurso(cursos.get(i).getIdCurso());
            cursovo.setCurso(cursos.get(i).getCurso());
            cursovo.setPeriodo(cursos.get(i).getPeriodo());
            cursovo.setCedInstructor(instructor.getCedula());
            cursovo.setNombreInstructor(instructor.getNombre());
            cursovo.setIdInstructor(instructor.getIdInstructor());
            cursosvo.add(cursovo);
        }
        return cursosvo;
    }

    @PostMapping("/guardarcurso")
    @ResponseStatus(HttpStatus.CREATED)
    public CursoVO crearcurso(@RequestBody CursoVO cursovo) {

        Curso curso = new Curso();

        curso.setCurso(cursovo.getCurso());
        curso.setPeriodo(cursovo.getPeriodo());
        curso.setIdInstructor(cursovo.getIdInstructor());
        this.cursoservice.guardarCurso(curso);
        return cursovo;
    }

    @GetMapping(path = "/consultarinstructores", produces = "application/json")
    public @ResponseBody
    List<Instructor> consultarinstructores() {

        return this.instructorservice.listaInstructores();

    }

    @DeleteMapping("/eliminarcurso/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        this.cursoservice.eliminarCurso(id);
    }

}
