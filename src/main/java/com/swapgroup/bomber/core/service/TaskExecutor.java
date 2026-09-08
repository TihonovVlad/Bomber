package com.swapgroup.bomber.core.service;

public class TaskExecutor {
    // асинхронный исполнитель (использует @Async или CompletableFuture):
    //
    //Получает список всех провайдеров из ProviderManager.
    //
    //Для каждого провайдера асинхронно вызывает provider.execute(phone).
    //
    //Собирает результаты, обновляет статус задачи в БД.
    //
    //Логирует ошибки (каждый провайдер может упасть, но это не останавливает остальные).
}
