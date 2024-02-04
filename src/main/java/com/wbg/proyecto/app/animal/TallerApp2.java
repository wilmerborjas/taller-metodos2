package com.wbg.proyecto.app.animal;

import com.wbg.proyecto.app.Objetos.Cama;

public class TallerApp2 {

	public static void main(String[] args) {

		Vaca vaca = new Vaca();
		vaca.nombre("lola");
		vaca.calcularEdad(2015, 2024);

		Burro burro = new Burro();
		burro.nombre(" Oscar ");
		burro.Edad(2010, 2030);

		Cama cama = new Cama();
		cama.Material("Madera");
		cama.calcularAniosUso(2022, 2024);

	}

}
