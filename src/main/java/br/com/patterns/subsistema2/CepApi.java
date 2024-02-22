package br.com.patterns.subsistema2;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstance(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Campinas";
    }

    public String recuperaEstado(String cep){
        return "SP";
    }

}
