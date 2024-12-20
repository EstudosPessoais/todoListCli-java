package br.com.todoCLI.commands;

import picocli.CommandLine.Command;

@Command(
        name = "helloWorld",
        mixinStandardHelpOptions = true,
        version = "hello world 1",
        description = "Print hello world"
)
public class HelloWorld implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World");
    }
}
