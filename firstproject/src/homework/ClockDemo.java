package homework;
import java.util.*;

public class ClockDemo {
	
//	Question 2

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Time for first : ");
		int secmid = sc.nextInt();
		Clock first = new Clock(secmid);
		
		System.out.println("Ticking 10 times:");
        for (int i=0;i<10;i++) {
            first.tick();
            System.out.println(first);
        }
        
        System.out.println("Enter hour, minute, and second for second:");
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        int seconds = sc.nextInt();
        Clock second = new Clock(hours, minutes, seconds);

        
        System.out.println("Ticking secondClock 10 times:");
        for (int j=0; j<10;j++) {
            second.tick();
            System.out.println(second);
        }
        
        first.addClock(second);
        System.out.println("After adding secondClock to firstClock:");
        System.out.println("First Clock: " + first);
        System.out.println("Second Clock: " + second);

        Clock thirdClock = first.subtractClock(second);
        System.out.println("thirdClock (difference between first and second): " + thirdClock);
        
        
        
        
		
	}

}
