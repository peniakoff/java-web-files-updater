package pl.tomaszmiller.FileUploader.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.UUID;

/**
 * Created by Peniakoff on 10.07.2017.
 */
@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/")
    public String indexPost(@RequestParam("file") MultipartFile file) {
        if (!file.isEmpty()) {
            String fileName = file.getOriginalFilename();
            String fileType = fileName.substring(fileName.lastIndexOf("."), fileName.length());
            UUID uuid = UUID.randomUUID(); // uniwersalny unikalny identyfikator (MAC + time)
            File fileLocal = new File("E:\\files\\" + uuid.toString() + fileType.toString());
            BufferedOutputStream stream;
            try {
                fileLocal.createNewFile();
                stream = new BufferedOutputStream(new FileOutputStream(fileLocal));
                stream.write(file.getBytes());
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "index";
    }

}
