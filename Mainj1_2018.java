import java.util.Scanner;

public class Mainj1_2018 {

public static void main(String[] args) {
// TODO Auto-generated method stub


Scanner s = new Scanner(System.in);

int first = 0;
int second = 0;
int third = 0;
int fourth = 0;

first = s.nextInt();
second = s.nextInt();
third = s.nextInt();
fourth = s.nextInt();

if ((first == 8 || first == 9) && (second == third) && (fourth == 8 || fourth == 9) ) {

	System.out.print("ignore");
}

else { System.out.print("answer");


}

}

}