
import java.util.Scanner;

class Solution_1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        str = str.toLowerCase();

        int pCnt = 0;
        int yCnt = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'p')
                pCnt++;
            if (str.charAt(i) == 'y')
                yCnt++;
            }
            if (pCnt == yCnt) {
                System.out.println("true");
            }
            else{
                    System.out.println("false");
                }
            }
        }


