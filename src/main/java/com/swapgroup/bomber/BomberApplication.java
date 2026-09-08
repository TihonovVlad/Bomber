package com.swapgroup.bomber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BomberApplication {

	public static void main(String[] args) {
		SpringApplication.run(BomberApplication.class, args);
	}

}
//База данных (Liquibase)
//Таблицы:
//users
//id (BIGINT, PK)
//telegram_id (BIGINT, UNIQUE)
//username (VARCHAR)
//created_at (TIMESTAMP)
//tasks
//id (UUID, PK)
//user_id (BIGINT, FK → users.id)
//phone_number (VARCHAR)
//status (VARCHAR) – ENUM в коде, в БД строка.
//created_at (TIMESTAMP)
//updated_at (TIMESTAMP)
//providers_used (JSONB или TEXT) – список провайдеров с результатами (например, {"site1":"OK", "site2":"FAIL"}).
//provider_logs (опционально) – логи выполнения каждого провайдера для конкретной задачи.

//Файлы миграции в src/main/resources/db/changelog/:
//db.changelog-master.yaml – включает все ченджлоги.
//Первая миграция создаёт таблицы, индексы.


//Взаимодействие между компонентами
//Пользователь отправляет команду /bomb +79001234567.
//TelegramBot передаёт команду в CommandHandler.
//CommandHandler вызывает TaskService.createTask() – сохраняется задача со статусом NEW.
//Затем TaskService.startTask() запускает асинхронное выполнение через TaskExecutor.
//TaskExecutor получает все провайдеры из ProviderManager и параллельно вызывает execute() для каждого.
//Результаты записываются в задачу (например, в поле providers_used) и статус меняется на COMPLETED (или FAILED, если все провайдеры упали).
//Бот уведомляет пользователя о завершении (или можно отправлять промежуточные статусы).