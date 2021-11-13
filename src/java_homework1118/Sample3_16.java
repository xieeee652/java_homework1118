package java_homework1118;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3_16 {

    public static void main(String[] args)throws IOException
    {
        System.out.println("請輸入一個整數");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        int num = Integer.parseInt(br.readLine());
        System.out.println("你輸入的是" + num);
         
    }                
}
