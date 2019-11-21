package Funciones;

import java.util.concurrent.TimeUnit;



public class Buscar {
	
	public static void Buscador(String Valor) throws Exception {
		try { 
			//
			Utilidades.sendKeysXpath("//input[@id='twotabsearchtextbox']", Valor);		

		} catch (Exception e) {
			
				throw new Exception();			
		}
	}
	
	public static void btm_Buscar() throws Exception {
		try { 
			
			Utilidades.clickXpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']");

		} catch (Exception e) {
			
				throw new Exception();			
		}
	}
	
	
	public static void Swipe() throws Exception {
		try { 
			TimeUnit.SECONDS.sleep(2);
			Utilidades.swipeToXpath("//li[@class='a-normal']//a[contains(text(),'2')]");
			TimeUnit.SECONDS.sleep(2);
			Utilidades.clickXpath("//li[@class='a-normal']//a[contains(text(),'2')]");
			TimeUnit.SECONDS.sleep(2);

		} catch (Exception e) {
			
				throw new Exception();			
		}
	}
	
	public static void TercerItem() throws Exception {
		try { 
			TimeUnit.SECONDS.sleep(2);
			Utilidades.swipeToXpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[4]/div[1]/div[3]/div[1]/span[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]");
			TimeUnit.SECONDS.sleep(2);
			Utilidades.clickXpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[4]/div[1]/div[3]/div[1]/span[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]");
			TimeUnit.SECONDS.sleep(2);

		} catch (Exception e) {
			
				throw new Exception();			
		}
	}
	
	public static void Validacion() throws Exception {
		try { 
			
			Utilidades.clickXpath("//input[@id='add-to-cart-button']");

		} catch (Exception e) {
			
				throw new Exception();			
		}
	}

	

}
