package br.com.todoCLI.commands;

import br.com.todoCLI.core.ICommands;
import br.com.todoCLI.core.Summary;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloWorld implements Runnable, ICommands {
    @Override
    public Summary getSummary() {
        return new Summary(
                "1.0",
                "Hello World",
                "Return the print of 'HelloWorld' ",
                List.of("helloworld", "hello")
            );
    }

    @Override
    public void run() {
        System.out.println("Hello World");
    }
}
