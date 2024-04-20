package Modulo1.Clase09_04.Composicion;

import java.util.Arrays;

public class Casa {
    private Puerta[] puertas;
    private int numMaterial = 0;

    public Puerta[] getPuertas() {
        return puertas;
    }

    public void setPuertas(Puerta[] puertas) {
        this.puertas = puertas;
    }

    //Creando la clase casa aqui mismo para hacer posbile la composición
    public Casa(){
        puertas = new Puerta[7];
    }

    //Método para componer la clase casa con la clase puerta agregando las puertas al array creado anteriormente
    public void agregarMaterialPuerta(String mat){
        puertas[numMaterial] = new Puerta(mat);
        numMaterial++;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "puertas=" + Arrays.toString(puertas) +
                ", numMaterial=" + numMaterial +
                '}';
    }
}
