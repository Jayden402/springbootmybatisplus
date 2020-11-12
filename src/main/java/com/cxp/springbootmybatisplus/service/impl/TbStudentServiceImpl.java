package com.cxp.springbootmybatisplus.service.impl;

import com.cxp.springbootmybatisplus.entity.TbStudent;
import com.cxp.springbootmybatisplus.mapper.TbStudentMapper;
import com.cxp.springbootmybatisplus.service.ITbStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cxp
 * @since 2020-11-10
 */
@Service
public class TbStudentServiceImpl extends ServiceImpl<TbStudentMapper, TbStudent> implements ITbStudentService {

}
