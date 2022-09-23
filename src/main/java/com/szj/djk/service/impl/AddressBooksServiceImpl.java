package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.AddressBook;
import com.szj.djk.mapper.AddressBooksMapper;
import com.szj.djk.service.AddressBooksService;
import org.springframework.stereotype.Service;

/**
 * @ClassName AddressBooksServiceImpl
 * @Authoc 孙少聪
 * @Date 2022/9/23 20:46:25
 */

@Service
public class AddressBooksServiceImpl extends ServiceImpl<AddressBooksMapper, AddressBook> implements AddressBooksService {
}
