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
 * 按天统计玩家游戏类型的打码量汇总表
 * </p>
 *
 * @author 
 * @since 2020-11-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("Report_UserGameTypeBetDayDetail")
public class ReportUsergametypebetdaydetail extends Model<ReportUsergametypebetdaydetail> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 打码日期
     */
    @TableField("BetDate")
    private Date BetDate;

    /**
     * 用户标识
     */
    @TableField("UserID")
    private Integer UserID;

    /**
     * 玩家ID
     */
    @TableField("GameID")
    private Integer GameID;

    /**
     * 业主ID
     */
    @TableField("AgentID")
    private Integer AgentID;

    /**
     * 棋牌打码量
     */
    @TableField("ChessBetAmount")
    private BigDecimal ChessBetAmount;

    /**
     * 捕鱼打码量
     */
    @TableField("FishBetAmount")
    private BigDecimal FishBetAmount;

    /**
     * 电子打码量
     */
    @TableField("ElectronBetAmount")
    private BigDecimal ElectronBetAmount;

    /**
     * 真人打码量
     */
    @TableField("VersionBetAmount")
    private BigDecimal VersionBetAmount;

    /**
     * 彩票打码量
     */
    @TableField("LotteryBetAmount")
    private BigDecimal LotteryBetAmount;

    /**
     * 体育打码量
     */
    @TableField("SportBetAmount")
    private BigDecimal SportBetAmount;

    /**
     * 电竞打码量
     */
    @TableField("eSportBetAmount")
    private BigDecimal eSportBetAmount;

    /**
     * 最近更新时间
     */
    @TableField("LastModifyTime")
    private Date LastModifyTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
