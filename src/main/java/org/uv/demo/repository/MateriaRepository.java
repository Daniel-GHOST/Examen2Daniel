/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.uv.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uv.demo.models.Materia;


public interface MateriaRepository extends JpaRepository<Materia, Long> {
}
