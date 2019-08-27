package com.learning;

public class Chef_and_Pairs {
	
	public static void main (String[] args)
	{
	    try {
	        
	    int Count=0;
		java.io.BufferedReader r = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
				//int a=Integer.parseInt(r.readLine()),b=Integer.parseInt(r.readLine());
		int numberOfInput=Integer.parseInt(r.readLine());
		for (int it=0;it<numberOfInput;it++) {
			Count=0;
			int numberOfEle = Integer.parseInt(r.readLine());
			String str=r.readLine();
			String elem[]=str.split(" ");
			int Element[]=new int[numberOfEle];
			
			for (int i = 0; i < elem.length; i++) {
				Element[i]=Integer.parseInt(elem[i]);
			}
			
			for (int i = 0; i < Element.length; i++) {
				if (Element[i]%2==0) {
					for (int j = i; j < Element.length; j++) {
						if(Element[j]%2!=0) {
							Count++;
						}
						
					}
				}
			}
			    System.out.println(Count);
			}
	        
	    } catch(Exception e) {
	        System.out.println(e);
	    } finally {
	    }
	}
}
