package PageObject.Onliner.LoginPage;

import PageObject.Onliner.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By emailInput = By.xpath("//input[@placeholder='Ник или e-mail']");
    private By passwordInput = By.xpath("//input[@type='password']");
    private By loginBtn = By.cssSelector("[type='submit'].auth-button");
    private By registrationBtn = By.cssSelector("[href='https://profile.onliner.by/registration']");
    private By forgotPasswordBtn = By.cssSelector("[href='https://profile.onliner.by/recover-password']");
    private By homePageBtn = By.cssSelector(".auth-form__image.auth-form__image_logo");
    private By loginIsAbsentError = By.xpath("//div[contains(text(),'Укажите ник или e-mail')]");
    private By passwordIsAbsentError = By.xpath("//div[contains(text(),'Укажите пароль')]");
    private By incorrectLoginOrPasswordError = By.xpath("//div[contains(text(),'Неверный логин или пароль')]");

    public LoginPage verifyLoginPage() {

        isDisplayed(emailInput, passwordInput, loginBtn,
                registrationBtn, forgotPasswordBtn);
        return this;

    }

    public LoginPage goToTheHomePage() {

        click(homePageBtn);
        return this;

    }

    public LoginPage goToRegistrationPage() {

        click(registrationBtn);
        return this;

    }

    public LoginPage goToRecoverPasswordPage() {

        click(forgotPasswordBtn);
        return this;

    }

    public LoginPage loginIntoApplication(String login, String password) {

        enter(emailInput, login);
        enter(passwordInput, password);
        click(loginBtn);
        return this;

    }

    public LoginPage verifyLoginIsAbsentError() {

        isDisplayed(loginIsAbsentError);
        return this;

    }

    public LoginPage verifyPasswordIsAbsentError() {

        isDisplayed(passwordIsAbsentError);
        return this;

    }

    public LoginPage verifyIncorrectLoginOrPasswordError() {

        isDisplayed(incorrectLoginOrPasswordError);
        return this;

    }

}
