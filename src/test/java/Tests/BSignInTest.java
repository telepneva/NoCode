package Tests;

import org.junit.Test;

public class BSignInTest extends BaseTest {

    //AuthorisationWithRoleSTUDENT
    @Test
    public void testSuccessfulAuthorisationWiThRoleStudent() {
        homePage.clickOnTheButtonSignIn();
        signInPage.successfulLogin("aleksFill2121@gmail.com", "Ghtybv1235");
        homePage.iconUsersIsVisible();
    }


    @Test
    public void authorisationWiThRoleStudentNotValidPassword() {
        homePage.clickOnTheButtonSignIn();
        signInPage.successfulLogin("aleksFill2121@gmail.com", "Ghtybv1235");
        signInPage.messageNotValidEmailIsVisible("Invalid email or password");
    }

    @Test
    public void authorisationWiThRoleStudentNotValidEmail() {
        homePage.clickOnTheButtonSignIn();
        signInPage.successfulLogin("aleksFill2121@gmail.com", "Ghtybv1235");
        signInPage.messageNotValidEmailIsVisible("Invalid email or password");
    }

    @Test
    public void LogOutWiThRoleStudent() {
        homePage.clickOnTheButtonSignIn();
        signInPage.successfulLogin("aleksFill2121@gmail.com", "Ghtybv1235");
        homePage.clickOnTheButtonIconUsers();
        homePage.clickOnTheButtonSignOut();
        homePage.iconUsersIsNotVisible();
        signInPage.buttonSignInAuthorisationFormIsVisible();
    }

    @Test
    public void buttonSignUpOpensOnTheSignUpForm() {
        homePage.clickOnTheButtonSignIn();
        signInPage.clickOnTheButtonSignUpAuthorisationForm();
        signUpPage.formSignUpIsVisibleFurCheckButtonSignUpInSignInTest();
    }


    //AuthorisationWithRoleTEACHER
    @Test
    public void testSuccessfulAuthorisationWiThRoleTeacher() {
        homePage.clickOnTheButtonSignIn();
        signInPage.successfulLogin("aleksFill2121@gmail.com", "Ghtybv1235");
        homePage.iconUsersIsVisible();
    }


    @Test
    public void authorisationWiThRoleTeacherNotValidPassword() {
        homePage.clickOnTheButtonSignIn();
        signInPage.successfulLogin("aleksFill2121@gmail.com", "Ghtybv1235");
        signInPage.messageNotValidEmailIsVisible("Invalid email or password");
    }

    @Test
    public void authorisationWiThRoleTeacherNotValidEmail() {
        homePage.clickOnTheButtonSignIn();
        signInPage.successfulLogin("aleksFill2121@gmail.com", "Ghtybv1235");
        signInPage.messageNotValidEmailIsVisible("Invalid email or password");
    }

    @Test
    public void LogOutWiThRoleTeacher() {
        homePage.clickOnTheButtonSignIn();
        signInPage.successfulLogin("aleksFill2121@gmail.com", "Ghtybv1235");
        homePage.clickOnTheButtonIconUsers();
        homePage.clickOnTheButtonSignOut();
        homePage.iconUsersIsNotVisible();
        signInPage.buttonSignInAuthorisationFormIsVisible();
    }

}
