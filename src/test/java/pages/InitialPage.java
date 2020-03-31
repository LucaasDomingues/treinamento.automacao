package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import uimaps.InitialMap;

public class InitialPage extends BasePage{

  private InitialMap initialMap = new InitialMap();
  
  public InitialPage(WebDriver driver) {
    super(driver);
  }
  
  //M�todo para clicar no bot�o de adicionar ao carrinho
  public void clickAddTocart() {
    click(initialMap.addToCartBtn);
    
  }
  
  //M�todo para clicar no bot�o para finalizar adi��o do item ao carrinho
  public void clickCheckout() {
    click(initialMap.proceedToCheckoutBtn);
    
  }
  
  //M�todo para clicar no carrinho
  public void clickCart() {
    click(initialMap.cartBuyBtn);
  }
  
  //M�todo para excluir no carrinho
  public void clickDeleteCar() {
    click(initialMap.cartDeleteBtn);
  }
  
  //M�todo para concluirCompra
  public void clickConcluded () {
    click(initialMap.buyConcludedBtn);
  }
  
  //Rolar a p�gina at� encontrar  elemento
  
  /*Scroll para encontrar item para adicionar ao carrinho*/
  public void scrollOverBlouse () {
    scrollItem(initialMap.overBlouse);
  }
 
  /*Scroll para encontrar icone excluir do carrinho*/
  public void scroolItemDelete() {
    scrollItem(initialMap.cartDeleteBtn);
  }
  
  
  /*Scroll para encontrar bot�o criar conta*/
  public void scrollCreateAcount() {
    scrollItem(initialMap.formCreatScroll);
  }
  
  
  //------------------ Clicar criar conta-----------
  public void clickInput() {
    click(initialMap.inputEmail);
  }
  public void inserirEmail(String email) {
    driver.findElement(initialMap.inputEmail).sendKeys(email);
  }
  
  public void clickCreateAcountBtn() {
    click(initialMap.createBtn);
  }
  
  public void scrollCreateBtn() {
    scrollItem(initialMap.inputEmail);
  }
  
  /*Inserir informa��es de cadastro*/
  public void clickSexo () {
    click(initialMap.btnSexo);
  }
  
  public void inputFirstName(String name) {
    driver.findElement(initialMap.inputFirstName).sendKeys(name);
  }
  
  public void inputLastName(String lastName) {
    driver.findElement(initialMap.inputLastName).sendKeys(lastName);
  }
  
  public void inputPassWord(String passwd) {
    driver.findElement(initialMap.inputPassWord).sendKeys(passwd);
  }
  
  public void dayOption(String value) {
    Select selectBox = new Select(driver.findElement(initialMap.dayOption));
    selectBox.selectByValue(value);
  }
  public void monthOption(String value) {
    Select selectBox = new Select(driver.findElement(initialMap.monthOption));
    selectBox.selectByValue(value);
  }
  public void yearOption( String value) {
    Select selectBox = new Select(driver.findElement(initialMap.yearOption));
    selectBox.selectByValue(value);
  }
  
  public void checkBoxConfirm() {
    click(initialMap.checkBox);
  }
  
  
}
