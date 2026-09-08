package com.swapgroup.bomber.bot;

public class BomberTgBot {
}
//BomberTelegramBot – наследник TelegramLongPollingBot, переопределяет onUpdateReceived.
//Слушает команды и делегирует обработку CommandHandler.
//
//CommandHandler – обрабатывает входящие сообщения:
//
/// start – приветствие и инструкция.
//
///bomb +71234567890 – запуск атаки на номер.
//
///status – показывает текущие задачи пользователя (опционально).
//
//MessageSender – утилита для отправки сообщений (обёртка над sendMessage).