package br.com.noviapp.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoreApplicationTests {

	@Test
	public void contextLoads() {
		
	}
	
	public void test () {
		System.out.println("entra aqui merda");
		Assert.assertTrue(true);
	}

}
