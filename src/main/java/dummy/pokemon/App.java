package dummy.pokemon;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@RequestMapping("/api/v1/deck")
	@ResponseBody
	public List<Integer> deck() {
		return Arrays.asList(25, 25, 25, 25, 26, 26, 26, 19, 19, 19, 20, 20, 7, 7, 7, 8, 8, 9, 77, 77, 1001, 1001, 1002,
				1002, 1003, 1004, 1004, 1009, 1010, 1014, 1017, 1018, 8001, 8002, 8003, 8004, 10002, 10002, 10002,
				10002, 10002, 10002, 10003, 10003, 10003, 10003, 10003, 10003, 10003, 10003, 10003, 10004, 10004, 10004,
				10004, 10004, 10004, 10011, 10011, 10011);
	}
}
