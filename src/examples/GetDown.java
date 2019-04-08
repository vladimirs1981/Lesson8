package examples;

import java.lang.reflect.Method;
import java.util.ArrayList;

import examples.hiphop.Beatmaker;
import examples.hiphop.DrDre;
import examples.hiphop.JDilla;
import examples.hiphop.KanyeWest;

public class GetDown {

	public static void main(String[] args) {
		JDilla jdee = new JDilla();
		DrDre dre = new DrDre();
		KanyeWest ye = new KanyeWest();
		
		// add dre & ye to a list with jdee
		ArrayList<Beatmaker> beatmakers = new ArrayList<Beatmaker>();
		beatmakers.add(jdee);
		beatmakers.add(dre);
		beatmakers.add(ye);

		for (Beatmaker beatmaker : beatmakers) {
			
			Method[] skills = beatmaker.getClass().getMethods();
			for (int i = 0; i < skills.length; i++) {
				Method method = skills[i];
				if (!method.getDeclaringClass().getSimpleName().equals("Object")) {
					System.out.println(beatmaker.getClass().getSimpleName() + " knows how to " + method.getName());
				}
			}
		}
	}

}
