package Parcial1;

import java.util.Set;

//Clase asociativa sede que asocia las clases prueba e instalacion
public class Campus {
    //Atributos
    private int phase;
    private String date;
    private String time;
    private Set<Test> setOFTests;//Set de objetos de tipo prueba para lograr la asociación
    private Set<Facility> setOfFacilities;//Set de objetos de tipo instalación para lograr la asociación


    //Constructores vacío y parametrizado
    public Campus() {
    }

    //Getters y setters
    public Campus(int phase, String date, String time, Set<Test> setOFTests, Set<Facility> setOfFacilities) {
        this.phase = phase;
        this.date = date;
        this.time = time;
        this.setOFTests = setOFTests;
        this.setOfFacilities = setOfFacilities;
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Set<Test> getSetOFTests() {
        return setOFTests;
    }

    public void setSetOFTests(Set<Test> setOFTests) {
        this.setOFTests = setOFTests;
    }

    public Set<Facility> getSetOfFacilities() {
        return setOfFacilities;
    }

    public void setSetOfFacilities(Set<Facility> setOfFacilities) {
        this.setOfFacilities = setOfFacilities;
    }

    //Método para mostrar los datos de la sede incluyendo los asociados de las clases prueba e instalacion
    public void showInfo(){
        System.out.println("SEDE");
        System.out.println("-Fecha: "+date);
        System.out.println("-Hora: "+time);
        System.out.println("-Fase: "+phase);
        System.out.println("-Instalaciones donde se realizaron pruebas:");
        for(Facility facility: setOfFacilities){
            System.out.println("-->"+facility.getName());
            System.out.println("\tPruebas que se realizaron:");
            for(Test test: facility.getTests()){
                System.out.println("\t->"+test.getTitle());
            }
        }
    }
}
