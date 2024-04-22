package Modulo1.EjercicioRepaso16_04;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String apellido;
    private String metodoPago;
    private List<Producto> carrito = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public List<Producto> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<Producto> carrito) {
        this.carrito = carrito;
    }

    public void agregarProductoCarrito(Producto prod){
        System.out.print("\nAgregando producto al carrito: ");
        carrito.add(prod);
        System.out.println(prod.getTipoProducto()+" "+prod.getMarcaProducto()+" "+prod.getPrecio());
    }

    @Override
    public String toString() {
        return "\nCLIENTE: {" + nombre + " " +apellido + " - Método de pago: " + metodoPago + "\n->Productos en el carrito de "+nombre+": " +carrito + '}';
    }
}
