package org.example.aditionalMethod;

import com.google.gson.Gson;
import org.example.record.ChangeResult;

import java.net.URI;
import java.net.http.HttpResponse;

public abstract class ConversorMoneda extends CreateHttpRequest{

    private static final String APIKEY = "";//Write your API KEY FOR USE
    private static final String URLBASE = "https://v6.exchangerate-api.com/v6/";

    protected abstract String codigoBase();

    //Metodo general para conversion de monedas
    public ChangeResult convertirMoneda(String monedaDestino, Double montoAConvertir) {

        try {
            URI direccion = URI.create(URLBASE + APIKEY + "/pair/"+codigoBase()+"/" + monedaDestino + "/" + montoAConvertir);
            HttpResponse<String> response = crearRequest(direccion);

            if (response.statusCode() == 200) {
                return new Gson().fromJson(response.body(), ChangeResult.class);
            } else {
                System.out.println("Error: código de estado " + response.statusCode());
                return null;
            }
        } catch (Exception e) {
            System.out.println("Excepción al hacer la conversión: " + e.getMessage());
            return null;
        }

    }

}
