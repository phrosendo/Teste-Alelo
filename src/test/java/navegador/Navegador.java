package navegador;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navegador {
	
	public static WebDriver driver;
	public static String URL = "https://www.google.com"; 
	
	@BeforeClass
	public static void abrirNavegador(){
		System.out.println("[Passo 1]: Abrir o Google Chrome.");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
	}
	
	@AfterClass
	public static void fecharNavegador() {
		
		driver.quit();
	}
}
