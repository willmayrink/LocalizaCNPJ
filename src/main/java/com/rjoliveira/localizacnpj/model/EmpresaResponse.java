/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rjoliveira.localizacnpj.model;

import java.util.List;

/**
 *
 * @author laura
 */
public class EmpresaResponse {
    List<String> colunas;
    List<Empresa> dados;

    public List<String> getColunas() {
        return colunas;
    }

    public void setColunas(List<String> colunas) {
        this.colunas = colunas;
    }

    public List<Empresa> getDados() {
        return dados;
    }

    public void setDados(List<Empresa> dados) {
        this.dados = dados;
    }
}
