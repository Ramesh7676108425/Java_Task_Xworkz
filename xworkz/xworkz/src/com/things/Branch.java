package com.things;

public class Branch {
	
	int index=0;
	
	String[] BranchList=new String[5];
	
	public void save(String Branch) {
		System.out.println("branch name is :"+Branch);
		if(index<this.BranchList.length) {
			this.BranchList[index]=Branch;
			index++;
		}else {
			System.out.println("branch is full");
			
			
		}
	}
	public void getdata() {
		 for(int i=0;i<this.BranchList.length;i++) {
			System.out.println("");
		}
	}
	public void update(String newelement,String oldelement) {
		for(int i=0;i<this.BranchList.length;i++) {
			if(this.BranchList[i]==oldelement) {
				this.BranchList[i]=newelement;
				
			}
	
		}
	}
		
		public void delete(String element) {
			for(int i=0;i<this.BranchList.length;i++) {
				if(BranchList[i]==element) {
					BranchList=null;
				}
				if(i==(BranchList.length-1)&&BranchList[i]!=element) {
					System.out.println("element not exist");
					
				}
			}
		}

			
		
	}
	


