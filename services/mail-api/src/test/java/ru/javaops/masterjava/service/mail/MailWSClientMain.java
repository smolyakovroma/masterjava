package ru.javaops.masterjava.service.mail;

import com.google.common.collect.ImmutableSet;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MailWSClientMain {
    public static void main(String[] args) {

        ImmutableSet<Addressee> addressees = ImmutableSet.of(
                new Addressee("gzd@bk.ru"),
                new Addressee("Мастер Java <mr.iterator@mail.ru>"),
                new Addressee("Bad Email <bad_email.ru>"));
        try {
            String state = MailWSClient.sendBulkMail(addressees, ImmutableSet.of(),"Subject", "Body");
            System.out.println(state);
        } catch (Throwable e) {
            log.error(e.toString(), e);
        }
    }
}