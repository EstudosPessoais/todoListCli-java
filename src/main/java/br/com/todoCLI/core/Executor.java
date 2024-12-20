package br.com.todoCLI.core;

public class Executor {

    public static void execute(String nameClass) {
        try {
            Class<?> loadClass = Class.forName(nameClass);

            if(!Runnable.class.isAssignableFrom(loadClass))
            {
                throw new RuntimeException(String.format("This class is not a 'command' %s", loadClass.getName()));
            }

            Runnable instance = (Runnable) loadClass.getDeclaredConstructor().newInstance();
            instance.run();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
