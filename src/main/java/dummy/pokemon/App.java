package dummy.pokemon;

import java.util.*;

import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

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
        templates.add(createTemplateMaster("kusa", "草ポケモンデッキ"));
        return templates;
    }

    @RequestMapping(value = "/api/v1/deck/templates/{deckCode}/cards", method = RequestMethod.GET)
    @ResponseBody
    public List<Integer> templateCards(@PathVariable String deckCode) {
        switch (deckCode) {
            case "kusa":
                return Arrays.asList(1,
                        1,
                        1,
                        2,
                        2,
                        3,
                        13,
                        13,
                        13,
                        14,
                        14,
                        15,
                        109,
                        109,
                        114,
                        114,
                        1001,
                        1002,
                        1003,
                        1013,
                        1013,
                        1015,
                        1015,
                        1015,
                        1016,
                        1016,
                        1019,
                        1020,
                        1020,
                        8001,
                        8001,
                        8002,
                        8002,
                        8004,
                        8006,
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
                        10001,
                        10001,
                        10011,
                        10011,
                        10011);
            default:
                throw new IllegalArgumentException("No card set are found for deckCode=" + deckCode);
        }
    }

    private Map<String, String> createTemplateMaster(String deckCode, String deckName) {
        // define pojo for deck master model
        Map<String, String> deckMst = new HashMap<>();
        deckMst.put("deckCode", deckCode);
        deckMst.put("deckName", deckName);
        return deckMst;
    }

}
