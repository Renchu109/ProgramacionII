package Modulo1.EjercicioRepaso16_04;

public class Producto {
    private String tipoProducto;
    private String marcaProducto;
    private double precio;
    private int cantidadStock;

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getMarcaProducto() {
        return marcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    @Override
    public String toString() {
        return "\n-->Producto: {" + tipoProducto + " - Marca: " +marcaProducto + " - Precio $" + precio + " - Stock: " +cantidadStock + '}';
    }
}
