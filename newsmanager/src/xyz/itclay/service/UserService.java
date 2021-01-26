package xyz.itclay.service;

import xyz.itclay.domain.User;

/**
 * 业务接口层
 *
 * @author ZhangSenmiao
 * @date 2021/1/26 21:13
 **/
public interface UserService {

    User login(String username, String password);
}
