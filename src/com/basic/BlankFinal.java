package com.basic;

public class BlankFinal {
//    // We can initialize here, but if we
//    // initialize here, then all objects get
//    // the same value.  So we use blank final
//    final int i;
//
//    BlankFinal(int x)
//    {
//        // Since we have initialized above, we
//        // must initialize i in constructor.
//        // If we remove this line, we get compiler
//        // error.
//        i = x;

    final public int i;

    BlankFinal(int val)    {  this.i = val;  }

    BlankFinal()
    {
        // Calling Test(int val)
        this(10);
    }

    public static void main(String[] args) {
        BlankFinal t1 = new BlankFinal();
        System.out.println(t1.i);

        BlankFinal t2 = new BlankFinal(20);
        System.out.println(t2.i);
    }
}
