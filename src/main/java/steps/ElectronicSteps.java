package steps;

import pages.ElectronicPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ElectronicSteps extends BaseSteps {

    @Step("Переход в раздел Наушники и Bluetooth-гарнитуры")
    public void stepSelectHeadphonesSection() {
     new ElectronicPage(driver).HeadphonesSection.click();
    }

    @Step("Переход в раздел Телевизоры")
    public void stepSelectTvSection() {
        new ElectronicPage(driver).TvSection.click();
    }
}
