package javabean;

public class Empleado implements java.io.Serializable{  
	private int id;  
	private String nombreYApellido;  
  
public Empleado(){}  
  
public void setId(int id){this.id=id;}  
  
public int getId(){return id;}  
  
public void setNombreYApellido(String nombreYApellido){this.nombreYApellido=nombreYApellido;}  
  
public String getNombreYApellido(){return nombreYApellido;}  
  
}  

