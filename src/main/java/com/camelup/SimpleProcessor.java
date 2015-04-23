package com.camelup;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.StringTokenizer;

/**
 * Created by newton on 4/23/15.
 */
public class SimpleProcessor implements Processor {
    public void process(Exchange exchange) throws Exception {
        String custom = exchange.getIn().getBody(String.class);
        StringTokenizer st = new StringTokenizer(custom, " ");
        StringBuilder csv = new StringBuilder();
        csv.append(custom.replaceAll("\n", "blah\n"));

        exchange.getIn().setBody(csv.toString());
    }
}
