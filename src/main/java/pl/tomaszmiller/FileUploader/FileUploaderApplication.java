package pl.tomaszmiller.FileUploader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

@SpringBootApplication
public class FileUploaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileUploaderApplication.class, args);
	}

//	public void downloadFile() {
//		try {
//			URL url = new URL("http://www.tomaszmiller.pl/files/list.txt");
//			InputStream inputStream = url.openStream();
//			Files.copy(inputStream, new File("E:\\files\\list.txt").toPath(), StandardCopyOption.REPLACE_EXISTING);
//			inputStream.close();
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

}
