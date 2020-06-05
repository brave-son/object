import java.io.IOException;

import javax.swing.text.Document;

import org.jsoup.Jsoup;

public class Parsing {
	public static void main(String[] args) throws IOException {
		Document doc = (Document) Jsoup.connect("http://example.com/").get(); String title = ((org.jsoup.nodes.Document) doc).title();

		
	}

}
