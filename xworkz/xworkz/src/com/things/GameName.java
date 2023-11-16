package com.things;

public class GameName {
	
	int index=0;
	
	String[] GameList=new String[4];
	
	public void save(String GameName) {
		System.out.println("GameName is:"+GameName);
		if(index<GameList.length) {
			GameList[index]=GameName;
			index++;
			
		}
		else {
			System.out.println("");
		}
	}
	public void getXyz() {
		 for(int i=0;i<this.GameList.length;i++) {
			System.out.println("");
		}
	}
	public void update(String oldElement,String newElement) {
	for(int i=0;i<GameList.length;i++) {
		if(GameList[i]==oldElement) {
			GameList[i]=newElement;
			
		}
	}
	}
	public void delete(String element) {
		for(int i=0;i<this.GameList.length;i++) {
			if(GameList[i]==element) {
				GameList=null;
			}
			if(i==(GameList.length-1)&&GameList[i]!=element) {
				System.out.println("element not exist");
				
			}
		}
	}

}
