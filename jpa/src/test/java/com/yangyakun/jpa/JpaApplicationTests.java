package com.yangyakun.jpa;

import com.yangyakun.jpa.db.entity.User;
import com.yangyakun.jpa.db.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void contextLoads() {
		userRepository.save(new User("nickName","openid","head_img",
				"phone",new Timestamp(1517040904000L),new Timestamp(1517040904000L)));
		userRepository.save(new User("nickName","openid","head_img",
				"phone",new Timestamp(1517040905000L),new Timestamp(1517040904000L)));
		userRepository.save(new User("nickName","openid","head_img",
				"phone",new Timestamp(1517040906000L),new Timestamp(1517040904000L)));

//		Assert.assertEquals(3, userRepository.findAll().size());
//
//		System.out.println(userRepository.findAll().size());
//		userRepository.delete(userRepository.findByUserName("aa1"));
	}

}
