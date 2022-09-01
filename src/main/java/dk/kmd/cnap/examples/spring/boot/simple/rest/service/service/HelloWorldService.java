package dk.kmd.cnap.examples.spring.boot.simple.rest.service.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class HelloWorldService {

    Logger logger = LoggerFactory.getLogger(HelloWorldService.class);
    String cnapExercise2;

    @Autowired
    public HelloWorldService(@Value("${message.return}") String cnapExercise2) {
        this.cnapExercise2 = cnapExercise2;
    }

    public String returnHello() {
        logger.info("Inside returnHello...");
        return cnapExercise2;
    }

}
