package examples;

import java.awt.List;
import java.util.ArrayList;

public interface Huggable {
	
	void giveHugs();

}

interface Quotable {
	
	void saySomethingFunny();
}

class June implements Huggable, Quotable {

	@Override
	public void giveHugs() {
		// give the best hugs
	}
	
	public void saySomethingFunny() {
		// method meat
	}
	
	
}
