package org.itmo.lesson13;

import java.math.BigDecimal;

public class PromoCode {
    private String code;
    private Boolean isExpired;
    private BigDecimal amount;

    public PromoCode(String code, Boolean isExpired, BigDecimal amount) {
        this.code = code;
        this.isExpired = isExpired;
        this.amount = amount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getExpired() {
        return isExpired;
    }

    public void setExpired(Boolean expired) {
        isExpired = expired;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PromoCode{" +
                "code='" + code + '\'' +
                ", isExpired=" + isExpired +
                ", amount=" + amount +
                '}';
    }
}
