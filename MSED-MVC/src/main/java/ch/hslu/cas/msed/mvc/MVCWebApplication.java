package ch.hslu.cas.msed.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MVCWebApplication
{
    private static final Logger logger = LoggerFactory.getLogger(MVCWebApplication.class);

    public static void main(String[] args)
    {
        SpringApplication.run(MVCWebApplication.class, args);
        logger.info("Hello World MVC Java!");
    }
}