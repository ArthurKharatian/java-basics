package org.itmo.lesson8;

public class MyCheckedException extends Exception {
    private Integer code;
    public MyCheckedException(String message) {
        super(message);
    }

    public MyCheckedException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "MyCheckedException{" +
                "code=" + code +
                '}';
    }
}
