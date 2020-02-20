package com.kmit.clean_code;
import java.io.*;
public class Client1 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	        System.out.println("----------Simple Interest------------");   
	        System.out.println("Enter principal\n"); 
	        double principal=Double.parseDouble(br.readLine());
	        System.out.println(("Enter annual interest rate\n")); 
	        double interest_rate=Double.parseDouble(br.readLine());
	        System.out.println("Enter  time\n"); 
	        double time=Double.parseDouble(br.readLine());
	        calc_simple_interest csi=new calc_simple_interest();
	        Double s=csi.SimpleInterest(principal, interest_rate, time);
	        
	            System.out.println(s);
	        System.out.println("----------Compound Interest-----------");   
	        System.out.println("number of times that interest is compounded per unit time \n"); 
	        double num=Double.parseDouble(br.readLine());
	        calc_compound_interest cci=new calc_compound_interest();
	        double c=cci.CompoundInterest(principal,interest_rate, time, num);
	       
	        bw.write(c+"\n");
	            bw.flush();
	}
	
	}
