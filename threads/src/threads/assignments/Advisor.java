package threads.assignments;

import java.util.List;
import java.util.Random;

public class Advisor extends Thread{
	String[] quotes = {
            "The only limit to our realization of tomorrow is our doubts of today. - Franklin D. Roosevelt",
            "In the end, we will remember not the words of our enemies, but the silence of our friends. - Martin Luther King Jr.",
            "Life is 10% what happens to us and 90% how we react to it. - Charles R. Swindoll",
            "The purpose of life is not to be happy. It is to be useful, to be honorable, to be compassionate, to have it make some difference that you have lived and lived well. - Ralph Waldo Emerson",
            "It is never too late to be what you might have been. - George Eliot",
            "Do not go where the path may lead, go instead where there is no path and leave a trail. - Ralph Waldo Emerson",
            "To be yourself in a world that is constantly trying to make you something else is the greatest accomplishment. - Ralph Waldo Emerson"
        };
	
	public void run() {
		
		int index =(int) (Math.random()*quotes.length);
		System.out.println(quotes[index]+"\n"+Thread.currentThread().getName());
		
	}
	public Advisor(String str) {
		this.setName(str);
		this.start();
	}
	public static void main(String s[]) {
		Advisor av = new Advisor("DaVinci");
		Advisor av1 = new Advisor("Marx");
		Advisor av2 = new Advisor("Chegu");
	}
}


