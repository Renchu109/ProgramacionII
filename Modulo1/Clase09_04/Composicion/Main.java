package Modulo1.Clase09_04.Composicion;

public class Main {
    public static void main(String[] args) {
        //Creación del objeto casa
        Casa casita = new Casa();

        //Composición con el método agregarMaterialPuerta para agregar las puertas a la casa
        casita.agregarMaterialPuerta("Roble");
        casita.agregarMaterialPuerta("Abedul");
        casita.agregarMaterialPuerta("Acero");
        casita.agregarMaterialPuerta("Plástico");
        casita.agregarMaterialPuerta("Abeto");
        casita.agregarMaterialPuerta("Durlock");
        casita.agregarMaterialPuerta("Pino");

        //Muestra de datos
        System.out.println("---------MATERIALES DE LAS PUERTAS------------");
        for(int i=0;i<casita.getPuertas().length;i++){
            System.out.println("-"+casita.getPuertas()[i].getMaterial());
        }


    }
}
