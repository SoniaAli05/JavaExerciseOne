/*package myIntegrationTest;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.qa.ali.sonia.springboot.database.hello.mySpringBootDatabaseApp.MySpringBootDatabaseAppApplication;
import com.qa.ali.sonia.springboot.database.hello.mySpringBootDatabaseApp.model.MySpringBootDataModel;
import com.qa.ali.sonia.springboot.database.hello.mySpringBootDatabaseApp.repository.MySpringBootRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {MySpringBootDatabaseAppApplication.class})
@AutoConfigureMockMvc
public class MyIntegrationTest {
	
	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private MySpringBootRepository repository;
	@Before
	public void clearDB() {
		repository.deleteAll();
	} 
	
	@Test
	public void findingAndRetrievingPersonFromDatabase()
		throws Exception{
			repository.save(new MySpringBootDataModel("Dale", "Salford", 2));
			mvc.perform(get("/api/person").contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk())
			.andExpect(content()
			.contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
			.andExpect(jsonPath("$[0].name",is("Dale")));
	}
}
*/
