package Phase1;

import javax.swing.text.html.HTMLDocument;

public class Methodss {

    static void sayHello() {
        System.out.println("Hello, Java!");
    }

//    method OverLoading

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

//    Scope of variables

    int instanceVar = 10; // instance
    static int staticVar = 93;

    void show(){
        int localVar = 80;
        System.out.println("Local: " + localVar);
        System.out.println("Instance: " + instanceVar);
        System.out.println("StaticVar: " + staticVar);
    }


//    Check number Even or odd or not?

    static void checkEvenOdd(int n){
        if (n % 2 == 0){
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }

//    find the largets of 3 numbers?


    static int largestOfThree(int a, int b, int c ){
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }


//    Factorial Method

    static int facto(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }



    public static void main(String[] args) {
        sayHello(); // method call
        System.out.println(add(10, 30)); // methods with paramaters
        System.out.println(add(10.5, 30.5)); // Here we can see same name of methods but diffrent parameters
        System.out.println(staticVar); // this can access as there name

        Methodss obj2 = new Methodss();
        obj2.show();

        checkEvenOdd(12);
        checkEvenOdd(19);

        System.out.println("Largest of three numbers : " + largestOfThree(10 , 15, 78));

        System.out.println(facto(5));


    }
}
