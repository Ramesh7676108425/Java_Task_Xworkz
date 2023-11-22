package com.driver;

import com.things.GameName;
import com.things.IPL;

public class IPLRunner {
	
	
	public static void main(String args[]) {
		

		IPL abcd=new IPL();
		abcd.save("csk");
		abcd.save("kkr");
		abcd.save("psbk ");
		abcd.save("RCB");
		abcd.save("RR");
		abcd.save("DD");
		abcd.getdata();
		abcd.delete("psbk");
		System.out.println("after delete");
		abcd.getdata();
		abcd.update("RR","DD");
		System.out.println("after update");
		abcd.getdata();
	}

}
