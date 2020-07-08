package club.banyuan.entity;

public class User {
  private Integer u_id;
  private String loginName;
  private String u_password;
  private String identityCode;
  private String mobile;
  private String address;
  private String postcode;

  public User(){}

  public User(Integer u_id,String loginName,String password,String identityCode,String mobile,String address,String postcode){
    this.u_id = u_id;
    this.loginName = loginName;
    this.u_password = password;
    this.identityCode = identityCode;
    this.mobile =mobile;
    this.address =address;
    this.postcode = postcode;
  }

  public Integer getU_id() {
    return u_id;
  }

  public void setU_id(Integer u_id) {
    this.u_id = u_id;
  }

  public String getLoginName() {
    return loginName;
  }

  public void setLoginName(String loginName) {
    this.loginName = loginName;
  }

  public String getPassword() {
    return u_password;
  }

  public void setPassword(String password) {
    this.u_password = password;
  }

  public String getIdentityCode() {
    return identityCode;
  }

  public void setIdentityCode(String identityCode) {
    this.identityCode = identityCode;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }
}
