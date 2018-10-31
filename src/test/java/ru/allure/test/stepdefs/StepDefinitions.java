package ru.allure.test.stepdefs;

import cucumber.api.java.ru.Допустим;

public class StepDefinitions {

    @Допустим("^пользователь вызывает исключение$")
    public void пользователь_вызывает_исключение() {
        throw new RuntimeException();
    }
}
