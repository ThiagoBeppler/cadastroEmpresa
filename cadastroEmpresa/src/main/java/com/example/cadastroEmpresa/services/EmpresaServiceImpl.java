package com.example.cadastroEmpresa.services;

import com.example.cadastroEmpresa.entities.EmpresaModel;
import com.example.cadastroEmpresa.dtos.EmpresaDto;
import com.example.cadastroEmpresa.interfaces.EmpresaService;
import com.example.cadastroEmpresa.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;

@Service
public class EmpresaServiceImpl implements EmpresaService {

    @Autowired
    EmpresaRepository empresaRepository;

    @Override
    public EmpresaModel cadastrarEmpresa(EmpresaDto empresa) {

        EmpresaModel empresaModel = new EmpresaModel();

        empresaModel.setNome(empresa.getNome());
        empresaModel.setCnpj(empresa.getCnpj());
        empresaModel.setEndereco(empresa.getEndereco());
        empresaModel.setDataAbertura(LocalDate.now());

        return empresaRepository.save(empresaModel);
    }

    @Override
    public ArrayList<EmpresaModel> listarEmpresas() {
        return (ArrayList<EmpresaModel>) empresaRepository.findAll();
    }

    @Override
    public String deletarEmpresa(Integer id) {

        try {
            empresaRepository.deleteById(id);

            return "Excluido";
        }
        catch (Exception e){
            return e.getMessage();
        }
    }
}
