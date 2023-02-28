package com.szj.djk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.LmdpColdFurnaceRecord;
import com.szj.djk.service.LmdpColdFurnaceRecordService;
import com.szj.djk.mapper.LmdpColdFurnaceRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
* @author JH-Sparrow
* @description 针对表【lmdp_cold_furnace_record】的数据库操作Service实现
* @createDate 2022-10-18 16:19:08
*/
@Service
@Transactional
public class LmdpColdFurnaceRecordServiceImpl extends ServiceImpl<LmdpColdFurnaceRecordMapper, LmdpColdFurnaceRecord>    implements LmdpColdFurnaceRecordService{

    @Autowired
    private LmdpColdFurnaceRecordMapper lmdpColdFurnaceRecordMapper;

    /**
     * 查询铸轧生产时间
     * @return
     */
    @Override
    public List<Map<String, Object>> selectLenzhaTimeList(){ return lmdpColdFurnaceRecordMapper.selectLenzhaTimeList();   }
}




