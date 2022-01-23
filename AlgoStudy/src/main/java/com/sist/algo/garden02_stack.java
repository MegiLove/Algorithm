package com.sist.algo;

import java.util.Scanner;
import java.util.Stack;

public class garden02_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long cnt=0;
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();	//빌딩 개수
		Stack<Integer> st= new Stack<Integer>();	//스택
		int []h= new int[n];	//빌딩 높이
		
		for(int i=0; i<n; i++) {
			h[i]= sc.nextInt();
			if(st.size()==0) {
				st.push(h[i]);
			}else {
				while(st.peek()<=h[i]){
					st.pop();
					if(st.size()==0) {
						break;
					}
				}
				cnt+=st.size();
				st.push(h[i]);
			}
		}
		System.out.println(cnt);
	}

}
