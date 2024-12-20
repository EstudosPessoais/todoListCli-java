package br.com.todoCLI;

import br.com.todoCLI.core.Summary;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App
{
    public static void main( String[] args ) throws Exception {
        // Lista de comandos
        Map<List<String>, String> commands = new HashMap<>();

        // Insere na lista acima
        File commandFiles = Paths.get("src/main/java/br/com/todoCLI/commands").toFile();
        if(!commandFiles.isDirectory())
            throw new Exception("[App] - Fail to read the 'commands' package");

        // LoadAlias
        for(String commandNames : commandFiles.list()){
            getAliasOfACommand(commandNames.replace(".java", ""));
        }


//        Load and Invoke Run
//        Class<?> loadClass = Class.forName("br.com.todoCLI.commands.HelloWorld");
//
//        Object instance = loadClass.getDeclaredConstructor().newInstance();
//
//        loadClass.getMethod("run").invoke(instance);

        System.exit(0);
    }

    private static List<String> getAliasOfACommand(String commandName) {
        List<String> aliasOfEachCommand = new ArrayList<>();
        try{
            Class<?> loadClass = Class.forName(String.format("br.com.todoCLI.commands.%s", commandName));

            Object instance = loadClass.getDeclaredConstructor().newInstance();

            Object summaryOfACommand = loadClass.getMethod("getSummary").invoke(instance);
            System.out.println(summaryOfACommand);
        }catch (Exception e)
        {
            if(e instanceof ClassNotFoundException) {
                System.out.println(String.format("[Load][Alias] - Not possible to load this class [%S]", commandName));
            }

            System.out.println("[Load][Alias] - Error when trying to load/invoke class");
        }

        System.out.println(commandName);

        return aliasOfEachCommand;
    }
}
