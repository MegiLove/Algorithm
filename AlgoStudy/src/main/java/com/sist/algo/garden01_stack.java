package com.sist.algo;

import java.util.Scanner;
import java.util.Stack;

public class garden01_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();	//�ǹ� ����	
		Stack<Integer> st = new Stack<>();	//����
		int h[]= new int[n];	//�ǹ� ����
		for(int i=0; i<n; i++) {
			h[i]= sc.nextInt();
			if(st.size()==0) {
				st.push(h[i]);
			}else {
				while(st.peek()<=h[i]) {
					st.pop();
					if(st.size()==0) {
						break;
					}
				}
				cnt+= st.size();
				st.push(h[i]);
				
			}
		}
		System.out.println(cnt);
		
		
	}

}
