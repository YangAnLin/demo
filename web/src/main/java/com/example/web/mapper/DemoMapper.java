package com.example.web.mapper;

import com.example.web.entity.AccountsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DemoMapper {


    AccountsInfo callback(@Param("typeId") int typeId, @Param("userId") int userId);
}
