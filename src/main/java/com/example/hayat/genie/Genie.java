package com.example.hayat.genie;

import java.io.IOException;

public class Genie {
    public static void fulfill(Wish cmd) {
        cmd.fulfill();
    }

    public static Wish getWish(String voiceCmd) {
        Wish cmd;
        if (voiceCmd.equals("Open Chrome")) {
            cmd = openChrome();
        } else if (voiceCmd.equals("Open Facebook")) {
            cmd = openFacebook();
        } else if (voiceCmd.equals("Open WhatsApp")) {
            cmd = openWhatsapp();
        } else {
            cmd = talkToGenie();
        }
        return cmd;
    }

    private static Wish talkToGenie() {
        return () -> {
            System.out.println("Got command");
        };
    }

    private static Wish openChrome() {
        return () -> {
            try {
                Runtime.getRuntime().exec("cmd /c start chrome ");
            } catch (IOException e) {
                System.out.println("Can't open Chrome");
            }
        };
    }

    private static Wish openFacebook() {
        return () -> {
            try {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler www.facebook.com");
            } catch (IOException e) {
                System.out.println("Can't open Link");
            }
        };
    }

    private static Wish openWhatsapp() {
        return () -> {
            try {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler https://web.whatsapp.com/");
            } catch (IOException e) {
                System.out.println("Can't open Link");
            }
        };
    }
}
