package com.hik.common;

public class HiAcs {
    static {
        System.loadLibrary("hiacs");
    }

    /**
     * description helloworld
     * param
     * @return
     */
    public native void native_helloWorld();
}
