package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * BasePage é uma página contendo todos as funções básicas que uma página exige
 * Ex:(Clicar, Scrool, inserir url, inserir alguma pesquisa, etc...)
 */

public class BasePage {
  public WebDriverWait wait;
  public WebDriver driver;
  public Actions action;
  

  public BasePage(WebDriver driver) {
    this.driver = driver;
    this.action = new Actions(driver);
    this.wait = new WebDriverWait(driver, 10);
  }

  public void navegar(String url) {
    driver.navigate().to(url);
  }

  public void click(By element) {
    wait(element);
    driver.findElement(element).click();
  }

  public void click(WebElement element) {
    element.click();
  }

  public void wait(By element) {
    this.wait.until(ExpectedConditions.visibilityOfElementLocated(element));
  }

  public void rightClick(WebElement element) {
    action.contextClick(element).perform();
  }

  public void confirmAlert() {
    driver.switchTo().alert().accept();
  }
  
  //Método para ter o MouseOver aparecendo os elementos
  public void mouseOver () {
    Actions action = new Actions(driver);
    WebElement item1 = driver.findElement(By.xpath("//ul[@id='homefeatured']/li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-mobile-line']"));
    action.moveToElement(item1).perform();
  }
  
  //Método para dar scrool até visualizar o elemento da página
  public void scrollItem(By element) {
    wait(element);
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();",this.driver.findElement(element));
  }
  
  /*public void scrollItem() {
    WebElement element = driver.findElement(By.xpath("//ul[@id='homefeatured']/li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-mobile-line']"));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();", element);
  }*/
  
  public void scrollItemDelete() {
    WebElement element = driver.findElement(By.xpath("//i[@class='icon-trash']"));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();", element);
  }
  
}
