package br.com.gilmarioarantes.validacpf.model;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidaCPFTeste {

    @Test
    public void testValidoCPF() {

        ValidaCPF validaCPF = new ValidaCPF();
        assertTrue(validaCPF.isCPF("12345678909"));
    }

    @Test
    public void testInvalidoCPF() {

        ValidaCPF validaCPF = new ValidaCPF();
        assertFalse(validaCPF.isCPF("1234567891234"));      // CPF com mais de 11 dígitos
        assertFalse(validaCPF.isCPF("12"));                 // CPF com menos de 3 dígitos
        assertFalse(validaCPF.isCPF("abcdefghijk"));        // CPF com caracteres inválidos
        assertFalse(validaCPF.isCPF("11111111111"));        // CPF com todos os números iguais
        assertFalse(validaCPF.isCPF("12345678929"));        // Primeiro dígito inválido
        assertFalse(validaCPF.isCPF("12345678907"));        // Segundo dígito inválido
    }
}
