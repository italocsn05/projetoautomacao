package br.com.application.name.commons;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.Connection;

/**
 * @author Ronaldo Silva
 */
public class AppiumRobot extends BaseTest {

    /**
     * @param startPercentage
     * @param finalPercentage
     * @param durantion
     */

    public static void swipeVertical(double startPercentage, double finalPercentage, int durantion) {

        try {
            TouchAction action = new TouchAction(driver);
            Dimension size = driver.manage().window().getSize();
            int width = (int) (size.width / 2);
            int startPoint = (int) (size.height * startPercentage);
            int endPoint = (int) (size.getHeight() * finalPercentage);
            action.press(width, startPoint).waitAction(Duration.ofSeconds(durantion)).moveTo(width, endPoint).release()
                    .perform();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * move para baixo até o elemento aparecer
     *
     * @param xpath
     */
    public static void swipeDown(String xpath) {

        try {
            TouchAction action = new TouchAction(driver);
            Dimension size = driver.manage().window().getSize();
            int width = (int) (size.width / 2);
            int startPoint = (int) (size.height - 10);
            int endPoint = (int) (10);
            while (elementExists(xpath) == false) {
                action.press(width, startPoint).waitAction(Duration.ofSeconds(4)).moveTo(width, endPoint).release()
                        .perform();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void swipeUp(String xpath) {

        try {
            TouchAction action = new TouchAction(driver);
            Dimension size = driver.manage().window().getSize();
            int width = (int) (size.width / 2);
            int startPoint = (int) (230);
            int endPoint = (int) (size.height - 10);
            while (elementExists(xpath) == false) {
                action.press(width, startPoint).waitAction(Duration.ofSeconds(4)).moveTo(width, endPoint).release()
                        .perform();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * valida se o elemento existe na página
     *
     * @param xpath
     * @return
     */
    public static boolean elementExists(String xpath) {

        return driver.findElements(By.xpath(xpath)).size() != 0;

    }

    public static boolean elementExistsByWebElement(WebElement xpath) {

        if (xpath.getSize().toString() != "0") {
            return true;
        } else {
            return false;
        }
    }

    /**
     * valida se o elemento existe na página
     *
     * @param xpath
     * @return
     */
    public static boolean waitElementDisappear(String xpath) {

        return driver.findElements(By.xpath(xpath)).isEmpty();

    }

    /**
     * Espera um elemento visivel
     *
     * @param element
     * @author tassio.lima
     */
    public static void waitElementToBeVisible(WebElement element) {

        wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * espera implicitamente um elemento ser visível
     *
     * @param timeout
     */
    public static void implicitlyWait(long timeout) {

        driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
    }

    public static void swipeByElements(WebElement startElement, WebElement endElement) {
        try {
            TouchAction actions = new TouchAction(driver);
            actions.longPress(startElement).moveTo(endElement).release();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Realiza swipe da tela horizontal
     *
     * @param startX
     * @param startY
     * @param endX
     * @param endY
     */
    public static void swipeHorizontal(int startX, int startY, int endX, int endY) {

        try {
            TouchAction action = new TouchAction(driver);
            action.press(startX, startY).waitAction(Duration.ofMillis(2000)).moveTo(endX, endY).release().perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * deixa o dispositivo em modo avião
     */
    public static void turnOffWifi() {
        driver.setConnection(Connection.AIRPLANE);

    }

    /**
     * tira o dispositivo de modo avião
     */
    public static void turnOnWifi() {
        driver.setConnection(Connection.ALL);
        driver.setConnection(Connection.WIFI);
    }

    /**
     * liga os dados do celular
     */
    public static void turnOnData() {
        driver.setConnection(Connection.DATA);
    }

    /**
     * desliga os dados e o wifi do dispositivo
     */
    public static void turnOffAll() {

        driver.setConnection(Connection.DATA);
    }

    /**
     * liga todos os dados e wifi do celular
     */
    public static void turnOnAll() {
        driver.setConnection(Connection.ALL);
    }

    /**
     * aguarda o elemento aparecer
     *
     * @param element
     */
    public static void explicitWait(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    /**
     * aguarda o elemento desaparecer da página
     *
     * @param element
     */
    public static void waitElementDisapper(WebElement element) {

        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public static void mouseOver(WebElement element) {

        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    public static boolean existElementID(String id) {

        return driver.findElements(By.id(id)).size() != 0;

    }

    /**
     * volta para tela home
     */

    public static void backHome() {

        driver.pressKeyCode(AndroidKeyCode.BACK);

    }

    public static void backToTheElement(String element) {
        while (!elementExists(element))
            driver.pressKeyCode(AndroidKeyCode.BACK);


    }
}
