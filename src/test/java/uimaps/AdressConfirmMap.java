package uimaps;

import org.openqa.selenium.By;

public class AdressConfirmMap {
  
  
  //Your Adress
  
  public By firstName = By.xpath("//input[@id='firstname']");
  public By secondName = By.xpath("//input[@id='lastname']");
  public By company = By.xpath("//input[@id='company']");
  public By adress = By.xpath("//input[@id='address1']");
  public By adressLine2 = By.xpath("//input[@id='address2']");
  public By city = By.xpath("//input[@id='city']");
  public By state = By.xpath("//select[@id='id_state']");
  public By zipPostalCode = By.xpath("//input[@id='postcode']");
  public By contry = By.xpath("//select[@id='id_country']/option[2]");
  public By aditionalInformation = By.xpath("//textarea[@id='other']");
  public By homePhone = By.xpath("//input[@id='phone']");
  public By cellPhone = By.xpath("//input[@id='phone_mobile']");
  public By adressReference = By.xpath("//input[@id='alias']");
  
  //Botão de concluir cadastro
  public By btnRegister = By.xpath("//button[@id='submitAccount']");
  
  //Botão pagina de confirmar endereco
  public By btnCheckout = By.xpath("//button[@class='button btn btn-default button-medium']");
  
  //Botão página para confirmar termos de serviço
  public By checkBoxTerms = By.xpath("//div[@id='uniform-cgv']");
  
  //Botão página para confirmar frete
  public By btnCheckoutFrete = By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']");
}
