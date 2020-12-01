package com.lzkj.sports.db.v2.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 金管家定义表
 * </p>
 *
 * @author 
 * @since 2020-11-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("GoldGjConfig")
public class GoldGjConfigEntity extends Model<GoldGjConfigEntity> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 业主ID
     */
    @TableField("AgentID")
    private Integer AgentID;

    /**
     * 金管家名称
     */
    @TableField("GoldGjName")
    private String GoldGjName;

    /**
     * 包含的游戏分类，取自GameTypeItem字段TypeID值，支持多选。譬如：2,3,4代表包含了棋牌、捕鱼、电子
     */
    @TableField("TypeID")
    private String TypeID;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private Date CreateTime;

    /**
     * 修改时间
     */
    @TableField("UpdateTime")
    private Date UpdateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
