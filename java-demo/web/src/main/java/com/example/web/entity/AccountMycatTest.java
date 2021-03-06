package com.example.web.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("RYAccountsDB.Account_Mycat_test")
public class AccountMycatTest {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("TestName")
    private String testNname;
}
