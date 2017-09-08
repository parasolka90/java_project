package com.kodilla.spring.exception.test;

public class ExceptionHandling {
    public static void main(String[]args){
        SecondChallenge challenge = new SecondChallenge();
        try{
            challenge.probablyIWillThrowException(1,6);
        } catch(Exception e){
            System.out.println("Error: "+e);
        } finally {
            System.out.print("finally");
        }
    }
}
