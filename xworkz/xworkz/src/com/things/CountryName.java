package com.things;

public class CountryName {
	
	int index =0;
	
	String[] CountryNameList=new String [6];
	
	public void save(String CountryName) {
		if(index<this.CountryNameList.length) {
			this.CountryNameList[index]=CountryName;
			index++;
		}else {
			System.out.println("CountryName is full");
		}
	}
	
	public void getdata(){
		for(int i=0;i<this.CountryNameList.length;i++) {
			if(this.CountryNameList[i]!=null)
			System.out.println(this.CountryNameList[i]);
		//}else {
			System.out.println("");
			
		}
		
	}
	
	public void update(String newelement,String oldelement) {
		for(int i=0;i<this.CountryNameList.length;i++) {
			if(this.CountryNameList[i]==oldelement) {
				this.CountryNameList[i]=newelement;
				
			}
		}
	
		}
		
		public void delete(String element) {
			for(int i=0;i<this.CountryNameList.length;i++) {
				if(CountryNameList[i]==element) {
					CountryNameList=null;
					break;
				}
			}
		
			//	if(i==(CountryNameList.length-1)&&CountryNameList[i]!=element) {
					System.out.println("element not exist");
					
				
			
		

}

				
}
