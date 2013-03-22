import java.io.IOException;

import javax.swing.text.Document;
import javax.xml.bind.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.springframework.core.io.ClassPathResource;
import org.xml.sax.SAXException;



public class XmlHelper {

    /**
     * Return he dom root element of an xml file
     * @param filePathInClassPath  the file path relative to the classpath
     * @return  the root element
     * @throws ParserConfigurationException
     * @throws IOException
     * @throws SAXException
     */
    public static Element getRootElementFromFileInClasspath(String filePathInClassPath) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

        // root elements
    Document doc = (Document) docBuilder.parse(new ClassPathResource(filePathInClassPath).getInputStream());
        return (Element) ((org.w3c.dom.Document) doc).getDocumentElement();
    }

}
