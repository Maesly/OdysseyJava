package Cliente;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author maesly
 */
public class XmlWriter {
    
    public void writeUser(String nombre, String apellido, String edad, String nombreUsuario, String contraseña,
                            String amigos, String generos){
        try{
            DocumentBuilderFactory docBFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = docBFactory.newDocumentBuilder();
            
            
            //Elementos de la raiz 
            Document doc = documentBuilder.newDocument();
            Element rootElement = doc.createElement("Usuarios");
            doc.appendChild(rootElement);
            
            //Elementos del usuario
            Element name = doc.createElement("nombre");
            name.appendChild(doc.createTextNode(nombre));
            rootElement.appendChild(name);
            
            Element last_name = doc.createElement("apellido");
            last_name.appendChild(doc.createTextNode(apellido));
            rootElement.appendChild(last_name);
            
            Element age = doc.createElement("edad");
            age.appendChild(doc.createTextNode(edad));
            rootElement.appendChild(age);
            
            Element user_name = doc.createElement("nombreUsuario");
            user_name.appendChild(doc.createTextNode(nombreUsuario));
            rootElement.appendChild(user_name);
            
            Element password = doc.createElement("contraseña");
            password.appendChild(doc.createTextNode(contraseña));
            rootElement.appendChild(password);
            
            Element friends = doc.createElement("amigos");
            friends.appendChild(doc.createTextNode(amigos));
            rootElement.appendChild(friends);
            
            Element genders = doc.createElement("generos");
            genders.appendChild(doc.createTextNode(generos));
            rootElement.appendChild(genders);
          
            //Escribir contenido en xml
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("/home/maesly/NetBeansProjects/Odissey/src/Algoritmos/Canciones.xml"));
            
            transformer.transform(source, result);
            
            String t = rootElement.getChildNodes().toString();
            System.out.println("File saved!");
            System.out.println(t);
            
        }catch(ParserConfigurationException pce){
            pce.printStackTrace();
        }catch(TransformerException tfe){
            tfe.printStackTrace();
        }
    }
    
}
