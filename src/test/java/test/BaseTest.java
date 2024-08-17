package test;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
//import pages.ProfilePage;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class BaseTest {


    protected static LoginPage loginPage;
  //  protected static ProfilePage profilePage;
    protected static WebDriver driver;
    /**
     * осуществление первоначальной настройки
     */
   @Tag("UiYandex")
    @BeforeAll
    @Step("Запуск страницы")
         public static void setup() {

        WebDriverManager.chromedriver().setup();
        //создание экземпляра драйвера
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
     //   profilePage = new ProfilePage(driver);
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



        }

    /**
     * осуществление выхода из аккаунта с последующим закрытием окна браузера Яндекс
     */
//    @AfterAll
//    @Step ("Выход из аккаунта")
//    public static void tearDown() {
//        step ("Заходим в iFrame menu", () ->
//        {     profilePage.entryMenu();});
//
//        step ("Получаем отображаемый логин и сравниваем его с логином из файлов настройки", () ->
//        {   String user = BaseTest.profilePage.getUserId();
//            Assertions.assertEquals(test.ConfProperties.getProperty("login"), user); });
//
//        step ("Нажимаем на кнопку Выход", () ->
//        {     profilePage.userLogout();});
//        driver.quit();
//    }
}




