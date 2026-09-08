package com.swapgroup.bomber.provider;


//Каждый провайдер должен быть зарегистрирован как Spring-бин (аннотация @Component).
public class Site1 implements Provider {
    @Override
    public String getProviderName() {
        return "";
    }

    @Override
    public void execute(String phoneNumber) {

    }
    // отправляет POST-запрос на эндпоинт регистрации сайта1, передавая номер.

    //Общий подход к реализации:
    //
    //Использовать RestTemplate или WebClient.
    //
    //Учитывать возможные капчи – для Pet-проекта выбирайте сайты без сложной защиты или используйте упрощённые публичные API.
    //
    //Обрабатывать HTTP-коды, логировать успех/неудачу.
}
