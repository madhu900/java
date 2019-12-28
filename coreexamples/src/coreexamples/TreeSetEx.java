package coreexamples;



import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		Set<String>batsman=new TreeSet<String>();
		batsman.add("SA");
		batsman.add("RO");
		batsman.add("DH");
		batsman.add("KO");
		batsman.add("BM");
		batsman.add("BM");
		//batsman.add(null);
		System.out.println(batsman);
		batsman.add("RO");
	    System.out.println(batsman);
	    
	    Set<String> bowler =new TreeSet<String>();
	    
	    bowler.add("HA");
	    bowler.add("RA");
	    bowler.add("IS");
	    bowler.add("PR");
	    bowler.add("UM");
	    
	   Set<String> cricketGame =new TreeSet<String>();
	   cricketGame.addAll(batsman);
	   cricketGame.addAll( bowler);
	   
	   Iterator<String> iterator=cricketGame.iterator();
		String statecode=null;
		while(iterator.hasNext()) {
			statecode= iterator.next();
			System.out.println(statecode);
		}
		
		boolean contains=  cricketGame.contains("AP");
		contains= cricketGame.contains("AB");
		contains= cricketGame.containsAll(bowler);
		
		int size=cricketGame.size();
		
		Set<String> cricketGameCopy=cricketGame;
		
		

	}

}
