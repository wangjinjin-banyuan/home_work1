package club.banyuan.entity;

import java.util.Date;

public class Product {

  private Integer p_id;
  private String p_name;
  private String p_describle;
  private Date p_startTime;
  private Date p_endTime;
  private Float startingPrice;
  private Float floorPrice;

  public Product() {
  }

  public Product(Integer p_id, String p_name, String p_describle, Date p_startTime,
      Date p_endTime, Float startingPrice, Float floorPrice) {
    this.p_id = p_id;
    this.p_name = p_name;
    this.p_describle = p_describle;
    this.p_startTime = p_startTime;
    this.p_endTime = p_endTime;
    this.startingPrice = startingPrice;
    this.floorPrice = floorPrice;
  }

  public Integer getP_id() {
    return p_id;
  }

  public void setP_id(Integer p_id) {
    this.p_id = p_id;
  }

  public String getP_name() {
    return p_name;
  }

  public void setP_name(String p_name) {
    this.p_name = p_name;
  }

  public String getP_describle() {
    return p_describle;
  }

  public void setP_describle(String p_describle) {
    this.p_describle = p_describle;
  }

  public Date getP_startTime() {
    return p_startTime;
  }

  public void setP_startTime(Date p_startTime) {
    this.p_startTime = p_startTime;
  }

  public Date getP_endTime() {
    return p_endTime;
  }

  public void setP_endTime(Date p_endTime) {
    this.p_endTime = p_endTime;
  }

  public Float getStartingPrice() {
    return startingPrice;
  }

  public void setStartingPrice(Float startingPrice) {
    this.startingPrice = startingPrice;
  }

  public Float getFloorPrice() {
    return floorPrice;
  }

  public void setFloorPrice(Float floorPrice) {
    this.floorPrice = floorPrice;
  }


}
