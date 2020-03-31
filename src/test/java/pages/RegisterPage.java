package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import uimaps.RegisterMap;

public class RegisterPage extends BasePage{

  public RegisterPage(WebDriver driver) {
    super(driver);
  }
  
   private RegisterMap registerMap = new RegisterMap();
   
   public void clickSexo () {
     click(registerMap.btnSexo);
   }
   
   public void inputFirstName(String name) {
     driver.findElement(registerMap.inputFirstName).sendKeys(name);
   }
   
   public void inputLastName(String lastName) {
     driver.findElement(registerMap.inputLastName).sendKeys(lastName);
   }
   
   public void inputPassWord(String passwd) {
     driver.findElement(registerMap.inputPassWord).sendKeys(passwd);
   }
   
   public void dayOption(final String value) {
     final Select selectBox = new Select(driver.findElement(registerMap.dayOption));
     selectBox.selectByValue(value);
   }
   public void monthOption(final String value) {
     final Select selectBox = new Select(driver.findElement(registerMap.monthOption));
     selectBox.selectByValue(value);
   }
   public void yearOption(final String value) {
     final Select selectBox = new Select(driver.findElement(registerMap.yearOption));
     selectBox.selectByValue(value);
   }
   
   public void checkBoxConfirm() {
     click(registerMap.checkBox);
   }
   
   
  
}
