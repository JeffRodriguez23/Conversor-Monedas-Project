package org.example.monedaService;


import org.example.aditionalMethod.ConversorMoneda;
import org.example.record.ChangeResult;

public class DolarService extends ConversorMoneda {

    @Override
    protected String codigoBase() {
        return "USD";
    }

    //Metodo para Convertir dolares a Pesos Argentinos
    public ChangeResult usdToPesosArg(Double montoAConvertir) {

        return convertirMoneda("ARS", montoAConvertir);
    }

    //Metodo para convertir Dolares a Reales Brasileros
    public ChangeResult dolarToRealBrasilero(Double montoAConvertir) {

        return convertirMoneda("BRL", montoAConvertir);
    }

    //Metodo para convertir Dolares a Pesos Colombianos
    public ChangeResult dolarToPesoColombiano(Double montoAConvertir) {

        return convertirMoneda("COP", montoAConvertir);
    }

    //Metodo para convertir Dolares a Pesos Chilenos
    public ChangeResult dolarToPesoChileno(Double montoAConvertir) {

        return convertirMoneda("CLP",montoAConvertir);
    }

    //Metodo para convertir Dolares a Euros
    public ChangeResult dolarToEuro(Double montoAConvertir) {

        return convertirMoneda("EUR",montoAConvertir);
    }


}


