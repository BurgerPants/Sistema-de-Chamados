package br.es.test.entities;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.es.entities.Empresa;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmpresaTest {
    
    /*Testes de Inicialização*/
    @Test
    public void criarEmpresaTest(){
        Empresa e = new Empresa(12345, "Mackenzie");
        assertEquals(e.getNomeEmpresa(), "Mackenzie");
        assertEquals(e.getNumeroContrato(), 12345);
    }
    
    @Test (expected = Exception.class)
    public void criarNumeroContratoInvalidoTest()throws Exception{
        Empresa e = new Empresa(-12345, "Mackenzie");
    }
    
    @Test (expected = Exception.class)
    public void criarNomeEmpresaNullTest()throws Exception{
        Empresa e = new Empresa(123, null);
    }
    
    /*Testes de Alteração*/
    @Test
    public void alterarNumeroContratoTest(){
        Empresa e = new Empresa(12345, "Mackenzie");
        e.setNumeroContrato(123);
        assertEquals(e.getNumeroContrato(), 123);
    }
    
    @Test
    public void alterarNomeEmpresaTest(){
        Empresa e = new Empresa(12345, "Mackenzie");
        e.setNomeEmpresa("FCI");
        assertEquals(e.getNomeEmpresa(), "FCI");
    }
    
    /*Testes de Alteração para valores inválidos*/
    @Test (expected = Exception.class)
    public void alterarNumeroContratoInvalidoTest()throws Exception{
        Empresa e = new Empresa(12345, "Mackenzie");
        e.setNumeroContrato(-123);
    }
    
    @Test (expected = Exception.class)
    public void alterarNomeEmpresaInvalidoTest()throws Exception{
        Empresa e = new Empresa(12345, "Mackenzie");
        e.setNomeEmpresa(null);
    }
}
