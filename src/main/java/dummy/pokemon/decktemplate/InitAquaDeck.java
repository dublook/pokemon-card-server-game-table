package dummy.pokemon.decktemplate;

import java.util.Arrays;
import java.util.List;

/**
 * ゼニガメとともだちデッキ
 * @author syusuke009
 *
 */
public class InitAquaDeck implements DeckPreset {

	@Override
	public String getDeckName() {
		return "ゼニガメとともだちデッキ";
	}

	@Override
	public List<Integer> getCardCodes() {
		return Arrays.asList(7,
				7,
				8,
				9,
				86,
				86,
				87,
				120,
				120,
				121,
				129,
				129,
				130,
				50,
				50,
				51,
				107,
				63,
				63,
				64,
				96,
				96,
				124,
				124,
				19,
				19,
				20,
				1001,
				1001,
				1003,
				1004,
				1013,
				1015,
				1016,
				8001,
				8002,
				10003,
				10003,
				10003,
				10003,
				10003,
				10003,
				10003,
				10003,
				10003,
				10003,
				10006,
				10006,
				10006,
				10006,
				10006,
				10006,
				10006,
				10006,
				10005,
				10005,
				10005,
				10005,
				10005,
				10005);
	}

}
