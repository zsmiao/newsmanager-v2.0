package xyz.itclay.service.impl;

import xyz.itclay.dao.UserDao;
import xyz.itclay.dao.impl.UserDaoImpl;
import xyz.itclay.domain.User;
import xyz.itclay.service.UserService;

/**
 * 业务接口层实现类
 *
 * @author ZhangSenmiao
 * @date 2021/1/26 21:12
 **/
public class UserServiceImpl implements UserService {

    private final UserDao userDao=new UserDaoImpl();
    @Override
    public User login(String username, String password) {
        return userDao.findByNameAndPwd(username,password);
    }
}
