package testing;

import FormTestConfig.FormTestConfig;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class CheckStudentRegistrationForm extends FormTestConfig {

    @Test
     void checkRegistrationForm(){


        // Открыли страницу
        open("https://demoqa.com/automation-practice-form");
        // По id заполнили имя
        $("#firstName").setValue("Ivan123");
        //  По id заполнили фамилию
        $("#lastName").setValue("Ivan0V321~");
        //  По id заполнили Email
        $("#userEmail").setValue("N_a-t.m+e@e_X-a.m0ple.coM52");
        //  Кликнули по радиобатону gender
        $(".custom-control-label").click();
        //  ввели номер телефона студента
        $("#userNumber").setValue("0123456789");
        // нашли инпут календаря и кликнули по нему для раскртия таблицы
        $(".react-datepicker-wrapper").click();
        // Нашли дроп-даун (селект) и выбрали по тексту нужный месяц
        $(".react-datepicker__month-select").selectOptionContainingText("April");
        // Нашли дроп-даун (селект) и выбрали по тексту нужный год
        $(".react-datepicker__year-select").selectOptionByValue("1994");
        /* Нашли нужный день в таблице по классу и кликнули по нему (хотел как-то иначе, по контексту aria-label или значению
        но не понял как реализовать*/
        $(".react-datepicker__day--024").click();
        //  ввели название предмета студента
        $("#subjectsInput").setValue("History").pressEnter();
        //  выбрали хобби
        $(byText("Music")).click();
        $(byText("Reading")).click();

        $("#uploadPicture").uploadFile();

    }

}
