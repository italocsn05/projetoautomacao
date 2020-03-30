import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TesteEstruturado {

    @Test
    public void teste001() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        ChromeDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,90);
        //Acessar URL
        driver.get("https://automacaocombatista.herokuapp.com/treinamento/home");

        //Maximizar o Browser
        driver.manage().window().fullscreen();

        //Clicar em um link/Botao
        driver.findElement(By.xpath("//a[@class='collapsible-header ']")).click();

        //Espera implicita para o elemento na tela
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@href='/users/new']"))));
        driver.findElement(By.xpath("//a[@href='/users/new']")).click();

        //Preenchimento dos campos de cadastro
        driver.findElement(By.id("user_name")).sendKeys("Marcos");
        driver.findElement(By.id("user_lastname")).sendKeys("Barbosa");
        driver.findElement(By.id("user_email")).sendKeys("marcosddd.ddcosta@sasas.com.br");

        driver.findElement(By.xpath("//input[@name='commit']")).click();


        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//p[@id='notice']"))));
        String valorTela = driver.findElement(By.xpath("//p[@id='notice']")).getText();

        Assert.assertEquals("Usuário Criado com sucesso", valorTela);

        driver.quit();

    }

}
