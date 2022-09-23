package edu.uc.cech.soit.myclassjournal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyclassjournalApplication {

    public static void main(String[] args) {
        System.err.println(new MyClassJournalController().index());
        SpringApplication.run(MyclassjournalApplication.class, args);
    }

}
