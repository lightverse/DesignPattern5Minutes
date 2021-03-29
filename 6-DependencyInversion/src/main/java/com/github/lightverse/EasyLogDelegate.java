package com.github.lightverse;

@Deprecated
public class EasyLogDelegate implements Log{

    private EasyLog easyLog = new EasyLog();

    @Override
    public void logd(String msg) {
        easyLog.logd(msg);
    }
}
