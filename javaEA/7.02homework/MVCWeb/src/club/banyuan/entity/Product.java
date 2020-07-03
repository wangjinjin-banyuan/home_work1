package club.banyuan.entity;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

public class Product {

  private Integer ID;
  private String NAME;
  private String DESCRIPTION;
  private Float PRICE;
  private Integer STOCK;
  private Integer CATEGORYLEVEL1ID;
  private Integer CATEGORYLEVEL2ID;
  private Integer CATEGORYLEVEL3ID;
  private String FILENAME;
  private Integer ISDELETE;
  private Integer quantity;

  public Product(String NAME, String DESCRIPTION, Float PRICE, Integer STOCK,
                 Integer quantity) {
    this.NAME = NAME;
    this.DESCRIPTION = DESCRIPTION;
    this.PRICE = PRICE;
    this.STOCK = STOCK;
    this.quantity = quantity;
  }

  public Product() {
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Integer getID() {
    return ID;
  }

  public void setID(Integer ID) {
    this.ID = ID;
  }

  public String getNAME() {
    return NAME;
  }

  public void setNAME(String NAME) {
    this.NAME = NAME;
  }

  public String getDESCRIPTION() {
    return DESCRIPTION;
  }

  public void setDESCRIPTION(String DESCRIPTION) {
    this.DESCRIPTION = DESCRIPTION;
  }

  public Float getPRICE() {
    return PRICE;
  }

  public void setPRICE(Float PRICE) {
    this.PRICE = PRICE;
  }

  public Integer getSTOCK() {
    return STOCK;
  }

  public void setSTOCK(Integer STOCK) {
    this.STOCK = STOCK;
  }

  public Integer getCATEGORYLEVEL1ID() {
    return CATEGORYLEVEL1ID;
  }

  public void setCATEGORYLEVEL1ID(Integer CATEGORYLEVEL1ID) {
    this.CATEGORYLEVEL1ID = CATEGORYLEVEL1ID;
  }

  public Integer getCATEGORYLEVEL2ID() {
    return CATEGORYLEVEL2ID;
  }

  public void setCATEGORYLEVEL2ID(Integer CATEGORYLEVEL2ID) {
    this.CATEGORYLEVEL2ID = CATEGORYLEVEL2ID;
  }

  public Integer getCATEGORYLEVEL3ID() {
    return CATEGORYLEVEL3ID;
  }

  public void setCATEGORYLEVEL3ID(Integer CATEGORYLEVEL3ID) {
    this.CATEGORYLEVEL3ID = CATEGORYLEVEL3ID;
  }

  public String getFILENAME() {
    return FILENAME;
  }

  public void setFILENAME(String FILENAME) {
    this.FILENAME = FILENAME;
  }

  public Integer getISDELETE() {
    return ISDELETE;
  }

  public void setISDELETE(Integer ISDELETE) {
    this.ISDELETE = ISDELETE;
  }



}
