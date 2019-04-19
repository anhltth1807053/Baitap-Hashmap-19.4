package mainthread;

import entity.News;
import model.NewsModel;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Calendar;

public class MyMain {
    public static void main(String[] args) {
        try {
            Document document = Jsoup.connect("http://cafebiz.vn/").get();
            Elements elements = document.select(".listtimeline ul > li[ispopup='1'] h3 a");
//            Elements elements = document.select("[id^='LocalNewsId'] h3 a");
            for (Element e :
                    elements) {
                System.out.println(e.attr("href"));
                System.out.println(e.text() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
