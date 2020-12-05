package steps;

import pages.AdvancedSearchPage;
import ru.yandex.qatools.allure.annotations.Step;


public class AdvancedSearchSteps extends BaseSteps {


    @Step("Поле {0} заполняется значением: {1}")
    public void stepFillField(String field, String value) {
        new AdvancedSearchPage(driver).fillField(field,  value);
    }

    @Step("Активация чекбокса Beats")
    public void stepBeatsCheckbox() {
        new AdvancedSearchPage(driver).BeatsCheckbox.click();
    }

    @Step("Активация чекбокса Lg")
    public void stepLgCheckbox() {
        new AdvancedSearchPage(driver).LgCheckbox.click();
    }

    @Step("Активация чекбокса Samsung")
    public void stepSamsungCheckbox() {
        new AdvancedSearchPage(driver).SamsungCheckbox.click();
    }

    @Step("Нажатие на кнопку Показать")
    public void stepShowButton() {
        new AdvancedSearchPage(driver).ShowButton.click();
    }

}
