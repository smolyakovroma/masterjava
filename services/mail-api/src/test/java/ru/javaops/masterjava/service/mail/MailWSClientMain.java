package ru.javaops.masterjava.service.mail;

import com.google.common.collect.ImmutableSet;

public class MailWSClientMain {
    public static void main(String[] args) {
        MailWSClient.sendToGroup(
                ImmutableSet.of(new Addressee("Григорий Кислин <gzd@bk.ru>")),
                ImmutableSet.of(new Addressee("Мастер Java <mr.iterator@mail.ru>")), "Subject", "Body");
    }
}