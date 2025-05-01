package org.example.monedaService;

import org.example.aditionalMethod.ConversorMoneda;
import org.example.record.ChangeResult;

public class EuroService extends ConversorMoneda {

    @Override
    protected String codigoBase() {
        return "EUR";
    }

    //Metodo para Convertir Euros a Dolares
    public ChangeResult euroToDolar(Double montoAconvertir){
        return convertirMoneda("USD",montoAconvertir);
    }

    //Metodo para Convertir Euros a Pesos Argentinos
    public ChangeResult euroToPesoArgentino(Double montoAConvertir){
        return convertirMoneda("ARS",montoAConvertir);
    }

    //Metodo para Convertir Euros a Reales Brasileros
    public ChangeResult euroToRealBrasilero(Double montoAConvertir){
        return convertirMoneda("BRL",montoAConvertir);
    }

    //Metodo para Convertir Euros a Pesos Chilenos
    public ChangeResult euroToPesoChileno(Double montoAConvertir){
        return convertirMoneda("CLP",montoAConvertir);
    }

    //Metodo Para Convertir Euros a Pesos Colombianos
    public ChangeResult euroToPesoColombiano(Double montoAConvertir){
        return convertirMoneda("COP",montoAConvertir);
    }



}
