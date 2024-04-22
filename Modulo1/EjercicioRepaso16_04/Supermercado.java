package Modulo1.EjercicioRepaso16_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Supermercado {
    private String nombreSuper;
    private List<Producto> stockDisponible = new ArrayList<>();

    public String getNombreSuper() {
        return nombreSuper;
    }

    public void setNombreSuper(String nombreSuper) {
        this.nombreSuper = nombreSuper;
    }
    Random rand = new Random();

    public List<Producto> getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(List<Producto> stockDisponible) {
        this.stockDisponible = stockDisponible;
    }

    public void agregarProducto(List<Producto> listaProductosUniversal){

        int stockAleatorio = rand.nextInt(10)+1;

        for(Producto producto:listaProductosUniversal){
            boolean encontrado = false;
            for(Producto prodSuper: stockDisponible){
                if(prodSuper.equals(producto)){
                    encontrado = true;
                    break;
                }
            }

            if(!encontrado){
                System.out.println("Agregando producto");
                stockDisponible.add(producto);
                producto.setCantidadStock(stockAleatorio);
                System.out.println(producto);
                break;
            }
        }
    }

    public boolean buscarProducto(Producto producto){
        for(int i=0;i<stockDisponible.size();i++){
            if(stockDisponible.get(i) == producto){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "\n<-----SUPERMERCADO " + nombreSuper.toUpperCase() + "------>" +
                "\n\nSTOCK DE PRODUCTOS" + stockDisponible;
    }
}
