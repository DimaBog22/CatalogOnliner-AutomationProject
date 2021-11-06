package PageObject.Onliner.LoginPage;

import PageObject.Onliner.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By emailInput = By.xpath("//input[@placeholder='Ник или e-mail']");
    private By passwordInput = By.xpath("//input[@type='password']");
    private By loginBtn = By.cssSelector("[type='submit'].auth-button");
    private By registrationBtn = By.cssSelector("[href='https://profile.onliner.by/registration']");
    private By forgotPasswordBtn = By.cssSelector("[href='https://profile.onliner.by/recover-password']");
    private By onlinerLogoBtn = By.cssSelector("[href='https://www.onliner.by/']");


    public LoginPage verifyHomePage() {

        isDisplayed(emailInput, passwordInput, loginBtn,
                registrationBtn, forgotPasswordBtn, onlinerLogoBtn);
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

    public LoginPage goToOnlinerHomePage() {

        click(onlinerLogoBtn);
        return this;

    }

    public LoginPage loginIntoApplication(String login, String password) {

        enter(emailInput, login);
        enter(passwordInput, password);
        click(loginBtn);
        return this;

    }

}
