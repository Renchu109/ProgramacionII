package Modulo1.TP2.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Novela novela1 = new Novela("Harry Potter y la piedra filosofal","J.K. Rowling",1997,false,"Fantasía");
        Universitario univ1 = new Universitario("Cálculo","Renzo Di Laudo",2028,false,"Cálculo avanzado matemático");
        Infantil inf1 = new Infantil("El principito","Rodolfo Velazco",2090,false,"Entretener");

        Biblioteca biblioteca1 = new Biblioteca();

        System.out.println("-------------------BIBLIOTECA EL LIBRO FELIZ-----------------");
        System.out.println(" ");
        biblioteca1.agregarLibro(novela1);
        biblioteca1.agregarLibro(univ1);
        biblioteca1.agregarLibro(inf1);
        System.out.println("---------------------------------------------------------------------------------------------------------------------");

        biblioteca1.mostrarLibros();
        System.out.println("---------------------------------------------------------------------------------------------------------------------");

        biblioteca1.prestarLibro(novela1);
        biblioteca1.mostrarLibros();
        System.out.println("---------------------------------------------------------------------------------------------------------------------");

        biblioteca1.devolverLibro(novela1);
        biblioteca1.mostrarLibros();
        System.out.println("---------------------------------------------------------------------------------------------------------------------");

        biblioteca1.prestarLibro(univ1);
        biblioteca1.mostrarLibros();
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
    }
}
