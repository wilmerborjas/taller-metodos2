package com.wbg.proyecto.app.animal;

public class Burro {

	public void nombre(String nombre) {
		System.out.println(" el nombre del burro es = " + nombre);
	}

	public void Edad(int anioNacimiento, int anioActual) {
		int edad = anioActual - anioNacimiento;
		System.out.println("la edad del burro es = " + edad);

	}

}
