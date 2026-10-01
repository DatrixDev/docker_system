package datrixdev.hello_docker.controller;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/redis")
public class RedisController {

    private final StringRedisTemplate redisTemplate;

    public RedisController(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @PostMapping("/{key}/{value}")
    public String set(
            @PathVariable String key,
            @PathVariable String value) {
        redisTemplate.opsForValue().set(key, value);
        return "Saved";
    }

    @GetMapping("/{key}")
    public String get(@PathVariable String key) {
        return redisTemplate.opsForValue().get(key);
    }
}