package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter integers please ");
        System.out.println("(Non-integer to terminate): ");
        
        
        while(scan.hasNextInt()) {
            list.add(scan.nextInt());
        }
        Random indexGen =  new Random();
        Integer nums[] = list.toArray(new Integer[0]);
        int index = indexGen.nextInt(nums.length);
        System.out.println("Index value generated: " + index);
        System.out.println("Value in arary at generated index: " + nums[index]);
        scan.close();
	}
}


