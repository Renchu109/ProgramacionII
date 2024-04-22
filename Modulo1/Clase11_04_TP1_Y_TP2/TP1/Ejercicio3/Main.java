package Modulo1.Clase11_04_TP1_Y_TP2.TP1.Ejercicio3;

public class Main {
    public static void main(String[] args) {

        LibroDeTextoUNCol libro1 = new LibroDeTextoUNCol("Álgebra","Renzo Di Laudo",50000,4,"Facultad de ingeniería");
        LibroDeTexto libro2 = new LibroDeTextoUNCol("Anatomía humana","Sergio Neira",60000,8,"Facultad de medicina");
        Novela novela1 = new Novela("El principito","Antoine De Saint Exupéry",20000,"Aventuras");
        Novela novela2 = new Novela("El psicoanalista","John Katzenbach",25000,"Policíaca");
        Novela novela3 = new Novela("Mexica","Rodolfo Velasco",30000,"Histórico");

        System.out.println("\n--------------------------------------------");
        libro1.mostrarDatosLibro();
        System.out.println("--------------------------------------------");
        libro2.mostrarDatosLibro();
        System.out.println("--------------------------------------------");
        novela1.mostrarDatosLibro();
        System.out.println("--------------------------------------------");
        novela2.mostrarDatosLibro();
        System.out.println("--------------------------------------------");
        novela3.mostrarDatosLibro();
        System.out.println("--------------------------------------------\n");
    }
}
