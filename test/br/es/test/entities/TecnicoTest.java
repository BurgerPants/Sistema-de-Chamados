package br.es.test.entities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.es.entities.Tecnico;
import org.junit.Test;
import static org.junit.Assert.*;

public class TecnicoTest {
    
    /*Testes de Inicialização*/
    @Test
    public void criarTecnico(){
        Tecnico p = new Tecnico("Guilherme.S", 12345678);
        assertEquals(p.getNome(), "Guilherme.S");
        assertEquals(p.getTelefone(), 12345678);
    }
    
    @Test (expected = Exception.class)
    public void criarNomeNullTest() throws Exception{
        Tecnico p = new Tecnico(null, 12345678);
    }
    
    @Test (expected = Exception.class)
    public void criarTelInvalidoTest() throws Exception{
        Tecnico p = new Tecnico("Guilherme.S", -12345678);
    }
    
    /*Testes de Alteração*/
    @Test
    public void alterarNome(){
        Tecnico p = new Tecnico("Guilherme.S", 12345678);
        p.setNome("Stoppa");
        assertEquals(p.getNome(), "Stoppa");
    }
    
    @Test
    public void alterarTelefone(){
        Tecnico p = new Tecnico("Guilherme.S", 12345678);
        p.setTelefone(87654321);
        assertEquals(p.getTelefone(), 87654321);
    }
    
    /*Teste de Alteração Invalida*/
    @Test (expected = Exception.class)
    public void alterarNomeNullTest() throws Exception{
        Tecnico p = new Tecnico("Guilherme.S", 12345678);
        p.setNome(null);
    }
    
    @Test (expected = Exception.class)
    public void alterarTelefoneInvalidoTest() throws Exception{
        Tecnico p = new Tecnico("Guilherme.S", 12345678);
        p.setTelefone(-12345678);
        
    }
    
}
