/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.ebj.beans;

import com.tecsup.ebj.dao.ProgramaDAO;
import com.tecsup.ebj.model.Programa;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import javax.inject.Inject;

/**
 *
 * @author alumno
 */
@ManagedBean
@RequestScoped
public class ProgramaBean {

    @Inject
    ProgramaDAO programaDAO;
   
    private List<Programa> programas;
    
    private Programa programa = new Programa();

    
    public void update(Programa pro) {
        this.programa = pro;
    }

    public void save() {
        if (programa.getId() == null) {
            programaDAO.save(programa);
        } else {
            programaDAO.update(programa);
        }
        this.programa = new Programa();
    }

    public void delete(Programa programa) {
        programaDAO.delete(programa);
    }

    public List<Programa> getProgramas() {
        programas = programaDAO.all();
        return programas;
    }

    public Programa getPrograma() {
        return programa;
    }
}
