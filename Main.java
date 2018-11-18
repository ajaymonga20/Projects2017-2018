import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
// TODO Auto-generated method stub

Scanner s = new Scanner(System.in);

int num = 0;
int input = 0;


num = s.nextInt();

int[] nums = new int[num*num];

for(int i = 0; i < num*num; i = i + 1) {
input = s.nextInt();
nums[i] = input;
}

int big = nums[0];
int small = nums[0];



for(int i = 0; i < (num*num); i = i + 1) {
Arrays.sort(nums);

}

for(int i = 0; i < (num*num); i = i + 1) {
	System.out.print(nums[i] + " ");
}

}

//nums[0] = small;
//nums[nums.length-1] = big;

//System.out.println(Arrays.toString(nums));

}

