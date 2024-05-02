package Parcial1;

import java.util.List;

//Clase Instalacion que se asocia con la clase prueba y con la clase asociativa sede
public class Facility {
    //Atributos
    private String category;
    private String location;
    private String name;
    private String kind;
    private List<Test> tests;//Lista de objetos de tipo prueba para realizar la asociación con los mismos

    //Constructores vacío y parametrizado
    //NOTA: el constructor parametrizado no contiene a la lista de pruebas para poder setearla después, una vez creada la misma
    public Facility() {
    }

    public Facility(String category, String location, String name, String kind) {
        this.category = category;
        this.location = location;
        this.name = name;
        this.kind = kind;
    }

    //Getters y setters
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public List<Test> getTests() {
        return tests;
    }

    public void setTests(List<Test> tests) {
        this.tests = tests;
    }

    //Sobreescritura del método toString para mostrar los datos de cada objeto
    @Override
    public String toString() {
        return "Facility{" +
                "category='" + category + '\'' +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", tests=" + tests +
                '}';
    }
}
