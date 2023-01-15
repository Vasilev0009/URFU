package timus;

import java.util.Scanner;

public class Task_1021 {
    public static void main(String[] args){//throws IOException {
//       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
       int one = in.nextInt();
        int[] oneList = new int[one];
        for (int i = oneList.length -1; i >= 0; --i) {
            oneList[i] = in.nextInt();;
        }
        int two = in.nextInt();;
        int[] twoList = new int[two];
        for (int k = 0; k < two; k++) {
            twoList[k] = in.nextInt();
            for(int i = 0; i < one; i++){
            if ( oneList[i] + twoList[k] == 10000) {

                System.out.println("YES");
                return;
            }
            if ( oneList[i] + twoList[k] < 10000) {
                break;
            }
        }
        }
        System.out.println("NO");
    }
}
/*        String tempOne = reader.readLine();
        int one = Integer.parseInt(tempOne);
        int[] oneList = new int[one];
        for (int i = oneList.length -1; i >= 0; --i) {
            String tempOne2 = reader.readLine();
            oneList[i] = Integer.parseInt(tempOne2);
        }
        String tempTwo = reader.readLine();
        int two = Integer.parseInt(tempTwo);
        int[] twoList = new int[two];
        for (int k : twoList) {
            String tempTwo2 = reader.readLine();
            twoList[k] = Integer.parseInt(tempTwo2);
            for (int i =0; i < oneList.length; ++i) {
                if ( oneList[i] + twoList[k] == 10000) {

                    System.out.println( "YES");
                    return;
                }
                if ( oneList[i] + twoList[k] < 10000) {
                    break;
                }
            }
        }
        System.out.println("NO");
    }
}
*/