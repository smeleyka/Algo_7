import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by smeleyka on 14.08.17.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        stringToMatrix();

    }

    public static void stringToMatrix() throws Exception {
        File f = new File("src/matrix.txt");
        FileInputStream fis = new FileInputStream(f);
        FileReader fr = new FileReader(f);
        char c[] = new char[7];
        while(fr.read(c)!=-1)
        System.out.println(c);


        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(fr);
        br.


//        byte[] b=new byte[7];
//        while (fis.read(b)!=10) {
//            System.out.println(fis.read(b));
//        }

//        Scanner sc = new Scanner(new File("src/matrix.txt"));
//
//        //String tmpString = sc.nextLine();
//        int row = 0, col = 0;
//        while (sc.hasNext()) {
//            if (sc.hasNext("0.*")) {
//                row++;
//                col = sc.next().length();
//            }
//
//
////            byte matrix[][] = new byte[tmpString.length()][tmpString.length()];
////
////            for (int i = 0; i < tmpString.length(); i++) {
////                System.out.println(tmpString.charAt(i));
////                if (tmpString.charAt(i) == '1') {
////                    matrix[0][i] = 1;
////                } else {
////                    matrix[0][i] = 0;
////                }
////            }
//        }
//                int matrix[][]=new int[row][col];
//
//        System.out.println(sc.nextLine());
    }
}
