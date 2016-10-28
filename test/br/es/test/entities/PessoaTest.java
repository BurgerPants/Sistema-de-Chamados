package br.es.test.entities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.es.entities.Pessoa;
import org.junit.Test;
import static org.junit.Assert.*;

public class PessoaTest {

    /*Testes de Inicialização*/
    @Test
    public void criarPessoa() {
        Pessoa p = new Pessoa("Guilherme.S", 12345678);
        assertEquals(p.getNome(), "Guilherme.S");
        assertEquals(p.getTelefone(), 12345678);
    }

    @Test(expected = Exception.class)
    public void criarNomeNull() throws Exception {
        Pessoa p = new Pessoa(null, 12345678);
    }

    @Test(expected = Exception.class)
    public void criarTelInvalido() throws Exception {
        Pessoa p = new Pessoa(null, -12345678);
    }

    /*Testes de Alteração*/
    @Test
    public void alterarNome() {
        Pessoa p = new Pessoa("Guilherme.S", 12345678);
        p.setNome("Stoppa");
        assertEquals(p.getNome(), "Stoppa");
    }

    @Test
    public void alterarTelefone() {
        Pessoa p = new Pessoa("Guilherme.S", 12345678);
        p.setTelefone(87654321);
        assertEquals(p.getTelefone(), 87654321);
    }

    /*Teste de Alteração Invalida*/
    @Test (expected = Exception.class)
    public void alterarNomeNullTest() throws Exception{
        Pessoa p = new Pessoa("Guilherme.S", 12345678);
        p.setNome(null);
    }

    @Test (expected = Exception.class)
    public void alterarTelefoneInvalidoTest() throws Exception{
        Pessoa p = new Pessoa("Guilherme.S", 12345678);
        p.setTelefone(-12345678);
    }

}
