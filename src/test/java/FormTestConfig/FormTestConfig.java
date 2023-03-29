package FormTestConfig;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class FormTestConfig {

    @BeforeAll
    static void configTestRegForm() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize="1900x1280";
    }
}
