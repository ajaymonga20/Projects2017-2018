import java.util.Scanner;

public class Main23 {

public static void main(String[] args) {
// TODO Auto-generated method stub

String str = "";
String str2 = "";
Scanner s = new Scanner(System.in);
int num = 0;
int count = 0;
String[] nums = new String[num];
String[] nums2 = new String[num];

num = s.nextInt();

str = s.next();

str2 = s.next();




for(int i = 0; i < num; i = i + 1) {
if(str.substring(i,i + 1).equals("C") && str2.substring(i, i + 1).equals("C")) {
count = count + 1;
}
}



System.out.print(count);
}

}