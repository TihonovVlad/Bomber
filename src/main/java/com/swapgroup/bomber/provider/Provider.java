package com.swapgroup.bomber.provider;



//Каждый провайдер должен быть зарегистрирован как Spring-бин (аннотация @Component).


public interface Provider {
    String getProviderName();
    void execute(String phoneNumber);
}
