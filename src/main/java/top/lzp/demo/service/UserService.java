package top.lzp.demo.service;

import org.springframework.stereotype.Service;
import top.lzp.demo.entity.User;

/**
 * @author Lu
 * @date 2020/4/12:22:20:52
 * @description
 */

public interface UserService {
    boolean save(User user);

    boolean findUserByUsernameAndPassword(User user);

    boolean isRegister(User user);
}
