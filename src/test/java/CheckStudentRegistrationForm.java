package testing;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class CheckStudentRegistrationForm {


    @Test
    void checkRegistrationForm(){
        Configuration.holdBrowserOpen = true;

        open("https://demoqa.com/automation-practice-form");

        $("[id=firstName]").setValue("Ivan123");


        $("[id=lastName]").setValue("Ivan0V321~");


        $("[id=userEmail]").setValue("N_a-t.m+e@e_X-a.m0ple.coM52");


        $("[class=custom-control-label]").click();


        $("[id=userNumber]").setValue("0123456789");


        $("[class=react-datepicker-wrapper]").click();


        $("[class=react-datepicker__month-select]").selectOptionContainingText("April");


        $("[class=react-datepicker__year-select]").selectOptionByValue("1994");


        $(".react-datepicker__day--024").click();
    }

}
