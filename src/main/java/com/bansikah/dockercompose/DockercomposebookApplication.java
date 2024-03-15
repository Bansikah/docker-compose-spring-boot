package com.bansikah.dockercompose;

import com.bansikah.dockercompose.entity.Book;
import com.bansikah.dockercompose.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@SpringBootApplication
public class DockercomposebookApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockercomposebookApplication.class, args);
    }

}
