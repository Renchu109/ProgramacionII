package Parcial1;

import java.util.List;

//Clase equipo nacional que agrega objetos de tipo atleta
public class NationalTeam {
    //Atributos de la clase
    private String colour;
    private String country;
    private List<Athlete> athletsTeam; //Lista de objetos de tipo atleta para realizar la relación de agregación de los mismos

    //Constructores vacío y parametrizado
    public NationalTeam() {
    }

    public NationalTeam(String colour, String country, List<Athlete> athletsTeam) {
        this.colour = colour;
        this.country = country;
        this.athletsTeam = athletsTeam;
    }

    //Getters y setters
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Athlete> getAthletsTeam() {
        return athletsTeam;
    }

    public void setAthletsTeam(List<Athlete> athletsTeam) {
        this.athletsTeam = athletsTeam;
    }

    //Sobreescritura del método toString para mostrar los datos de cada objeto
    @Override
    public String toString() {
        return "Selección nacional{" +
                " Colores: " + colour +
                " | País: " + country +
                '}';
    }
}
