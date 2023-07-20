package mypack;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AppTest 
{

	App a;
	Object requiredOutput[];
	Employee e;
	
	public AppTest()
	{
		a = new App();		
		requiredOutput = new Object[5];
		e = new Employee();
	}
	
	

	@Test
	public void testCase1()
	{
		assertTrue(App.isEven(100));						
	}
	
	@Test
	public void testCase2()
	{
		assertFalse(App.isEven(89));
	}
	
	@Test
	public void testCase3()
	{
		//assertEquals(expected,actual);
		
		assertEquals("true",App.isEquals(10,10));
		assertEquals("false",App.isEquals(9,10));
		assertEquals("true",App.isEquals(19,10));
	
	}
	
		
	@Test
	public void testCase4()
	{
		assertEquals("avaj gnimmargorp"  ,reverseWord("java programming"));
	}
	
	
	
	private static String reverseWord(String str){  
		  
        StringBuilder result=new StringBuilder();  
        StringTokenizer tokenizer=new StringTokenizer(str," ");  
  
        while(tokenizer.hasMoreTokens()){  
        StringBuilder sb=new StringBuilder();  
        sb.append(tokenizer.nextToken());  
        sb.reverse();  
  
        result.append(sb);  
        result.append(" ");  
      
        }  
        System.out.println(result);
        return result.toString().trim();  
    }  
	
	
	
	@Test
	public void testCase5()
	{
		assertThat(a.greet("William"),is("Good Morning! William"));		
	}

	
	@Test
	public void testCase6()
	{
		assertEquals(1,findMin());		
	}
	
	private static int findMin()
	{
		int arr[]= {1,2,3,4,5};
		int temp=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(temp < arr[i])
			{
				temp=arr[i];
			}				
		}
		
		return temp;					
	}	
	
	
	@Before
	public void enterRecords()
	{
		requiredOutput[0] = new Employee(101,"abc6");
		requiredOutput[1] = new Employee(102,"abc2");
		requiredOutput[2] = new Employee(103,"abc3");
		requiredOutput[3] = new Employee(104,"abc7");
		requiredOutput[4] = new Employee(105,"abc6");
		System.out.println("Before is running ! ");
	}
	
	
	@Test
	public void testCase7()
	{
		Object arr[] = e.createRecord().toArray();
		
		System.out.println("TestCase is Running !");
		
		//assertArrayEquals(arr,requiredOutput);
		assertEquals(arr[0],requiredOutput[0]);
	
	}
	
	
	@After
	public void afterfunc()
	{
		System.out.println("After the test case");
	}

		
}

