package steps;

import pages.YandexPage;
import ru.yandex.qatools.allure.annotations.Step;

public class YandexSteps extends BaseSteps {

    @Step("Выбран пункт меню - {0}")
    public void stepSelectMarketSection(String menuItem) {
     new YandexPage(driver).selectmarketSection(menuItem);
    }

    @Step("Закртытие вкладки Яндекс и переход во вкладку Маркет")
    public void stepWindowsHandlesManagment() {
        new YandexPage(driver).windowsHandlesManagment();
    }
}
