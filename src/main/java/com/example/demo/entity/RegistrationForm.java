package com.example.demo.entity;

import jakarta.validation.constraints.NotEmpty;

public class RegistrationForm {
    @NotEmpty(message = "名前を入力してください")
    private String name;

    @NotEmpty(message = "住所を入力してください")
    private String address;

    @NotEmpty(message = "電話番号を入力してください")
    private String tel;

    @NotEmpty(message = "メールアドレスを入力してください")
    private String email;

    @NotEmpty(message = "パスワードを入力してください")
    private String password;

    // GetterとSetterを省略
}
