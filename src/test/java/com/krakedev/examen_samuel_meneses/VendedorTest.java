package com.krakedev.examen_samuel_meneses;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class VendedorTest {
    
    @Test
    public void testCalcularSueldo() {
        Vendedor vendedor = new Vendedor("1234567890");
        vendedor.setSueldoFijo(500.0);
        assertEquals(500.0, vendedor.calcularSueldo());
    }
}