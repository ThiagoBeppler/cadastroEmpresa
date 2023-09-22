package com.example.cadastroEmpresa.repositories;

import com.example.cadastroEmpresa.entities.EmpresaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<EmpresaModel, Integer> {
}
