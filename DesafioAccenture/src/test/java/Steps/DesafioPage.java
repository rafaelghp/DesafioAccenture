package Steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class DesafioPage {
	
	private DSL dsl;
	
	
	public DesafioPage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	public void preencheVehicleData() {
		dsl.clicaPorId("entervehicledata");
		dsl.escrevePorIdEnter("make", "BMW");
		dsl.escrevePorIdEnter("model", "moped");
		dsl.escrevePorId("cylindercapacity", "200");
		dsl.escrevePorId("engineperformance", "200");
		dsl.escrevePorId("dateofmanufacture", "10/10/2010");
		dsl.clicaPorXpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]");
		dsl.escrevePorIdEnter("numberofseats", "2");
		dsl.escrevePorIdEnter("numberofseatsmotorcycle", "2");
		dsl.escrevePorIdEnter("fuel", "petrol");
		dsl.escrevePorId("payload", "1000");
		dsl.escrevePorId("totalweight", "5000");
		dsl.escrevePorId("listprice", "1500");
		dsl.escrevePorId("licenseplatenumber", "200");
		dsl.escrevePorId("annualmileage", "150");
		dsl.clicaPorId("nextenterinsurantdata");
	}
	public void preencheInsurantData() {
		dsl.escrevePorId("firstname", "Rafael");
		dsl.escrevePorId("lastname", "Lima");
		dsl.escrevePorId("birthdate", "04/04/1992");
		dsl.escrevePorId("streetaddress", "rua teste");
		dsl.escrevePorIdEnter("country", "Brazil");
		dsl.escrevePorId("zipcode", "99999999");
		dsl.escrevePorId("city", "Porto alegre");
		dsl.clicaPorXpath("//*[@id=\"occupation\"]/option[4]");
		dsl.clicaPorXpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]");
		dsl.escrevePorId("website", "Teste.com");
		dsl.clicaPorId("nextenterproductdata");
	}
	public void preencheProductData() {
		dsl.escrevePorId("startdate", "12/26/2021");
	    dsl.escrevePorIdEnter("insurancesum", "3000000");
	    dsl.escrevePorIdEnter("meritrating", "Bonus 1");
	    dsl.clicaPorXpath("//*[@id=\"damageinsurance\"]/option[2]");
	    dsl.clicaPorXpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]");
	    dsl.clicaPorXpath("//*[@id=\"courtesycar\"]/option[2]");
	    dsl.clicaPorId("nextselectpriceoption");
	}
	public void preenchePriceOption() throws InterruptedException {
		dsl.clicaPorXpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]");
		Thread.sleep(2000);
		dsl.clicaPorId("nextsendquote");
	}
	public void preencheSendQuote() {
		dsl.escrevePorId("email", "teste@teste.com");
		dsl.escrevePorId("phone", "999999999");
		dsl.escrevePorId("username", "teste12");
		dsl.escrevePorId("password", "Aleatoria1");
		dsl.escrevePorId("confirmpassword", "Aleatoria1");
		dsl.escrevePorId("Comments", "Este ? um teste automatizado");
		dsl.clicaPorId("sendemail");
	}
	public void verificaMensagem() throws InterruptedException {
		Thread.sleep(10000);
		String  Mensagem = dsl.recuperaTexto("/html/body/div[4]/h2");
		Assert.assertEquals(Mensagem,"Sending e-mail success!");
	}
}