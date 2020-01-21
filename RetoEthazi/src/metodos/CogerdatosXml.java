package metodos;

import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import hibernate.Albergue;
import hibernate.Alojamiento;
import hibernate.Camping;

public class CogerdatosXml {

	
	public String nombre;
	public String ubicacion;
	public int capacidad;
	public String categoria;
	public String web;
	public String latitud;
	public String longitud;
	public String precio;
	public int idnum;
	Albergue arrayObjetos[];
	InsertarDatos insertar = new InsertarDatos();

	public void subirDatosAlbergue() {
		idnum = 0;
		try {
			int cont = 1;

			File archivo = new File("C:\\Users\\admin1\\eclipse-workspace\\Reto0\\src\\fitxeros\\albergue.xml");
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
			Document document = documentBuilder.parse(archivo);
			document.getDocumentElement().normalize();
			System.out.println("Elemento raiz:" + document.getDocumentElement().getNodeName());
			NodeList listaalbergues = document.getElementsByTagName("row");
			for (int temp = 0; temp < listaalbergues.getLength(); temp++) {
				Node nodo = listaalbergues.item(temp);
				System.out.println("Elemento:" + nodo.getNodeName());
				if (nodo.getNodeType() == Node.ELEMENT_NODE) {
					try {
						Element element = (Element) nodo;
						idnum = Integer.parseInt(element.getAttribute("num"));
						nombre = element.getElementsByTagName("documentname").item(0).getTextContent();
						ubicacion = element.getElementsByTagName("municipality").item(0).getTextContent();
						capacidad = Integer.parseInt(element.getElementsByTagName("capacity").item(0).getTextContent());
						categoria = element.getElementsByTagName("category").item(0).getTextContent();
						web = element.getElementsByTagName("web").item(0).getTextContent();
						latitud = element.getElementsByTagName("latwgs84").item(0).getTextContent();
						longitud = element.getElementsByTagName("lonwgs84").item(0).getTextContent();
						precio = element.getElementsByTagName("territorycode").item(0).getTextContent();
						System.out.println(nombre + " " + ubicacion + " " + capacidad);
						Albergue albergue = new Albergue(nombre, ubicacion, capacidad, categoria, web, latitud,
								longitud, precio);
						if (true) {
							insertar.insertaralbergue(albergue, idnum);
							cont++;
							System.out.println(cont + "subido");
						}
					} catch (Exception ex) {
						System.out.println("Fallo: " + ex);
						Element element = (Element) nodo;
						idnum = Integer.parseInt(element.getAttribute("num"));
						nombre = element.getElementsByTagName("documentname").item(0).getTextContent();
						ubicacion = element.getElementsByTagName("municipality").item(0).getTextContent();
						capacidad = Integer.parseInt(element.getElementsByTagName("capacity").item(0).getTextContent());
						categoria = element.getElementsByTagName("category").item(0).getTextContent();
						web = "www.google.es";
						latitud = "1.0000571541";
						longitud = "-1.414828548154";
						precio = element.getElementsByTagName("territorycode").item(0).getTextContent();
						System.out.println(nombre + " " + ubicacion + " " + capacidad);
						Albergue albergue = new Albergue(nombre, ubicacion, capacidad, categoria, web, latitud,
								longitud, precio);
						if (true) {
							insertar.insertaralbergue(albergue, idnum);
							cont++;
							System.out.println(cont + "subido");
						}
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void subirDatosAlojaminetos() {
		idnum = 0;
		try {
			int cont = 1;

			File archivo = new File(
					"C:\\Users\\admin1\\eclipse-workspace\\Reto0\\src\\fitxeros\\alojamientoturistico.xml");
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
			Document document = documentBuilder.parse(archivo);
			document.getDocumentElement().normalize();
			System.out.println("Elemento raiz:" + document.getDocumentElement().getNodeName());
			NodeList listaalojaminetos = document.getElementsByTagName("row");
			for (int temp = 0; temp < listaalojaminetos.getLength(); temp++) {
				Node nodo = listaalojaminetos.item(temp);
				System.out.println("Elemento:" + nodo.getNodeName());
				if (nodo.getNodeType() == Node.ELEMENT_NODE) {
					try {
						Element element = (Element) nodo;
						idnum = Integer.parseInt(element.getAttribute("num"));
						nombre = element.getElementsByTagName("documentname").item(0).getTextContent();
						ubicacion = element.getElementsByTagName("municipality").item(0).getTextContent();
						capacidad = Integer.parseInt(element.getElementsByTagName("capacity").item(0).getTextContent());
						categoria = element.getElementsByTagName("category").item(0).getTextContent();
						web = element.getElementsByTagName("web").item(0).getTextContent();
						latitud = element.getElementsByTagName("latwgs84").item(0).getTextContent();
						longitud = element.getElementsByTagName("lonwgs84").item(0).getTextContent();
						precio = element.getElementsByTagName("territorycode").item(0).getTextContent();
						System.out.println(nombre + " " + ubicacion + " " + capacidad);
						Alojamiento alojamientos = new Alojamiento(nombre, ubicacion, capacidad, categoria, web,
								latitud, longitud, precio);
						if (true) {
							insertar.insertarAlojamineto(alojamientos, idnum);
							cont++;
							System.out.println(cont + "subido");
						}
					} catch (Exception ex) {
						System.out.println("Fallo: " + ex);
						Element element = (Element) nodo;
						idnum = Integer.parseInt(element.getAttribute("num"));
						nombre = element.getElementsByTagName("documentname").item(0).getTextContent();
						ubicacion = element.getElementsByTagName("municipality").item(0).getTextContent();
						capacidad = Integer.parseInt(element.getElementsByTagName("capacity").item(0).getTextContent());
						categoria = element.getElementsByTagName("category").item(0).getTextContent();
						web = "www.google.es";
						latitud = "1.0000571541";
						longitud = "-1.414828548154";
						precio = element.getElementsByTagName("territorycode").item(0).getTextContent();
						System.out.println(nombre + " " + ubicacion + " " + capacidad);
						Alojamiento alojamientos = new Alojamiento(nombre, ubicacion, capacidad, categoria, web,
								latitud, longitud, precio);
						if (true) {
							insertar.insertarAlojamineto(alojamientos, idnum);
							cont++;
							System.out.println(cont + "subido");
						}
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void subirDatosCamping() {
		try {
			int cont = 1;

			File archivo = new File("C:\\Users\\admin1\\eclipse-workspace\\Reto0\\src\\fitxeros\\camping.xml");
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
			Document document = documentBuilder.parse(archivo);
			document.getDocumentElement().normalize();
			System.out.println("Elemento raiz:" + document.getDocumentElement().getNodeName());
			NodeList listacamping = document.getElementsByTagName("row");
			for (int temp = 0; temp < listacamping.getLength(); temp++) {
				Node nodo = listacamping.item(temp);
				System.out.println("Elemento:" + nodo.getNodeName());
				if (nodo.getNodeType() == Node.ELEMENT_NODE) {
					try {
						Element element = (Element) nodo;
						idnum = Integer.parseInt(element.getAttribute("num"));
						nombre = element.getElementsByTagName("documentname").item(0).getTextContent();
						ubicacion = element.getElementsByTagName("municipality").item(0).getTextContent();
						capacidad = Integer.parseInt(element.getElementsByTagName("capacity").item(0).getTextContent());
						categoria = element.getElementsByTagName("category").item(0).getTextContent();
						web = element.getElementsByTagName("web").item(0).getTextContent();
						latitud = element.getElementsByTagName("latwgs84").item(0).getTextContent();
						longitud = element.getElementsByTagName("lonwgs84").item(0).getTextContent();
						precio = element.getElementsByTagName("territorycode").item(0).getTextContent();
						System.out.println(nombre + " " + ubicacion + " " + capacidad);
						Camping campings = new Camping(nombre, ubicacion, capacidad, categoria, web, latitud, longitud,
								precio);
						if (true) {
							insertar.insertarCamping(campings, idnum);
							/*java.util.Date nuevaFecha = new Date(2020, 01, temp);

			                 Calendar cal = Calendar.getInstance();
			                 cal.setTime(yourDAte);
			                 cal.add(Calendar.DATE, 5);
			                 nuevaFecha = cal.getTime();
							for (int x = 0; x < 5; x++) {
								calendar.setTime(Fecha);
								// Configuramos la fecha que se recibe
								String fecha = Fecha.toString();
								insertar.insertarcampinghistorico(idnum, fecha);

								calendar.add(Calendar.DATE, 1); // numero de d�as a a�adir, o restar en caso de
																		// d�as<0
								Fecha = calendar.getTime();
							}*/
							cont++;
							System.out.println(cont + "subido");
						}
					} catch (Exception ex) {
						System.out.println("Fallo: " + ex);
						Element element = (Element) nodo;
						idnum = Integer.parseInt(element.getAttribute("num"));
						nombre = element.getElementsByTagName("documentname").item(0).getTextContent();
						ubicacion = element.getElementsByTagName("municipality").item(0).getTextContent();
						capacidad = Integer.parseInt(element.getElementsByTagName("capacity").item(0).getTextContent());
						categoria = element.getElementsByTagName("category").item(0).getTextContent();
						web = "www.google.es";
						latitud = "1.0000571541";
						longitud = "-1.414828548154";
						precio = element.getElementsByTagName("territorycode").item(0).getTextContent();
						System.out.println(nombre + " " + ubicacion + " " + capacidad);
						Camping campings = new Camping(nombre, ubicacion, capacidad, categoria, web, latitud, longitud,
								precio);
						if (true) {
							insertar.insertarCamping(campings, idnum);
							cont++;
							System.out.println(cont + "subido");
						}
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	

	/*public boolean verificarCampos(Albergue albergue) {
		boolean lleno = true;
		if (albergue.getNombre().equals(null)
				lleno = false;
		}
		return lleno;
		
	}*/
}
