package com.gjr.controller;

import com.gjr.po.Items;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by geng
 * on 2017/1/28.
 */

@Controller
public class ItemsController2 {

    // 将方法和url进行映射
    @RequestMapping("/queryItems")
    public ModelAndView queryItems() {
        List<Items> itemsList = new ArrayList<Items>();

        Items items_1 = new Items();
        items_1.setName("联想笔记本");
        items_1.setPrice(6000f);
        items_1.setDetail("ThinkPad T430 联想笔记本电脑！");

        Items items_2 = new Items();
        items_2.setName("苹果手机");
        items_2.setPrice(5000f);
        items_2.setDetail("iphone6苹果手机！");

        itemsList.add(items_1);
        itemsList.add(items_2);

        //返回ModelAndView
        ModelAndView modelAndView = new ModelAndView();
        //相当于request的setAttribute方法,在jsp页面中通过itemsList取数据
        modelAndView.addObject("itemsList", itemsList);

        /**
         * 配置了 视图解析器的前缀，后缀，此处可以省略
         */
        modelAndView.setViewName("items/itemsList");

        return modelAndView;
    }
}
