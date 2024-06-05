package guia7;

public class Alumno {
	
	private String name;
	private String nacionalidad;
	
	public Alumno(String name, String nacionalidad)  {
		
		this.name = name;
		this.nacionalidad = nacionalidad;
	}
	

	public Alumno() {
	
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return "Alumno [name=" + name + ", nacionalidad=" + nacionalidad + "]";
	}
	
	
}
