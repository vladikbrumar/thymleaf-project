package com.someproject.th0403.controller;

import com.someproject.th0403.entity.Goods;
import com.someproject.th0403.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @Autowired
    private GoodsRepository goodsRepository;

    @GetMapping("/main")
    public String getMain() {
        return "main";
    }

    @PostMapping("/addGoods")
    public String addGoods(@RequestParam(value = "goods_name") String goodsName,
                           @RequestParam(value = "goods_price") String goodsPrice,
                           @RequestParam(value = "goods_availability", defaultValue = "false") String goodsAvailability,
                           @RequestParam(value = "goods_sort", defaultValue = "third") String goodsSort) {
        Goods good = new Goods();
        good.setName(goodsName);
        good.setPrice(Float.parseFloat(goodsPrice));
        good.setAvailability(Boolean.parseBoolean(goodsAvailability));
        good.setSort(goodsSort);
        goodsRepository.save(good);
        return "main";
    }

    @PostMapping("/showGoods")
    public String showGoods(Model model) {
        model.addAttribute("goods", goodsRepository.findAll());
        return "main";
    }
}
