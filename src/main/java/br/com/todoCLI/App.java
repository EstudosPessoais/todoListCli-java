package br.com.todoCLI;

import java.io.File;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args ) throws Exception {
        // Lista de comandos
        List<String> commands = new ArrayList<>();

        // Insere na lista acima
        File coomandsFile = Paths.get("src/main/java/br/com/todoCLI/commands").toFile();
        if(!coomandsFile.isDirectory())
            throw new Exception("[Error] - Droga de url");

        for(String nameFile : coomandsFile.list())
        {
            commands.add(nameFile);
        }

        System.out.println(commands);

        System.exit(0);
    }
}
