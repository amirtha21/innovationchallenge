package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

    private static final WebDriver driver = null;

	public WebDriver ldriver;

    public Loginpage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(id = "email")
    @CacheLookup
    WebElement txtEmail;
    
    @FindBy(xpath = "//*[@id=\"main\"]/login/auth-container/div/fe-container/div/div/div/div/fe-form/form/div/fe-button/button")
    @CacheLookup
    WebElement btnNext;

    @FindBy(id = "password")
    @CacheLookup
    WebElement txtPassword;
           
    @FindBy(xpath = "//*[@id=\"main\"]/signin/auth-container/div/fe-container/div/div/div/div/fe-form/form/div/fe-button/button")   //On real time projects we customized the "xpath"
    @CacheLookup
    WebElement btnLogin;
    
     
    @FindBy(xpath = "//*[@id=\"main\"]/widget-index/div/widget-index-item[1]/widget-hero-board/div/fe-container/div/div[2]/div/div[2]/fe-card/div/fe-card-content/div/ul/li/a/div[1]")
    @CacheLookup
    WebElement btnInnovation;    
    
    @FindBy(xpath = "//*[@id=\"topicDetailTabContainer\"]/div/fe-container/div/div/div/fe-topic-participate-suggest/fe-topic-participate-description/fe-panel/div/div/fe-button/button")
    @CacheLookup
    WebElement btnSubmitIdea;
    
    @FindBy(xpath = "//*[@id=\"topicDetailTabContainer\"]/div/fe-container/div/div/div/ng-component/div/fe-suggestion-submit/fe-container/div/div/div/inn-suggestion-form/form/fe-form-field[1]/div/input")
    @CacheLookup
    WebElement txtIdeatitle;
    
    @FindBy(xpath = "//*[@id=\"topicDetailTabContainer\"]/div/fe-container/div/div/div/ng-component/div/fe-suggestion-submit/fe-container/div/div/div/inn-suggestion-form/form/fe-form-field[2]/div/fe-textarea/textarea")
    @CacheLookup
    WebElement txtIdeadescribe;
    
    @FindBy(xpath = "//*[@id=\"topicDetailTabContainer\"]/div/fe-container/div/div/div/ng-component/div/fe-suggestion-submit/fe-container/div/div/div/inn-suggestion-form/form/div/fe-button/button")
    @CacheLookup
    WebElement btnsubmitidea;
    
    @FindBy(xpath = "//*[@id=\"topicDetailTabContainer\"]/div/fe-container/div/div/div/fe-topic-participate-suggest/div/fe-list-suggestion/div/div[4]/fe-panel/div/fe-panel-suggestion/div/fe-comment-wrapper/div/fe-comment-input/fe-form-field/div/textarea")
    @CacheLookup
    WebElement txtComment;
    
    
    @FindBy(xpath = "//*[@id=\"topicDetailTabContainer\"]/div/fe-container/div/div/div/fe-topic-participate-suggest/div/fe-list-suggestion/div/div[5]/fe-panel/div/fe-panel-suggestion/div/fe-comment-wrapper/div/fe-comment-input/div/div[2]")
    @CacheLookup
    WebElement btnsumbit;
    


    public void setUserName(String uname) {
        txtEmail.clear();
        txtEmail.sendKeys(uname);
        
    }
        
     public void clickNext() {
         btnNext.click();
    }

    public void setPassword(String pwd) {
        txtPassword.clear();
        txtPassword.sendKeys(pwd);
    }
    
     public void clickLogin() {
        btnLogin.click();
    }
     
     public void clickInnovation() {
    	 btnInnovation.click();
     }
     
     public void clickSubmitIdea() {
    	 btnSubmitIdea.click();
     }
     
     public void typeideatitle(String olk) {
    	 txtIdeatitle.sendKeys(olk);
     }
     
     public void typeideadescribe(String nmk) {
    	 txtIdeadescribe.sendKeys(nmk);
     }
     
     public void clickSubmitidea() {
    	 btnsubmitidea.click();
     }
     
     public void TypeComment(String cmt) {
    	 txtComment.sendKeys(cmt);
     }
     
     public void Submitcomt() {
    	btnsumbit.click();
    	 
    }


}

