package com.example.demo;

import com.example.demo.view.MahasiswaView;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {

        // FIX WAJIB → Matikan mode headless supaya Swing boleh muncul
        System.setProperty("java.awt.headless", "false");

        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);

        // Jalankan GUI Swing setelah Spring Boot siap
        javax.swing.SwingUtilities.invokeLater(() -> {
            MahasiswaView view = context.getBean(MahasiswaView.class);
            view.setVisible(true);
        });
    }
}
