package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class S_Registration_Form_tests {
    @Test
    void success_ful_submit_registration_test() {

        //open("https://demoqa.com/text-box");


        open("https://demoqa.com/automation-practice-form");

        $("[id=firstName]").setValue("some firstName");
        $("[id=lastName]").setValue("some lastName");
        $("[id=userEmail]").setValue("some userEmail");
        $("[id=]").setValue(""); // гендер
        $("[id=userNumber]").setValue("8999422555");
        $("[id=dateOfBirthInput]").setValue("18 Oct 1989");
        //$("[id=]").setValue(""); //предметы
        //$("[id=]").setValue(""); //хобби
        //$("[id=uploadPicture]").setValue("some user"); // добавление файла, погуглить как отработать добавление файла
        $("[id=currentAddress]").setValue("1600 Pennsylvania Avenue NW");
        //$("[id=currentAddress]").setValue("some user"); //штат
       // $("[id=currentAddress]").setValue("some user"); //город
        $("[id=submit]").click();

        $("[id=example-modal-sizes-title-lg]").shouldHave(text("Thanks for submitting the form"));



    }
}
