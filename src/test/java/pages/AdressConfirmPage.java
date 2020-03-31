package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import uimaps.AdressConfirmMap;

public class AdressConfirmPage extends BasePage{

  public AdressConfirmPage(WebDriver driver) {
    super(driver);
   }
  
  private AdressConfirmMap adressConfirmMap = new AdressConfirmMap();
  
  public void inputFirstNameAdress(String adressFirstName) {
    driver.findElement(adressConfirmMap.firstName).sendKeys(adressFirstName);
  }
  
  public void inputSecondNameAdress(String adressSecondName) {
    driver.findElement(adressConfirmMap.secondName).sendKeys(adressSecondName);
  }
  
  public void company(String company) {
    driver.findElement(adressConfirmMap.company).sendKeys(company);
  }
  
  public void adress(String adress) {
    driver.findElement(adressConfirmMap.adress).sendKeys(adress);
  }
  
  
  public void adressLine2(String adress2) {
    driver.findElement(adressConfirmMap.adressLine2).sendKeys(adress2);
  }
  
  
  public void city(String city) {
    driver.findElement(adressConfirmMap.city).sendKeys(city);
  }
  
  public void stateOption(final String state) {
    final Select selectBox = new Select(driver.findElement(adressConfirmMap.state));
    selectBox.selectByValue(state);
  }
  
  public void postalCode(String postalCode) {
    driver.findElement(adressConfirmMap.zipPostalCode).sendKeys(postalCode);
  }
  
  public void contryOption(final String contry) {
    final Select selectBox = new Select(driver.findElement(adressConfirmMap.contry));
    selectBox.selectByValue(contry);
  }
  
  public void aditionalInformation(String text) {
    driver.findElement(adressConfirmMap.aditionalInformation).sendKeys(text);
  }
  
  public void homePhone(String homePhone) {
    driver.findElement(adressConfirmMap.homePhone).sendKeys(homePhone);;
  }
  
  public void cellPhone( String cellPhone) {
    driver.findElement(adressConfirmMap.cellPhone).sendKeys(cellPhone);
  }
  
  public void adressReference ( String reference) {
    driver.findElement(adressConfirmMap.adressReference).sendKeys(reference);
  }
  
  public void btnRegister () {
    click(adressConfirmMap.btnRegister);
  }
 
  public void checkoutFrete() {
    click(adressConfirmMap.checkBoxTerms);
  }
  
  public void btnConfirmCheckout() {
    click(adressConfirmMap.btnCheckout);
  }
  
  public void btnConfirmCheckBoxFrete() {
    click(adressConfirmMap.btnCheckoutFrete);
  }
  
  
}
