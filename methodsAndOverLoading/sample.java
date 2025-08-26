public class sample {

    public static void main(String[] args) {
        System.out.println("irfan baig");

        int[] arr = { 5, 6, 3, 2 };
        System.out.println(sumofArray(arr)); 

        int[] frry = { 7, 8, 9, 4, 5 };
        System.out.println(sumofArray(frry));

        System.out.println(upper("      irfanbaig     "));

        System.out.println(towSum(15, 5));

        System.out.println(towSum(15, 85, 5)); // same name method but diff parameters that called method overloading

    }

    public static int sumofArray(int[] arr) {

        int res = 0;
        for (int i : arr) {
            res += i;
        }
        return res;
    }

    private static String upper(String str){
        return str.trim().toUpperCase();
    }

    private static int towSum(int a, int b){
        return a+b;
    }

    // method overLoading,
    // same name of methods but with diffrent size paremeters or diffrent type of parameter
    private static int towSum(int a, int b, int c){
        return a+b+c;
    }

}
