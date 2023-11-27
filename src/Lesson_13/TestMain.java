package Lesson_13;



interface Executable {
    void printHello(int x);
}


class Printer {
    public void print(Executable e ){
         e.printHello(10);

    }
}

class ExecutableImpl implements Executable{

    @Override
    public void printHello(int x) {
        System.out.println(x);
    }
}

public class TestMain {
    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.print(new ExecutableImpl());

        printer.print(new Executable() {
            @Override
            public void printHello(int x) {
                System.out.println(x + 5 );
            }
        });
                printer.print(x -> {
                    System.out.println(x + 10 );
                    System.out.println("external code");
                });



    }
}
