package com.test.controller;

import com.test.dao.SkuDao;
import com.test.entity.SkuEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lichao on 2017/9/20.
 */
@Controller
@RequestMapping("/sku")
public class SkuController {

    //映射一个action
    @RequestMapping("/user")
    @ResponseBody
    public List<SkuEntity> getUser() {
        SkuDao dao = new SkuDao();
        //查询stage表的所有数据，返回json
        return dao.query();
    }
}
