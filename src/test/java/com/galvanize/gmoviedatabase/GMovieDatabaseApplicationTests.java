package com.galvanize.gmoviedatabase;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class GMovieDatabaseApplicationTests {
	@Autowired
	MockMvc mockMvc;

	@Autowired
	ObjectMapper objectMapper;

	@Test
	public void emptyDBTest() throws Exception {
			this.mockMvc.perform(MockMvcRequestBuilders.get("/movies")
					.contentType(MediaType.APPLICATION_JSON))
					.andExpect(MockMvcResultMatchers.status().isOk())
					.andExpect(MockMvcResultMatchers.jsonPath("length()").value(0));
	}

	@Test
	public void newMovieReleasedTest() throws Exception{


		this.mockMvc.perform(MockMvcRequestBuilders.get("/movies")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("length()").value(0));

		this.mockMvc.perform(MockMvcRequestBuilders.post("/movies")
			.contentType(MediaType.APPLICATION_JSON)
			.content(this.objectMapper.writeValueAsString(new Movie("The Avengers"))))
			.andExpect(MockMvcResultMatchers.status().isCreated());

		this.mockMvc.perform(MockMvcRequestBuilders.get("/movies")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("length()").value(1))
				.andExpect(MockMvcResultMatchers.jsonPath("[0].title").value("The Avengers"));
	}

}
