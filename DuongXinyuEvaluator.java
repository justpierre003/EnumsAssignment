package com.itlize.EnumsPractice;

public class DuongXinyuEvaluator {

    private String the_name;

    public void DuongXinyuEvaluator(String input) {
        the_name = "";
    }

    public boolean isDuong() {
        return the_name == "Duong";
    }

    public boolean isXinyu() {
        return the_name == "Xinyu";
    }
}
