package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.LmdpQcPack;
import com.szj.djk.service.LmdpQcPackService;
import com.szj.djk.mapper.LmdpQcPackMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @author JH-Sparrow
* @description 针对表【lmdp_qc_pack】的数据库操作Service实现
* @createDate 2022-10-18 16:19:09
*/
@Service
@Transactional
public class LmdpQcPackServiceImpl extends ServiceImpl<LmdpQcPackMapper, LmdpQcPack>
    implements LmdpQcPackService{

}




