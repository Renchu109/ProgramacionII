package Modulo1.Clase09_04.AsocUnidireccional;

import java.util.List;

public class Estudiante {
    private String nombre;
    private Universidad universidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public void mostrar(){
        System.out.println(
                "El estudiante "+nombre+" asiste a la "
                        +universidad.getNombre());
    }

    public void cambiarUniversidad(Estudiante est, Universidad uni1, Universidad uni2){
        if(est.universidad.getNombre().equals(uni1.getNombre())){
            est.setUniversidad(uni2);
        }else {
            est.setUniversidad(uni1);
        }
    }
}
