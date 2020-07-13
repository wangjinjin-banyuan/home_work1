package club.banyuan.entity;

import java.util.Date;

public class Bid {
    private Integer b_id;
    private Date datetime;
    private Float b_price;
    private String auctionPersonName;

    public Bid(){}

    public Bid(Integer b_id, Date datetime, Float b_price, String auctionPersonName) {
        this.b_id = b_id;
        this.datetime = datetime;
        this.b_price = b_price;
        this.auctionPersonName = auctionPersonName;
    }

    public Integer getB_id() {
        return b_id;
    }

    public void setB_id(Integer b_id) {
        this.b_id = b_id;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public Float getB_price() {
        return b_price;
    }

    public void setB_price(Float b_price) {
        this.b_price = b_price;
    }

    public String getAuctionPersonName() {
        return auctionPersonName;
    }

    public void setAuctionPersonName(String auctionPersonName) {
        this.auctionPersonName = auctionPersonName;
    }
}
