package com.krakedev.examen_samuel_meneses;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VendedorController {

    private AdminVentas adminVentas = new AdminVentas();

    @PostMapping("/agregarVendedor")
    public void agregarVendedor(@RequestBody Vendedor vendedor) {
        if (vendedor.getTipo().equals("V")) {
            Vendedor v = new Vendedor(vendedor.getCedula(), "V");
            v.setSueldoFijo(vendedor.getSueldoFijo());
            adminVentas.agregar(v);
        } else if (vendedor.getTipo().equals("C")) {
            VendedorComision vc = new VendedorComision(vendedor.getCedula());
            vc.setComisionPorVenta(vendedor.getComisionPorVenta());
            vc.setNumeroVentas(vendedor.getNumeroVentas());
            adminVentas.agregar(vc);
        } else if (vendedor.getTipo().equals("M")) {
            VendedorMixto vm = new VendedorMixto(vendedor.getCedula());
            vm.setSueldoFijo(vendedor.getSueldoFijo());
            vm.setNumeroVentas(vendedor.getNumeroVentas());
            adminVentas.agregar(vm);
        }
    }

    @GetMapping("/calcularSueldo")
    public Double calcularSueldoVendedor(@RequestParam String cedula) {
        return adminVentas.calcularSueldo(cedula);
    }
}
