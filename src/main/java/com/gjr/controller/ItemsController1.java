package com.gjr.controller;

import com.gjr.po.Items;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by geng
 * on 2017/1/28.
 */
public class ItemsController1 implements HttpRequestHandler {

    public void handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
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

        httpServletRequest.setAttribute("itemsList", itemsList);
        httpServletRequest.getRequestDispatcher("WEB-INF/jsp/items/itemsList.jsp")
                .forward(httpServletRequest, httpServletResponse);
    }
}
