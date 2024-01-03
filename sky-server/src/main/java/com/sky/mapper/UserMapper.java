package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    /*
    * 根据openid查询用户
    * @param openid
    * @return
    * */
    @Select("SELECT * FROM user WHERE openid=#{openid}")
    User getByOpenid(String Openid);
    /*
    * 插入数据
    * @param user
    * */
    void insert(User user);
}