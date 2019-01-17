package myRepositoryTest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.ali.sonia.springboot.database.hello.mySpringBootDatabaseApp.MySpringBootDatabaseAppApplication;
import com.qa.ali.sonia.springboot.database.hello.mySpringBootDatabaseApp.model.MySpringBootDataModel;
import com.qa.ali.sonia.springboot.database.hello.mySpringBootDatabaseApp.repository.MySpringBootRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {MySpringBootDatabaseAppApplication.class})
@DataJpaTest
public class MyRepositoryTest {

	@Autowired
		private TestEntityManager entityManager;
		
		@Autowired
		private MySpringBootRepository MyRepo;
		
		//@Test
		//public void retrieveByIdTest() {
		//	MySpringBootDataModel model1 = new MySpringBootDataModel("Bob", "Space",50);
		//	entityManager.persist(model1);
		//	entityManager.flush();
		//	assertTrue(MyRepo.findById(model1.getId()).isPresent());
		//}
		
}
