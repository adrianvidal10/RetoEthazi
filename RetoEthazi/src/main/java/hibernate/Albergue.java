package hibernate;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="alberg�e")


public class Alberg�e implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY )
	@Column(name="Id",length=5)
	private int Id;
	
	@Column(name="Nombre",length=30, nullable = false)
	private String Nombre;
	
	public Alberg�e() {
		
	}
	
	public Alberg�e(int Id,String Nombre) {
		
		this.Id=Id;
		this.Nombre=Nombre;
		
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
}

