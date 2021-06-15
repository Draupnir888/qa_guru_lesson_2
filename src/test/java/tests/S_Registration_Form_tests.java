package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import javax.swing.text.html.parser.DTD;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class S_Registration_Form_tests {
    @BeforeAll
    static void setup() {
        Configuration.browserSize = "2500x1500";
        //Configuration.startMaximized = true;
        Configuration.headless = true;
    }

    @Test
    void success_ful_submit_registration_test() {

        //open("https://demoqa.com/text-box");


        open("https://demoqa.com/automation-practice-form");

        $("[id=firstName]").setValue("somefirstName");
        $("[id=lastName]").setValue("somelastName");
        $("[id=userEmail]").setValue("tosttostovich@gmail.com");
        $("[class=custom-control-label]").click(); // гендер, работает!!!
        //$(byText("Male")).click();
        $("[id=userNumber]").setValue("8999422555");

        $("[id=dateOfBirthInput]").click(); //календарь
        $("[class=react-datepicker__month-select]").click();
        $(byText("October")).click();
        $("[class=react-datepicker__year-select]").click();
        $(byText("1989")).click();
        $(byText("18")).click();

        //$("[id=subjectsContainer]").setValue("Maths"); //Почему не работает? Элемент id=subjectsContainer единстенный на странице
        //$(byText("Maths")).click();

        $(byText("Sports")).click();
        $("[id=currentAddress]").setValue("1600 Pennsylvania Avenue NW");

        /*
        $("[class=css-1uccc91-singleValue]", 1).click(); //штат
        $(byText("Haryana")).click();
        Почему не работает? Индекс указан верно, по счету второй, счет начинается от нуля
        */

        $(byText("Select State")).click();
        $(byText("Haryana")).click();

        //$(".css-1wa3eu0-placeholder", 2).click(); //город
        $(byText("Select City")).click();
        $(byText("Panipat")).click();

        $(byText("Submit")).click();



        $(byText("Student Name")).shouldHave(text("somefirstName somelastName"));
        $(byText("Student Email")).shouldHave(text("tosttostovich@gmail.com"));
        $(byText("Gender")).shouldHave(text("Male"));
        $(byText("Mobile")).shouldHave(text("8999422555"));
        $(byText("Date of Birth")).shouldHave(text("18 October,1989"));
        $(byText("Hobbies")).shouldHave(text(""));
        $(byText("Address")).shouldHave(text("1600 Pennsylvania Avenue NW"));
        $(byText("State and City")).shouldHave(text("Haryana Submit"));

    }
}
