package top.lzp.demo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import top.lzp.demo.entity.User;

/**
 * @author Lu
 * @date 2020/4/12:22:28:05
 * @description
 */
@Mapper
@Repository
public interface UserMapper {
    @Insert("insert into user(username,password) values(#{username},#{password})")
    int save(User user);

    @Select("select * from user where username = #{username} and password = #{password}")
    User findUserByUsernameAndPassword(User user);

    @Select("select * from user where username = #{username}")
    User isRegister(User user);
}
