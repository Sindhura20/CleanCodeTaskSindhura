package com.kmit.clean_code;
import java.io.*;

public class Client2 {

	

	

	                public static void main(String[] args) throws IOException{
	                                                                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	                        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	                        bw.write("select 1.standard materials\t2.above standard materials\t3.high standard materials\n");
	                                
	                                int type_of_material=Integer.parseInt(br.readLine());
	                                bw.write("enter area of house\n");
	                                int area_of_house=Integer.parseInt(br.readLine());
	                                bw.write("select 1 for automation else 0\n");
	                                int automation_required=Integer.parseInt(br.readLine());
	                                Construction_Cost c=new Construction_Cost();
	                                
	                                int cost=c.estimate(type_of_material,area_of_house,automation_required);
	                bw.write(cost+"\n");
	                }

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

