package Modulo1.Clase09_04.Agregacion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creación de objetos vacíos de tipo empleado y subsiguiente asignación de parámetros
        Empleado emp1 = new Empleado();
        Empleado emp2 = new Empleado();
        Empleado emp3 = new Empleado();
        Empleado emp4 = new Empleado();
        emp1.setNombre("Renzo");
        emp1.setCargo("Oficinista");
        emp2.setNombre("Sodolfo");
        emp2.setCargo("Conserje");
        emp3.setNombre("Max");
        emp3.setCargo("Cocinero");
        emp4.setNombre("Gualter");
        emp4.setCargo("Bachero");

        //Creación de las listas de empleados correspondiente a su ocupación
        List<Empleado> listaEmpleadosOficina = new ArrayList<>();
        listaEmpleadosOficina.add(emp1);
        listaEmpleadosOficina.add(emp2);

        List<Empleado> listaEmpleadosCocina = new ArrayList<>();
        listaEmpleadosCocina.add(emp3);
        listaEmpleadosCocina.add(emp4);

        //Creación de objetos departamentos y asignación de parámetros
        Departamento dep1 = new Departamento();
        dep1.setNombreDep("Oficinas");
        Departamento dep2 = new Departamento();
        dep2.setNombreDep("Cocina");

        //Creación de listas de departamentos correspondiente a la clase empresa
        List<Departamento> listaDepartamentos = new ArrayList<>();
        listaDepartamentos.add(dep1);
        listaDepartamentos.add(dep2);

        //RELACIÓN DE AGREGACIÓN: de los departamentos con sus correspondientes listas de empleados
        dep1.setEmpleadosAsociados(listaEmpleadosOficina);
        dep2.setEmpleadosAsociados(listaEmpleadosCocina);

        //Creación de un objeto empresa y parametros
        Empresa empresa = new Empresa();
        empresa.setNombre("MadMax5");

        //RELACIÓN DE AGREGACIÓN: de la empresa con su correspondiente listas de departamentos
        empresa.setListaDepartamentos(listaDepartamentos);

        //Muestra de datos
        System.out.println("-----------EMPRESA------------");
        System.out.println("La empresa "+empresa.getNombre()+" está dividida en los siguientes departamentos: ");
        for (Departamento listaDepartamento : listaDepartamentos) {
            System.out.println("-" + listaDepartamento.getNombreDep());
        }

        System.out.println("--------DEPARTAMENTOS---------");
        System.out.println("El departamento "+dep1.getNombreDep().toLowerCase()+" tiene asociados los siguientes empleados");
        for (Empleado empleado : listaEmpleadosOficina) {
            System.out.println("-" + empleado.getNombre() + ", ocupación: " + empleado.getCargo());
        }

        System.out.println("El departamento "+dep2.getNombreDep().toLowerCase()+" tiene asociados los siguientes empleados");
        for (Empleado empleado : listaEmpleadosCocina) {
            System.out.println("-" + empleado.getNombre() + ", ocupación: " + empleado.getCargo());
        }
    }
}
