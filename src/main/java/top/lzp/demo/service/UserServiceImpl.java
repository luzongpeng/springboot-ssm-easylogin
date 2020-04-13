package top.lzp.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.lzp.demo.dao.UserMapper;
import top.lzp.demo.entity.User;

/**
 * @author Lu
 * @date 2020/4/12:22:21:34
 * @description
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean save(User user) {
        int rows = userMapper.save(user);
        return rows > 0 ? true : false;
    }

    @Override
    public boolean findUserByUsernameAndPassword(User user) {
        User temp = userMapper.findUserByUsernameAndPassword(user);
        return temp == null ? false : true;
    }

    @Override
    public boolean isRegister(User user) {
        User register = userMapper.isRegister(user);
        return register == null ?true:false;
    }
}
