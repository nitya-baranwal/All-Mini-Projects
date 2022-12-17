package liveClass;

import java.util.logging.ConsoleHandler;

public class _3WeProblem {

    //create an interface Printer : print()
    //create a concrete class FilePrinter
    //create a concrete class ConsolePrinter

    public static void main(String[] args) {
        FilePrinter filePrinter = new FilePrinter();
        filePrinter.print();
        ConsolePrinter consolePrinter = new ConsolePrinter();
        consolePrinter.print();

        System.out.println(filePrinter instanceof Printer);
        System.out.println(consolePrinter instanceof Printer);
    }
}

interface Printer { //super type
    void print();

}

class FilePrinter implements Printer{ //sub type
    public void print() {
        System.out.println("File printer");
    }
}
class ConsolePrinter implements Printer {
    public void print() {
        System.out.println("Console printer");
    }
}