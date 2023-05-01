package homework2.tests;

import homework2.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class CheckStudentRegistrationPageObjects extends TestBase {

    @Test
    void checkRegistrationForm() {


        // Открыли страницу
        open("/automation-practice-form");

        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        new RegistrationPage().setFirstName("test");
        new RegistrationPage().setLastName("test");
        new RegistrationPage().setEmail("N_a-t.m_-e@e_X-a.m0ple.cru");
        $("#genterWrapper").$(byText("Other")).click();
        $("#userNumber").setValue("0123456789");
        $(".react-datepicker-wrapper").click();
        $(".react-datepicker__month-select").selectOptionContainingText("April");
        $(".react-datepicker__year-select").selectOptionByValue("1994");
        $(".react-datepicker__day--024").click();
        $("#subjectsInput").setValue("History").pressEnter();
        $(byText("Music")).click();
        $(byText("Reading")).click();
        $("#uploadPicture").uploadFile(new File("src/test/resources/myuglyfacelol.jpg"));
        $("#currentAddress").setValue("You're looking damn good kitty, cuz you're in the Saint-Peterburg!");
        $("#state").click();
        $(byText("Uttar Pradesh")).click();
        $("#city").click();
        $(byText("Merrut")).click();
        $("#submit").click();

        $(".table-responsive").shouldHave(
                text("John"),
                text("Ivan0V321~"),
                text("N_a-t.m_-e@e_X-a.m0ple.cru"),
                text("Other"),
                text("0123456789"),
                text("24 April,1994"),
                text("History"),
                text("Music, Reading"),
                text("myuglyfacelol.jpg"),
                text("You're looking damn good kitty, cuz you're in the Saint-Peterburg!"),
                text("Uttar Pradesh"),
                text("Merrut"));

        $("#closeLargeModal").click();


    }

}
