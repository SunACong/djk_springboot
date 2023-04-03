package com.szj.djk.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.AbnormalProcess;
import com.szj.djk.mapper.AbnormalProcessMapper;
import com.szj.djk.service.AbnormalProcessService;
import org.springframework.stereotype.Service;


/**
 * 异常流程显示Service业务层处理
 *
 * @author jiahua
 * @date 2022-11-08
 */
@Service
public class AbnormalProcessServiceImpl extends ServiceImpl<AbnormalProcessMapper, AbnormalProcess>
        implements AbnormalProcessService {

}
