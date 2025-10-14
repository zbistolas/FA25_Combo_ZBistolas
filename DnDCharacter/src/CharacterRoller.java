
public class CharacterRoller {
	private int mod = 0;
	private int str = rollchar();
	private int dex = rollchar();
	private int con = rollchar();
	private int intl = rollchar();
	private int wis = rollchar();
	private int cha = rollchar();
	int[]stats = {str,dex,con,intl,wis,cha};

	public CharacterRoller() {
		super();
		this.str = str;
		this.dex = dex;
		this.con = con;
		this.intl = intl;
		this.wis = wis;
		this.cha = cha;
	}

	private int rollchar() {
		int sum = 0;
		int low = 6;
		for (int i = 0; i < 4; i++) {
			int roll = Dice.roll(6);
			sum += roll;
			if (roll < low) {
				low = roll;
			}
		}
		sum -= low;
		return sum;
	}

	private int findMod(int stat) {
		mod = ((stat - 10) / 2);
		return mod;
	}
	private String recType() {
		int high = 0;
		String ret = "";
		for(int i = 0; i < stats.length; i ++)
		{
			if(stats[i] > stats[high])high = i;
		}
		switch (high) {
			case 0:
				ret = "Barbarian";
				break;
			case 1:
				ret = "Rogue";
				break;
			case 2:
				ret = "Barbarian";
				break;
			case 3:
				ret = "Wizard";
				break;
			case 4:
				ret = "Druid";
				break;
			case 5:
				ret = "Bard";
				break;
				default:
					ret = "NPC";
		}
		return ret;
	}

	@Override
	public String toString() {
		return "CharacterRoller [str=" + str + " Mod [" + findMod(str) + "], dex=" + dex + " Mod [" + findMod(dex)
				+ "], con=" + con + " Mod [" + findMod(con) + "],\n intl=" + intl + " Mod [" + findMod(intl)
				+ "] + , wis=" + wis + " Mod [" + findMod(wis) + "]" + ", cha=" + cha + " Mod [" + findMod(str) + "]" + recType();
	}

	

}
