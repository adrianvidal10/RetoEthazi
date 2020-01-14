package hibernate;

import org.hibernate.Session;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class Main {
	static Session session = HibernateUtil.getSessionFactory().openSession();
	
	public static void main(String[] args) {
		CogerdatosXml guardar = new CogerdatosXml();
		Main fichero = new Main();
		
		fichero.descargarAlbergue();
		fichero.descargarCamping();
		fichero.descargarAlojamientoturistico();
		guardar.subirfitxeroempleado();
		
		insertarAlumno();
		insertarAlojamientos();
		insertarAlbergues();
		insertarCamping();
		

		
		Albergue alb = new Albergue();
		alb.setId(6);
		alb.setNombre("Primer Albergüe");		
		session.save(alb);		


		Alojamiento alo = new Alojamiento();
		alo.setId(6);
		alo.setNombre("Primer Alojamiento");		
		session.save(alo);

		
		Camping cam = new Camping();
		cam.setId(6);
		cam.setNombre("Primer Camping");		
		session.save(cam);
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}
	private static void insertarCamping() {
		// TODO Auto-generated method stub
		
	}
	private static void insertarAlbergues() {
		// TODO Auto-generated method stub
		
	}
	private static void insertarAlojamientos() {
		// TODO Auto-generated method stub
		
	}
	public static void insertarAlumno() {
		session.beginTransaction();
		// Añadir un nuevo objeto alumno
		mapeo alum = new mapeo();
		alum.setId(6);
		alum.setNombre("demo");
		alum.setApellido("user");
		alum.setEdad(1);
		session.save(alum);
	}
	public  void descargarAlbergue() throws    SAXException, TransformerConfigurationException, ParserConfigurationException {
		DocumentBuilderFactory albergues = DocumentBuilderFactory.newInstance();
		DocumentBuilder creadorAlbergues = null;
			creadorAlbergues = albergues.newDocumentBuilder();
		
		URL url = null;
		try {
			url = new URL("http://opendata.euskadi.eus/contenidos/ds_recursos_turisticos/albergues_de_euskadi/opendata/alojamientos.xml");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println("No se ha podido acceder a la url de albergues");
		}
		Document documento = null;
		try {
			documento = creadorAlbergues.parse(url.openStream());
		} catch (IOException e) {
			System.out.println(e);
			System.out.println("error al escribir el fichero");
		}
		
		TransformerFactory fábricaTransformador = TransformerFactory.newInstance();
		Transformer transformador = fábricaTransformador.newTransformer();
		Source origen = new DOMSource(documento);
		Result destino = new StreamResult("C:\\Users\\admin1\\eclipse-workspace\\Reto0\\src\\fitxeros\\albergue.xml");
		try {
			transformador.transform(origen, destino);
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println("Error al guardar el documento albergue");
		}
		}
		public  void descargarCamping() throws ParserConfigurationException, SAXException, TransformerConfigurationException, IOException {
			DocumentBuilderFactory albergues = DocumentBuilderFactory.newInstance();
			DocumentBuilder creadorAlbergues = albergues.newDocumentBuilder();
			
			URL url = null;
			try {
				url = new URL("http://opendata.euskadi.eus/contenidos/ds_recursos_turisticos/campings_de_euskadi/opendata/alojamientos.xml");
			} catch (MalformedURLException e) {
				System.out.println(e);
				System.out.println("No se ha podido acceder a la url de camping");
			}
			Document documento = creadorAlbergues.parse(url.openStream());
			
			TransformerFactory fábricaTransformador = TransformerFactory.newInstance();
			Transformer transformador = fábricaTransformador.newTransformer();
			Source origen = new DOMSource(documento);
			Result destino = new StreamResult("C:\\Users\\admin1\\eclipse-workspace\\Reto0\\src\\fitxeros\\camping.xml");
			try {
				transformador.transform(origen, destino);
			} catch (TransformerException e) {
				System.out.println(e);
				System.out.println("Error al guardar el documento camping");
			}
			}
		public void descargarAlojamientoturistico() throws ParserConfigurationException, SAXException, IOException, TransformerConfigurationException{
			DocumentBuilderFactory albergues = DocumentBuilderFactory.newInstance();
			DocumentBuilder creadorAlbergues = albergues.newDocumentBuilder();
			
			URL url = null;
			try {
				url = new URL("http://opendata.euskadi.eus/contenidos/ds_recursos_turisticos/alojamiento_de_euskadi/opendata/alojamientos.xml");
			} catch (MalformedURLException e) {
				System.out.println(e);
				System.out.println("No se ha podido acceder a la url de alojamientos");
			}
			Document documento = creadorAlbergues.parse(url.openStream());
			
			TransformerFactory fábricaTransformador = TransformerFactory.newInstance();
			Transformer transformador = fábricaTransformador.newTransformer();
			Source origen = new DOMSource(documento);
			Result destino = new StreamResult("C:\\Users\\admin1\\eclipse-workspace\\Reto0\\src\\fitxeros\\alojamientoturistico.xml");
			try {
				transformador.transform(origen, destino);
			} catch (TransformerException e) {
				System.out.println(e);
				System.out.println("Error al guardar el documento alojamientos");
			}
		}
}
