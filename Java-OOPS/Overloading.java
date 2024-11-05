
public class OverloadingExample {

    // First overloaded add method: adds int and char by converting char to its ASCII value
    public int add(int num, char ch) {
        return num + ch;  // The char is implicitly converted to its ASCII value
    }

    // Second overloaded add method: adds int and char, but returns a concatenated string
    public String add(char ch, int num) {
        return ch + " " + num;  // Concatenates char and int into a string
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();
        
        // Call the first version of the add method
        int result1 = obj.add(10, 'A');
        System.out.println("Result of add(int, char): " + result1);
        
        // Call the second version of the add method
        String result2 = obj.add('B', 20);
        System.out.println("Result of add(char, int): " + result2);
    }
}
