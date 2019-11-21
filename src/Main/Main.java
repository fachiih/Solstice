package Main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Funciones.Buscar;
import Funciones.Utilidades;


public class Main {

	static WebDriver d;
	
	public static void main(String[] args) throws Exception {
		
		// CHROME DRIVER ALOJADO EN Driver\\
		System.setProperty("webdriver.chrome.driver","Drivers2\\chromedriver.exe");
		
		d = new ChromeDriver();
		
		
     	System.out.println("Generando caso Amazon");
		
		// URL DEL APLICATIVO
		String baseUrl = "http://amazon.com";
		d.get(baseUrl);
		d.manage().window().maximize();

		new Utilidades(d);
		
	
		//CORREMOS LAS CASUISTICAS (MODULOS)
		
		try {
			TimeUnit.SECONDS.sleep(15);
			System.out.println("15 segundos para introducir el Captcha - validacion obligatoria");
			
			//Buscamos el articulo.
			Buscar.Buscador("Alexa");
			System.out.println("Buscamos 'Alexa' en el buscador de amazon");
			
			Buscar.btm_Buscar();
			System.out.println("Tocamos el boton buscar");
			
			Buscar.Swipe();
			System.out.println("Hacemos un Swipe hasta la segunda pagina");
			
			Buscar.TercerItem();
			System.out.println("Seleccionamos el tercer item");
			
			Buscar.Validacion();
			System.out.println("CASO EXITOSO");

			
		} catch (Exception e) {
			
			
			d.quit();
			System.err.println("= Error  =");
			throw new Exception();
		}
		d.quit();
		System.out.println("=== CERRANDO ===");
		
		
		
		
	}

}
