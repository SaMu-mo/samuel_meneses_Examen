package com.krakedev.examen_samuel_meneses;

public class VendedorMixto extends Vendedor {

    public VendedorMixto(String cedula) {
        super(cedula);
    }

    @Override
    public double calcularSueldo() {
        return getSueldoFijo() + (getSueldoFijo() * 0.01 * getNumeroVentas());
    }
}
