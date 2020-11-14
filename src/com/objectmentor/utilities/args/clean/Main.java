package com.objectmentor.utilities.args.clean;

public class Main {
    public static void main(String[] args) {
        try {
            Args arg = new Args("l,p#,d*", args);
            boolean logging = arg.getBoolean('l');
            int port = arg.getInt('p');
            String directory = arg.getString('d');
            //executeApplication(logging, port, directory);

            System.out.println("Logging:" + logging);
            System.out.println("Port:" + port);
            System.out.println("Directory:" + directory);

        } catch (ArgsException e) {
            System.out.printf("Argument error: %s\n", e.errorMessage());
        }
    }
}
