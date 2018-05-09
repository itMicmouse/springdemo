package com.yangyakun.jpa;

import com.yangyakun.jpa.db.entity.User;
import com.yangyakun.jpa.db.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Test
	public void contextLoads() {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		String formattedDate = dateFormat.format(date);

		userRepository.save(new User("aa1", "aa123456", "aa@126.com", "aa",formattedDate));
		userRepository.save(new User("bb2", "bb123456", "bb@126.com", "bb",formattedDate));
		userRepository.save(new User("cc3", "cc123456", "cc@126.com", "cc",formattedDate));

		Assert.assertEquals(3, userRepository.findAll().size());

		System.out.println(userRepository.findAll().size());
		System.out.println(userRepository.findByUserNameOrEmail("bb", "cc@126.com").getNickName());
		userRepository.delete(userRepository.findByUserName("aa1"));
	}

}
