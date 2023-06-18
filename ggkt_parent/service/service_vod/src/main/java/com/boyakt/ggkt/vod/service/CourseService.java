package com.boyakt.ggkt.vod.service;

import com.boyakt.ggkt.model.vod.Course;
import com.boyakt.ggkt.vo.vod.CourseFormVo;
import com.boyakt.ggkt.vo.vod.CoursePublishVo;
import com.boyakt.ggkt.vo.vod.CourseQueryVo;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author atguigu
 * @since 2022-04-22
 */
public interface CourseService extends IService<Course> {

    //点播课程列表
    Map<String, Object> findPageCourse(Page<Course> pageParam, CourseQueryVo courseQueryVo);

    /**
     * 插入课程信息表和课程描述信息表
     * @param courseFormVo
     * @return
     */
    Long saveCourseInfo(CourseFormVo courseFormVo);

    //根据id获取课程信息
    CourseFormVo getCourseInfoById(Long id);

    //修改课程信息
    void updateCourseId(CourseFormVo courseFormVo);

    //根据课程id查询发布课程信息
    CoursePublishVo getCoursePublishVo(Long id);

    //课程最终发布
    void publishCourse(Long id);

    //删除课程
    void removeCourseId(Long id);

    //根据课程分类查询课程列表（分页）
    Map<String,Object> findPage(Page<Course> pageParam, CourseQueryVo courseQueryVo);

    //根据课程id查询课程详情
    Map<String, Object> getInfoById(Long courseId);

    //查询所有课程
    List<Course> findlist();
}
