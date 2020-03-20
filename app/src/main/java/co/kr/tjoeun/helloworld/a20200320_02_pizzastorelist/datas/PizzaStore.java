package co.kr.tjoeun.helloworld.a20200320_02_pizzastorelist.datas;

import java.io.Serializable;

public class PizzaStore implements Serializable {

    private String storeName;
    private String logoUrl;
    private String phoneNum;

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public PizzaStore(String storeName, String logoUrl, String phoneNum) {
        this.storeName = storeName;
        this.logoUrl = logoUrl;
        this.phoneNum = phoneNum;
    }
}
