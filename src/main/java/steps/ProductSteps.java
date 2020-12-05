package steps;

import pages.ProductPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ProductSteps extends BaseSteps {

    @Step("Нажатие на кнопку Все фильтры ")
    public void stepAllfiltersBtn() {
        new ProductPage(driver).AllfiltersBtn.click();
    }
}
