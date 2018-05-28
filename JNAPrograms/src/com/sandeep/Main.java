package com.sandeep;
import com.sun.jna.Library;
import com.sun.jna.NativeLong;
import com.sun.jna.Native;

public class Main {

    public interface CLibrary extends Library {
        CLibrary cLib = Native.loadLibrary("c", CLibrary.class);
        NativeLong clock();
    }

    public static void main(String[] args) {
//        CLibrary.cLib.printf("Clock value %ld\n", CLibrary.cLib.clock());
        System.out.println("Time taken by this program "+ CLibrary.cLib.clock());
    }
}
