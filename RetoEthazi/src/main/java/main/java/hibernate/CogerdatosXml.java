package main.java.hibernate;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import hibernate.Albergue;

public class CogerdatosXml {

	
	public String Id;
	public String ubicacion;
	public int capacidad;
	public String categoria;
	public String web;
	public double latitud;
	public double longitud;
	public double precio;
	public  void subirfitxeroempleado() {
        try {
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
                    Element element = (Element) nodo;                 
                    String nombre = element.getElementsByTagName("documentname").item(0).getTextContent();
                    ubicacion= element.getElementsByTagName("municipality").item(0).getTextContent();
                    capacidad= Integer.parseInt(element.getElementsByTagName("capacity").item(0).getTextContent());
                    categoria= element.getElementsByTagName("category").item(0).getTextContent();
                    web= element.getElementsByTagName("web").item(0).getTextContent();
                    latitud= Double.parseDouble( element.getElementsByTagName("latwgs84").item(0).getTextContent());
                    longitud= Double.parseDouble(element.getElementsByTagName("lonwgs84").item(0).getTextContent());
                    precio= Double.parseDouble(element.getElementsByTagName("territorycode").item(0).getTextContent());
                    
                    Albergue arrayObjetos[]=new Albergue[listaalbergues.getLength()];
                    //Creamos objetos en cada posicion
                    arrayObjetos[temp]=new Albergue(Id,nombre);
                    
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	public void guardarDatosAlbergue() {
		Albergue albergue = new Albergue(null, null);
		
	}
}
