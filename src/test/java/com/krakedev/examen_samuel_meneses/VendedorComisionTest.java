package com.krakedev.examen_samuel_meneses;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class VendedorComisionTest {

    @Test
    public void testCalcularSueldo() {
        VendedorComision vendedor = new VendedorComision("0987654321");
        vendedor.setComisionPorVenta(50.0);
        vendedor.setNumeroVentas(10);
        assertEquals(500.0, vendedor.calcularSueldo());
    }
}