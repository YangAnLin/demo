package com.lzkj.sports.db.v2.entity;

import java.math.BigDecimal;
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
 * 按派发期数汇总派彩状况的汇总表
 * </p>
 *
 * @author 
 * @since 2020-11-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("GoldGjUserReward")
public class GoldGjUserReward extends Model<GoldGjUserReward> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 派发期数（如：2020-11-01期）
     */
    @TableField("SendPeriod")
    private String SendPeriod;

    /**
     * 开始日期
     */
    @TableField("StartDate")
    private Date StartDate;

    /**
     * 结束日期
     */
    @TableField("EndDate")
    private Date EndDate;

    /**
     * 奖励类型（1-日俸禄，2-周俸禄，3-月俸禄，4-晋级奖励）
     */
    @TableField("RewardType")
    private Integer RewardType;

    /**
     * 派彩总玩家数
     */
    @TableField("UserCount")
    private Integer UserCount;

    /**
     * 正常派彩玩家总数
     */
    @TableField("NormalUserCount")
    private Integer NormalUserCount;

    /**
     * 拒绝派彩玩家总数
     */
    @TableField("RefuseUserCount")
    private Integer RefuseUserCount;

    /**
     * 派彩总金额
     */
    @TableField("UserAmount")
    private BigDecimal UserAmount;

    /**
     * 正常派彩总金额
     */
    @TableField("NormalUserAmount")
    private BigDecimal NormalUserAmount;

    /**
     * 拒绝派彩总金额
     */
    @TableField("RefuseUserAmount")
    private BigDecimal RefuseUserAmount;

    /**
     * 派彩状态。0-未派发，1-拒绝派发，2-已经派发
     */
    @TableField("RewardStatus")
    private Integer RewardStatus;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private Date CreateTime;

    /**
     * 派彩状态更新时间
     */
    @TableField("RewardTime")
    private Date RewardTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
