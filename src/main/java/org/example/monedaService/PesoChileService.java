package org.example.monedaService;

import org.example.aditionalMethod.ConversorMoneda;
import org.example.record.ChangeResult;

public class PesoChileService extends ConversorMoneda {

    @Override
    protected String codigoBase() {
        return "CLP";
    }

    //Metodo para Convertir Pesos chilenos a Dolares
    public ChangeResult pesosChileToUsd(Double montoAConvertir){
        return convertirMoneda("USD",montoAConvertir);
    }

    //Metodo para Convertir Pesos Chilenos a Euros
    public ChangeResult pesosChileToEuro(Double montoAConvertir){
        return convertirMoneda("EUR",montoAConvertir);
    }

    //Metodo para Convertir Pesos Chilenos a Reales Brasileros
    public ChangeResult pesosChileToRealBrasilero(Double montoAConvertir){
        return convertirMoneda("BRL",montoAConvertir);
    }

    //Metodo para Convertir Pesos Chilenos a Pesos Argentinos
    public ChangeResult pesosChileToPesoArgentino(Double montoAConvertir){
        return convertirMoneda("ARS",montoAConvertir);
    }

    //Metodo Para Convertir Pesos Chilenos a Pesos Colombianos
    public ChangeResult pesosChileToPesoColombiano(Double montoAConvertir){
        return convertirMoneda("COP",montoAConvertir);
    }


}
