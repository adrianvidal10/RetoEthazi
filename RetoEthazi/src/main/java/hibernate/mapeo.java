package hibernate;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
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

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY )
	@Column(name="Id",length=5)
	private int Id;
	
	@Column(name="Nombre",length=15, nullable = false)
	private String Nombre;
	
	@Column(name="Apellido",length=15, nullable = false)
	private String Apellido;
	
	@Column(name="Edad",length=3, nullable = false)
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
	
	public void setNombre(String Nombre) {

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
