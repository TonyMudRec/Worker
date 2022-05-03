package com.company;

class Main {
    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener erorrer = System.out::println;
        Worker worker = new Worker(listener, erorrer);
        worker.start();


    }
}