package masterSpringMvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by Christian on 21.06.2016.
 */
@Configuration
@Profile("redis")
@EnableRedisHttpSession
public class RedisConfig {
}
