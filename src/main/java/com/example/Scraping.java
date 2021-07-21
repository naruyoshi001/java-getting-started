package com.example;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Scraping {
    public static String scrapingTest() throws IOException {
    	Document doc = Jsoup.connect("https://resource.pokemon-home.com/battledata/rankmatch_detail.html").get();
        // 各記事のaタグを取得。jQueryのセレクターと同じ感じで記載
        Elements newsHeadlines = doc.select("title");

        String title = "";
        for (Element headline : newsHeadlines) {
        	title = "title: " + headline.ownText() + ",  href: " + headline.absUrl("href");
        }

        return title;
    }
}