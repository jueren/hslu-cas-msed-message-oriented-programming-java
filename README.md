# I CAS MSED Message Oriented Programming Java

# General Information
This repo contains two example projects which do basically the same thing: Display Blogs and the Details views.
Each project does the same thing using two different approaches:
- Classical monolithic MVC-Approach where the corresponding Services consume each other directly using DI
- De-Coupled approach, where the functionality of the Services are triggered using a message bus infrastructure (using Spring-Integration Channels, Messages, Routers and Gateways)

# Prerequisites
- JRE 17
- Gradle 7.4

# Setup
- Checkout the repo in a local folder
- Build the project using gradle (via IDE)
- No additional setup necessary

# Run / Debug
There are two example applications as Java modules present:
- MSED-MOM
- MSED-MVC

In order to start these applications navigate to
- main/java/ch.hslu.cas.msed.mom.MOMWebApplication.java or
- main/java/ch.hslu.cas.msed.mvc. MVCWebApplication.java
-> and Run / Debug that file from your IDE.