package homework2.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    // SelenideElements / locator / etc
    SelenideElement firstNameInput = $("#firstName");

    SelenideElement lastNameInput = $("#lastName");

    SelenideElement userEmailInput = $("#userEmail");

    // Actions
    public void setFirstName(String value) {
        firstNameInput.setValue(value);
    }

    public void setLastName(String value) {
       lastNameInput.setValue(value);
    }

    public void setEmail(String value) {
        userEmailInput.setValue(value);

    }
}
