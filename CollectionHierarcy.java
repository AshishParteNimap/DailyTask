package Test;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionHierarcy {
	public static void main(String[] args) {
		
		
	//List Interface
		List<Integer> listI=new ArrayList<>();
		listI.add(12);
		listI.add(23);
		listI.add(21);
		listI.remove(0);
		System.out.println(listI.get(1));
		
		//ArrayList 
	ArrayList<String> arylst=new ArrayList<>();
	arylst.add("ashish");
	arylst.add("sandesh");
	arylst.add("suraj");
	arylst.remove(2);
	System.out.println(arylst.contains("ashish"));
	for(String ar:arylst) {
		System.out.println(ar);
		
	}
		
		
		//LinkedList
	LinkedList<Integer> lnk=new LinkedList<>();
		for(int i=1;i<=10;i++) 
			lnk.add(i);
		for(int i=0;i<lnk.size();i++)
			System.out.println(lnk.get(i)+" ");
		//vector
	Vector<Double> vct=new Vector<>();
		for(double i=1;i<10;i++) 
			vct.add(i);
		
		for(double db:vct)
			System.out.println(db);
		
	
	Stack<Integer> stack=new Stack<>();
		stack.push(12);
		System.out.println(stack);
		stack.push(23);
		System.out.println(stack);
		stack.push(34);
		System.out.println(stack);
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		
		System.out.println(stack.search(12));
		
		//Queue interface
		
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("india");
		pq.add("usa");
		pq.add("russia");
		
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.peek());
		
		for(String prq:pq) 
			System.out.println("inside priorityQueue :"+prq);

		//Deque
		
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		ad.addFirst(123);
		ad.addFirst(234);
		ad.addLast(890);
		ad.addLast(342);
		
		System.out.println(ad);
		
		int rm=ad.removeFirst();
		System.out.println(rm);
		
		System.out.println(ad);
		
		//Set interface
		
		//HashSet
		
		HashSet<Character> hash=new HashSet<>();
		hash.add('N');
		hash.add('i');
		hash.add('m');
		hash.add('a');
		hash.add('p');
		
		Iterator<Character> itr=hash.iterator();
		char newCahr=itr.next();
		System.out.println(newCahr);
		
		while(itr.hasNext()) {
			itr.forEachRemaining((chr)->System.out.println(chr+","));
			
		//LinkedHashSet
			LinkedHashSet<String> link=new LinkedHashSet<>();
			link.add("mumbai");
			link.add("thane");
			link.add("mulund");
			link.add("dadar");
			link.add("mulund");
			
			Iterator<String> itrHash=link.iterator();
			while(itrHash.hasNext()) {
				itrHash.forEachRemaining((linkH)->System.out.println(linkH));
				
			//Tree Set
				TreeSet<String> tree=new TreeSet<>();
				tree.add("titan");
				tree.add("rolex");
				tree.add("fastrack");
				
				Iterator<String> itr2=tree.iterator();
				while(itr2.hasNext()) {
					itr2.forEachRemaining((treeSet)->System.out.println(treeSet+" "));
				}
			}
		}
	}
}

