package xyz.itclay.dao.impl;

import xyz.itclay.dao.UserDao;
import xyz.itclay.domain.User;

/**
 * 持久层接口的实现类
 *
 * @author ZhangSenmiao
 * @date 2021/1/26 20:55
 **/
public class UserDaoImpl implements UserDao {
    /**
     * 根据用户名和密码查询对应的用户信息
     *
     * @author ZhangSenmiao
     * @date 2021/1/26 20:56
     **/
    @Override
    public User findByNameAndPwd(String username, String password) {
       User user=null;
       if ("root".equals(username)&&"root".equals(password)){
           user=new User(1,
                   "张三",
                   "root",
                   "root",
                   "管理员", Math.toIntExact(18198001123L));
       }
       return user;
    }
}
