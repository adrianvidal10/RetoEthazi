package hibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="alumno")


public class mapeo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="Id",nullable=false,length=5)
	private int Id;
	
	@Column(name="Nombre",length=15)
	private String Nombre;
	
	@Column(name="Apellido",length=15)
	private String Apellido;
	
	@Column(name="Edad",length=3)
	private int Edad;
	
	public mapeo() {
		
	}
	
	public mapeo(int Id,String Nombre,String Apellido,int Edad) {
		
		this.Id=Id;
		this.Nombre=Nombre;
		this.Apellido=Apellido;
		this.Edad=Edad;
	}
	
	
	public int getId() {
		
		return Id;
	}
	
	
	public void setId(int Id) {
		
		this.Id=Id;
	}
	
	
	public String getNombre() {

		return Nombre;

		}
	
	public void setNombre(String nombre) {

		this.Nombre = Nombre;

		}
	
	
	public String getApellido() {
		
		return Apellido;
	}
	
	
	public void setApellido(String Apellido) {
		
		this.Apellido=Apellido;
	}
	
	
	public int getEdad() {
		
		return Edad;
	}
	
	
	public void setEdad(int Edad) {
		
		this.Edad=Edad;
	}
}
