package br.com.application.name.commons;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.
		WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.application.name.mobile.interfaces.AccountCredentialsUsers;
import br.com.application.name.mobile.interfaces.MobileApplication;
import br.com.application.name.mobile.interfaces.WebMobileApplication;
import br.com.application.name.reports.evidence.Evidence;
import br.com.application.name.reports.evidence.SeleniumEvidence;
import br.com.application.name.configuration.WebApplication;
import cucumber.api.Scenario;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

/**
 * 
 * @author Ronaldo Silva
 *
 */
public class BaseTest {

	protected static AndroidDriver<WebElement> driver;
	protected static AndroidDriver<WebElement> webViewDriver;
	protected static WebDriver webDriver;
	protected static List<SeleniumEvidence> evidenceList = new ArrayList<SeleniumEvidence>();
	protected static WebDriverWait wait;
	protected static WebDriverWait shortWait;
	protected static AccountCredentialsUsers credentialsUsers;
	protected static boolean initialized;

	public static Evidence evidence;

	public void setCtName(String ctName) {
		evidence.setCtName(ctName);
	}

	public void setCiclo(String cycle) {
		evidence.setCiclo(cycle);

	}

	public void setTester(String tester) {
		evidence.setTester(tester);
	}

	public void setCtNumber(String ctNumber) {
		evidence.setCtNumber(ctNumber);
	}

	public void initializeEvidence() {
		BaseTest.evidence = new Evidence(evidenceList);
	}

	/**
	 * Inicializa o {@code AndroidDriver} e o {@code WebDriverWait}
	 */
	protected void initializeMobileApplicationNew(MobileApplication mobileApplication) {
		if (!initialized) {
			initialized = true;
			driver = mobileApplication.getDriverByApp();
			wait = new WebDriverWait(driver, 540);
			shortWait = new WebDriverWait(driver, 15);
		}
	}
	
	protected void initializeMobileApplication(MobileApplication mobileApplication, boolean reiniciar) {
		if (!initialized || reiniciar) {
			initialized = true;
			driver = mobileApplication.getDriver();
			wait = new WebDriverWait(driver, 540);
			shortWait = new WebDriverWait(driver, 15);
		}
	}

	/**
	 * Inicializa o {@code webdriver} no salesforce e o {@code WebDriverWait}
	 */
	protected void initializeWebMobileApplication(WebMobileApplication webMobileApplication) {
		webViewDriver = webMobileApplication.getDriver();
		wait = new WebDriverWait(webViewDriver, 20);
	}

	/**
	 * Inicializa o {@code WebDriver} e o {@code WebDriverWait}
	 */
	protected void initializeWebApplication(WebApplication webApplication) {
		webDriver = webApplication.getDriver();
		webDriver.manage().window().maximize();
		webDriver.get(PropertiesManager.getPropertiesValue("URL_QA"));
		wait = new WebDriverWait(webDriver, 80);
	}

	/**
	 * Define o usuário da aplicação pelo Gherkin.
	 * 
	 * @param credentialsUsers
	 */
	protected void setUserApplicationUsers(AccountCredentialsUsers credentialsUsers) {

		BaseTest.credentialsUsers = credentialsUsers;
	}

	/**
	 * Método para adicionar na evidência mobile
	 * 
	 * @param mensagem
	 */
	protected void addEvidenciaMobile(String mensagem) {
		try {
			evidenceList.add(new SeleniumEvidence("RESULTADO OBTIDO: " + mensagem + "", takeScreenshot(driver)));
		} catch (Exception e) {
			System.out.println("Erro ao adicionar na evidência: " + e.getMessage());
			e.printStackTrace();
		}

	}

	/**
	 * Método para adicionar na evidência web
	 * 
	 * @param mensagem
	 */
	protected void addEvidenciaWeb(String mensagem) {
		try {
			evidenceList.add(new SeleniumEvidence("RESULTADO OBTIDO: " + mensagem + "", takeScreenshot(webDriver)));
		} catch (Exception e) {
			System.out.println("Erro ao adicionar na evidência: " + e.getMessage());
			e.printStackTrace();
		}

	}

	protected void clearEvidenceList() {
		evidenceList.clear();
	}

	/**
	 * Gera evidência
	 */
	protected void generateEvidence(Scenario scenario) {
		try {
			evidence.generateEvidence(scenario);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Adiciona o erro.
	 * 
	 * @param e
	 */
	protected void setError(Throwable e) {
		evidence.setError(e, driver);
	}

	/**
	 * Encerra o Appium e o {@code AndroidDriver}
	 * 
	 * @throws InterruptedException
	 */
	protected void closeMobile() {
		driver.quit();
		closeAppium();
	}
	
	protected static void closeMobileAfter() {
		driver.quit();
		closeAppiumAfter();
	}


	/**
	 * fecha o driver web
	 */
	protected static void closeWeb() {
		webDriver.quit();
	}

	/**
	 * tira prints
	 * 
	 * @param driver
	 * @return
	 */
	private String takeScreenshot(WebDriver driver) {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
	}

	/**
	 * inicia o appium no java
	 */
	protected void startAppium() {

		AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
		service.start();
	}

	/**
	 * fecha o appium
	 */
	protected void closeAppium() {
		try {

			Runtime.getRuntime().exec(new String[] { "/bin/bash", "-l", "-c", "killall node" });
			Thread.sleep(3000);
		} catch (IOException e) {
			System.out.println("Erro ao encerrar o node");
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected static void closeAppiumAfter() {
		try {

			Runtime.getRuntime().exec(new String[] { "/bin/bash", "-l", "-c", "killall node" });
			Thread.sleep(3000);
		} catch (IOException e) {
			System.out.println("Erro ao encerrar o node");
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
