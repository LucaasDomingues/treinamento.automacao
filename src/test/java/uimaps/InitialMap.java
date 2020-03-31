package uimaps;

import org.openqa.selenium.By;
/*
 * UiMaps é responsável por manter todos os mapeamentos de um teste.
 * Cada página deve possuir seu mapeamento
 */

public class InitialMap {
  // Mapeamento do mouseOver no item 'Blouse'
  public By overBlouse = By
      .xpath("//ul[@id='homefeatured']/li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-mobile-line']");
  // Mapeamento do botão 'Adicionar ao carrinho'
  public By addToCartBtn = By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[1]/span");
  // Mapeamento do botão para confirmar a adição do item ao carrinho
  public By proceedToCheckoutBtn = By
      .xpath("//div[@class='layer_cart_cart col-xs-12 col-md-6']//a[@class='btn btn-default button button-medium']");
  // Mapeamento botão Carrinho
  public By cartBuyBtn = By.xpath("//div[@class ='shopping_cart']");
  // Mapeamento botão deletar do carrinho
  public By cartDeleteBtn = By.xpath("//i[@class='icon-trash']");
  // Mapeamento concluirCompra
  public By buyConcludedBtn = By.xpath("//a[@href='http://automationpractice.com/index.php?controller=order&step=1']");
  public By inputEmail = By.xpath("//input[@id='email_create']");
  public By createBtn = By.xpath("//button[@class='btn btn-default button button-medium exclusive']");
  // Elemento para scrool no campo de criar conta
  public By formCreatScroll = By.xpath("//div[@class='col-xs-12 col-sm-6']/form[@id='create-account_form']");
  
  
  /* Register */
  // Mapeamento escolha sexo
  public By btnSexo = By.xpath("//input[@id='id_gender1']");
  // Input primeiro nome
  public By inputFirstName = By.xpath("//input[@id='customer_firstname']");
  // Input Ultimo nome
  public By inputLastName = By.xpath("//input[@id='customer_lastname']");
  // Input senha
  public By inputPassWord = By.xpath("//input[@id='passwd']");
  // Inserir data de Nascimento
  public By dayOption = By.xpath("//select[@id='days']");
  public By monthOption = By.xpath("//select[@id='months']");
  public By yearOption = By.xpath("//select[@id='years']");
  // CheckBox
  public By checkBox = By.xpath("//div[@id='uniform-optin']");
  // Botão pagina de confirmar endereco
  public By btnCheckout = By.xpath("//button[@class='button btn btn-default button-medium']");
  // Botão página para confirmar termos de serviço
  public By checkBoxTerms = By.xpath("//div[@id='uniform-cgv']//input[@id='cgv']");
  // Botão página para confirmar frete
  public By btnCheckoutFrete = By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']");
  // Confirmar forma de pagamento
  public By btnPayment = By.xpath("//a[@class='bankwire']");
  // Confirmar pagamento
  public By btnPaymentConfirm = By.xpath("//button[@class='button btn btn-default button-medium']");
}
