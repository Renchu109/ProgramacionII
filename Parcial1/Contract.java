package Parcial1;

//Interfaz contrato con métodos para calcular el índice de masa corporal
//de cada atleta y determinar si tienen soprepeso
public interface Contract {
    double calculateIMC();

    boolean isThereExtraWeight(Double imc);

    double takePulsations();
}
