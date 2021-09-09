package com.example.Basics;

import java.io.*;
import java.util.*;

public class HollowDiamond {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tern = Integer.parseInt(br.readLine());
        for (int i = 0; i < tern; i++) {
            int noOfLine = Integer.parseInt(br.readLine());
            bw.write("Case #" + (i + 1) + ":\n");
            for (int j = 0; j < noOfLine; j++) {
                int noOfLeftSpaceEachLine = Math.abs(noOfLine / 2 - j);
                for (int k = 0; k < noOfLeftSpaceEachLine; k++)
                    bw.write(" ");
                bw.write("*");
              /*  for (int k = noOfLeftSpaceEachLine + 1; k < (noOfLine - noOfLeftSpaceEachLine - 1); k++)
                    bw.write(" ");
                if (j != 0 && j != noOfLine - 1)
                    bw.write("*"); */
                bw.write("\n");
            }
            bw.flush();
        }
        br.close();
        bw.close();
    }
}