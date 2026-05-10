package com.krakedev.examen_samuel_meneses;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class VendedorMixtoTest {

    @Test
    public void testCalcularSueldo() {
        VendedorMixto vendedor = new VendedorMixto("1122334455");
        vendedor.setSueldoFijo(500.0);
        vendedor.setNumeroVentas(10);
        assertEquals(550.0, vendedor.calcularSueldo());
    }
}