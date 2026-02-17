package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.TituloOmdb;
import br.com.alura.screenmatch.modelos.TituloSuperClass;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import exercicios.java3.ex18.TituloTest;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um filme para buscas: ");
        var busca = sc.nextLine();

        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=ef4dc0c8";

        HttpClient client = HttpClient.newHttpClient(); //criando um objeto que sabe fazer requisições HTTP
        HttpRequest request = HttpRequest.newBuilder() //começa a construir a requisição
                .uri(URI.create(endereco)) //define o endereço da API
                .build(); //finaliza
        HttpResponse<String> response = client.send //envia a requisição
                (request, HttpResponse.BodyHandlers.ofString()); //diz que queremos a resposta como texto (String)

        String json = response.body();
        System.out.println(json);

        Gson  gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        TituloOmdb  meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);
        TituloSuperClass meuTitulo = new TituloSuperClass(meuTituloOmdb);
        System.out.println("Titulo já convertido");
        System.out.println(meuTitulo);
    }
}

