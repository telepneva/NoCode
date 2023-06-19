package Pages;

import Tests.BaseTest;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ForgotPasswordPage {
    private SelenideElement fieldEmail = $(byXpath("//[placeholder = 'Email']"));
    private SelenideElement buttonRecoverPassword = $(byXpath("//[placeholder = 'Email']"));

    public void forgotPassword(String emailValue){
        fieldEmail.setValue(emailValue);
        buttonRecoverPassword.click();
    }
}
