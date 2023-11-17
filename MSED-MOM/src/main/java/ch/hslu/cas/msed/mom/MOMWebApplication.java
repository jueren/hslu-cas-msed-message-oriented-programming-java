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

    /*
        1) MOMBlogDomainService.getAll() -> Implement this.gateway.getUserById() (replaces this.authService.getById())

        2) MOMMessageBusGateway -> create  this.gateway.getUserById()-Method

        3) Create MOMMessageBusAuthQueryMessage

        4) Create
            - /infrastructure/MOMMessageBusAuthChannel
            - /infrastructure/MOMMessageBusAuthQueryChannel (CQRS-Stuff)
            - /infrastructure/MOMMessageBusAuthQueryChannel (CQRS-Stuff)
        5) Create
            - /infrastructure/MOMMessageBusAuthRouter

        6) Modify
            - /infrastructure/MOMMessageBusRouter -> Add new MessageType

        7) Add	- /presentation/MOMMessageBusAuthActivator (Listener for Auth-Messages)

        8) Enrich: - /resources/templates/blog/list.html / detail.html with the new service-data

        9) Test: localhost:8080/MOM/Blogs/List ;-) OR Checkout the solution-branch ;-)
    */

    public static void main(String[] args)
    {
        SpringApplication.run(MOMWebApplication.class, args);
        logger.info("Hello World MoM Java!");
    }
}