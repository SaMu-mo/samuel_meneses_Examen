package com.krakedev.examen_samuel_meneses;

public class VendedorComision extends Vendedor {

    public VendedorComision(String cedula) {
        super(cedula);
    }

    @Override
    public double calcularSueldo() {
        return getComisionPorVenta() * getNumeroVentas();
    }
}
