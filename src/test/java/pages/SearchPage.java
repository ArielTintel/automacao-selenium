package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage {

    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/main/section[4]/div[3]/div/ul/li/a")
    private List<WebElement> resultados;

    public boolean verificarResultado(String valorDaBusca){
        return resultados.stream()
                .filter(resultado -> resultado.getText().toLowerCase().contains(valorDaBusca.toLowerCase()))
                .findFirst()
                .isPresent();
    }
}





