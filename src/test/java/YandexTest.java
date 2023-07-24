import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YandexTest {

    @BeforeAll
    static void config() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void simpleYandexSearchTest() {
        open("https://www.yandex.ru/");
        $("[name=q]").setValue("youtube").pressEnter();
        $("[id=search]").shouldHave(text("youtube.com"));

    }
}
