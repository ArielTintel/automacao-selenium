package tests;

import config.Driver;
import org.junit.Assert;
import pages.HomePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.SearchPage;

public class Pesquisa {

    private WebDriver driver;
    private HomePage homePage;
    private SearchPage searchPage;

    @Before
    public void iniciarDriver() {
       Driver init = new Driver();
       driver = init.getInitDriver();
       homePage = new HomePage(driver);
       searchPage = new SearchPage(driver);
    }

    @After
    public void finalizarDriver(){
        driver.quit();
    }

    @Test
    public void realizar_pesquisa(){
        String  valorDaBusca = "NoTeBook";
        homePage.realizarPesquisa(valorDaBusca);
        boolean resultadoVerificado = searchPage.verificarResultado(valorDaBusca);

        Assert.assertTrue(resultadoVerificado);
    }
}
