/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import controle.ControleTecnicos;
import entidade.Tecnico;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pedro
 */
public class ControleTecnicosTest {
    
    @Test
    public void inserirTecnicoTest(){
        ControleTecnicos ct = new ControleTecnicos();
        Tecnico t = new Tecnico("Pedro", 59205920);
        
        Tecnico te = ct.inserir(t.getTelefone(), t.getNome());
        
        assertEquals(t.getNome(),te.getNome());
        assertEquals(t.getTelefone(),te.getTelefone());
    }
    
    @Test (expected = Exception.class)
    public void inserirNomeTecnicoNullTest() throws Exception{
        ControleTecnicos ct = new ControleTecnicos();
        Tecnico te = ct.inserir(12345678, null);
    }
    
    @Test (expected = Exception.class)
    public void inserirTelefoneTecnicoInvalidoTest() throws Exception{
        ControleTecnicos ct = new ControleTecnicos();
        Tecnico te = ct.inserir(-34439988, "Jorge");
    }
}
