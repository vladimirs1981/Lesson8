package examples.hiphop;

public class KanyeWest extends Beatmaker {
	
	private RappingAbility rapSkillz;
	private ShoeDesigningAbility shoeDesigningAbility = new ShoeDesigningAbility();
	
	public void spitRhymes() {
		rapSkillz.spitRhymes(); //delegates to RappingAbility
	}

	// this is a delegator method
	public void designShoes() {
	
		shoeDesigningAbility.designShoes();
		
	}

}
