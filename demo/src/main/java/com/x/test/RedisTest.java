package com.x.test;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.x.dao.UserDao;
import com.x.entity.User;

/**  
 * 测试 
 * @author ryan  
 * @version <b>1.0</b>  
 */ 
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class RedisTest extends AbstractJUnit4SpringContextTests {
	

	@Autowired
	private UserDao userDao;
	
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	/** 
     * 新增 
     */
	/*@SuppressWarnings("deprecation")
	@Test
	public void testAddUser(){
		System.out.println("1111");
		User user = new User();
		user.setId("user2");
		user.setName("RyanWang2");
		boolean result = userDao.add(user);
		Assert.assertTrue(result);
		System.out.println("success");
	}*/
	/** 
     * 批量新增 普通方式 
     */  
	/*@Test
	public void testAddUser1(){
		System.out.println("1111");
		List<User> list = new ArrayList<>();
		for(int i=10;i<15;i++){
			User user = new User();
			user.setId("user" + i);
			user.setName("RyanWang" + i);
			list.add(user);
		}
		long begin = System.currentTimeMillis();
		for(User user :list){
			userDao.add(user);
		}
		System.out.println(System.currentTimeMillis() -  begin);
	}*/
	
	/** 
     * 批量新增 pipeline方式 
     */
	/*@Test
	public void testAddUser2(){
		List<User> list = new ArrayList<User>();
		for(int i=15;i<20;i++){
			User user = new User();
			user.setId("user" + i);
			user.setName("RyanWang" + i);
			list.add(user);
		}
		long begin = System.currentTimeMillis();
		boolean result = userDao.add(list);
		System.out.println(System.currentTimeMillis() - begin);
		Assert.assertTrue(result);		
	}*/
	/** 
     * 修改 
     * <br>------------------------------<br> 
     */ 
	/*@Test
	public void testUpdate(){
		User user = new User();
		user.setId("user10");
		user.setName("newName");
		boolean result = userDao.update(user);
		Assert.assertTrue(result);
	}*/
	/** 
     * 通过key删除单个 
     * <br>------------------------------<br> 
     */
	/*@Test
	public void testDelete(){
		String key = "user10";
		userDao.delete(key);
	}*/
	/** 
     * 批量删除 
     * <br>------------------------------<br> 
     */ 
	/*@Test
	public void testDeletes(){
		List<String> list = new ArrayList<String>();
		for(int i=10;i<20;i++){
			list.add("user" + i);
		}
		userDao.delete(list);
	}*/
	/** 
     * 获取 
     * <br>------------------------------<br> 
     */ 
	@Test
	public void testGetUser(){
		String id = "user1";
		User user = userDao.get(id);
		System.out.println(user.getName());
		Assert.assertNotNull(user);
		Assert.assertEquals(user.getName(), "RyanWang1");
	}
	
	
}
