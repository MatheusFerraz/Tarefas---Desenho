package geometria.entidades;

public class GeometriaException extends Exception {
	
	private static final long serialVersionUID = -1101918872570381084L;

	public GeometriaException() {
		super("Valor inválido para medida de uma das dimensões da figura geométrica.");
	}
	
}
