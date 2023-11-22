package com.driver;

import com.things.Branch;
import com.things.IPL;

public class BranchRunner {
	
	

	public static void main(String args[]) {
		

		Branch abcd=new Branch();
		abcd.save("CS");
		abcd.save("ECE");
		abcd.save("CIVIL ");
		abcd.save("IP");
		abcd.save("ISE");
		abcd.save("ME");
		abcd.getdata();
		abcd.delete("ISE");
		System.out.println("after delete");
		abcd.getdata();
		abcd.update("ME","IP");
		System.out.println("after update");
		abcd.getdata();
	}

}



