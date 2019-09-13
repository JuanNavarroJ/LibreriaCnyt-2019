package edu.eci.cnyt.libreriaNumerosComplejos;

/**
 * Clase que es la representacion de un numero complejo.
 * @author Juan David
 * @version	1
 */
public class NumeroComplejo {
	
	//Atributos
	private double pReal;
	private double pImaginario;
	
	/**
	 * Constructor de la clase Numero complejo.
	 * @param	real	Es la parte real del numero complejo.
	 * @param	imaginario	Es la parte imaginaria del numero complejo.
	 */
	public NumeroComplejo(double pReal, double pImaginario ) {
		this.pReal = pReal;
		this.pImaginario = pImaginario;
	}
	
	//Metodos
	
	/**
	 * Metodo que permite hacer el conjugado al numero complejo.
	 * @return	Retorna El conjugado del numero complejo que es un nuevo numero complejo.
	 */
	public NumeroComplejo conjugado() {
		return new NumeroComplejo(pReal, pImaginario*-1);
	}
	
	/**
	 * Metodo que permite obtener el opuesto del numero complejo.
	 * @return	Retorna el opuesto del numero complejo.
	 */
	public NumeroComplejo opuesto() {
		return new NumeroComplejo(pReal*-1, pImaginario*-1);
	}
	
	/**
	 * Metodo que permite hacer el modulo al numero complejo.
	 * @return	Retorna el modulo del numero complejo.
	 */
	public double modulo() {
		double interno = Math.pow(pReal, 2) + Math.pow(pImaginario, 2);
		return Math.sqrt(interno);
	}
	
	/**
	 * Metodo que permite hacer la fase al numero complejo.
	 * @return	Retorna la fase del numero complejo.
	 */
	public double fase() {
		double ang = Math.toDegrees(Math.atan(pImaginario/pReal));
		return ang;
	}
	
	/**
	 * Metodo que retorna la parte real del numero complejo.
	 * @return	Retorna la parte real.
	 */
	public double getReal() {
		return pReal;
	}
	
	/**
	 * Metodo que retorna la parte imaginaria del numero complejo.
	 * @return	Retorna la parte imaginaria.
	 */
	public double getImaginario() {
		return pImaginario;
	}
	
	public boolean equals(NumeroComplejo num1) {
		boolean resp = false;
		if(num1.getReal() == this.getReal() && num1.getImaginario() == this.getImaginario()) {
			resp = true;
		}
		return resp;
	}
}
