package com.arch2.dockerapi;

import com.arch2.dockerapi.entity.MusicEntity;
import com.arch2.dockerapi.repo.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class DockerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerApiApplication.class, args);
	}

}
