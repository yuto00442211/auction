package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.RegistrationForm;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/sell")
public class SellController {

    @Autowired
  //  private GoodsService goodsService; // 商品情報の登録処理を行うサービスクラスをインジェクション

    @GetMapping("/sell")
    public String showSellPage() {
        return "sell"; // 出品ページのテンプレート名
    }


    @PostMapping("creat")
    public String sellItem() {
        // goodsFormの内容を使ってデータベースに出品情報を登録する処理を呼び出す
       // goodsService.registerGoods(goodsForm);
        return "exhibit"; // 出品完了後、トップページにリダイレクト
    }
    @PostMapping("sub")
    public String menber() {
        // goodsFormの内容を使ってデータベースに出品情報を登録する処理を呼び出す
       // goodsService.registerGoods(goodsForm);
        return "menber"; // 出品完了後、トップページにリダイレクト
    }
    @PostMapping("product")
    public String product() {
        // goodsFormの内容を使ってデータベースに出品情報を登録する処理を呼び出す
       // goodsService.registerGoods(goodsForm);
        return "item"; // 出品完了後、トップページにリダイレクト
    }
    @PostMapping("login")
    public String login() {
        // goodsFormの内容を使ってデータベースに出品情報を登録する処理を呼び出す
       // goodsService.registerGoods(goodsForm);
        return "login"; // 出品完了後、トップページにリダイレクト
    }
    
    @PostMapping("/register")
    public String register(@RequestBody @Valid RegistrationForm registrationForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // バリデーションエラーがある場合の処理
            return "バリデーションエラーが発生しました。";
        }

        // バリデーションが成功した場合の処理
        // 登録処理などを行う
        return "登録が完了しました。";
    }
}