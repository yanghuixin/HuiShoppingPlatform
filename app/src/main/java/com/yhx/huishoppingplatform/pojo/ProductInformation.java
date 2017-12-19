package com.yhx.huishoppingplatform.pojo;

/**
 * Created by Administrator on 2017/12/19.
 */

public class ProductInformation {

    //产品编号
    private int pid;
    //产品名称
    private String pname;
    //产品主图url地址
    private String picurl;
    //商城价格
    private float shopprice;
    //商品被浏览的次数
    private int iviews;
    //已被购买的数量
    private int ibuys;
    //该产品一天可购买的最大数，为0时不限购
    private int buymax;
    //购买该产品可使用的积分数量(若值为0，则不可使用积分/红包，若不为0，则可以使用当前积分/红包)
    private int usintegral;
    //库存数量
    private int istock;
    //产品编码
    private String pno;
    //所属商家的编号
    private int ibid;
    //产品评论数
    private int icommentcnt;
    //商品评分（平均分）1-5分
    private int iscore;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public float getShopprice() {
        return shopprice;
    }

    public void setShopprice(float shopprice) {
        this.shopprice = shopprice;
    }

    public int getIviews() {
        return iviews;
    }

    public void setIviews(int iviews) {
        this.iviews = iviews;
    }

    public int getIbuys() {
        return ibuys;
    }

    public void setIbuys(int ibuys) {
        this.ibuys = ibuys;
    }

    public int getBuymax() {
        return buymax;
    }

    public void setBuymax(int buymax) {
        this.buymax = buymax;
    }

    public int getUsintegral() {
        return usintegral;
    }

    public void setUsintegral(int usintegral) {
        this.usintegral = usintegral;
    }

    public int getIstock() {
        return istock;
    }

    public void setIstock(int istock) {
        this.istock = istock;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public int getIbid() {
        return ibid;
    }

    public void setIbid(int ibid) {
        this.ibid = ibid;
    }

    public int getIcommentcnt() {
        return icommentcnt;
    }

    public void setIcommentcnt(int icommentcnt) {
        this.icommentcnt = icommentcnt;
    }

    public int getIscore() {
        return iscore;
    }

    public void setIscore(int iscore) {
        this.iscore = iscore;
    }
}
