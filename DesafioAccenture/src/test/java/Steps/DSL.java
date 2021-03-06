package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DSL {
	
	private WebDriver driver;
	
	public DSL(WebDriver driver) {
		this.driver = driver;
	}
	
	public void escrevePorId(String Id,String texto) {
		driver.findElement(By.id(Id)).sendKeys(texto);
	}
	public void escrevePorIdEnter(String Id,String texto) {
		driver.findElement(By.id(Id)).sendKeys(texto+Keys.RETURN);
	}
	public void clicaPorId(String Id) {
		driver.findElement(By.id(Id)).click();
	}
	public void clicaPorXpath(String Xpath) {
		driver.findElement(By.xpath(Xpath)).click();
	}
	public String recuperaTexto(String Xpath) {
		String Mensagem =	driver.findElement(By.id(Xpath)).getText();
		return Mensagem;
	}
}
