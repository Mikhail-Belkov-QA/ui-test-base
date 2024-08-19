package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    /**
     * определение локатора меню пользователя
     */
    @FindBy(xpath = "//*[contains(@class, 'UserID-Account')]")
    private WebElement userMenu;
 @FindBy(xpath = "//*[contains(@class, 'Subname')]")
    private WebElement userId;


    /**
     * определение локатора кнопки выхода из аккаунта
     */
    @FindBy(xpath = "//*[contains(@class, 'MenuItem_logout')]")
    private WebElement logoutBtn;
    /**
     * метод для получения имени пользователя из меню пользователя
     */
    public String getUserName() {
        String userName = userMenu.getText();
        return userName; }
   public String getUserId() {
        String userIdText = userId.getText();
        return userIdText; }
    /**
     * метод для нажатия кнопки меню пользователя
     */
    @Step("Вход в iFrame menu")
    public void entryMenu() {

        userMenu.click();
        //Далее входим во фрейм меню
        WebElement iframe = driver.findElement( By.className( "UserWidget-Iframe") );
        driver.switchTo().frame( iframe );
    }

    /**
     * метод для нажатия кнопки выхода из аккаунта
     */
    @Step ("Выход из аккаунта")
    public void userLogout() {
        logoutBtn.click(); } }

