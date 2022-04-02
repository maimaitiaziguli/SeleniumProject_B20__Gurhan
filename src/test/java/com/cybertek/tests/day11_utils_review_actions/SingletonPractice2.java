package com.cybertek.tests.day11_utils_review_actions;

public class SingletonPractice2 {
    private SingletonPractice2(){}
    private String word ;

    public String getWord() {
        if (word == null){
            System.out.println("variable is not assigned yet, please initialize the local variable ");
            word = "something";
        }else{
            System.out.println("Variable is already assigned");
            return word;
        }
        return word;
    }
}
