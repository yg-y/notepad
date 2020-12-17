package com.young.notepad.web;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NotepadServeAdminApplicationTests {

    public static void main(String[] args) {
     String srt = new String("a");
     String srt2 = new String("a");

        System.err.println(srt == srt2);
        System.err.println(srt .equals( srt2));
    }
}
