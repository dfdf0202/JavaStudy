package ch7;

public class Ch7_Ex8 {

	public static void main(String[] args) {
		
		Paresable parser = Parsermanager.getParser("XML");
		parser.parse("document.xml");
		parser = Parsermanager.getParser("HTML");
		parser.parse("document2.html");
		
	}

}

interface Paresable{
	public void parse(String fileName);
}

class Parsermanager{
	public static Paresable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		}else {
			return new HTMLParser();
		}
	}
}

class XMLParser implements Paresable{
	
	public void parse(String fileName) {
		System.out.println(fileName + "- XML parsing completed.");
	}
	
}

class HTMLParser implements Paresable{
	public void parse(String fileName) {
		System.out.println(fileName + "- HTML parsing completed.");
	}
}
