package pl.training.integration.lab01;

public class ConsolePrinter implements Printer {

    @Override
    public void print(String text) {
        System.out.println("#: " + text);
    }

}
