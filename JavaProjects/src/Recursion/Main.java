package Recursion;

public class Main {

    /**
     * 8.1. Write a method to generate the nth Finbonacci number.
     * idea: f(n) = f(n - 1) + f(n - 2)
     * f(1) = f(2) = 1
     */
    /**
     *
     * @param n
     * @return the fibonacci number at nth.
     */
    public static int Fibo(int n){
        if (n == 1 || n == 2)
            return 1;
        return Fibo(n - 1) + Fibo(n - 2);
    }

    /**
     * 8.2. Write a method that return all subset of a set.
     *
     */
    public static void sovle2(){

    }

    /**
     * Write a method to compute all permutation of a string.
     *
     */
    public static void solve3(){

    }

    /**
     *
     */
    public static void sovle4(){

    }


    public static void main(String args[]){
        System.out.println("Hello Chapter 8");
        System.out.println("This chapter is about recursion");
        System.out.println(Fibo(10));
    }
}
