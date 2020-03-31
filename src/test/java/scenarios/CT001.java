package scenarios;

import org.junit.Before;
import org.junit.Test;

import pages.AdressConfirmPage;
import pages.InitialPage;
import pages.PaymentPage;
//import pages.PaymentPage;


public class CT001 extends BaseTest {
  
  private InitialPage initialPage;
  private AdressConfirmPage adressConfirmPage;

  private PaymentPage paymentPage;
  
  @Before
  public void beforetest() {
    initialPage = new InitialPage(driver);
    adressConfirmPage = new AdressConfirmPage(driver);
    paymentPage = new PaymentPage(driver);
  }

  @Test
  public void test() throws Exception {
    initialPage.navegar("http://automationpractice.com/index.php");
    initialPage.scrollOverBlouse();
    initialPage.mouseOver();
    initialPage.clickAddTocart();
    initialPage.clickCheckout();
    initialPage.clickCart();
    //initialPage.scroolItemDelete();
    //initialPage.clickDeleteCar();
    initialPage.clickConcluded();
    initialPage.scrollCreateBtn();
    initialPage.clickInput();
    initialPage.inserirEmail("lbdeveris@gmail.com");
    initialPage.clickCreateAcountBtn();
   
    initialPage.clickSexo();
    initialPage.inputFirstName("Lucas");
    initialPage.inputLastName("Domingues");
    initialPage.inputPassWord("12345567");
    initialPage.dayOption("2");
    initialPage.monthOption("8");
    initialPage.yearOption("2000");
    initialPage.checkBoxConfirm();
    
    //AdressConfirm
    
    adressConfirmPage.inputFirstNameAdress("");
    adressConfirmPage.inputSecondNameAdress("");
    adressConfirmPage.company("Everis");
    adressConfirmPage.adress(" Av Londres ");
    adressConfirmPage.adressLine2("Tibery");
    adressConfirmPage.city("Uberlandia");
    adressConfirmPage.stateOption("6");
    adressConfirmPage.postalCode("80002");
    adressConfirmPage.aditionalInformation("Condominio 444");
    adressConfirmPage.homePhone("34 32680543");
    adressConfirmPage.cellPhone("34 99875094");
    adressConfirmPage.adressReference("Próximo ao supermecado");
    adressConfirmPage.btnRegister();
    adressConfirmPage.btnConfirmCheckout();
    adressConfirmPage.checkoutFrete();
    adressConfirmPage.btnConfirmCheckBoxFrete();
    
    /*Escolhendo cartão como forma de pagamento*/
    
    paymentPage.btnPaymentClick();
    paymentPage.btnPaymentConfirm();
    
  
  }
  
}
