package cn.edu.sandau.ditingmusic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
// 路径必须与AdminMapper所在包完全一致
@MapperScan("cn.edu.sandau.ditingmusic.mapper")
public class DitingMusicServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DitingMusicServerApplication.class, args);
    }
}
