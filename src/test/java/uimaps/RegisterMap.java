package uimaps;

import org.openqa.selenium.By;

public class RegisterMap {
  
    public int dia ;
    public int mes ;
    public int ano ;
        
    /*Register*/
    
    //Mapeamento escolha sexo
    public By btnSexo = By.xpath("//input[@id='id_gender1']");
    
    //Input primeiro nome
    public By inputFirstName = By.xpath("//input[@id='customer_firstname']");
    
    //Input Ultimo nome
    public By inputLastName = By.xpath("//input[@id='customer_lastname']']");
    
    //Input senha
    public By inputPassWord = By.xpath("//input[@id='passwd']");
  
    //Inserir data de Nascimento
    public By dayOption = By.xpath("//select[@id='days']//option[@value='"+ dia +"']");
    public By monthOption = By.xpath("//select[@id='months']//option[@value='"+ mes +"']");
    public By yearOption = By.xpath("//select[@id='years']//option[@value='"+ ano +"']");
    
    //CheckBox
    public By checkBox = By.xpath("//input[@id='optin']");
    
    
    
    //Bot�o pagina de confirmar endereco
    public By btnCheckout = By.xpath("//button[@class='button btn btn-default button-medium']");
    
    //Bot�o p�gina para confirmar termos de servi�o
    public By checkBoxTerms = By.xpath("//div[@id='uniform-cgv']//input[@id='cgv']");    
    
    //Bot�o p�gina para confirmar frete
    public By btnCheckoutFrete = By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']");
    
    //Confirmar forma de pagamento
    public By btnPayment = By.xpath("//a[@class='bankwire']");
    
    //Confirmar pagamento
    public By btnPaymentConfirm = By.xpath("//button[@class='button btn btn-default button-medium']");
}
