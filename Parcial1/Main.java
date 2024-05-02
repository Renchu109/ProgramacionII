package Parcial1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        /*
        CREACION DE OBJETOS, CLASES, LISTAS, SETS Y LLENADO DE LAS MISMAS
         */

        //CLASE ATLETA/ATHLETE
        //Creación y llenado de los objetos de tipo atleta y de una arrayList para contenerlos
        Athlete ath1 = new Athlete(44986473,"Renzo",1.70,20,58.5);
        Athlete ath2 = new Athlete(40123456,"Rodolfo",1.65,28,43.5);
        Athlete ath3 = new Athlete(43456789,"Juan",1.55,23,67.5);
        Athlete ath4 = new Athlete(32657498,"Jose",1.75,35,91.5);
        Athlete ath5 = new Athlete(38765908,"Pedro",1.95,29,102.5);
        Athlete ath6 = new Athlete(41234980,"Pablo",1.62,25,71.5);
        List<Athlete> listOfAthletes = new ArrayList<>();
        listOfAthletes.add(ath1);
        listOfAthletes.add(ath2);
        listOfAthletes.add(ath3);
        listOfAthletes.add(ath4);
        listOfAthletes.add(ath5);
        listOfAthletes.add(ath6);

        //CLASE EQUIPO NACIONAL/NATIONAL TEAM
        //Creación y llenado de los objetos de la clase equipo nacional y de una arrayList para cada objeto con los atletas que dispone
        List<Athlete> athletesForTeam1 = new ArrayList<>();
        athletesForTeam1.add(ath1);
        athletesForTeam1.add(ath2);
        athletesForTeam1.add(ath3);
        List<Athlete> athletesForTeam2 = new ArrayList<>();
        athletesForTeam2.add(ath4);
        athletesForTeam2.add(ath5);
        athletesForTeam2.add(ath6);

        NationalTeam team1 = new NationalTeam("Celeste y blanco","Argentina",athletesForTeam1);
        NationalTeam team2 = new NationalTeam("Verde y amarillo","Brasil",athletesForTeam2);


        //CLASE PRUEBA/TEST Y ASOCIACIÓN CON INSTALACION/FACILITY
        //Creacion de arrayList de tipo INSTALACION para contener los objetos de esta clase, que son las instalaciones que realizan cada prueba
        List<Facility> facilitiesForTest1 = new ArrayList<>();
        List<Facility> facilitiesForTest2 = new ArrayList<>();
        List<Facility> facilitiesForTest3 = new ArrayList<>();
        List<Facility> facilitiesForTest4 = new ArrayList<>();

        //Creacion de arrayList de tipo PRUEBA para contener los objetos de esta clase, que son las pruebas que realiza cada instalación
        List<Test> facility1Tests = new ArrayList<>();
        List<Test> facility2Tests = new ArrayList<>();

        //Creación y llenado de objetos de tipo PRUEBA e INSTALACION
        Test test1 = new Test(123,"Resistencia",listOfAthletes);
        Test test2 = new Test(124,"Fuerza",listOfAthletes);
        Test test3 = new Test(678,"Cardiológica",listOfAthletes);
        Test test4 = new Test(679,"Respiratoria",listOfAthletes);
        Facility fac1 = new Facility("Pruebas físicas","Mendoza, Argentina","'Centro de deportes'","'Polideportivo'");
        Facility fac2 = new Facility("Pruebas médicas","Mendoza, Argentina","'Santa Isabel de Hungría'","'Hospital'");

        //Llenado de las arrayList de tipo INSTALACION con el objeto de esa clase (la instalacion) que hace cada prueba
        facilitiesForTest1.add(fac1);
        facilitiesForTest2.add(fac1);
        facilitiesForTest3.add(fac2);
        facilitiesForTest4.add(fac2);

        //Llenado de las arrayList de tipo PRUEBA con el objeto de esa clase (la prueba) que realiza cada instalación
        facility1Tests.add(test1);
        facility1Tests.add(test2);
        facility2Tests.add(test3);
        facility2Tests.add(test4);

        //Agregacion a cada prueba de la lista de instalaciones donde se puede realizar la misma
        test1.setFacilities(facilitiesForTest1);
        test2.setFacilities(facilitiesForTest2);
        test3.setFacilities(facilitiesForTest3);
        test4.setFacilities(facilitiesForTest4);

        //Agregacion a cada instalación de la lista de pruebas que realiza cada una
        fac1.setTests(facility1Tests);
        fac2.setTests(facility2Tests);

        //CLASE CAMPUS - SEDE
        //Creación y llenado de los sets de tipo prueba e instalación para realizar la asociación
        Set<Test> setOfTests = new HashSet<>();
        Set<Facility> setOfFacilities = new HashSet<>();
        setOfTests.add(test1);
        setOfTests.add(test2);
        setOfTests.add(test3);
        setOfTests.add(test4);
        setOfFacilities.add(fac1);
        setOfFacilities.add(fac2);

        //Creación y llenado de un objeto de tipo sede
        Campus campus1 = new Campus(1,"01/05/2024","12:51",setOfTests,setOfFacilities);



        /*
        MENU INTERACTIVO CON LAS CONSIGNAS DEL PARCIAL + OPCIONES EXTRA
         */

        Scanner scan = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n-----MENU: Ejercicios del parcial-----");
            System.out.println("1-Nombre del 3er atleta de la prueba 2");
            System.out.println("2-Código de la prueba 2");
            System.out.println("3-Altura de los atletas");
            System.out.println("4-Peso extra de cada atleta");
            System.out.println("-----MENU: EXTRA-----");
            System.out.println("5-Ver lista de atletas");
            System.out.println("6-Ver selecciones nacionales");
            System.out.println("7-¿En qué instalación puedo realizar las pruebas FÍSICAS? ¿Y las MÉDICAS?");
            System.out.println("8-¿Qué pruebas puedo realizar en cada instalación?");
            System.out.println("9-Ver SEDE");
            System.out.println("Salir (cualquier otra tecla)");
            System.out.print(": ");
            String dec = scan.nextLine();

            switch (dec) {
                case "1" -> {
                    //1) Mostrando el nombre del 3er atleta de la segunda prueba desde un objeto INSTALACIÓN
                    System.out.print("-----------------------------------------");
                    System.out.println("\nNombre del 3er atleta de la segunda prueba: "+fac1.getTests().get(1).getListOfAthletesTested().get(2).getName());
                    /*
                    1-Desde el objeto instalación que contiene la segunda prueba, traemos la lista de pruebas que realiza el mismo
                    2-Traemos la prueba de la posicion 2 de la lista de pruebas (índice 1)
                    3-Traemos la lista de atletas que realizan esa prueba
                    4-Traemos al atleta de la posición 3 de esa lista de atletas (índice 2)
                    5-Por último, traemos su nombre
                     */
                }
                case "2" -> {
                    //2) Mostrando el código de la prueba 2 desde un objeto INSTALACIÓN
                    System.out.println("-----------------------------------------");
                    System.out.println("Código de la segunda prueba: "+fac1.getTests().get(1).getCode());
                    /*
                    1-Desde el objeto instalación que contiene la segunda prueba, traemos la lista de pruebas que realiza el mismo
                    2-Traemos la prueba de la posicion 2 de la lista de pruebas (índice 1)
                    3-Traemos el código de esa prueba
                     */
                }
                case "3" -> {
                    //3) Mostrando altura de los atletas desde un objeto EQUIPO NACIONAL
                    System.out.println("-----------------------------------------");
                    System.out.println("Altura de los atletas");
                    for(Athlete athlete: team1.getAthletsTeam()){
                        System.out.println("\nAtleta: "+athlete.getName());
                        System.out.println("-Altura: "+athlete.getHeight()+"mts.");
                    }
                    /*
                    Utilizamos un bucle for-each para mostrar fácilmente los datos de todos los atletas
                    Llamamos a la lista de atletas de uno de los objetos Equipo nacional
                    Traemos el nombre de cada uno
                    Seguidamente, traemos su altura
                     */
                }
                case "4" -> {
                    //4) Mostrando el peso extra de cada atleta desde un objeto EQUIPO NACIONAL
                    System.out.print("-----------------------------------------");
                    for(Athlete athlete: team1.getAthletsTeam()){
                        double imc =athlete.calculateIMC();
                        boolean overWeight = athlete.isThereExtraWeight(imc);
                        System.out.println("\nAtleta: "+athlete.getName());
                        System.out.println("IMC: "+imc);
                        if(overWeight){
                            System.out.println("-Tiene SOBREPESO. Debe bajar al menos "+((imc*Math.pow(athlete.getHeight(), 2))-(25*Math.pow(athlete.getHeight(), 2)))+"kg para poder entrenarse");
                        } else if (imc < 18.5) {
                            System.out.println("-Tiene imc INSUFICIENTE. Debe aumentar al menos "+((18.5*Math.pow(athlete.getHeight(), 2))-(imc*Math.pow(athlete.getHeight(), 2)))+"kg para poder entrenarse");
                        }else {
                            System.out.println("-Tiene un peso NORMAL");
                        }
                    }
                    /*
                    1-Utilizamos un bucle for-each para mostrar fácilmente los datos de todos los atletas
                    2-Llamamos a la lista de atletas de uno de los objetos Equipo nacional
                    3-Llamamos a los métodos calcularIMC y hayPesoExtra para cada atleta
                    4-Mostramos el imc de cada atleta y según el valor, se determinará:
                       -Si es mayor a 25, se realizará el cálculo matemático correspondiente para determinar
                       el mínimo de kg que debe BAJAR el atleta para estar en peso normal
                       -Si es menor a 18.5 se realizará el cálculo matemático correspondiente para determinar
                       el mínimo de kg que debe AUMENTAR el atleta para estar en peso normal
                       -Implementamos la interfaz Math para realizar la potencia y una variable booleana para determinar
                       si el atleta tiene o no sobrepeso
                     */
                }
                case "5" -> {
                    //5) Mostrando la lista total de atletas
                    System.out.println("-----------------------------------------");
                    System.out.println("LISTA DE ATLETAS");
                    for(Athlete athlete:listOfAthletes){
                        System.out.println("-"+athlete);
                    }
                }
                case "6" -> {
                    //6) Mostrando selecciones nacionales y sus atletas
                    System.out.println("-----------------------------------------");
                    System.out.println("SELECCIONES NACIONALES");

                    System.out.println("\n"+team1);
                    System.out.println("Atletas:");
                    for(Athlete athlete:athletesForTeam1){
                        System.out.println("-"+athlete);
                    }

                    System.out.println("\n"+team2);
                    System.out.println("Atletas:");
                    for(Athlete athlete:athletesForTeam2){
                        System.out.println("-"+athlete);
                    }
                }
                case "7" -> {
                    //7) Mostrando la lista de instalaciones para realizar pruebas físicas y médicas
                    System.out.println("-----------------------------------------");
                    System.out.println("Las pruebas FÍSICAS se realizan en la instalación "+fac1.getName()+" localizada en "+fac1.getLocation());
                    System.out.println("Las pruebas MÉDICAS se realizan en la instalación "+fac2.getName()+" localizada en "+fac2.getLocation());
                }
                case "8" -> {
                    //8) Mostrando la lista de pruebas que se pueden realizar en cada instalación
                    System.out.println("-----------------------------------------");
                    System.out.println("La instalación de tipo "+fac1.getKind()+" "+fac1.getName()+" tiene las siguientes pruebas:");
                    for(Test test: facility1Tests){
                        System.out.println("-"+test.getTitle());
                    }
                    System.out.println("\nLa instalación de tipo "+fac2.getKind()+" "+fac2.getName()+" tiene las siguientes pruebas:");
                    for(Test test: facility2Tests){
                        System.out.println("-"+test.getTitle());
                    }
                }
                case "9" -> {
                    //9) Mostrando la SEDE
                    System.out.println("-----------------------------------------");
                    campus1.showInfo();
                }
                default -> {
                    System.out.println("\nCerrando sesión...");
                    continuar = false;
                }
            }
        }
    }
}
