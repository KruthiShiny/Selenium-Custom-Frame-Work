package org.example.base;
import org.example.Utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.sql.SQLException;

//import static com.thetestingacademy.driver.DriverManager.getDriver;
import static org.example.drivers.DriverManager.getDriver;

public class CommonToAllPages {
    public void openVWOUrl() throws SQLException {
        getDriver().get(PropertiesReader.readKey("url"));


    }

    public void clickElement(By by) {
        getDriver().findElement(by).click();
    }

    public void clickElement(WebElement by) {
        by.click();
    }

    public void enterInput(By by, String key) {
        getDriver().findElement(by).sendKeys(key);

    }

    public void enterInput(WebElement by, String key) {
        by.sendKeys(key);
    }

    public String getText(By by){
        return getDriver().findElement(by).getText();
    }

    public String getText(WebElement by){
        return by.getText();
    }

}
