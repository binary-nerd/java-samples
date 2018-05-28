package com.sandeep;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLong;
import static java.lang.Thread.sleep;

public class Main {

    public interface CLibrary extends Library {
        CLibrary cLib = Native.loadLibrary("c", CLibrary.class);
        NativeLong clock();
    }

    public static void main(String[] args) {
        // Measure clocks at the start of the program
        long start = CLibrary.cLib.clock().longValue();

        // Do something and consume come CPU time
        long i = 10000000;
        while (i-- > 0);

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Measure clocks at the end of the program
        long end = CLibrary.cLib.clock().longValue();

        // Total clocks consumed.
        double clockCount = end - start;

        System.out.println("Clocks consumed by this program : "+ clockCount);
    }
}
