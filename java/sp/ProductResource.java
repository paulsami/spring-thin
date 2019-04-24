package sp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductResource {

	@GetMapping("/")
	public String get()
	{
		return "Hello";
	}
}
