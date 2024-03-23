package utils;

import org.openqa.selenium.By;

public interface Locators {

    public interface MainPage {
        By BUTTON = By.xpath("(//span[contains(text(),'Заглавная страница')])[2]");
        By BUTTON2 = By.xpath("(//span[contains(text(),'Обсуждение')])[2]");
    }

    public interface SearchResultPage {
        By HEADER_TEXT = By.xpath("(//span[@class='mw-page-title-namespace'])[1]");
    }

}



