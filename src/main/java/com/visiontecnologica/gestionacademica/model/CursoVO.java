/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.visiontecnologica.gestionacademica.model;



/**
 *
 * @author Lenin
 */
public class CursoVO {
    
    private Long idCurso;
   
    private String curso;
  
    private String periodo;
    
    private Long idInstructor;
    
    private String cedInstructor;
    
    private String nombreInstructor;
    
    
     public CursoVO(){
     }

    public CursoVO(Long idCurso, String curso, String periodo, Long idInstructor, String cedInstructor, String nombreInstructor) {
        this.idCurso = idCurso;
        this.curso = curso;
        this.periodo = periodo;
        this.idInstructor = idInstructor;
        this.cedInstructor = cedInstructor;
        this.nombreInstructor = nombreInstructor;
    }

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Long getIdInstructor() {
        return idInstructor;
    }

    public void setIdInstructor(Long idInstructor) {
        this.idInstructor = idInstructor;
    }

    public String getCedInstructor() {
        return cedInstructor;
    }

    public void setCedInstructor(String cedInstructor) {
        this.cedInstructor = cedInstructor;
    }

    public String getNombreInstructor() {
        return nombreInstructor;
    }

    public void setNombreInstructor(String nombreInstructor) {
        this.nombreInstructor = nombreInstructor;
    }
    
    
    
    
    
}
