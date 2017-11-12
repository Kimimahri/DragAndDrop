package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class MainPage {
    private WebDriver driver;
    private By draggable = By.id("draggable");
    private By droppable = By.id("droppable");
    private By iframe = By.xpath("//iframe[@src='droppable/default.html']");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void doDragAndDrop() {
        Actions builder = new Actions(driver);
        driver.switchTo().frame(driver.findElement(iframe));
        builder.dragAndDrop(driver.findElement(draggable), driver.findElement(droppable)).perform();
    }

    public String getTextOfDroppable() {
        return driver.findElement(droppable).getText();
    }
}
