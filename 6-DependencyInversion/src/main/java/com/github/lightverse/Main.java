package com.github.lightverse;

public class Main {

    public static void main(String[] args) {
      Log easyLog = new CustomLog();
      logSomething(easyLog);
    }


    private static void logSomething(Log easyLog){
        easyLog.logd("打印debug日志");
    }
}
