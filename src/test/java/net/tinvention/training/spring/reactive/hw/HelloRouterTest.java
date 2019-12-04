package net.tinvention.training.spring.reactive.hw;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import net.tinvention.training.spring.reactive.hw.server.Application;

@RunWith(SpringRunner.class)
@SpringBootTest(
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
		classes = Application.class
		)
public class HelloRouterTest {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	public void testHello() {
		webTestClient

			.get().uri("/bye")
			.accept(MediaType.TEXT_PLAIN)
			.exchange()

			.expectStatus().isOk()
			.expectBody(String.class).isEqualTo("Hello World !");
	}
}
