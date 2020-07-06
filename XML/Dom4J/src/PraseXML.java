import java.util.Iterator;
import java.util.jar.Attributes;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class PraseXML {
	public static void main(String[] args) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read("src/NewFile.xml");
        
        Element root = document.getRootElement();
        
        System.out.println(root.getName());
        
        Iterator<Element> it = root.elementIterator();
        while(it.hasNext()) {
        	Element ele = it.next();
        	Iterator<Attribute> attributes = ele.attributeIterator();
        	while(attributes.hasNext()) {
        		Attribute ab = attributes.next();
        		System.out.println(ab.getName() + ":" + ab.getValue());
        	}
        }
	}
}
