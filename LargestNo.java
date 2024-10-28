class LargestNo {
    public static void main(String args[]) {
        int a = 43, b = 49, c = 41;
        
        if (a >= b && a >= c) {
            System.out.println("The largest number is: " + a);
        } 
        else if (b >= a && b >= c) {
            System.out.println("The largest number is: " + b);
        } 
        else {
            System.out.println("The largest number is: " + c);
        }
    }
}
