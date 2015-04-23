package com.camelup;

/**
 * Created by newton on 4/23/15.
 */

import java.util.Scanner;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class App {
    public static void main(String args[]) throws Exception {
        CamelContext context = new DefaultCamelContext();
        context.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("file:/Users/newton/D6/code/camelup/testdir?noop=true").to("file:/Users/newton/D6/code/camelup/testdir2");
            }
        });
        context.start();
        System.out.println("Press enter to continue...");
        Scanner keyboard = new Scanner(System.in);
        keyboard.nextLine();
        context.stop();
    }
}
