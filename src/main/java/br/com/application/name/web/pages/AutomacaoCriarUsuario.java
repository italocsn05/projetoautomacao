package br.com.application.name.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomacaoCriarUsuario {
    public AutomacaoCriarUsuario(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//input[@id='user_name']")
    private WebElement input_username;

    @FindBy(xpath = "//input[@id='user_lastname']")
    private WebElement input_userlastname;

    @FindBy(xpath = "//input[@id='user_email']")
    private WebElement input_user_email;

    @FindBy(xpath = "//input[@id='user_address']")
    private WebElement input_user_adress;

    @FindBy(xpath = "//input[@id='user_university']")
    private WebElement input_user_university;

    @FindBy(xpath = "//input[@id='user_profile']")
    private WebElement input_user_profile;

    @FindBy(xpath = "//input[@id='user_gender']")
    private WebElement input_user_gender;

    @FindBy(xpath = "//input[@id='user_age']")
    private WebElement input_user_age;

    @FindBy(xpath = "//input[@name='commit']")
    private WebElement bnt_commit;

    public WebElement getInput_username() {
        return input_username;
    }

    public WebElement getInput_userlastname() {
        return input_userlastname;
    }

    public WebElement getInput_user_email() {
        return input_user_email;
    }

    public WebElement getInput_user_adress() {
        return input_user_adress;
    }

    public WebElement getInput_user_university() {
        return input_user_university;
    }

    public WebElement getInput_user_profile() {
        return input_user_profile;
    }

    public WebElement getInput_user_gender() {
        return input_user_gender;
    }

    public WebElement getInput_user_age() {
        return input_user_age;
    }

    public WebElement getBnt_commit() {
        return bnt_commit;
    }
}
