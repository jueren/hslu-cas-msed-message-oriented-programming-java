open module ch.hslu.cas.msed.mvc
{
    requires spring.webmvc;
    requires spring.context;
    requires spring.web;
    requires spring.core;
    // requires spring.integration.core;
    requires spring.boot.autoconfigure;
    requires org.slf4j;
    requires spring.boot;
    requires spring.beans;
    requires org.apache.tomcat.embed.core;

    exports ch.hslu.cas.msed.mvc;
}
