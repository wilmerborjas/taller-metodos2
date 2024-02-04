package com.wbg.proyecto.app.animal;

public class Vaca {

	public void nombre(String nombre) {
		System.out.println("el nombre de la vaca es = " + nombre);
	}

	public void calcularEdad(int anioNacimiento, int anioActual) {
		int edad = anioActual - anioNacimiento;
		System.out.println("la edad de la vaca = " + edad);

	}

}
