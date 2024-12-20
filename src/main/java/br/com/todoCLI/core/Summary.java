package br.com.todoCLI.core;

import java.util.List;

public record Summary(
        String version,
        String name,
        String description,
        List<String> alias
) { }
