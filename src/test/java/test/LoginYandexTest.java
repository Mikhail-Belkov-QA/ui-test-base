package test;


import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.logevents.SelenideLogger.step;

@Tag("UiYandex")
public class LoginYandexTest extends BaseTest {

    /**
     * тестовый метод для осуществления аутентификации
     */
    @Test
    @DisplayName("Мой тест - авторизация аккаунта Яндекс (по почте)")
   @Step ("Ввод логина")

    public void loginTest() {

        step ("Открываем стартовую страницу", () ->
        {     driver.get(ConfProperties.getProperty("url"));});

        //Нажатие на кнопку Email
        step ("Нажимаем на кнопку Email", () ->
        { loginPage.inputLoginEmailBtn();});

        step ("Задать логин", () ->
     { loginPage.inputLogin(ConfProperties.getProperty("login"));});
          //нажимаем кнопку входа
        step ("Нажать на кнопку", () ->
        { loginPage.clickLoginBtn();});

          //вводим пароль
        step ("Задать пароль", () ->
        {  loginPage.inputPasswd(ConfProperties.getProperty("password"));});

        //нажимаем кнопку входа
        step ("Нажать на кнопку", () ->
        {   loginPage.clickPasswBtn();});

    }
    }

