package com.ejercicio3.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ejercicio3.dto.MaquinaRegistradora;

public interface IMaquinaRegistradoraDao extends JpaRepository<MaquinaRegistradora, Long> {

}
