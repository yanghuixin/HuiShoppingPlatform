package com.yhx.alipaydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipaySystemOauthTokenRequest;
import com.alipay.api.response.AlipaySystemOauthTokenResponse;

public class MainActivity extends AppCompatActivity {

    /** 支付宝支付业务：入参APP_ID */
    public static final String APP_ID = "2015122401037921";

    /** 支付宝账户登录授权业务：入参APP_PRIVATE_KEY */
    public static final String APP_PRIVATE_KEY = "MIIEpAIBAAKCAQEAxhIspu4Z/bjWj3m8uazv+bSan8URCMBfjKTO/O+BUwQx468AVj3cSl5bEXV+NHFWZhzmQkHZaO0hrD58653JW+rYVjKc+FjppOh4XPyVxQ/koVrsIv5+uOm2q0ok2bAYWT5ODh2F5jAt66EM/sXw3wfKT65zcoKi1s4H84bwZEoBjB45RvM1whHTcrTnLB0iI/IfiwNxzgxX5QCa0NLVjjUNlq6ezNS1if3syYX2fJbOaZNClmFE5ukhY2k5uI54oZhvTrhvrIK5NWFR5PLaukD0HQt2tbaGWw6qQtq9A9w79asuNN+MPUIAvWgmfxFuRaB1WRJLEkeGNdwXdC022wIDAQABAoIBAQCE0GECmjvxZwTwdhf3hR/xF4prQbA3Zw9q9oQZFNxp9zEg1BLswVQ6xeRY46j5r1nY5N39ZbxL4F4o6knHkCkaKnJf8lZRLQWWX49+ApzG4+5Rx+75VB9TDNxBJVlqYusgxGeAjYlgncPc8UQOfloSo12kanzdNv3L/aFVSZFeHRWRsOOaR8UXOyFWYqMZA0JnqKqI7tvEzNCErl6hH5l5xGqFvn0Qd1STAsNaU0LqXfjNTH/c4vSUKuToC09zm/ui/TJIu5GCx6mM5gT69ocn/ihitg5xbdTubN00tmJlYbZNpyZF1vDNFHfaXVMdUDvFwcgKdsbvtKxqf4dnhqa5AoGBAP4tcipIecXvo+SqL4WjJ/EzPZ5XbftEUaZci9/6rTpkVHQupCh0U33Xzn3ieVDsY/1rBwJ09SrYKk+pvOd6YAD9oTHhtolznAzMv1Yh7bQxQ+UxqA2zsSX9Q52pt+Nd7qmI5PN3H4jLOypnpZs0lLQjQker19bl6k1dN9CpNRWfAoGBAMd9vhG2quMSrVtp3PtD45WNZGXKCSoQNOpqcZ+AJO1G9WxwUB5UPPvR5ykPf3KfK6xiso1PU/bUjtKj5vCkv3ev8CYVZi1rR1bbyAe+sFe9YYKnnL/T6S3YsbRrrTXL9L03dQFlOZ3EhP/siJbwLEtectA6noVy5TMGju6/GL1FAoGAZjEFXoSnGPKhNTVLR/JyA6KzWm8SU9yC61z4C8QwU3K1FcUO0Qj77HOQnMIqPmPcS631MoKtc11XnZHD1lk4Mg3G+lQiXJ7zlZ3YK5wWgsTv5D0TsPaW+Ywa3E+5FBvW8aiNTGmPbyMulXz4cy8vvkESy9gGPmtPyWz6HNV690cCgYEAhRZkWVjuRLNPKC9GF/NAv6Mmmanh10gcpU8CIpDREeNHFGMRcEpurOlqOEB4nDWIY2ctC40izQcdiXWDOoQOoIClzCJ2mlJ5s37IwjH7X22ewhWkQ23SoJ1yYJV9Zuh8jEeVLaskdxaGTF62+UudoWKPYk/ZNdpjAlmbvbeLf6kCgYB/dizBIKt1AhqnbtpRUaJ19gconEz0loJ7hNSxZtHNigyhWMv1R06Iy0CM/SfMsUbCtOQHPm2jMxj2XVWK7X6IjYNincwFg3wLFx5cH+5FXBYfudDmRoTaHOrxJLaAbp+gyO8XYrwT8jWazbFgktj6Kn7RDCtCiZWmOwwzz7/usQ==";

    /** 支付宝账户登录授权业务：入参CHARSET */
    public static final String CHARSET = "UTF-8";

    /** 支付宝账户登录授权业务：入参ALIPAY_PUBLIC_KEY */
    public static final String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxhIspu4Z/bjWj3m8uazv+bSan8URCMBfjKTO/O+BUwQx468AVj3cSl5bEXV+NHFWZhzmQkHZaO0hrD58653JW+rYVjKc+FjppOh4XPyVxQ/koVrsIv5+uOm2q0ok2bAYWT5ODh2F5jAt66EM/sXw3wfKT65zcoKi1s4H84bwZEoBjB45RvM1whHTcrTnLB0iI/IfiwNxzgxX5QCa0NLVjjUNlq6ezNS1if3syYX2fJbOaZNClmFE5ukhY2k5uI54oZhvTrhvrIK5NWFR5PLaukD0HQt2tbaGWw6qQtq9A9w79asuNN+MPUIAvWgmfxFuRaB1WRJLEkeGNdwXdC022wIDAQAB";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alipayLogin(View view) throws AlipayApiException {
        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", APP_ID, APP_PRIVATE_KEY, "json", CHARSET, ALIPAY_PUBLIC_KEY, "RSA2");  //获得初始化的AlipayClient
        AlipaySystemOauthTokenRequest request = new AlipaySystemOauthTokenRequest();//创建API对应的request类
        request.setGrantType("authorization_code");
        request.setCode("4b203fe6c11548bcabd8da5bb087a83b");
        AlipaySystemOauthTokenResponse response = alipayClient.execute(request);//通过alipayClient调用API，获得对应的response类
        System.out.print(response.getBody());
    }
}