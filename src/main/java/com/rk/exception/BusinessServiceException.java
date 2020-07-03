package com.rk.exception;


/**
 * 自定义异常
 */
public class BusinessServiceException extends RuntimeException{
   private int code;
   private String message;

   public BusinessServiceException(int code, String message){
       this.code=code;
       this.message=message;
   }
    public BusinessServiceException(String message) {
        this.code = 20000;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
