package com.cxp.springbootmybatisplus.controller;


import com.cxp.springbootmybatisplus.entity.TbStudent;
import com.cxp.springbootmybatisplus.service.ITbStudentService;
import com.cxp.springbootmybatisplus.util.JsonResult;
import com.cxp.springbootmybatisplus.util.ResultTool;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cxp
 * @since 2020-11-10
 */
@RestController
@RequestMapping("/tb-student")
public class TbStudentController {

    @Resource
    private ITbStudentService iTbStudentService;

    @RequestMapping("/gettbstudentbyid/{id}")
    public JsonResult getTbStudentById(@PathVariable("id") String id){
        TbStudent student = iTbStudentService.getById(id);
        return ResultTool.success(student);
    }


}

