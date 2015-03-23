package geometria.entidades;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner entradaMedida = new Scanner(System.in);
			double medidaLado = 0.0;

			Quadrado quadrado = new Quadrado();

			System.out.println("Informe a media do lado do quadrado em centímetros: " + "\n");
			medidaLado = entradaMedida.nextDouble();
			quadrado.setMedidaLado(medidaLado);

			double areaQuadrado = 0.0;
			double perimetroQuadrado = 0.0;

			areaQuadrado = quadrado.calcularAreaFigura();
			perimetroQuadrado = quadrado.calcularPerimetroFigura();

			System.out
					.println("Área do quadrado cuja medida do lado informada foi igual a "
							+ quadrado.getMedidaLado()
							+ " centímetros: "
							+ areaQuadrado + " centímetros quadrados.");

			System.out
					.println("Perímetro do quadrado cuja medida do lado informada foi igual a "
							+ quadrado.getMedidaLado()
							+ " centímetros: "
							+ perimetroQuadrado + ".");

			entradaMedida.close();

		} catch (GeometriaException gException) {
			System.out.println("Um erro ocorreu: " + gException.getMessage());
		}
	}
}
