package com.example.demo.mapper;

import com.example.demo.entity.AccountsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DemoMapper {


    AccountsInfo callback(@Param("typeId") int typeId,@Param("userId") int userId);
}
