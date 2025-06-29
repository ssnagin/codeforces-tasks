/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeforces;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author developer
 */
public class Solution69 {
    public static void main(String[] args) {
        
        long[] dimentions = {0,0,0};
        int ceils = 3;
        long answer = 0;
        int rows;
        long[] vectors;
        
        Scanner scanner = new Scanner(System.in);
        
        rows = scanner.nextInt();
        vectors = new long[ceils];
        
        for (int i = 0; i < rows; i++) {
            answer = 0;
            for (int j = 0; j < ceils; j++) {
                vectors[j] += scanner.nextInt();
            }
        }
        
        System.out.print((vectors[0] == 0 && vectors[1] == 0 && vectors[2] == 0) ? "YES" : "NO"); 
    }
}
