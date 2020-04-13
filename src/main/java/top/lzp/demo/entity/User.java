package top.lzp.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Repository;

/**
 * @author Lu
 * @date 2020/4/12:19:06:05
 * @description
 */
@Repository
@Setter
@Getter
@ToString
public class User {
    private Integer id;
    private String username;
    private String password;
}
