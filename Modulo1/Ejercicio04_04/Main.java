package Modulo1.Ejercicio04_04;

public class Main {
    public static void main(String[] args) {

        Guerrero g1 = new Guerrero("Renzian",9,90,80);
        Mago m1 = new Mago("Dumbledore",10,100,50);

        System.out.println(" ");
        g1.mostrarDatosIniciales();
        System.out.println("Categoría: "+g1.getClass().getSimpleName());
        System.out.println("\n-----------------------------------------------------------\n");
        m1.mostrarDatosIniciales();
        System.out.println("Categoría: "+m1.getClass().getSimpleName());
        System.out.println("\n-----------------------------------------------------------\n");
        System.out.println("Empieza el combate!\n");

        while (true){
            g1.atacar();
            g1.mostrarDatosAtaque();

            m1.defender(g1.atacar());

            if (g1.puntosVida == 0){
                System.out.println(g1.getNombre()+" ha sido derrotado...");
                System.out.println(m1.getNombre()+" gana el combate!");
                break;
            }else if(m1.puntosVida == 0){
                System.out.println(m1.getNombre()+" ha sido derrotado...");
                System.out.println(g1.getNombre()+" gana el combate!");
                break;
            }

            m1.atacar();
            m1.mostrarDatosAtaque();

            g1.defender(m1.atacar());

            if (g1.puntosVida == 0){
                System.out.println(g1.getNombre()+" ha sido derrotado...");
                System.out.println(m1.getNombre()+" gana el combate!");
                break;
            }else if(m1.puntosVida == 0){
                System.out.println(m1.getNombre()+" ha sido derrotado...");
                System.out.println(g1.getNombre()+" gana el combate!");
                break;
            }
        }
    }
}
