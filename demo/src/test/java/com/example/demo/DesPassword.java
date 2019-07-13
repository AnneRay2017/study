package com.example.demo;

import com.alibaba.druid.filter.config.ConfigTools;
import com.alibaba.druid.util.DruidPasswordCallback;

public class DesPassword extends DruidPasswordCallback {
    public static void main(String[] args) throws Exception {
        String publickey = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAIAu5DEc/JCrXXEIrtgWuxt//IYKswoz+6OCOJl5B66w05opoKkXZYhNAjzW81Q2zoBOkL+HI1MbnFih7X2DDCsCAwEAAQ==";
        String password = "VK7+Qek1ykU1U6wyPtKx4AUiY5/beSK4KMRIknCX9q2k6jCkAtc5Lc0hpD9QuGG6HAeIBmJoFZ0pWunlFrAgvw==";
        String pwd = ConfigTools.decrypt(publickey, password);

        System.out.println(pwd);
    }
}
