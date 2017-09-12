package org.eclipse.che.examples;

/**
  * 
  * @author Julia Pineda
  *
  */
 
public class Monstruos implements FabricaRanger{
    
    /**
	 * 
	 * @param nombre
	 * @param elemento
	 * @param edad
	 * @param color
	 */
	
    private String nombre;
	private String elemento;
	private int edad;
	private String color;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String agigantarse() {
		return "Soy " + nombre + " y me vuelvo gigante";
	}
	
	public String caminarLento() {
		return "Soy " + nombre + " y camino lento";
	}
	
	public String golpear() {
		return "Soy " + nombre + " y golpeo :D";
	}
	
	public String volar() {
		if(elemento.equals("aire")) {
			return "Soy " + nombre + " y puedo volar";
		}else {
			return "Soy " + nombre + " y no puedo volar";
		}
	}
	
	public String quemar() {
		if(elemento.equals("fuego")) {
			return "Soy " + nombre + "y quemo";
		}else{
			return "Soy " + nombre + " y no puedo quemar";
		}
	}
	
	public void hacerAlgo() {
		System.out.println(toString());
		System.out.println(agigantarse());
		System.out.println(caminarLento());
		System.out.println(volar());
		System.out.println(quemar());
		System.out.println(golpear());
	}
}
