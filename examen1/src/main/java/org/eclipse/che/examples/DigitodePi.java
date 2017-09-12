package org.eclipse.che.examples;

/**
  * 
  * @author Julia Pineda
  *
  */

public class DigitodePi implements Chudnovsky{
    
    public double calcularPi(int nDigitos) {
        
    /**
	 * @param n1
	 * @param n2
	 * @param n3
	 */
	
	  /**
	 * @metoth calcula los digitos de Pi, por medio de recursividad, haciendo uso 
	 * de los metodos de recursividad de factorial y potencia
	 */
	
        int n1=545140134;
        int n2=13591409;
        double n3=2.625374127E17;
        
		if(nDigitos == 0) {
			return 0;
		}else {
			return  ((Factorial(6*nDigitos)*((n1*nDigitos)+n2))/
			     ((Factorial(3*nDigitos)) * (Potencia(nDigitos,3)) * (Potencia(-n3,nDigitos)))) 
			     + calcularPi(nDigitos-1);
		}
		
	/**
	 * @return retorna los digitos para Pi, en donde si nDigitos es 0, retorna 0, de lo contrario
	 * calcula los digios utilizando recursividad
	 */
	}
	
	public int Factorial(int n) {
		if(n==0) {
			return 1;
		}else {
			return n * Factorial(n-1);
		}
	}
	
	    /**
	 * @return retorna el factorial de n, hasta que n sea igual a 1
	 */
	
	public double Potencia(double a, int b) {
		if(b==0) {
			return 1;
		}else {
			return a * Potencia(a,b-1);
		}
	}
	
	  /**
	 * @return retorna el potencial, hasta que n sea igual a 1
	 */
}
