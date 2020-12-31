//package com.example.web.telegram;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Component;
//import org.telegram.telegrambots.bots.TelegramLongPollingBot;
//import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
//import org.telegram.telegrambots.meta.api.objects.Message;
//import org.telegram.telegrambots.meta.api.objects.Update;
//import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
//
//@Component
//@Slf4j
//public class YourBot extends TelegramLongPollingBot {
//    /**主要邏輯寫在此，處理收到訊息*/
//    public void onUpdateReceived(Update update) {
//        Message message = null;
//        Long chatId = null;
//        String text = null;
//
//        if (update.hasChannelPost()) {
//            message = update.getChannelPost();
//        } else {
//            message = update.getMessage();
//        }
//
//        chatId = message.getChatId();
//        text = message.getText();
//
//        log.info("ChatId [{}]", chatId);
//        log.info("MessageId [{}]", message.getMessageId());
//        log.info("Message Content [{}]", text);
//
//        this.sendDummyMessage(chatId);
//    }
//    public void sendDummyMessage(Long chatId) {
//        SendMessage sm = new SendMessage();
//        sm.setChatId(chatId);
//        sm.setText("OKOK!");
//
//        try {
//            this.execute(sm);
//        } catch (TelegramApiException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void sendDummyMessage(String message) {
//        SendMessage sm = new SendMessage();
//        sm.setChatId(-446033341l);
//        sm.setText(message);
//        try {
//            this.execute(sm);
//        } catch (TelegramApiException e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**回傳之前取得的username*/
//    public String getBotUsername() {
//        return "anthonytest23namebot";
//    }
//
//    /**回傳之前取得的token*/
//    public String getBotToken() {
//        return "633510778:AAEzNhdYK8b8zvFBkKhupryaukUEuTdXFOw";
//    }
//}
