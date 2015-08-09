/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.ebj.dao;

import com.tecsup.ebj.model.Programa;
import java.util.List;

/**
 *
 * @author alumno
 */
public interface ProgramaDAO {

    public List<Programa> all();

    public Programa find(Long id);

    public void save(Programa programa);

    public void update(Programa programa);

    public void delete(Programa programa);
}
