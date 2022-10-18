package net.miwashi.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class TimerRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        //from("timer:first-timer").to("log:first-timer");
    }
}
