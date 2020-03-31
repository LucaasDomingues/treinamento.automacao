package scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.InitialPage;

/*
 * Classes responsáveis por “montar” o caso de teste usando 
 * os métodos das pages. Scenarios não deve executar ações na pagina web
 * e obrigatoriamente todos os scenarios devem extender a BaseTest.

 */

public class BaseTest {
  public WebDriver driver;
  public InitialPage initialPage;

  @BeforeClass
  public static void beforeClass() {
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
  }

  @Before
  public void before() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    //initialPage = new InitialPage(driver);
  }
   

  @After
  public void afterTest() {
    try {
      Thread.sleep(5000);
      driver.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
