package com.sist.algo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=0;
		int cnt=0;
		Scanner sc= new Scanner(System.in);
		n= sc.nextInt();

			int []h= new int[80001];
			for(int i=0; i<n ; i++){
				h[i]=sc.nextInt();			
			}
			for(int i=0; i<n; i++) {
				for(int j=i+1; j<n; j++) {
					if(h[i]>=h[j]) {					
						cnt++;
					}else {
						break;
					}
				}
			}
			
		
		
		System.out.println(cnt);
		}
	
	}


