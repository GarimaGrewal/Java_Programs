/*
 Given a 2D matrix, print all elements of the given matrix in diagonal order. 
 */
package javaapplication2;
import java.io.*;
import java.util.*;

public class Solution {
    static int min(int a,int b)
    {
        return a>b?b:a;
    }
    static int max(int a,int b)
    {
        return a>b?a:b;
    }
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int row,col,start_col,count,j,i,line;
        row=sc.nextInt();
        col=sc.nextInt();
        int arr[][]= new int[row][col];
        for(i=0;i<row;i++)
            for(j=0;j<col;j++)
                arr[i][j]=sc.nextInt();
        for(line=1;line<=(row+col-1);line++)
        {
            start_col=max(0,(line-row));
            count=min(line,(col-start_col));
            for(j=0;j<count;j++)
                System.out.print(arr[min(line,row)-j-1][start_col+j]+" ");
           System.out.println();    
        }
    }
}
