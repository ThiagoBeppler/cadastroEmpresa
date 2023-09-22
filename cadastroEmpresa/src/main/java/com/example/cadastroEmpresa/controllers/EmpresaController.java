package com.example.cadastroEmpresa.controllers;

import com.example.cadastroEmpresa.dtos.EmpresaDto;
import com.example.cadastroEmpresa.entities.EmpresaModel;
import com.example.cadastroEmpresa.interfaces.EmpresaService;
import com.example.cadastroEmpresa.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    EmpresaRepository empresaRepository;

    @Autowired
    EmpresaService empresaService;

    @GetMapping("teste1")
    public String teste(){

        return "Teste";
    }

    @GetMapping("")
    public ArrayList<EmpresaModel> listarEmpresas(){
        return empresaService.listarEmpresas();
    }

    @PostMapping("")
    public EmpresaModel cadastrarEmpresa(@RequestBody EmpresaDto empresa){
        return empresaService.cadastrarEmpresa(empresa);
    }

    @DeleteMapping("/{id}")
    public String deletarEmpresa(@PathVariable(value = "id") Integer id){
        return empresaService.deletarEmpresa(id);
    }
}
