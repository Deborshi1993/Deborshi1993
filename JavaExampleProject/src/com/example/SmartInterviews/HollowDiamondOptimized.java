package com.example.SmartInterviews;

import java.io.*;
public class HollowDiamondOptimized {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int iterations = Integer.parseInt(br.readLine());
        int i;
        for (i = 0; i < iterations; i++) {
            int noOfLine = Integer.parseInt(br.readLine());
            bw.write("Case #" + (i + 1) + ":\n");
            //Start of main diamond print logic
            int mid = noOfLine / 2 + 1;
            int j;
            for (j = 0; j < mid; j++) {
                for (int k = 1; k <= noOfLine; k++) {
                    if (k == mid - j)
                        bw.write("*");
                    else if (k == mid + j) {
                        bw.write("*");
                        break;
                    } else
                        bw.write(" ");
                }
                bw.write("\n");
            }
            for (j = mid - 2; j >= 0; j--) {
                for (int k = 1; k <= noOfLine; k++) {
                    if (k == mid - j)
                        bw.write("*");
                    else if (k == mid + j) {
                        bw.write("*");
                        break;
                    } else
                        bw.write(" ");
                }
                bw.write("\n");
            }
            bw.flush();

        }
        br.close();
        bw.close();
    }

}
