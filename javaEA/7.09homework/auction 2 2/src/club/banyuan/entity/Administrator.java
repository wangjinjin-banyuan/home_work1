package club.banyuan.entity;

public class Administrator {
    private Integer a_id;
    private String adminName;
    private String a_password;

    public Administrator(){}

    public Administrator(Integer a_id, String adminName, String a_password) {
        this.a_id = a_id;
        this.adminName = adminName;
        this.a_password = a_password;
    }

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getA_password() {
        return a_password;
    }

    public void setA_password(String a_password) {
        this.a_password = a_password;
    }
}
