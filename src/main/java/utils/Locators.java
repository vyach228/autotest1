package utils;

import org.openqa.selenium.By;

public interface Locators {

    public interface MainPage {
        By BUTTON = By.xpath("(//span[contains(text(),'Заглавная страница')])[2]");
    }

    public interface SearchResultPage {
        By HEADER_TEXT = By.xpath("(//span[contains(text(),'Заглавная')])[2]");
    }

}