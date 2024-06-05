package guia7;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner; 
public class GestionAlumnos {
	
	HashMap<String, Alumno> mapa=new HashMap<>();
	 
	
	public void AgregarAlumno(Alumno a) //comun sin excepciones
	{
		
		
		
		mapa.put(a.getNacionalidad(), a);
		
	}
	public void AgregarAlumnoTecla()throws IOException //con la excepcion de que si osi se le agregue el apellido
	{
		Boolean flag=false;
		Scanner scan =new Scanner(System.in);
		Alumno a =new Alumno();
		while(flag==false) 
		{
			try {
				  System.out.println("ingrese nombre");
				  a.setName(scan.nextLine());
				  
				  System.out.println("ingrese nacionalidad");
				  a.setNacionalidad(scan.nextLine());
				  
				  if(a.getNacionalidad().isEmpty()) 
				       {
					     throw new Exception ("tenes que agregar la nacionalidad");
				       }
				
				  flag=true;
			    }
				
				
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
	}
		
	
	
	public void VerNacionalidad(String nacionalidad) 
	{
		int cont;
		for (Map.Entry<String,Alumno> map: mapa.entrySet()) 
		{ 
			
			if (map.getKey()==nacionalidad)
			{
				cont=cuantos(nacionalidad);
				System.out.println("nacionalidad :"+map.getKey()+""+"nombre :"+map.getValue()+"cantidad"+""+cont);
			}
			
			//System.out.println("nacionalidad :"+map.getKey()+""+"nombre :"+map.getValue());
		}
	}
	
	public Integer cuantos(String nacionalidad) 
	{
		int cont=0;
		for(Map.Entry<String,Alumno> map: mapa.entrySet()) 
		{
			if(map.getKey()==nacionalidad) 
			{
				
				cont++;
			}
		}
		return cont;
	}
	
	public void elimina (Alumno a) {
		if(this.mapa.isEmpty()) {
		try {
		      for(Map.Entry<String, Alumno> map :mapa.entrySet())  
		       {
			      if(map.getValue().equals(a)) 
			        {
			    	  this.mapa.remove(map.getValue());
				
			        }
			
		       }
		
		    }catch(Exception e) 
                   {
	                  System.out.println(e.getMessage());
                   }
		}
		
		
		
	}
	public void verTodos() {
		
		for(Map.Entry<String,Alumno> map :mapa.entrySet()) {
			System.out.println("nacionalidad :"+map.getKey()+""+"nombre :"+map.getValue());
			
		}
	}
    
}
