import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class stair_case {

    // Complete the staircase function below.
    static void staircase(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<n-1-i)
                    System.out.print(" ");
                 else  
                    System.out.print("#");  
            }
            System.out.println();    
        }
    }
