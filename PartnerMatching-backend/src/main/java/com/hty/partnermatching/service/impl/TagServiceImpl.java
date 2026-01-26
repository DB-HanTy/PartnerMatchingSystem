package com.hty.partnermatching.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hty.partnermatching.model.domain.Tag;
import com.hty.partnermatching.service.TagService;
import com.hty.partnermatching.mapper.TagMapper;
import org.springframework.stereotype.Service;

/**
* @author 33038
* @description 针对表【tag(标签表)】的数据库操作Service实现
* @createDate 2026-01-18 12:31:10
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService{

}




