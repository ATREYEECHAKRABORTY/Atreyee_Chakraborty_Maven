package com.EPAM.Atreyee_NYG;

import newyeargift.NewYearGift;

public class Sweet extends NewYearGift
{
	public void bsort(String[] arr, int[] price, double[] weight)
	{
		int i,j,ptemp;
		double wtemp;
		String ctemp;
		for(i=0;i<4;i++)
		{
			for(j=0;j<4-i;j++)
			{
				if(price[j]>price[j+1])
				{
					ptemp=price[j];
					price[j]=price[j+1];
					price[j+1]=ptemp;
					
					wtemp=weight[j];
					weight[j]=weight[j+1];
					weight[j+1]=wtemp;
					
					ctemp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=ctemp;
				}
		}
}
	}
public void show(String[] arr, int[] price, double[] weight)
{
for(int i=0;i<5;i++)
{
	System.out.println("Product: "+arr[i]+" Price: "+price[i]+" Weight: "+weight[i]);
}
}
public void rshow(String[] arr, int[] price, double[] weight, int rrange)
{
for(int i=0;i<5;i++)
{
	if(price[i]<=rrange)
	{
		System.out.println("Product: "+arr[i]+" Price: "+price[i]+" Weight: "+weight[i]);
	}
}
}
}

