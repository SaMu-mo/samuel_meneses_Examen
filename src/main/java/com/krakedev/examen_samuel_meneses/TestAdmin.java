package com.krakedev.examen_samuel_meneses;

public class TestAdmin {

    public static void main(String[] args) {
        AdminVentas admin = new AdminVentas();

        Vendedor v = new Vendedor("1111", "V");
        VendedorComision vc = new VendedorComision("2222");
        VendedorMixto vm = new VendedorMixto("3333");
        
        v.setSueldoFijo(600.0);

        vc.setComisionPorVenta(50.0);
        vc.setNumeroVentas(8);

        vm.setSueldoFijo(400.0);
        vm.setNumeroVentas(5);

        admin.agregar(v);
        admin.agregar(vc);
        admin.agregar(vm);

        System.out.println("Sueldo vendedor: " + admin.calcularSueldo("1111"));
        System.out.println("Sueldo vendedor comision: " + admin.calcularSueldo("2222"));
        System.out.println("Sueldo vendedor mixto: " + admin.calcularSueldo("3333"));
        System.out.println("Cedula inexistente: " + admin.calcularSueldo("9999"));
        
    }
}