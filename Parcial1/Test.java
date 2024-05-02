package Parcial1;

import java.util.List;

//Clase prueba que agrega objetos de tipo atleta
//y se asocia con la clase instalacion y con la clase asociativa sede
public class Test {
    //Atributos de la clase
    private int code;
    private String title;
    private List<Athlete> listOfAthletesTested;//Lista de objetos de tipo atleta para realizar la relación de agregación de los mismos

    private List<Facility> facilities;//Lista de objetos de tipo instalacion para realizar la asociación con los mismos


    //Constructores vacío y parametrizado
    //NOTA: el constructor parametrizado no contiene a la lista de instalaciones para poder setearla después, una vez creada la misma
    public Test() {
    }

    //Getters y setters
    public Test(int code, String title, List<Athlete> listOfAthletesTested) {
        this.code = code;
        this.title = title;
        this.listOfAthletesTested = listOfAthletesTested;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Athlete> getListOfAthletesTested() {
        return listOfAthletesTested;
    }

    public void setListOfAthletesTested(List<Athlete> listOfAthletesTested) {
        this.listOfAthletesTested = listOfAthletesTested;
    }

    public List<Facility> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<Facility> facilities) {
        this.facilities = facilities;
    }

    //Sobreescritura del método toString para mostrar los datos de cada objeto
    @Override
    public String toString() {
        return "Test{" +
                "code=" + code +
                ", title='" + title + '\'' +
                ", listOfAthletesTested=" + listOfAthletesTested +
                ", facilities=" + facilities +
                '}';
    }
}
