package com.itlize.EnumsPractice;


enum DuongXinyuEnum {
    Duong, Xinyu;

    public String getCatchPhrase(){
        return "Hey, my name is "+ this.toString();
    }



    public boolean isDuong(){
        return "Duong"==this.toString();
    }

    public boolean isXinyu(){
        return "Xinyu"==this.toString();
    }
}



