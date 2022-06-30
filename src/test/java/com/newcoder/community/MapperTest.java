package com.newcoder.community;

import com.newcoder.community.dao.DiscussPostMapper;
import com.newcoder.community.dao.UserMapper;
import com.newcoder.community.entity.DiscussPost;
import com.newcoder.community.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author feyfey
 * @create 2022/6/30
 * @University JiangHan Univiersity
 */
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
@RunWith(SpringRunner.class)
public class MapperTest {
    @Autowired
    private  DiscussPostMapper discussPostMapper;
    @Autowired
    private UserMapper userMapper;


    @Test
    public void testSelectById()
    {
        User user = userMapper.selectById(101);
        System.out.println(user);
        System.out.println("1213");
    }
    @Test
    public  void test01()
    {
        List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(0, 0, 10);
        for(DiscussPost post:discussPosts)
        {
            System.out.println(post);
        }
    }

}
