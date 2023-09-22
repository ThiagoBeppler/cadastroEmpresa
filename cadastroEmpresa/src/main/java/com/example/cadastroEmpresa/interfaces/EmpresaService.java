package com.example.cadastroEmpresa.interfaces;

import com.example.cadastroEmpresa.entities.EmpresaModel;
import com.example.cadastroEmpresa.dtos.EmpresaDto;

import java.util.ArrayList;

public interface EmpresaService {
    public abstract EmpresaModel cadastrarEmpresa(EmpresaDto empresa);

    public abstract ArrayList<EmpresaModel> listarEmpresas();

    public abstract String deletarEmpresa(Integer id);

}
