package com.krakedev.examen_samuel_meneses;

public class TestVendedor {
	public static void main(String[] args) {
		Vendedor vendedor = new Vendedor("1234567890", "V");
		vendedor.setSueldoFijo(500.0);
		System.out.println(vendedor);
	}
}