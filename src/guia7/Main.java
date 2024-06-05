package guia7;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException 
	{
		Alumno a1=new Alumno("juan","Colombia");
		Alumno a2=new Alumno("pedro","giorgia");
		Alumno a3=new Alumno("jose","Armenia");
		Alumno a4=new Alumno("jonas","Costa rica");
		GestionAlumnos g = new GestionAlumnos();
		g.AgregarAlumno(a1);
		g.AgregarAlumno(a2);
		g.AgregarAlumno(a3);
		g.AgregarAlumno(a4);
		
		
		
		
	}

}
