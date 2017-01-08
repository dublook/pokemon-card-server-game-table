package dummy.pokemon;

import java.util.List;

import dummy.pokemon.decktemplate.DeckPreset;
import dummy.pokemon.decktemplate.InitAquaDeck;
import dummy.pokemon.decktemplate.InitFireDeck;
import dummy.pokemon.decktemplate.InitLeafDeck;

/**
 * @author syusuke009
 */
enum DeckTemplates {
	INIT_LEAF(new InitLeafDeck()),
	INIT_FIRE(new InitFireDeck()),
	INIT_AQUA(new InitAquaDeck());

	private final DeckPreset preset;

	DeckTemplates(DeckPreset preset) {
		this.preset = preset;
	}

	public String code() {
		return this.name().toLowerCase().replaceAll("_", "-");
	}

	public static DeckTemplates parse(String code) {
		return DeckTemplates.valueOf(code.toUpperCase().replaceAll("-", "_"));
	}

	public String getDeckName() {
		return preset.getDeckName();
	}

	public List<Integer> getCardCodes() {
		return preset.getCardCodes();
	}
}
