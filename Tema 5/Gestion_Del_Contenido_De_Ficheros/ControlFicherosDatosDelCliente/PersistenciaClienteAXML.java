package Gestion_Del_Contenido_De_Ficheros.ControlFicherosDatosDelCliente;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.crypto.dsig.TransformException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


public class PersistenciaClienteAXML {
    public static void write(ArrayList<Cliente> listaDeClientes) throws IOException,
                                FileNotFoundException, ParserConfigurationException,
                                TransformerConfigurationException, TransformerException{

        final String RUTA = "Tema 5/Gestion_Del_Contenido_De_Ficheros/ControlFicherosDatosDelCliente/";
        final String NOMBRE = "clientes.xml";
        
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element root = document.createElement("Clientes");
        document.appendChild(root);
        
        Element clienteElement;
        for (Cliente clienteAEscribir : listaDeClientes) {
            clienteElement = crearUnNodoClienteCompleto(document, clienteAEscribir);

            root.appendChild(clienteElement);
        }

        Transformer traductor = TransformerFactory.newInstance().newTransformer();
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new File(RUTA + NOMBRE));

        traductor.transform(source, result);
    }

    private static Element crearUnNodoClienteCompleto(Document document, Cliente clienteAEscribir) {
        Element clienteElement;
        Element elementsSon;
        Element elementsGranson;

        //Creo el elemento principal Cliente con el ID correspondiente
        clienteElement = document.createElement("Cliente");
        clienteElement.setAttribute("id", "" + clienteAEscribir.getId());


        //Creo el elemento NIF
        elementsSon = document.createElement("NIF");
        elementsSon.appendChild(document.createTextNode(clienteAEscribir.getNif()));
        clienteElement.appendChild(elementsSon);


        //Creo los elementos Nombre y Apellidos
        elementsSon = document.createElement("Firma");

        elementsGranson = document.createElement("Nombre");
        elementsGranson.appendChild(document.createTextNode(clienteAEscribir.getNombre()));
        elementsSon.appendChild(elementsGranson);

        elementsGranson = document.createElement("Apellidos");
        elementsGranson.appendChild(document.createTextNode(clienteAEscribir.getApellidos()));
        elementsSon.appendChild(elementsGranson);

        clienteElement.appendChild(elementsSon);


        //Creo el elemento Email
        elementsSon = document.createElement("Email");
        elementsSon.appendChild(document.createTextNode(clienteAEscribir.getEmail()));
        clienteElement.appendChild(elementsSon);
        return clienteElement;
    }

    public static String read(String fichero) throws Exception {
        StringBuilder xmlResultado = new StringBuilder("Clientes\n");

        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(fichero);
        Element root = (Element) document.getFirstChild();
        NodeList clientes = root.getElementsByTagName("Cliente");

        for (int i = 0; i < clientes.getLength(); i++) {
            //Operacion complicada, pero resultado bonito
            elementoClienteToString(xmlResultado, clientes, i);

            //Operacion Sencilla, pero resultado feo 
            //xmlResultado.append(clientes.item(i).getTextContent());
        }

        return xmlResultado.toString();
    }

    private static void elementoClienteToString(StringBuilder xmlResultado, NodeList clientes, int i) {
        Element clienteNode;
        Element sonNode;
        clienteNode = (Element) clientes.item(i);
        xmlResultado.append("Cliente id: " + clienteNode.getAttribute("id") + "\t");

        sonNode = (Element) clienteNode.getElementsByTagName("NIF").item(0);
        xmlResultado.append("NIF: " + sonNode.getFirstChild().getTextContent() + "\t");

        sonNode = (Element) clienteNode.getElementsByTagName("Firma").item(0);
        xmlResultado.append("Nombre: " + sonNode.getFirstChild().getTextContent() + " ");
        xmlResultado.append("Apellidos: " + sonNode.getLastChild().getTextContent() + "\n");

        sonNode = (Element) clienteNode.getElementsByTagName("Email").item(0);
        xmlResultado.append("Email: " + sonNode.getFirstChild().getTextContent());

        xmlResultado.append("\n");
    }

    public static void main(String[] args) {
        //Test del write()
        
        // /*

        ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();

        listaDeClientes.add(new Cliente("235d", "Juulio", "Puff puff", "kk@du.com"));
        listaDeClientes.add(new Cliente("254354735d", "Juliia", "Puff pufff", "kak@sdf.com"));
        listaDeClientes.add(new Cliente("23452354F", "JJulie", "Puff puffff", "kk@d.com"));
        listaDeClientes.add(new Cliente("23452345354F", "Julliu", "Puff pufffff", "kk@sdcv.com"));

        try {
            write(listaDeClientes);
        } catch (Exception e) {
            System.out.println("Problema con el Write\n\n\n" + e.getMessage());
        }
        // */
    
        System.out.println("Write completado con éxito");


        //Test del read()    
        // /**
        String ruta = "Tema 5/Gestion_Del_Contenido_De_Ficheros/ControlFicherosDatosDelCliente/";
        String nombreFichero = "clientes.xml";
        
        String listaDeClientes2;

        try {
            listaDeClientes2 = read(ruta + nombreFichero);
            System.out.println(listaDeClientes2);
        } catch (Exception e) {
            System.out.println("Problema con el Read()\n\n\n" + e);
        }

        // */
    
    }
}
