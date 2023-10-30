package ch.hslu.cas.msed.mom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.config.EnableIntegration;

@EnableIntegration
@SpringBootApplication
// @IntegrationComponentScan(value = {"ch.hslu"})
public class MOMWebApplication
{
    private static final Logger logger = LoggerFactory.getLogger(MOMWebApplication.class);

    public static void main(String[] args)
    {
        SpringApplication.run(MOMWebApplication.class, args);
        logger.info("Hello World MoM Java!");
    }
}