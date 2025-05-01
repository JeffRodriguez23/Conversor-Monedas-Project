package org.example.monedaService;

import org.example.aditionalMethod.ConversorMoneda;
import org.example.record.ChangeResult;

public class RealBrasilService extends ConversorMoneda {

    @Override
    protected String codigoBase() {
        return "BRL";
    }


    //Metodo para Convertir Reales Brasileros a Dolares
    public ChangeResult realesToUsd(Double montoAConvertir) {
        return convertirMoneda("USD",montoAConvertir);
    }

    //Metodo para Convertir Reales Brasileros a Euros
    public ChangeResult realesToEuros(Double montoAConvertir) {
        return convertirMoneda("EUR",montoAConvertir);
    }

    //Metodo para Convertir Reales Brasileros a Pesos Argentinos
    public ChangeResult realesToPesosArgentinos(Double montoAConvertir) {
        return convertirMoneda("ARS",montoAConvertir);
    }

    //Metodo para Convertir Reales Brasileros a Pesos Chilenos
    public ChangeResult realesToPesosChilenos(Double montoAConvertir) {
        return convertirMoneda("CLP",montoAConvertir);
    }

    //Metodo Para Convertir Reales Brasileros a Pesos Colombianos
    public ChangeResult realesToPesosColombianos(Double montoAConvertir) {
        return convertirMoneda("COP",montoAConvertir);
    }


}
