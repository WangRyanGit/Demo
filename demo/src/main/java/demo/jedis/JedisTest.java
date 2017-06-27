package demo.jedis;

import java.util.ResourceBundle;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisTest {
	
	/*private static JedisPool pool;
	static{
		ResourceBundle bundle = ResourceBundle.getBundle("redis");
		if(bundle == null){
			throw new IllegalArgumentException("[redis.properties] is not found!");
		}
		JedisPoolConfig config = new JedisPoolConfig();
		config.setMaxActive(Integer.valueOf(bundle.getString("redis.pool.maxActive")));
		config.setMaxIdle(Integer.valueOf(bundle.getString("redis.pool.maxIdel")));
		config.setMaxWait(Integer.valueOf(bundle.getString("redis.pool.maxWait")));
		config.setTestOnBorrow(Boolean.valueOf(bundle.getString("redis.pool.testOnBorrow")));
	    config.setTestOnReturn(Boolean.valueOf(bundle.getString("redis.pool.testOnReturn")));	
		
	    pool = new JedisPool(config, bundle.getString("redis.ip"), Integer.valueOf(bundle.getString("redis.port")));
	}
	public static void main(String[] args) {
		Jedis jedis = pool.getResource();
		String keys = "pass";
		String value = jedis.get(keys);
		System.out.println(value);
		
		//释放对象池
		pool.returnResource(jedis);
	}
*/
}
