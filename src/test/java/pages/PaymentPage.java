package pages;

import org.openqa.selenium.WebDriver;

import uimaps.PaymentMap;

public class PaymentPage extends BasePage{

  public PaymentPage(WebDriver driver) {
    super(driver);
  }
  
  private PaymentMap paymentMap = new PaymentMap();
  
  public void btnPaymentClick() {
    click(paymentMap.btnPayment);
  }
  
  public void btnPaymentConfirm() {
    click(paymentMap.btnPaymentConfirm);
  }
}
