package com.driver;

import com.things.GameName;

public class GameNameRunner {
	
	public static void main(String args[]) {
		
		GameName abcd=new GameName();
		abcd.save("cricket");
		abcd.save("khokho");
		abcd.save("kabaddi ");
		abcd.save("football");
		abcd.save("valyball");
		abcd.save("abcde");
		abcd.getXyz();
		abcd.delete("abcde");
		System.out.println("after delete");
		abcd.getXyz();
		abcd.update("rrr","cricket");
		System.out.println("after update");
		abcd.getXyz();
		
		
		
		
		
		
				
			
		
	}

}
