package club.banyuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("club.banyuan.mapper")
public class ProvinceRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProvinceRedisApplication.class, args);
    }

}
