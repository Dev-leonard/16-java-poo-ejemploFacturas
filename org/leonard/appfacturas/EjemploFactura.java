package org.leonard.appfacturas;

import org.leonard.appfacturas.modelo.*; // se ha optimizado  con un asterisco
//import org.leonard.appfacturas.modelo.Cliente;
//import org.leonard.appfacturas.modelo.Factura;
//import org.leonard.appfacturas.modelo.ItemFactura;
//import org.leonard.appfacturas.modelo.Producto;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setRuc("000457881");
        cliente.setNombre("Leonidas");

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una descripcion de la factura: ");

        Factura factura = new Factura(s.nextLine(), cliente);  // este es el constructor

        Producto producto;
//        String nombre;
//        float precio;
//        int cantidad;

        System.out.println();

        for (int i = 0; i < 2; i++) {
            producto = new Producto();

            System.out.print("Ingrese producto n° " + producto.getCodigo() + ": ");
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");  // no es la cantidad de  productos

            factura.addItemFactura(new ItemFactura(s.nextInt(), producto));

            System.out.println();
            s.nextLine();
        }
        System.out.println(factura);
    }
}
