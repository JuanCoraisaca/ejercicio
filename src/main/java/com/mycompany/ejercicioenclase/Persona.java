/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioenclase;

/**
 *
 * @author PC-15
 */
public class Persona {

    String cedula;
    String nombre;
    int fechaNacimiento;

    public int obtenerEdad() {
        var edad = 2022 - fechaNacimiento;
        return edad;
    }

    public boolean esCedulaValida() {
        if (cedula.length() == 10) {
            return true;
        } else {
            return false;
        }
    }

}
