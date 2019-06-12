package com.test.design.pattern;

public class ProxyImage implements Image{

	   private RealImage realImage;
	   private String fileName;

	   public ProxyImage(String fileName){
	      this.fileName = fileName;
	   }

	   public void display() {
	      if(realImage == null){
	    	  System.out.println("Loading from Real Image");
	         realImage = new RealImage(fileName);
	      }
	      realImage.display();
	   }
	}