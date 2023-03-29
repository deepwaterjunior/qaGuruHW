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

        // Открыли страницу
        open("https://demoqa.com/automation-practice-form");

        // По id заполнили имя
        $("[id=firstName]").setValue("Ivan123");

        //  По id заполнили фамилию
        $("[id=lastName]").setValue("Ivan0V321~");

        //  По id заполнили Email
        $("[id=userEmail]").setValue("N_a-t.m+e@e_X-a.m0ple.coM52");

        //  Кликнули по радиобатону gender
        $("[class=custom-control-label]").click();

        //  ввели номер телефона студента
        $("[id=userNumber]").setValue("0123456789");

        // нашли инпут календаря и кликнули по нему для раскртия таблицы
        $("[class=react-datepicker-wrapper]").click();

        // Нашли дроп-даун (селект) и выбрали по тексту нужный месяц
        $("[class=react-datepicker__month-select]").selectOptionContainingText("April");

        // Нашли дроп-даун (селект) и выбрали по тексту нужный год
        $("[class=react-datepicker__year-select]").selectOptionByValue("1994");

        /* Нашли нужный день в таблице по классу и кликнули по нему (хотел как-то иначе, по контексту aria-label или значению
        но не понял как реализовать*/
        $(".react-datepicker__day--024").click();
    }

}
