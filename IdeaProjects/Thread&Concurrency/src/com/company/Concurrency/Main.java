package com.company.Concurrency;

public class Main {

    public static void main(String[] args) {
	    Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 5; i >= 0; i--) {

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print(i + " ");
                }
            }
        });
	    t.start();
	    Database db = Database.getInstance("db_music");
	    System.out.println(db.toString());
    }
}
