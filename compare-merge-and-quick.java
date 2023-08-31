import java.util.*;

class TestInteger implements Comparable<TestInteger> {
    private static long counter = 0; // Static counter to count comparisons
    private int value; // Integer field value
    
    // Constructor
    public TestInteger(int value) {
        this.value = value;
    }
    
    // Implementation of the compareTo method
    @Override
    public int compareTo(TestInteger other) {
        counter++; // Increment the static counter
        
        return Integer.compare(this.value, other.value);
    }
    
    // Method to get the counter value
    public static long getCounter() {
        return counter;
    }
    
    // Method to reset the counter to 0
    public static void resetCounter() {
        counter = 0;
    }
}

public class Main {
    public static void main(String[] args) {
        TestInteger t1 = new TestInteger(5);
        TestInteger t2 = new TestInteger(10);
        
        int result = t1.compareTo(t2);
        System.out.println("Comparison result: " + result);
        System.out.println("Counter value: " + TestInteger.getCounter());
        
        // Reset the counter
        TestInteger.resetCounter();
        System.out.println("Counter after reset: " + TestInteger.getCounter());
    }
}
