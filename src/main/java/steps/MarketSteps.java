package steps;

import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketSteps extends BaseSteps {

    @Step("Выбор пункта меню - {0}")
    public void stepSelectElectonicSection(String menuItem) {
     new MarketPage(driver).selectElectonicSection(menuItem);
    }
}
