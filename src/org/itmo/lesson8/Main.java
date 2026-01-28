package org.itmo.lesson8;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger("Main");

    public static void main(String[] args) {
//        try {
//            throwMyCheckedException();
//            throwMyUncheckedException();
//        } catch (MyCheckedException | MyUncheckedException e) {
//            System.err.println(e.getMessage());
////            throw new RuntimeException(e);
//
//        } catch (ArithmeticException ignore) {
//            //
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("finally");
//        }


//        throwMyUncheckedException();

//        anotherMethod();

        System.out.println();


//        logger.log(Level.INFO, "OK");
        //SLF4J
        // log.info();
        // log.debug();
        // log.warn();
        // log.error(e.getMessage, e);
    }


    public static void throwMyCheckedException() throws MyCheckedException {
        throw new MyCheckedException("My Checked Exception");
    }


    public static void throwMyUncheckedException() throws MyUncheckedException, RuntimeException {
        throw new MyUncheckedException("My Unchecked Exception");
    }

    public static void method() {
        int value = 0;
        try {
            int array[] = new int[]{1, 2, 3};
            value = array[100];
        } finally {
            System.out.println(value);
        }
    }

    public static void anotherMethod() {
        try {
            method();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }

}
