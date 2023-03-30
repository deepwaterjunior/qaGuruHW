package homework2;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void configTestRegForm() {
        Configuration.holdBrowserOpen = false;
        Configuration.browserSize="1900x1280";
    }
}
