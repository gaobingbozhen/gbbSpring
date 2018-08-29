package com.gbb.springTest.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
	@Autowired
	private  CompactDisc cd;
	
	@Test
	public  void cdshouldNotBeNull(){
		Assert.notNull(cd);
		if(!ObjectUtils.isEmpty(cd)){
			System.out.println("11");
		}
   	}
}
