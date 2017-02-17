package com.learng.program;

public class BubbleSort {

	public static void main(String[] args) {	
		/*int a[] = {4,45,2,44},swap;
		for(int i=0; i<a.length; i++){
			for(int j=i+1;j<a.length; j++){
				if(a[i]<a[j]){
					swap=a[i];
					a[i]=a[j];
					a[j]=swap;
				}
			}
		}
		for(int k=0;k<a.length;k++){
			System.out.println(a[k]);
		}*/
		int a[] = {4,7,5,9},swap;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					swap = a[i];
					a[i] = a[j];
					a[j] = swap;
				}
			}
		}
		for(int k=0;k<a.length;k++){
			System.out.println(a[k]);
		}
	}
}
