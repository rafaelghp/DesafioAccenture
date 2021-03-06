package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DesafioSteps {
	private WebDriver driver;

	private DesafioPage page;
	@Given("Que estou acessando o site para envio de cotacao")
	public void que_estou_acessando_o_site_para_envio_de_cotacao() {
		driver = new ChromeDriver();
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		page = new DesafioPage(driver);
	}

	@When("preencho o formulario da aba vehicle data")
	public void preencho_o_formulario_da_aba_vehicle_data() {
		page.preencheVehicleData();
	  }

	@When("preencho o formulario da aba insurant data")
	public void preencho_o_formulario_da_aba_insurant_data() {
		page.preencheInsurantData();
	}

	@When("preencho o formulario da aba product data")
	public void preencho_o_formulario_da_aba_product_data() {
		page.preencheProductData();
	}

	@When("preencho o formulario da aba price option")
	public void preencho_o_formulario_da_aba_price_option() throws InterruptedException  {
		page.preenchePriceOption();
	}

	@When("preencho o formulario da aba send quote e pressiono send")
	public void preencho_o_formulario_da_aba_send_quote_e_pressiono_send() {
		page.preencheSendQuote();
	}

	@Then("a cotacao deve ser enviada por email")
	public void a_cotacao_deve_ser_enviada_por_email() throws InterruptedException {
		page.verificaMensagem();
	}
	@After
	public void fim(){
		driver.quit();
	}
}
