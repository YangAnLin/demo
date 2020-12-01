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
 * 金管家等级与奖励定义表
 * </p>
 *
 * @author 
 * @since 2020-11-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("GoldGjLevelReward")
public class GoldGjLevelReward extends Model<GoldGjLevelReward> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 金管家标识。取自表GoldGjConfig的ID字段值
     */
    @TableField("GoldGjID")
    private Integer GoldGjID;

    /**
     * 升级条件（1-打码，2-充值，3-充值+打码）
     */
    @TableField("UpgradeTj")
    private Integer UpgradeTj;

    /**
     * 金管家等级
     */
    @TableField("LevelID")
    private Integer LevelID;

    /**
     * 晋级所需充值金额
     */
    @TableField("NeedCharge")
    private BigDecimal NeedCharge;

    /**
     * 晋级所需打码量
     */
    @TableField("NeedBetAmount")
    private BigDecimal NeedBetAmount;

    /**
     * 奖励类型（1-日俸禄，2-周俸禄，3-月俸禄，4-晋级奖励）。譬如字段值为：1,2,3，则表示该等级有对应的三种奖励类型。
     */
    @TableField("RewardType")
    private String RewardType;

    /**
     * 日俸禄
     */
    @TableField("DayReward")
    private BigDecimal DayReward;

    /**
     * 月俸禄
     */
    @TableField("MonthReward")
    private BigDecimal MonthReward;

    /**
     * 周俸禄
     */
    @TableField("WeekReward")
    private BigDecimal WeekReward;

    /**
     * 晋级奖励
     */
    @TableField("UpgradeReward")
    private BigDecimal UpgradeReward;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private Date CreateTime;

    /**
     * 最近更新时间
     */
    @TableField("UpdateTime")
    private Date UpdateTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
