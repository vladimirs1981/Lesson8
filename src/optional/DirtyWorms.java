package optional;

import java.util.ArrayList;
import java.util.Collection;

public class DirtyWorms {

	public static void main(String[] args) {

		class Stuff {
		}
		class Worm extends Stuff {
		}
		class Dirt extends Stuff {
		}
		ArrayList<Stuff> stuffIFoundInTheYard = new ArrayList<Stuff>();
		stuffIFoundInTheYard.add(new Worm());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Dirt());
		stuffIFoundInTheYard.add(new Worm());
		stuffIFoundInTheYard.add(new Dirt());

		System.out.println(stuffIFoundInTheYard.size());

		stuffIFoundInTheYard.remove(1);
		stuffIFoundInTheYard.remove(1);
		stuffIFoundInTheYard.remove(1);
		stuffIFoundInTheYard.remove(2);

		System.out.println(stuffIFoundInTheYard.size()); // should be 2

	}
}
