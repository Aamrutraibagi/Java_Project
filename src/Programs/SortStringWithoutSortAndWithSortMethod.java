package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class SortStringWithoutSortAndWithSortMethod {
	public static void main(String[] args) {
		//Aproach-1:--without using sort method
		String str="ROCK";
	    char arr[]=str.toCharArray();
	    char temp;
	    
	    for(int i=0;i<arr.length;i++) {
	    	for(int j=i+1;j<arr.length;j++) {
	    		if(arr[i]>arr[j]) {
	    			temp=arr[i];
	    			arr[i]=arr[j];
	    			arr[j]=temp;
	    		}
	    	}
	    }
	    System.out.println(new String(arr));
	    
	  //Aproach-2:--with using sort method
	    String str1="JAVA";
	    char[] charArray=str1.toCharArray();
	    Arrays.sort(charArray);
	    System.out.println(new String(charArray));
	   
	  //Aproach-3:--using compareTo()
	    int n;
	    String temp1;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number of name you want to sort");
	    n=sc.nextInt();
	    String names[]=new String[n];
	    Scanner sc1=new Scanner(System.in);
	    System.out.println("enter all the names you want to sort");
	    for(int i=0;i<n;i++) {
	    	names[i]=sc1.nextLine();
	    }
	    for(int i=0;i<n;i++) {
	    	for(int j=i+1;j<n;j++) {
	    		if(names[i].compareTo(names[j])>0) {
	    			temp1=names[i];
	    		    names[i]=names[j];
	    		    names[j]=temp1;
	    		}
	    	}
	    }
	    for(String name: names) {
	    	System.out.println(name);
	    }
	    
	}

}
