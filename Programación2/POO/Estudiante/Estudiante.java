package Programación2.POO.Estudiante;

import java.util.Scanner;

public class Estudiante {
    
    String nombre;
    int [] calificacion = new int [10];
    
    int contador = 0;
    
    public Estudiante (String nombre) {
        this.nombre = nombre;
        
    }


    public void AñadirCalificacion (int nota) {
        this.calificacion[this.contador] = nota;
        this.contador ++;
    }

    public double PromedioDeCalificaciones () {
        int sumaCalificaciones = 0;
        
            for (int i =0; i < contador; i++){
                sumaCalificaciones = sumaCalificaciones + calificacion[i];

            }
        
        double promedioCalificaciones = sumaCalificaciones / contador;

        return promedioCalificaciones;
        }
        
    public void MostrarPromedio() {
        double promedio = PromedioDeCalificaciones();
        if (promedio >= 6) {
            System.out.println("Felicidades has aprobado con " + promedio );
        } else {
            System.out.println("Has desaprobado con" + promedio );
        }
    }    
    }


