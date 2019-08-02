package com.gjing.common.core;

/**
 * @author Gjing
 **/
class DefaultService implements BaseService {
    @Override
    public void say() {
        System.out.println("默认方法say（）执行了");
    }

    @Override
    public String ok() {
        return "默认方法ok（）执行了";
    }
}
