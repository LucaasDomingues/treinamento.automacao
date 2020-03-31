package uimaps;

import org.openqa.selenium.By;

public class PaymentMap {
  
//Confirmar forma de pagamento
  public By btnPayment = By.xpath("//a[@class='bankwire']");
  
  //Confirmar pagamento
  public By btnPaymentConfirm = By.xpath("//button[@class='button btn btn-default button-medium']");
}
