package dummy.pokemon.decktemplate;

import java.util.Arrays;
import java.util.List;

/**
 * ヒトカゲとともだちデッキ
 * @author syusuke009
 *
 */
public class InitFireDeck implements DeckPreset {

	@Override
	public String getDeckName() {
		return "ヒトカゲとともだちデッキ";
	}

	@Override
	public List<Integer> getCardCodes() {
		return Arrays.asList(4,
				4,
				5,
				6,
				58,
				58,
				59,
				77,
				77,
				126,
				25,
				25,
				26,
				81,
				81,
				82,
				100,
				100,
				50,
				50,
				51,
				66,
				66,
				67,
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
				10002,
				10002,
				10002,
				10002,
				10002,
				10002,
				10002,
				10002,
				10002,
				10002,
				10004,
				10004,
				10004,
				10004,
				10004,
				10004,
				10004,
				10004,
				10006,
				10006,
				10006,
				10006,
				10006,
				10006);
	}

}
