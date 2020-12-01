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
 * 玩家金管家等级派奖记录
 * </p>
 *
 * @author 
 * @since 2020-11-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("GoldGjUserRewardDetail")
public class GoldGjUserRewardDetail extends Model<GoldGjUserRewardDetail> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户标识
     */
    @TableField("UserID")
    private Integer UserID;

    /**
     * 玩家标识
     */
    @TableField("GameID")
    private Integer GameID;

    /**
     * 金管家标识。取自表GoldGjConfig的ID字段值
     */
    @TableField("GoldGjID")
    private Integer GoldGjID;

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
     * 奖励金额
     */
    @TableField("RewardAmount")
    private BigDecimal RewardAmount;

    /**
     * 派发状态。0-未派发，1-拒绝派发，2-已经派发
     */
    @TableField("RewardStatus")
    private Integer RewardStatus;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private Date CreateTime;

    /**
     * 派发状态更新时间
     */
    @TableField("RewardTime")
    private Date RewardTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
