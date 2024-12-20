package br.com.todoCLI.commands;

import br.com.todoCLI.core.ICommands;
import br.com.todoCLI.core.Summary;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ping implements ICommands, Runnable {
    @Override
    public Summary getSummary() {
        return new Summary(
                "1.0",
                "ping",
                "Ping! Pong! - Latency",
                List.of("ping")
        );
    }

    @Override
    public void run() {

    }
}
