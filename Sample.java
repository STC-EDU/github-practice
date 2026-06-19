public class Sample {
    
    int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}