package com.wbg.proyecto.app.Objetos;

public class Cama {

	public void Material(String material) {
		System.out.println("el material de la cama es = " + material);
	}

	public void calcularAniosUso(int anioFabricacion, int anioActual) {
		int Uso = anioActual - anioFabricacion;
		System.out.println("tiempo de uso = " + Uso);

	}

}
