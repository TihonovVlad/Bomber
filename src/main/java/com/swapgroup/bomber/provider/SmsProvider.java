package com.swapgroup.bomber.provider;



//Каждый провайдер должен быть зарегистрирован как Spring-бин (аннотация @Component).
//Провайдеры как @Component, слушают конфиги из application.yaml.
//@Order/Ordered, @Qualifier, конфиги через @ConfigurationProperties.

public interface SmsProvider {
    String getProviderName();
    void execute(String phoneNumber);
}
