package com.newcoder.community.dao;

import com.newcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author feyfey
 * @create 2022/6/30
 * @University JiangHan Univiersity
 */
@Mapper
public interface DiscussPostMapper {
    List<DiscussPost>selectDiscussPosts(int userId,int offset,int limit);
    int selectDiscussPostRows(@Param("userId") int userId);

}
