package xyz.itclay.dao;

import xyz.itclay.domain.User;

/**
 *持久层接口
 * @author ZhangSenmiao
 * @date   2021/1/26 20:52
 **/
public interface UserDao {

    User findByNameAndPwd(String username,String password);
}
