package hibernate;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="albergue")


public class Albergue implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY )
	@Column(name="Id",length=5)
	private String Id;
	
	@Column(name="Nombre",length=30, nullable = false)
	private String Nombre;
	
	private String nombre;
	private String ubicacion;
	private int capacidad;
	private String categoria;
	private String web;
	private String latitud;
	private String longitud;
	private String precio;

	public Albergue(String nombre, String ubicacion, int capacidad, String categoria, String web, String latitud,
			String longitud, String precio) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.capacidad = capacidad;
		this.categoria = categoria;
		this.web = web;
		this.latitud = latitud;
		this.longitud = longitud;
		this.precio = precio;
	}

	public Albergue() {
		// TODO Auto-generated constructor stub
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}
}

