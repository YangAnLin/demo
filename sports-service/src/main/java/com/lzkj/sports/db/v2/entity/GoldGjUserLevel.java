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
 * 玩家金管家等级
 * </p>
 *
 * @author 
 * @since 2020-11-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("GoldGjUserLevel")
public class GoldGjUserLevel extends Model<GoldGjUserLevel> {

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
     * 金管家等级。取自GoldGjLevelReward表LevelID字段值
     */
    @TableField("LevelID")
    private Integer LevelID;

    /**
     * 日俸禄派发状态。0-正常，1-停止
     */
    @TableField("DayStatus")
    private Integer DayStatus;

    /**
     * 周俸禄派发状态。0-正常，1-停止
     */
    @TableField("WeekStatus")
    private Integer WeekStatus;

    /**
     * 月俸禄派发状态。0-正常，1-停止
     */
    @TableField("MonthStatus")
    private Integer MonthStatus;

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
