package csii.com.cn.domain;

public class User {

    private String id;
    private String userName;
    private String password;
    private String jj;
    private String phone;
	private String bb;
	System.out.println("345234524244322343");
        System.out.println("3333");

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {

        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
