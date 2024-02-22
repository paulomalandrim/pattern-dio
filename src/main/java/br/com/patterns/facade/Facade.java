package br.com.patterns.facade;

import br.com.patterns.subsistema1.CrmService;
import br.com.patterns.subsistema2.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){
        CepApi cepApi = CepApi.getInstance();

        String cidade = cepApi.recuperarCidade(cep);
        String estado = cepApi.recuperaEstado(cep);

        CrmService.gravarCliente(nome, cep, estado, cidade);
    }

}
