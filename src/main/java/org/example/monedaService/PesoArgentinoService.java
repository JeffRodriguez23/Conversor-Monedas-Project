package org.example.monedaService;

import org.example.aditionalMethod.ConversorMoneda;
import org.example.record.ChangeResult;

public class PesoArgentinoService extends ConversorMoneda {

    @Override
    protected String codigoBase() {
        return "ARS";
    }

    //Metodo para Convertir Pesos Argentinos a Dolares
    public ChangeResult pesosArgToUsd(Double montoAConvertir){
        return convertirMoneda("USD",montoAConvertir);
    }

    //Metodo para Convertir Pesos Argentinos a Euros
    public ChangeResult pesosArgToEuro(Double montoAConvertir){
        return convertirMoneda("EUR",montoAConvertir);
    }

    //Metodo para Convertir Pesos Argentinos a Reales Brasileros
    public ChangeResult pesosArgToRealBrasilero(Double montoAConvertir){
        return convertirMoneda("BRL",montoAConvertir);
    }

    //Metodo para Convertir Pesos Argentinos a Pesos Chilenos
    public ChangeResult pesosArgToPesoChileno(Double montoAConvertir){
        return convertirMoneda("CLP",montoAConvertir);
    }

    //Metodo Para Convertir Pesos Argentinos a Pesos Colombianos
    public ChangeResult pesosArgToPesoColombiano(Double montoAConvertir){
        return convertirMoneda("COP",montoAConvertir);
    }


}
