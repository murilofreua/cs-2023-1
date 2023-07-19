package org.example._05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.crypto.Data;

public class CartaoUtilOriginal {

    private static final int VISA = 1;
    private static final int MASTERCARD = 2;
    private static final int AMEX = 3;
    private static final int DINERS = 4;
    private static final String CARTAO_OK = "Cartão válido";
    private static final String CARTAO_ERRO = "Cartão inválido";

    private int bandeira;
    private String numero;
    private Date dataValidade;

    public int getBandeira () {
        return this.bandeira;
    }

    public String getNumero () {
        return this.numero;
    }

    public Date getDataValidade () {
        return this.dataValidade;
    }
    
    public String cadastrarCartao(int bandeira, String numero, Data dataValidade) {
        
        if(validaDataValidade(dataValidade) == CARTAO_OK)
            this.dataValidade = dataValidade;
        else
            return CARTAO_ERRO;

        this.bandeira = bandeira;

        if(validaNumero(numero, bandeira) == CARTAO_OK)
            this.numero = numero;
        else
            return CARTAO_ERRO;

        return "Cartão cadastrado com sucesso!";
    }

    public String validaDataValidade (Data dataValidade) {
        
        try {
            Date validade = new SimpleDateFormat("MM/yyyy").parse(dataValidade);
        }
        catch (ParseException e) {
            return CARTAO_ERRO;
        }

        Calendar calValidade = new GregorianCalendar();
        calValidade.setTime(dataValidade);

        // apenas mês e ano são utilizados na validação
        Calendar calTemp = new GregorianCalendar();
        Calendar calHoje = (GregorianCalendar) calValidade.clone();
        calHoje.set(Calendar.MONTH, calTemp.get(Calendar.MONTH));
        calHoje.set(Calendar.YEAR, calTemp.get(Calendar.YEAR));

        boolean validadeOK = calHoje.before(calValidade);

        if (validadeOK == false)
            return CARTAO_ERRO;
        else
            return CARTAO_OK;
    }
    
    public String validaNumero (String numero, int bandeira) {

        // ----- PREFIXO E TAMANHO -----
        
        String numeroFormatado = "";
        boolean formatoOK = false;

        int valoresMasterCard[] = {51, 52, 53, 54, 55};
        int valoresDiners[] = {300, 305, 36, 38};

        // remove caracteres não-numéricos
        for (int i = 0; i < numero.length(); i++) {
            
            char algarismo = numero.charAt(i);

            if (Character.isDigit(algarismo))
                numeroFormatado += algarismo;
        }

        switch (bandeira) {
            
            case VISA: // tamanhos 13 ou 16, prefixo 4.
                if   (formatado.startsWith("4") && (formatado.length() == 13 || formatado.length() == 16 ))
                    formatoOK = true;

                break;

            case MASTERCARD: // tamanho 16, prefixos 51 a 55
                if  ((formatado.isArray(valoresMasterCard)) && formatado.length() == 16)
                    formatoOK = true;
  
                break;

            case  AMEX: // tamanho 15, prefixos 34 e 37.
                if ((formatado.startsWith("34") || formatado.startsWith("37")) && formatado.length() == 15)
                    formatoOK = true;
        
                break;

            case  DINERS: // tamanho 14, prefixos 300  305, 36 e 38.
                if  ((formatado.isArray(valoresDiners)) && formatado.length() == 14)
                    formatoOK = true;

                break;

            default:
                formatoOK = false;

                break;
        } 

        if (!formatoOK)
            return CARTAO_ERRO;

        // ----- SEQUÊNCIA NUMÉRICA -----

        // fórmula de LUHN (http://www.merriampark.com/anatomycc.htm)

        int soma = 0;
        int digito = 0;
        int somafim = 0;
        boolean multiplica = false;

        for (int i = formatado.length() - 1; i >= 0; i--) {
            
            digito = Integer.parseInt(formatado.substring(i, i+1));

            if (multiplica) {

                somafim = digito * 2;

                if (somafim > 9)
                    somafim -= 9;
            } 
            else
                somafim = digito;
            
            soma += somafim;
                multiplica = !multiplica;
        }

        int resto = soma % 10;

        if (resto == 0)
            return CARTAO_OK;
        else
            return CARTAO_ERRO;
    }
}

