package testing;

import FormTestConfig.FormTestConfig;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class CheckStudentRegistrationForm extends FormTestConfig {

    @Test
     void checkRegistrationForm(){


        // Открыли страницу
        open("https://demoqa.com/automation-practice-form");
        sleep(1000);
        // По id заполнили имя
        $("#firstName").setValue("Ivan123");
        sleep(1000);
        //  По id заполнили фамилию
        $("#lastName").setValue("Ivan0V321~");
        sleep(1000);
        //  По id заполнили Email
        $("#userEmail").setValue("N_a-t.m_-e@e_X-a.m0ple.cru");
        sleep(1000);
        //  Кликнули по радиобатону gender
        $("#genterWrapper").$(byText("Other")).click();
        sleep(1000);
        //  ввели номер телефона студента
        $("#userNumber").setValue("0123456789");
        sleep(1000);
        // нашли инпут календаря и кликнули по нему для раскртия таблицы
        $(".react-datepicker-wrapper").click();
        sleep(1000);
        // Нашли дроп-даун (селект) и выбрали по тексту нужный месяц
        $(".react-datepicker__month-select").selectOptionContainingText("April");
        sleep(1000);
        // Нашли дроп-даун (селект) и выбрали по тексту нужный год
        $(".react-datepicker__year-select").selectOptionByValue("1994");
        sleep(1000);
        /* Нашли нужный день в таблице по классу и кликнули по нему (хотел как-то иначе, или значению
        но не понял как реализовать*/
        $(".react-datepicker__day--024").click();
        sleep(1000);
        //  ввели название предмета студента
        $("#subjectsInput").setValue("History").pressEnter();
        sleep(1000);
        //  выбрали хобби
        $(byText("Music")).click();
        sleep(1000);
        $(byText("Reading")).click();
        sleep(1000);
        //  загрузили файл
        $("#uploadPicture").uploadFile(new File("src/test/resources/myuglyfacelol.jpg"));
        sleep(1000);
       //заполнили инпут
        $("#currentAddress").setValue("You're looking damn good kitty, cuz you're in the Saint-Peterburg!");
        sleep(1000);
        //выбрали штат и город
        $("#state").click();
        sleep(1000);
        $(byText("Uttar Pradesh")).click();
        sleep(1000);
        $("#city").click();
        sleep(1000);
        $(byText("Merrut")).click();
        sleep(1000);
        // нашли кнопку и кликнули по ней
        $("#submit").click();

        //проверили данные в таблице
       $(".table-responsive").shouldHave(
                text("Ivan123"),
                text("Ivan0V321~"),
                text("N_a-t.m_-e@e_X-a.m0ple.cru"),
                text("Male"),
                text("0123456789"),
                text("24 April,1994"),
                text("History"),
                text("Music, Reading"),
                text("myuglyfacelol.jpg"),
                text("You're looking damn good kitty, cuz you're in the Saint-Peterburg!"),
                text("Uttar Pradesh"),
                text("Merrut"));
        //закрыли модалку
        $("#closeLargeModal").click();


    }

}
