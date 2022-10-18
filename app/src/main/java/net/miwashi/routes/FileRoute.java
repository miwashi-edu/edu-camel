package net.miwashi.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        //from("file:/somedir?noop=true&idempotentKey=${file:name}-${file:size}")
        //from("file:/Volumes/tutorial/edu-camel/in?noop=true&idempotentKey=${file:name}-${file:modified}&delay=1s")
        from("file:/Volumes/tutorial/edu-camel/in?noop=true&idempotentKey=${file:modified}&delay=1s")
                .to("log:first-file");
    }
}
