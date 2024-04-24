package Modulo2.Clase23_04.Excepciones;

public class Ejemplo {
    public static void main(String[] args) {
        try{
            throw new miExcepcion("Este es un mensaje para todos los bosteros: 9/12/18");
        }catch (miExcepcion e){
            System.out.println("Se produjo un error: "+e.getMessage());
        }
    }
}
