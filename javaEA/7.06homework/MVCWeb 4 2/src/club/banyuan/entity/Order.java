package club.banyuan.entity;

import java.util.Date;

public class Order {
    private Integer id;
    private Integer userId;
    private String loginName;
    private String userAddress;
    private Date createTime;
    private Float cost;
    private String serialNumber;

    public Order(){}
    public Order(Integer id,Integer userId,String loginName,String userAddress,Date createTime,Float cost,String serialNumber ){
        this.id=id;
        this.userId=id;
        this.loginName=loginName;
        this.userAddress=userAddress;
        this.createTime=createTime;
        this.cost=cost;
        this.serialNumber=serialNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

}
