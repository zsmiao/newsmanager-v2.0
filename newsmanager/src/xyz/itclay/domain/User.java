package xyz.itclay.domain;

/**
 * 用户实体类
 * 属性：id（id）  姓名（name）  用户名（username）  密码（password）  角色（roles）  电话(tel)
 *
 * @author ZhangSenmiao
 * @date 2021/1/26 20:57
 **/
public class User {
    private Integer id;
    private String name;
    private String username;
    private String password;
    private String roles;
    private int tel;

    public User() {
    }

    public User(Integer id, String name, String username, String password, String roles, int tel) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.roles = roles;
        this.tel = tel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roles='" + roles + '\'' +
                ", tel=" + tel +
                '}';
    }
}
