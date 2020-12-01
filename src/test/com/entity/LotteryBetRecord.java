package com.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author anthony
 * @since 2020-10-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("lottery_bet_record")
@ApiModel(value="LotteryBetRecord对象", description="")
public class LotteryBetRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Integer id;

    @ApiModelProperty(value = "下注号码")
    @TableField("balls")
    private String balls;

    @ApiModelProperty(value = "游戏ID")
    @TableField("gameid")
    private Integer gameid;

    @ApiModelProperty(value = "0=正常投注,1=聊天室投注,2=跟单")
    @TableField("is_jd")
    private Integer isJd;

    @ApiModelProperty(value = "0: 继续追号  1：中奖停追")
    @TableField("is_run_stop")
    private Integer isRunStop;

    @ApiModelProperty(value = "奖金")
    @TableField("jiangjin")
    private BigDecimal jiangjin;

    @ApiModelProperty(value = "结算时间")
    @TableField("js_time")
    private Date jsTime;

    @ApiModelProperty(value = "开奖号码")
    @TableField("kj_balls")
    private String kjBalls;

    @ApiModelProperty(value = "赔率")
    @TableField("peilv")
    private String peilv;

    @ApiModelProperty(value = "每注底注")
    @TableField("per_price")
    private BigDecimal perPrice;

    @ApiModelProperty(value = "期数")
    @TableField("qishu")
    private String qishu;

    @ApiModelProperty(value = "0=未开奖 1=开奖中 2=已开奖")
    @TableField("status")
    private String status;

    @ApiModelProperty(value = "投注时间")
    @TableField("tz_time")
    private Date tzTime;

    @ApiModelProperty(value = "玩家昵称")
    @TableField("username")
    private String username;

    @ApiModelProperty(value = "玩法")
    @TableField("wanfa")
    private String wanfa;

    @ApiModelProperty(value = "中奖金额")
    @TableField("win")
    private String win;

    @ApiModelProperty(value = "详情")
    @TableField("xiangqing")
    private String xiangqing;

    @ApiModelProperty(value = "注单号")
    @TableField("zhudan")
    private String zhudan;

    @ApiModelProperty(value = "追号id")
    @TableField("zhudan_id")
    private Integer zhudanId;

    @ApiModelProperty(value = "注数")
    @TableField("zhushu")
    private String zhushu;


}
