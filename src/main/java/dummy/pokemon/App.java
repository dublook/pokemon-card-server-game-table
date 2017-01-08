package dummy.pokemon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import dummy.pokemon.decktemplate.DeckPreset;
import dummy.pokemon.decktemplate.InitAquaDeck;
import dummy.pokemon.decktemplate.InitFireDeck;
import dummy.pokemon.decktemplate.InitLeafDeck;

@RestController
@EnableAutoConfiguration
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@ModelAttribute
	public void setVaryResponseHeader(HttpServletResponse response) {
		// cross domain request/CORS
		response.setHeader("Access-Control-Allow-Origin", "*");
	}

	@RequestMapping("/api/v1/deck")
	@ResponseBody
	public List<Integer> deck() {
		return Arrays.asList(25, 25, 25, 25, 26, 26, 26, 19, 19, 19, 20, 20, 7, 7, 7, 8, 8, 9, 77, 77, 1001, 1001, 1002,
				1002, 1003, 1004, 1004, 1009, 1010, 1014, 1017, 1018, 8001, 8002, 8003, 8004, 10002, 10002, 10002,
				10002, 10002, 10002, 10003, 10003, 10003, 10003, 10003, 10003, 10003, 10003, 10003, 10004, 10004, 10004,
				10004, 10004, 10004, 10011, 10011, 10011);
	}

    @RequestMapping(value = "/api/v1/deck/templates", method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String, String>> templates() {
        List<Map<String, String>> templates = new ArrayList<>();
        templates.add(createTemplateMaster(DeckTemplates.INIT_LEAF));
        templates.add(createTemplateMaster(DeckTemplates.INIT_FIRE));
        templates.add(createTemplateMaster(DeckTemplates.INIT_AQUA));
        return templates;
    }

    @RequestMapping(value = "/api/v1/deck/templates/{deckCode}/cards", method = RequestMethod.GET)
    @ResponseBody
    public List<Integer> templateCards(@PathVariable String deckCode) {
    	DeckTemplates code = DeckTemplates.parse(deckCode);
    	DeckPreset deck;
        switch (code) {
            case INIT_LEAF:
            	deck = new InitLeafDeck();
            	break;
            case INIT_FIRE:
            	deck = new InitFireDeck();
            	break;
            case INIT_AQUA:
            	deck = new InitAquaDeck();
            	break;
            default:
                throw new IllegalArgumentException("No card set are found for deckCode=" + deckCode);
        }
        return deck.getCardCodes();
    }

    private Map<String, String> createTemplateMaster(DeckTemplates template) {
        // define pojo for deck master model
        Map<String, String> deckMst = new HashMap<>();
        deckMst.put("deckCode", template.code());
        deckMst.put("deckName", template.getDeckName());
        return deckMst;
    }

}
