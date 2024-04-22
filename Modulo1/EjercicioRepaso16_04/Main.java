package Modulo1.EjercicioRepaso16_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Producto prod1 = new Producto();
        Producto prod2 = new Producto();
        Producto prod3 = new Producto();
        Producto prod4 = new Producto();
        Producto prod5 = new Producto();
        Producto prod6 = new Producto();
        Producto prod7 = new Producto();
        Producto prod8 = new Producto();
        Producto prod9 = new Producto();
        Producto prod10 = new Producto();

        prod1.setTipoProducto("Botella de salsa");
        prod1.setMarcaProducto("La Campagnola");
        prod1.setPrecio(2000);

        prod2.setTipoProducto("Pan de hamburguesas");
        prod2.setMarcaProducto("La española");
        prod2.setPrecio(950);

        prod3.setTipoProducto("Lentejas");
        prod3.setMarcaProducto("La lenteja feliz");
        prod3.setPrecio(3300);

        prod4.setTipoProducto("1/2 docena de medialunas");
        prod4.setMarcaProducto("Virgen del valle");
        prod4.setPrecio(1800);

        prod5.setTipoProducto("Vino");
        prod5.setMarcaProducto("Chacabuco");
        prod5.setPrecio(2300);

        prod6.setTipoProducto("Jamon");
        prod6.setMarcaProducto("Paladini");
        prod6.setPrecio(1750);

        prod7.setTipoProducto("Detergente");
        prod7.setMarcaProducto("Cif");
        prod7.setPrecio(1200);

        prod8.setTipoProducto("Yerba mate");
        prod8.setMarcaProducto("Taragui");
        prod8.setPrecio(2500);

        prod9.setTipoProducto("Azúcar");
        prod9.setMarcaProducto("Ledesma");
        prod9.setPrecio(800);

        prod10.setTipoProducto("Leche");
        prod10.setMarcaProducto("La Serenísima");
        prod10.setPrecio(1400);

        //Lista de productos en el SUPERMERCADO
        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(prod1);
        listaProductos.add(prod2);
        listaProductos.add(prod3);
        listaProductos.add(prod4);
        listaProductos.add(prod5);
        listaProductos.add(prod6);
        listaProductos.add(prod7);
        listaProductos.add(prod8);
        listaProductos.add(prod9);
        listaProductos.add(prod10);

        Supermercado super1 = new Supermercado();
        super1.setNombreSuper("Carrefour");



        //Buscar producto en el SUPERMERCADO
        System.out.println(super1.buscarProducto(prod1));
        System.out.println(super1.buscarProducto(prod6));


        Cliente cliente1 = new Cliente();
        //Lista de productos en el CARRITO
        List<Producto> productosCarritoCliente1 = new ArrayList<>();
        cliente1.setNombre("Renzo");
        cliente1.setApellido("Di Laudo");
        cliente1.setMetodoPago("Efectivo");
       // cliente1.setCarrito(productosCarritoCliente1);
        /*
        int cantProducto1 = 10;
        int cantProducto2 = 40;
        int cantProducto3 = 30;
        //Agregar producto cliente CARRITO
        cliente1.agregarProductoCarrito(prod1);
        cliente1.agregarProductoCarrito(prod3);
        cliente1.agregarProductoCarrito(prod4);

        //Mostrar productos en el SUPERMERCADO
        System.out.println(super1);

        //Mostrar productos en el CARRITO
        System.out.println(cliente1);
         */

        label:
        while(true){
            System.out.println("\n---------SUPERMERCADO CARREFOUR---------\n");
            System.out.println("MENÚ DE OPCIONES\n");
            System.out.println("1- Agregar un producto al Stock del supermercado");
            System.out.println("2- Buscar un producto");
            System.out.println("3- Realizar una compra");
            System.out.println("4- Listar el stock de todos los productos disponibles en el supermercado");
            System.out.println("5- SALIR\n");
            System.out.print("Ingrese su desición: ");
            String desicion = scan.nextLine();

            switch (desicion) {
                case "1":
                    System.out.println("\n--->AGREGAR PRODUCTO<---");
                    super1.agregarProducto(listaProductos);
                    if(listaProductos.size() == super1.getStockDisponible().size()){
                        System.out.println("No hay más productos para agregar");
                    }
                    break;
                case "2":
                    System.out.println("\n--->BUSCAR PRODUCTO<---");
                    boolean estaOno = super1.buscarProducto(prod1);
                    System.out.println("Buscando producto "+prod1);
                    System.out.println("Disponible: "+estaOno);
                    break;
                case "3":
                    System.out.println("\n--->REALIZAR COMPRA<---");
                    double totalCompra = 0;
                    int posicion = 0;

                    for(Producto prod:super1.getStockDisponible()){
                        estaOno = super1.buscarProducto(prod1);
                        if(estaOno){
                            super1.getStockDisponible().get(posicion).setCantidadStock(super1.getStockDisponible().get(posicion).getCantidadStock()-1);
                            cliente1.agregarProductoCarrito(prod);
                            totalCompra += prod.getPrecio();
                        }
                        posicion += 1;
                    }

                    System.out.println("\nEl total de esta compra es de $"+totalCompra);
                    break;
                case "4":
                    System.out.println("\n--->LISTANDO PRODUCTOS<---");
                    System.out.println(super1);
                    break;
                case "5":
                    System.out.println("\nSaliendo del sistema...");
                    break label;
                default:
                    System.out.println("\nEleción incorrecta");
                    break;
            }

            System.out.println("\n-----------------------------------------------------------------------------");
            System.out.print("Presione cualquier tecla para volver al menú");
            String dec = scan.nextLine();
        }
    }
}