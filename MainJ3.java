import java.util.Scanner;

public class MainJ3 {

public static void main(String[] args) {
// TODO Auto-generated method stub


Scanner s = new Scanner(System.in);

int c1 = 0;
int c2 = 0;
int c3 = 0;
int c4 = 0;

c1 = s.nextInt();
c2 = s.nextInt(); 
c3 = s.nextInt(); 
c4 = s.nextInt(); 





System.out.println((c1 - c1 + " ") + (c1 + " ") + (c1 + c2 + " ") + (c1 + c2 + c3 + " ") + (c1 + c2 + c3 + c4));
System.out.println((c1 + " ") + (0 + " ") + (c2 + " ") + (c2 + c3 + " ") + (c2 + c3 + c4));

System.out.println((c1 + c2 + " ") + (c2 + " ") + (0 + " ") + (c3 + " ") + (c3 + c4));

System.out.println((c1 + c2 + c3 + " ") + (c2 + c3 + " ") + (c3 + " ") + (0 + " ") + (c4));

System.out.println((c1 + c2 + c3 + c4 + " ") + (c2 + c3 + c4 + " ") + (c3 + c4 + " ") + (c4 + " ") + 0);










}

}

