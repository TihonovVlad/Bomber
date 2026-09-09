package com.swapgroup.bomber.provider;


import lombok.AllArgsConstructor;
import org.springframework.web.client.RestClient;

//Каждый провайдер должен быть зарегистрирован как Spring-бин (аннотация @Component).
//Использовать RestTemplate или WebClient.
//Учитывать возможные капчи – для Pet-проекта выбирайте сайты без сложной защиты или используйте упрощённые публичные API.
//Обрабатывать HTTP-коды, логировать успех/неудачу.


@AllArgsConstructor
public class Site1 implements SmsProvider {

    private final RestClient webClient;

// вернуть реальное имя.
    @Override
    public String getProviderName() {
        return "";
    }

    @Override
    public void execute(String phoneNumber) {
    }
}


// отправляет POST-запрос на эндпоинт регистрации сайта1, передавая номер.
//POST + чтение ответа + логирование успех/фейл. getProviderName() — вернуть реальное имя.


