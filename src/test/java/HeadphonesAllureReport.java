import pages.ResultSearchPage;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;
import steps.*;


public class HeadphonesAllureReport extends BaseSteps {

    YandexSteps yandexSteps = new YandexSteps();
    MarketSteps marketSteps = new MarketSteps();
    ElectronicSteps electronicSteps = new ElectronicSteps();
    ProductSteps productSteps = new ProductSteps();
    AdvancedSearchSteps advancedSearchSteps = new AdvancedSearchSteps();
    ResultSearchSteps resultSearchSteps = new ResultSearchSteps();
    ResultSearchPage resultSearchPage = new ResultSearchPage(driver);

    @Test
    @Title("Яндекс Маркет - Наушники")
    public void testMarketHeadphones() {

        yandexSteps.stepSelectMarketSection("Маркет");
        yandexSteps.stepWindowsHandlesManagment();

        marketSteps.stepSelectElectonicSection("Электроника");
        electronicSteps.stepSelectHeadphonesSection();

        productSteps.stepAllfiltersBtn();

        advancedSearchSteps.stepFillField("Цена", "5000");
        advancedSearchSteps.stepBeatsCheckbox();
        advancedSearchSteps.stepShowButton();

        resultSearchSteps.stepcheckCountOfResultElements(30);

        resultSearchSteps.stepFillField("Поиск", resultSearchPage.getFirstElement().getText());

        resultSearchSteps.stepCheckFillField("Первый элемент поиска", resultSearchPage.searchInput.getAttribute("value"));

    }
}
