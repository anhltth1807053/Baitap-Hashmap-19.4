package crawler.coffee.biz;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class MyMainCrawler {

    private static ThreadPoolExecutor threadPoolExecutor;

    public static void main(String[] args) {
//        threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(50);
//        threadPoolExecutor.execute(new BizCrawler());
        // List < Collection
//        ArrayList<String> listString = new ArrayList<String>();
//        listString.add("Hung");
//        listString.add("Nhung");
//        listString.add("Chung");
//        listString.add("Tung");
//        String keyword = "Tung";
//
//        for (int i = 0; i < listString.size(); i++) {
//            if(listString.get(i).equals(keyword)){
//                System.out.println("Trung roi.");
//            }
//            System.out.println(listString.get(i));
//        }

        // - link
        // - index (boolean)

        HashMap<String, Boolean> map = new HashMap<String, Boolean>();
        map.keySet();
        map.values();
        boolean value = map.get("aaa");
        map.containsKey("");

        HashSet<String> setString = new HashSet<String>();
        String getLink = "http://cafebiz.vn";
        try {
            while (true) {
                Document document = Jsoup.connect(getLink).get();
                Elements elements = document.select("a");
                for (Element element :
                        elements) {
                    String link = element.attr("href");
                    setString.add(link);
                }
                System.out.println(setString.size());
                for (String st :
                        setString) {
                    System.out.println(st);
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
