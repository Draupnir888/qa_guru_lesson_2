package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class S_Registration_Form_tests {
    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
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
        //$("[class=react-datepicker__day react-datepicker__day--018]").click()
        // $(byText("react-datepicker__day react-datepicker__day--018")).click();
        //$("[class=react-datepicker__day.react-datepicker__day--018]").click();

        //$("[id=subjectsContainer]").setValue("Maths"); //предметы
        $(byText("Sports")).click();
        //$("[id=uploadPicture]").setValue("some user"); // добавление файла, погуглить как отработать добавление файла
        $("[id=currentAddress]").setValue("1600 Pennsylvania Avenue NW");

        $("[class=css-1uccc91-singleValue]").click(); //штат
        $(byText("Rajasthan")).click();

        $(".css-1wa3eu0-placeholder", 3).click(); //город
        $(byText("Jaipur")).click();
        //$(byText("Submit")).click();
        $x("//button[@id='submit']").click();

        //$("[id=example-modal-sizes-title-lg]").shouldHave(text("Thanks for submitting the form"));



    }
}
