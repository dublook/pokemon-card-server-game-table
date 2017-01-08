package dummy.pokemon.decktemplate;

import java.util.Arrays;
import java.util.List;

/**
 * フシギダネとともだちデッキ
 * @author syusuke009
 *
 */
public class InitLeafDeck implements DeckPreset {

	@Override
	public String getDeckName() {
		return "フシギダネとともだちデッキ";
	}

	@Override
	public List<Integer> getCardCodes() {
		return Arrays.asList(1,
				1,
				2,
				3,
				10,
				10,
				11,
				32,
				32,
				33,
				34,
				114,
				25,
				25,
				26,
				81,
				81,
				82,
				125,
				63,
				63,
				64,
				96,
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
				10001,
				10001,
				10001,
				10001,
				10001,
				10001,
				10001,
				10001,
				10001,
				10001,
				10004,
				10004,
				10004,
				10004,
				10004,
				10004,
				10004,
				10004,
				10005,
				10005,
				10005,
				10005,
				10005,
				10005);
	}

}
