import java.io.FileWriter;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class CreateXML {
	public static void main(String[] args) throws Exception {
		Document document = DocumentHelper.createDocument();
		Element root = document.addElement("root");
		
		Element author1 = root.addElement("author")
				.addAttribute("name", "James")
				.addAttribute("location", "UK")
				.addText("James Strachan");
		
		Element author2 = root.addElement("author")
				.addAttribute("name", "Bob")
				.addAttribute("location", "US")
				.addText("Bob McWhirter");
		
		FileWriter out = new FileWriter("src/CreatedXMLByDom4j.xml");
		document.write(out);
		out.close();
		
	}
}
