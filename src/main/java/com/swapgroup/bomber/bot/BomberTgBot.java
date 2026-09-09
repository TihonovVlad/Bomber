package com.swapgroup.bomber.bot;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class BomberTgBot extends TelegramLongPollingBot{
//должен возвращать username/token

    @Override
    public void onUpdateReceived(Update update) {

    }

    @Override
    public String getBotUsername() {
        return "";
    }
}
//BomberTelegramBot – наследник TelegramLongPollingBot, переопределяет onUpdateReceived.
//Слушает команды и делегирует обработку CommandHandler.
//CommandHandler – обрабатывает входящие сообщения:
//
/// start – приветствие и инструкция.
///bomb +71234567890 – запуск атаки на номер.
///status – показывает текущие задачи пользователя (опционально).
//MessageSender – утилита для отправки сообщений (обёртка над sendMessage).