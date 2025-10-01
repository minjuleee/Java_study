package day17;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String URL = "https://www.moviechart.co.kr/rank/realtime/index/image";
		
		try {
			Document doc = Jsoup.connect(URL).get();
			System.out.println(doc);
			
			Elements elements = doc.select("div.movie-title"); // CSS Selector
			int rank = 1;
			for(Element element : elements) {
				System.out.println(rank + "위 : " + element.text());
				rank++;
			}
		}
		catch(Exception e) { e.printStackTrace(); }
	}

}
