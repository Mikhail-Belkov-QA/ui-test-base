package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    @FindBy(xpath = "//button[@class = 'Button2 Button2_checked Button2_size_l Button2_view_default']")
    private WebElement loginEmail;

    /**
     * определение локатора поля ввода логина
     */
    @FindBy(xpath = "//*[contains(@id, 'passp-field-login')]")
    private WebElement loginField;
    /**
     * определение локатора кнопки входа в аккаунт
     */
    @FindBy(xpath = "//*[contains(text(), 'Войти')]/..")
    private WebElement loginBtn;
    /**
     * определение локатора поля ввода пароля
     */
    @FindBy(xpath = "//*[contains(@id, 'passp-field-passwd')]")
    private WebElement passwdField;

    @FindBy(xpath = "//span[text() = 'Продолжить']")
    private WebElement passwdClick;

    /**
     * метод для ввода логина
     */
    @Step ("Нажатие на кнопку Email")
    public void inputLoginEmailBtn() {
        loginEmail.click(); }
   @Step ("Ввод логина")
   public void inputLogin(String login) {
        loginField.sendKeys(login); }
    /**
     * метод для ввода пароля
     */
    @Step ("Ввод пароля")
    public void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd); }
    /**
     * метод для осуществления нажатия кнопки входа в аккаунт
     */

    @Step ("Нажатие на кнопку Продолжить")
    public void clickPasswBtn() {
       ((JavascriptExecutor) driver).executeScript("arguments[0].click();", passwdClick);


      //  passwdClick.click();
        }
    @Step ("Нажатие на кнопку")
    public void clickLoginBtn() {
        loginBtn.click(); } }

