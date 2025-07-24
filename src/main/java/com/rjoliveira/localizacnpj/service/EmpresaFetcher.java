/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rjoliveira.localizacnpj.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rjoliveira.localizacnpj.model.Empresa;
import com.rjoliveira.localizacnpj.model.EmpresaResponse;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.io.entity.EntityUtils;

/**
 *
 * @author laura
 */
public class EmpresaFetcher {

    public static Empresa fetchData(String cnpj) throws ParseException, IOException {

        String url = "https://brasilapi.com.br/api/cnpj/v1/" + cnpj;
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(url);
            try (CloseableHttpResponse response = httpClient.execute(request)) {
                String json = EntityUtils.toString(response.getEntity());
                //System.out.println(json);
                ObjectMapper mapper = new ObjectMapper();
                Empresa parsed = mapper.readValue(json, Empresa.class);
                return parsed;
            } catch (Exception e) {
                System.out.print("Erro no parse do JSON");
                e.printStackTrace();
            }
        } catch (Exception e) {

        }
        return null;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o cpnj: \n");
        String cnpj = scanner.nextLine();
        try {
            Empresa emp = fetchData(cnpj);

            System.out.printf("Nome: %s | CEP: %s | Logradouro: %s | Data abertura %s%n",
                    emp.getRazaoSocial(), emp.getCep(), emp.getLogradouro(),emp.getDataAbertura());

        } catch (Exception e) {
        }
    }

}
