package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }
//    @Bean
//    public static Egg6 getEgg(){
//        Egg6 egg = new Egg6();
//        return egg;
//    }
    @Bean
    public static Needle7 getNeedle(){
        Needle7 needle = new Needle7();
        return needle;
    }
    @Bean
    public static Deth8 getDie(){
        return new Deth8();
    }

}
