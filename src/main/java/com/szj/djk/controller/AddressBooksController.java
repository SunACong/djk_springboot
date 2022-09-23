package com.szj.djk.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.szj.djk.common.R;
import com.szj.djk.entity.AddressBook;
import com.szj.djk.service.AddressBooksService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName AddressBooksController
 * @Authoc 孙少聪
 * @Date 2022/9/23 20:49:39
 */

@Slf4j
@RestController
@RequestMapping("/addressBooks")
public class AddressBooksController {

    @Autowired
    private AddressBooksService addressBooksService;

    @GetMapping("list")
    public R<List<AddressBook>> list(){
        LambdaQueryWrapper<AddressBook> queryWrapper = new LambdaQueryWrapper<>();
        List<AddressBook> list = addressBooksService.list(queryWrapper);
        return R.success(list);
    }
}
