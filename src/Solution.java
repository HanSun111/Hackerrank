import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int valN = s.nextInt();
        int queriesX = 1;
        int queriesY = (int)(Math.random() * 5) + 1;
        ArrayList n = new ArrayList();
        for(int i = 0; i < valN; i++){
            n.add(Math.random() * 20000 + 1);
        }

    }
}