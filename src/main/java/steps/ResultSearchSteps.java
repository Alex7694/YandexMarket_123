package steps;

import pages.ResultSearchPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ResultSearchSteps extends BaseSteps {

    @Step("Вывдено результатов поисковой выдачи на странице: {0}")
    public void stepcheckCountOfResultElements(int expectedCount) {
        new ResultSearchPage(driver).checkCountOfResultElements(expectedCount);
    }

    @Step("Поле {0} заполняется значением: {1}")
    public void stepFillField(String field, String value) {
        new ResultSearchPage(driver).fillField(field, value);
    }

    @Step("Поле {0} заполнено значением: {1}")
    public void stepCheckFillField(String field, String value) {
        new ResultSearchPage(driver).checkFillField(field, value);
    }
}
