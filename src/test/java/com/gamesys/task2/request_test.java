package com.gamesys.task2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.junit.jupiter.api.Test;

class request_test {

	@Test
	public void getRequest() throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://httpbin.org/get"))
				.build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		assertEquals(200, response.statusCode());
	}

}
