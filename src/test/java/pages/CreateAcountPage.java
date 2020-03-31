package pages;


import org.openqa.selenium.WebDriver;


import uimaps.CreateAcountMap;

public class CreateAcountPage extends BasePage{
  private CreateAcountMap createAcountMap = new CreateAcountMap();
  public CreateAcountPage(WebDriver driver) {
    super(driver);
  }
  
  
  
  public void clickInput() {
    click(createAcountMap.inputEmail);
  }
  public void inserirEmail(String email) {
    driver.findElement(createAcountMap.inputEmail).sendKeys(email);
  }
  
  public void btnCreateAcount() {
    click(createAcountMap.createBtn);
  }
  
  public void scrollCreateBtn() {
    scrollItem(createAcountMap.createBtn);
  }
  
}
