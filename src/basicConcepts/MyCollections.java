package basicConcepts;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class MyCollections
{
	//ClassName objName = new Constructor();
	//int , char , boolean -> Wrapper on top of all primitive types  INTEGER , STRING , CHARACTER
	@Test
	public void arrayList_integer()
	{
		ArrayList<Integer>  mylist = new ArrayList<Integer>();
		int len = mylist.size();
		System.out.println("Intial length of the list :" + len);
		mylist.add(22); mylist.add(252); mylist.add(222);mylist.add(292); mylist.add(522); mylist.add(227);mylist.add(522);mylist.add(222);
		System.out.println("Length of the collection - 2 :  " + mylist.size());
		mylist.get(0);
		for(int i=0;i<mylist.size();i++)
		{
			System.out.println("Elements in the list 1 :" + mylist.get(i));
		}
		mylist.add(2, 233);
		System.out.println("Length of the collection - 3 :  " + mylist.size());
		for(int i=0;i<mylist.size();i++)
		{
			System.out.println("Elements in the list 2:" + mylist.get(i));
		}
		mylist.remove(1);
		System.out.println("Length of the collection - 4 :  " + mylist.size());
		for(int i=0;i<mylist.size();i++)
		{
			System.out.println("Elements in the list 3:" + mylist.get(i));
		}
	}
	@Test
	public void setCollection()
	{
		ArrayList<Integer>  mylist = new ArrayList<Integer>();
		int len = mylist.size();
		System.out.println("Intial length of the list :" + len);
		mylist.add(22); mylist.add(252); mylist.add(222);mylist.add(292); mylist.add(522); mylist.add(227);mylist.add(522);mylist.add(222);
		for(int i=0;i<mylist.size();i++)
		{
			System.out.println("Elements in the list :" + mylist.get(i));
		}
		TreeSet<Integer>  myset = new TreeSet<Integer>(mylist);		
		System.out.println("Elements in the set :" + myset);
		
	}
}
