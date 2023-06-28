/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import paquete2.*;

public class Ejecutor2 {

    public static void main(String[] args) {

        ArrayList<PasajeUrbano> pasajes = new ArrayList<>();
        String[] nombres = {"Austin", "Monique", "Glen", "Richard", "Patrick"};
        String[] apellidos = {"Martinez", "Lyons", "Kim", "Tate", "Lee"}; // no se utiliza
        String[] ide = {"11500", "34678", "204333", "80999", "23400"};
        int[] edad = {9, 70, 35, 23, 10};
        double pasajeFijo = 0.4;
        Persona personas;
        /*
        Generar un proceso que permita iterar los arreglos; el objetivo es 
        crear objetos de tipo Pasaje Menor de edad, Pasaje Normal, Pasaje 
        Universitario y Pasaje Tercera Edad. Los arreglos tienen una 
        característica, las posiciones se corresponden; por ejemplo, todas las 
        posiciones 0, crearán un objeto de cualquiera de los tipos nombrados de
        Pasajes.
        Cada objeto creado será agregado a la lista pasajes.
        
        ¿Cómo saber a que tipo de Pasaje pertenece cada objeto? Usar la edad 
        como discriminatoria.
        
        menor de edad: mayor o igual a 0 y menor o igual a 18
        universitario: mayor a 18 y menor o igual a 25
        normal: mayor a 25 y menor 65
        tercera edad: mayor o igual a 65
        
        for (String[] datos : datos001) {
            String nombrePlato = datos[0];
            double valorInicial = Double.parseDouble(datos[1]);
            double valorHelado = Double.parseDouble(datos[2]);
            double valorPastel = Double.parseDouble(datos[3]);

            MenuNinos menuNinos = new MenuNinos(nombrePlato, valorInicial, valorHelado, valorPastel);
            menuNinos.establecerValorMenu();
            lista.add(menuNinos);
        }
        
         */
        // inicio de solución
        for (int i = 0; i < nombres.length; i++) {

            if (edad[i] >= 0 && edad[i] <= 18) {
                personas = new Persona(nombres[i], ide[i], edad[i]);

                PasajeMenorEdad pME = new PasajeMenorEdad(pasajeFijo);
                pME.establecerPersona(personas);

                pasajes.add(pME);
            }
            if (edad[i] > 18 && edad[i] <= 25) {
                personas = new Persona(nombres[i], ide[i], edad[i]);
                PasajeUniversitario pu = new PasajeUniversitario(pasajeFijo);
                pu.establecerPersona(personas);
                pasajes.add(pu);
            }
            if (edad[i] > 25 && edad[i] < 65) {
                personas = new Persona(nombres[i], ide[i], edad[i]);
                PasajeNormal pn = new PasajeNormal(pasajeFijo);
                pn.establecerPersona(personas);
                pasajes.add(pn);
            }
            if (edad[i] >= 65) {
                personas = new Persona(nombres[i], ide[i], edad[i]);
                PasajeTerceraEdad pte = new PasajeTerceraEdad(pasajeFijo);
                pte.establecerPersona(personas);
                pasajes.add(pte);
            }

        }

        // fin  de solución
        // no incrementar líneas de código desde aquí
        for (int i = 0; i < pasajes.size(); i++) {
            pasajes.get(i).establecerValorPasaje();
        }

        for (int i = 0; i < pasajes.size(); i++) {
            System.out.printf("%s\n",
                    pasajes.get(i));
        }

    }
}
