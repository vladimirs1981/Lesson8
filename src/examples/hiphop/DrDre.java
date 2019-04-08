package examples.hiphop;

public class DrDre extends Beatmaker {
	RappingAbility rapSkillz;
	private ShoeDesigningAbility shoeDesigningAbility = new ShoeDesigningAbility();

	public void spitRhymes() {
		rapSkillz.spitRhymes(); // delegates to RappingAbility
	}
	
	public void designShoes() {
		shoeDesigningAbility.designShoes();
	}
}
