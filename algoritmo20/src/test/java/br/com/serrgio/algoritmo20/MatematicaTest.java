package br.com.serrgio.algoritmo20;

import org.junit.Test;

public class MatematicaTest {
    
    @Test(expected=IllegalArgumentException.class)
    public void testrazaoAureaT1() {
        int t1 = 0;
        int t2 = 0;
        int fator = 0;
        
        Matematica.razaoAurea(t1, t2, fator);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testrazaoAureaT2eFator() {
        int t1 = 1;
        int t2 = 2;
        int fator = -1;
        
        Matematica.razaoAurea(t1, t2, fator);
    }
    
}
