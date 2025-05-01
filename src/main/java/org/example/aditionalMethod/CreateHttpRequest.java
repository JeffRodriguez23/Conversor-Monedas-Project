package org.example.aditionalMethod;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public abstract class CreateHttpRequest {

    protected final HttpClient CLIENTE = HttpClient.newHttpClient();
    protected final Gson GSON = new Gson();

    //Metodo especifico creado para Crear la Request Http y el response , recibiendo unicamente la Direccion(URI)
    protected HttpResponse<String> crearRequest(URI direccion) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            return CLIENTE.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
