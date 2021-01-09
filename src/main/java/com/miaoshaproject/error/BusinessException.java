package com.miaoshaproject.error;

//包装器业务异常类实现
public class BusinessException extends Exception implements CommonError{

    private CommonError commonError;

    //直接接收EmBuinessError的传参用户构造业务异常
    public BusinessException(CommonError commonError){
        super();
        this.commonError = commonError;
    }

    //通过自定义的方法构造业务异常
    public BusinessException(CommonError commonError,String errmsg){
        super();
        this.commonError = commonError;
        this.commonError.setErrMsg(errmsg);
    }

    @Override
    public int getErrCode() {
        return this.commonError.getErrCode();
    }

    @Override
    public String getErrMsg() {
        return this.commonError.getErrMsg();
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.commonError.setErrMsg(errMsg);
        return this;
    }
}
