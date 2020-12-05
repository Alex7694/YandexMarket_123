import pages.ResultSearchPage;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;
import steps.*;

public class TvAllureReport extends BaseSteps {

    YandexSteps yandexSteps = new YandexSteps();
    MarketSteps marketSteps = new MarketSteps();
    ElectronicSteps electronicSteps = new ElectronicSteps();
    ProductSteps productSteps = new ProductSteps();
    AdvancedSearchSteps advancedSearchSteps = new AdvancedSearchSteps();
    ResultSearchSteps resultSearchSteps = new ResultSearchSteps();
    ResultSearchPage resultSearchPage = new ResultSearchPage(driver);

    @Test
    @Title("Яндекс Маркет - Телевизоры")
    public void testMarketHeadphones()  {

        yandexSteps.stepSelectMarketSection("Маркет");
        yandexSteps.stepWindowsHandlesManagment();

        marketSteps.stepSelectElectonicSection("Электроника");
        electronicSteps.stepSelectTvSection();

        productSteps.stepAllfiltersBtn();

        advancedSearchSteps.stepFillField("Цена", "20000");
        advancedSearchSteps.stepLgCheckbox();
        advancedSearchSteps.stepSamsungCheckbox();
        advancedSearchSteps.stepShowButton();

        resultSearchSteps.stepcheckCountOfResultElements(48);

        resultSearchSteps.stepFillField("Поиск", resultSearchPage.getFirstElement().getText());

        resultSearchSteps.stepCheckFillField("Первый элемент поиска", resultSearchPage.searchInput.getAttribute("value"));

    }
}
