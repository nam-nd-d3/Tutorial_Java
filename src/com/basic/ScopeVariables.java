package com.basic;

public class ScopeVariables {
//    static int x = 11;
//    private int y = 33;
//    public void method1(int x)
//    {
//        ScopeVariables t = new ScopeVariables();
//        this.x = 22;
//        y = 44;
//
//        System.out.println("Test.x: " + ScopeVariables.x);
//        System.out.println("t.x: " + t.x);
//        System.out.println("t.y: " + t.y);
//        System.out.println("y: " + y);
//    }

    public static void main(String[] args) {
//        ScopeVariables t = new ScopeVariables();
//        t.method1(5);

        // The variable x has scope within
        // brackets
//        int x = 10;
//        System.out.println(x);

//        for (int x = 0; x < 4; x++)
//        {
//            System.out.println(x);
//        }
//
//        // Will produce error
//        System.out.println(x);

//        int x;
//        for (x = 0; x < 4; x++)
//        {
//            System.out.println(x);
//        }
//
//        System.out.println(x);

//        int a = 5;
//        for (int a = 0; a < 5; a++)
//        {
//            System.out.println(a);
//        }

//        int x = 5;
//        {
//            int x = 10;
//            System.out.println(x);
//        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int i = 20;
        System.out.println(i);
    }
}
