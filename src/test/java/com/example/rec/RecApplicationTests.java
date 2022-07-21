package com.example.rec;

import com.example.rec.position.domain.Position;
import com.example.rec.position.service.PositionService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.util.Base64Utils;

import javax.servlet.ServletContext;
import javax.transaction.Transactional;

import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//testy
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc

@SpringBootTest
class RecApplicationTests {

	//testy
	@Autowired
	private MockMvc mvc;

	@Test
	void contextLoads() {
	}

	//testy
	@WithMockUser(username="admin", password = "password")
	@Test
	public void test1() throws Exception {
		this.mvc.perform(MockMvcRequestBuilders
				.post("/api/positions")
				.content(asJsonString(new Position( 100000000l, 761231, 1523311 )))
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isCreated())
				.andExpect(MockMvcResultMatchers.jsonPath("$.id").exists())
				.andExpect(MockMvcResultMatchers.jsonPath("$.deviceId").value(100000000l))
				.andExpect(MockMvcResultMatchers.jsonPath("$.latitiude").value(761231))
				.andExpect(MockMvcResultMatchers.jsonPath("$.longitude").value(1523311)
		);
	}

	@WithMockUser(username="admin", password = "password")
	@Test
	public void test2() throws Exception {
		this.mvc.perform(MockMvcRequestBuilders
						.post("/api/positions")
						.content(asJsonString(new Position( 100000001l, -361231, -1523311 )))
						.contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isCreated())
				.andExpect(MockMvcResultMatchers.jsonPath("$.id").exists())
				.andExpect(MockMvcResultMatchers.jsonPath("$.deviceId").value(100000001l))
				.andExpect(MockMvcResultMatchers.jsonPath("$.latitiude").value(-361231))
				.andExpect(MockMvcResultMatchers.jsonPath("$.longitude").value(-1523311)
				);
	}

	@WithMockUser(username="admin", password = "password")
	@Test
	public void test3() throws Exception {
		this.mvc.perform(MockMvcRequestBuilders
						.post("/api/positions")
						.content(asJsonString(new Position( 100000000l, -3261231, -1523311 )))
						.contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isBadRequest());
	}

	@WithMockUser(username="admin", password = "password")
	@Test
	public void test4() throws Exception {
		this.mvc.perform(MockMvcRequestBuilders
						.post("/api/positions")
						.content(asJsonString(new Position( 100000000l, -326121, -152886311 )))
						.contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isBadRequest());
	}

	public static String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
