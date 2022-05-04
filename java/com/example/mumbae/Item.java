package com.example.mumbae;

public class Item {
    private String name;   // name of item
    private String subText;
    private int ImageResourceID = NO_IMAGE_PROVIDED;
    private int SubTextResourceID = NO_SUBTEXT_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;
    private static final int NO_SUBTEXT_PROVIDED = -1;


    public Item(String name,String subText){
        this.name = name;
        this.subText = subText;
    }

    public Item(String name,int imageResourceID){
        this.name = name;
        this.ImageResourceID = imageResourceID;
    }

    public Item(String name, String subText, int imageResourceID){
        this.name = name;
        this.subText = subText;
        this.ImageResourceID = imageResourceID;
    }

    public String getName(){
        return this.name;
    }

    public String getSubText(){
        return this.subText;
    }

    public int getImageResourceID(){
        return this.ImageResourceID;
    }

    public int getSubTextID(){
       return this.SubTextResourceID;
    }

    public boolean hasImage(){
        return this.ImageResourceID != NO_IMAGE_PROVIDED;
    }


    public boolean hasSubText(){ // not all items on the list might have a subText.
        return this.SubTextResourceID != NO_SUBTEXT_PROVIDED;
    }


}
