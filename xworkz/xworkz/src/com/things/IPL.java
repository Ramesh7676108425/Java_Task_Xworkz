package com.things;

public class IPL {
	
	int index=0;
	
	String[] IPLteamList=new String[5];

	public void save(String IPL) {
		System.out.println("IPL is:"+IPL);
		if (index<IPLteamList.length) {
			IPLteamList[index]=IPL;
			index++;
			
		}
		else {
			System.out.println("");
		}
	}	
	public void getdata() {
		 for(int i=0;i<this.IPLteamList.length;i++) {
			System.out.println("");
		}
	}
	public void update(String oldElement,String newElement) {
		for(int i=0;i<IPLteamList.length;i++) {
			if(IPLteamList[i]==oldElement) {
				IPLteamList[i]=newElement;
				
			}
		}
		}
		public void delete(String element) {
			for(int i=0;i<this.IPLteamList.length;i++) {
				if(IPLteamList[i]==element) {
					IPLteamList=null;
				}
				if(i==(IPLteamList.length-1)&&IPLteamList[i]!=element) {
					System.out.println("element not exist");
					
				}
			}
		}

	}

	


