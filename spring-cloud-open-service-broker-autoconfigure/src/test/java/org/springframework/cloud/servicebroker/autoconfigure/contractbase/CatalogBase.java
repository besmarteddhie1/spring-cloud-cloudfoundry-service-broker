package org.springframework.cloud.servicebroker.autoconfigure.contractbase;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import org.springframework.cloud.servicebroker.controller.CatalogController;
import org.springframework.cloud.servicebroker.service.CatalogService;

import static org.mockito.Mockito.when;
import static org.springframework.cloud.servicebroker.model.fixture.CatalogFixture.getCatalog;

public class CatalogBase {

	@Mock
	private CatalogService catalogService;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		when(this.catalogService.getCatalog()).thenReturn(getCatalog());
		RestAssuredMockMvc.standaloneSetup(new CatalogController(this.catalogService));
	}

}
