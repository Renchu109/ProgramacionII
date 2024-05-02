package Parcial1;

//Clase hija atleta. Hereda de persona e implementa la interfaz contrato
public class Athlete extends Person implements Contract {
    //Atributos de la clase
    private double height;
    private int age;
    private double weight;

    //Constructores vacío y parametrizado
    public Athlete() {
    }

    public Athlete(int dni, String name, double height, int age, double weight) {
        super(dni, name);
        this.height = height;
        this.age = age;
        this.weight = weight;
    }

    //Getters y setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    //Sobreescritura de los métodos de al interfaz
    @Override
    public double calculateIMC() {
        double height_ = this.height;
        double weight_ = this.weight;

        return weight_ / Math.pow(height_,2);//Calculamos el imc de cada atleta implementando la interfaz Math para realizar la potencia
    }

    @Override
    public boolean isThereExtraWeight(Double imc) {
        //Según el imc obtenido de la función anterior, determianmos mediante un bool si hay o no sobrepeso en el atleta
        if(imc < 18.5){
            return false;
        } else if ((imc >= 18.5) && (imc < 24.9)) {
            return false;
        } else if ((imc >= 25) && (imc < 29.9)) {
            return true;
        }else {
            return true;
        }
    }

    @Override
    public double takePulsations() {
        return 0;
    }

    //Sobreescritura del método toString para mostrar los datos de cada objeto
    @Override
    public String toString() {
        return "Atleta{" +
                "Altura: " + height +
                " mts | Edad: " + age +
                " años | Peso: " + weight +
                " kg | DNI: " + dni +
                " | Nombre: " + name +
                '}';
    }
}
