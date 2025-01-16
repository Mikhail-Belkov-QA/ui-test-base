package test;


import helpers.Properties;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static helpers.Properties.confProperties;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

@Tag("UiYandex")
public class LoginYandexTest extends BaseTest {

    /**
     * тестовый метод для осуществления аутентификации
     */
    @Test
    @DisplayName("Мой тест - авторизация аккаунта Яндекс (по почте)")
    @Step ("авторизация аккаунта Яндекс (по почте)")

    public void loginTest() {

        step ("Открываем стартовую страницу_", () ->
        {     driver.get(confProperties.url());});

        //Нажатие на кнопку Email
        step ("Нажимаем на кнопку Email", () ->
        { loginPage.inputLoginEmailBtn();});

        step ("Задать логин", () ->
     { loginPage.inputLogin(confProperties.login());});
          //нажимаем кнопку входа
        step ("Нажать на кнопку", () ->
        { loginPage.clickLoginBtn();});

          //вводим пароль
        step ("Задать пароль", () ->
        {  loginPage.inputPasswd(confProperties.password());});

        //нажимаем кнопку входа
        step ("Нажать на кнопку", () ->
        {   loginPage.clickPasswBtn();});

        step ("Заходим в iFrame menu", () ->
        {     profilePage.entryMenu();});

        step ("Получаем отображаемый логин и сравниваем его с логином из файлов настройки", () ->
        {   String user = BaseTest.profilePage.getUserId();
            Assertions.assertEquals(confProperties.login(), user); });

        step ("Нажимаем на кнопку Выход", () ->
        {     profilePage.userLogout();});

    }
}

