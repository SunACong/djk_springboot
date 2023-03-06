package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.LmdpCastHoldingFurnace;
import com.szj.djk.service.LmdpCastHoldingFurnaceService;
import com.szj.djk.mapper.LmdpCastHoldingFurnaceMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @author JH-Sparrow
* @description 针对表【lmdp_cast_holding_furnace】的数据库操作Service实现
* @createDate 2022-10-18 16:19:08
*/
@Service
@Transactional
public class LmdpCastHoldingFurnaceServiceImpl extends ServiceImpl<LmdpCastHoldingFurnaceMapper, LmdpCastHoldingFurnace>
    implements LmdpCastHoldingFurnaceService{

}




