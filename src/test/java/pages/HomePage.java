package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[1]/div/main/section[1]/div[2]/header/div/div[1]/ul[1]/li[1]/a")
    private WebElement encontreUmaLoja;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/main/section[1]/div[2]/header/div/div[1]/ul[2]/li[1]/a")
    private WebElement atendimento;

    @FindBy(how = How.ID, using = "input-search")
    private WebElement caixaDePesquisas;

    @FindBy(how = How.CSS, using = "#search-container > div.sc-eCImPb.dAIaCU.sc-jYmNlR.fVizLQ > svg")
    private WebElement botaoDePesquisar;

    public void getEncontrarLoja(){
        encontreUmaLoja.click();
    }

    public void getAtendimento(){
        atendimento.click();
    }

    public void realizarPesquisa(String valorPesquisa){
        caixaDePesquisas.sendKeys(valorPesquisa.toLowerCase(), Keys.ENTER);
    }

}
