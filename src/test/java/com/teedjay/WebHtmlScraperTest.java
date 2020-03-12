package com.teedjay;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebHtmlScraperTest {

    WebHtmlScraper scraper = new WebHtmlScraper();
    String address = "https://ap.unit4.com/";

    @Test
    public void fetch() throws Exception {

        String webpage = scraper.fetch(address);
        assertTrue(webpage.contains("when this text is found nagios knows we are online"), "Expected nagios pattern not found");

    }

}
