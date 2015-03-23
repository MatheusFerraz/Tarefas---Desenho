package geometria.entidades;

public class Quadrado extends FiguraGeometrica {
	
	private double medidaLado;
	
	public Quadrado() {
		
	}
	
	public Quadrado(double medidaLadoQuadrado) {
		this.medidaLado = medidaLadoQuadrado;
	}
	
	public double getMedidaLado() {
		return medidaLado;
	}
	
	public void setMedidaLado(double medidaLado) throws GeometriaException {
		if(medidaLado <= 0.0) {
			throw new GeometriaException();
		} else {
			this.medidaLado = medidaLado;
		}
	}

	@Override
	public double calcularAreaFigura() {
		double areaQuadrado = 0.0;
		double medidaLadoQuadrado = this.medidaLado;
		
		areaQuadrado = (medidaLadoQuadrado * medidaLadoQuadrado);
		
		return areaQuadrado;
	}

	@Override
	public double calcularPerimetroFigura() {
		double perimetroQuadrado = 0.0;
		double medidaLadoQuadrado = this.medidaLado;
		
		perimetroQuadrado = (4 * medidaLadoQuadrado);
		
		return perimetroQuadrado;
	}

}
