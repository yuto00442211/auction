package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}