package br.com.patterns.subsistema1;

public class CrmService {

    private CrmService(){
        super();
    }
    public static void gravarCliente(String nome, String cep, String estado, String cidade){
        System.out.println("Cliente " + nome + " de " + cidade + "/" + estado +  ", cep:" + cep + " salvo no sistema de CRM");
    }
}
