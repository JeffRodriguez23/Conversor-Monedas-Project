package org.example.monedaService;

import org.example.aditionalMethod.ConversorMoneda;
import org.example.record.ChangeResult;

public class PesoColombiaService extends ConversorMoneda {

    @Override
    protected String codigoBase() {
        return "COP";
    }

    //Metodo para Convertir Pesos Colombianos a Dolares
    public ChangeResult pesoColombiaToUsd(Double montoAConvertir) {
        return convertirMoneda("USD",montoAConvertir);
    }

    //Metodo para Convertir Pesos Colombianos a Euros
    public ChangeResult pesoColombiaToEuro(Double montoAConvertir) {
        return convertirMoneda("EUR",montoAConvertir);
    }

    //Metodo para Convertir Pesos Colombianos a Reales Brasileros
    public ChangeResult pesoColombiaToRealBrasilero(Double montoAConvertir) {
        return convertirMoneda("BRL",montoAConvertir);
    }

    //Metodo para Convertir Pesos Colombianos a Pesos Chilenos
    public ChangeResult pesoColombiaToPesoChileno(Double montoAConvertir) {
        return convertirMoneda("CLP",montoAConvertir);
    }

    //Metodo Para Convertir Pesos Colombianos a Pesos Argentinos
    public ChangeResult pesoColombiaToPesoArgentino(Double montoAConvertir) {
        return convertirMoneda("ARS",montoAConvertir);
    }


}
