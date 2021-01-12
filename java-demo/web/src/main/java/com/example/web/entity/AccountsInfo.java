package com.example.web.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("RYAccountsDB.AccountsInfo")
public class AccountsInfo extends Model<AccountsInfo>{


    private static final long serialVersionUID = 1L;

    /**
     * 用户标识
     */
    @TableId(value = "UserID", type = IdType.AUTO)
    private Integer userId;

    /**
     * 游戏标识
     */
    @TableField("GameID")
    private Integer gameId;

    /**
     * 密保标识
     */
    @TableField("ProtectID")
    private Integer protectId;

    /**
     * 口令索引
     */
    @TableField("PasswordID")
    private Integer passwordId;

    /**
     * 推广员标识
     */
    @TableField("SpreaderID")
    private Integer spreaderId;

    /**
     * 用户帐号
     */
    @TableField("Accounts")
    private String accounts;

    /**
     * 用户昵称
     */
    @TableField("NickName")
    private String nickName;

    /**
     * 注册帐号
     */
    @TableField("RegAccounts")
    private String regAccounts;

    /**
     * 个性签名
     */
    @TableField("UnderWrite")
    private String underWrite;

    /**
     * 身份证号
     */
    @TableField("PassPortID")
    private String passPortId;

    /**
     * 真实名字
     */
    @TableField("Compellation")
    private String compellation;

    /**
     * 登录密码
     */
    @TableField("LogonPass")
    private String logonPass;

    /**
     * 安全密码
     */
    @TableField("InsurePass")
    private String insurePass;

    /**
     * 动态密码
     */
    @TableField("DynamicPass")
    private String dynamicPass;

    /**
     * 动态密码更新时间
     */
    @TableField("DynamicPassTime")
    private Date dynamicPassTime;

    /**
     * 头像标识
     */
    @TableField("FaceID")
    private Integer faceId;

    /**
     * 自定标识
     */
    @TableField("CustomID")
    private Integer customId;

    /**
     * 赠送礼物
     */
    @TableField("Present")
    private Integer present;

    /**
     * 用户奖牌
     */
    @TableField("UserMedal")
    private Integer userMedal;

    /**
     * 经验数值
     */
    @TableField("Experience")
    private Integer experience;

    @TableField("GrowLevelID")
    private Integer growLevelId;

    /**
     * 用户魅力
     */
    @TableField("LoveLiness")
    private Integer loveLiness;

    /**
     * 用户权限
     */
    @TableField("UserRight")
    private Integer userRight;

    /**
     * 管理权限
     */
    @TableField("MasterRight")
    private Integer masterRight;

    /**
     * 服务权限
     */
    @TableField("ServiceRight")
    private Integer serviceRight;

    /**
     * 管理等级
     */
    @TableField("MasterOrder")
    private Integer masterOrder;

    /**
     * 会员等级
     */
    @TableField("MemberOrder")
    private Integer memberOrder;

    /**
     * 过期日期
     */
    @TableField("MemberOverDate")
    private Date memberOverDate;

    /**
     * 切换时间
     */
    @TableField("MemberSwitchDate")
    private Date memberSwitchDate;

    /**
     * 头像版本
     */
    @TableField("CustomFaceVer")
    private Integer customFaceVer;

    /**
     * 用户性别
     */
    @TableField("Gender")
    private Integer gender;

    /**
     * 禁止服务
     */
    @TableField("Nullity")
    private Integer nullity;

    /**
     * 禁止时间
     */
    @TableField("NullityOverDate")
    private Date nullityOverDate;

    /**
     * 关闭标志
     */
    @TableField("StunDown")
    private Integer stunDown;

    /**
     * 固定机器
     */
    @TableField("MoorMachine")
    private Integer moorMachine;

    /**
     * 是否机器人 数据库默认为0
     */
    @TableField("IsAndroid")
    private Integer isAndroid;

    /**
     * 登录次数
     */
    @TableField("WebLogonTimes")
    private Integer webLogonTimes;

    /**
     * 登录次数
     */
    @TableField("GameLogonTimes")
    private Integer gameLogonTimes;

    /**
     * 游戏时间
     */
    @TableField("PlayTimeCount")
    private Integer playTimeCount;

    /**
     * 在线时间
     */
    @TableField("OnLineTimeCount")
    private Integer onLineTimeCount;

    /**
     * 登录地址
     */
    @TableField("LastLogonIP")
    private String lastLogonIp;

    /**
     * 登录时间
     */
    @TableField("LastLogonDate")
    private Date lastLogonDate;

    /**
     * 登录手机
     */
    @TableField("LastLogonMobile")
    private String lastLogonMobile;

    /**
     * 登录机器
     */
    @TableField("LastLogonMachine")
    private String lastLogonMachine;

    /**
     * 注册地址
     */
    @TableField("RegisterIP")
    private String registerIp;

    /**
     * 注册时间
     */
    @TableField("RegisterDate")
    private Date registerDate;

    /**
     * 注册手机
     */
    @TableField("RegisterMobile")
    private String registerMobile;

    /**
     * 注册机器
     */
    @TableField("RegisterMachine")
    private String registerMachine;

    /**
     * PC       0x00     ,
     ANDROID  0x10(cocos 0x11,u3d 0x12)     ,16
     ITOUCH   0x20     ,
     IPHONE   0x30(cocos 0x31,u3d 0x32)     ,48
     IPAD     0x40(cocos 0x41,u3d 0x42)     ,
     WEB      0x50                           80
     */
    @TableField("RegisterOrigin")
    private Integer registerOrigin;

    /**
     * =2 表示是游客
     */
    @TableField("PlatformID")
    private Integer platformId;

    @TableField("UserUin")
    private String userUin;

    @TableField("RankID")
    private Integer rankId;

    @TableField("AgentID")
    private Integer agentId;

    /**
     * T_Acc_Agent.AgentID 677这套代理
     */
    @TableField("ParentID")
    private Integer parentId;

    /**
     * 变色用
     */
    @TableField("UserType")
    private Integer userType;

    /**
     * 试玩任务ID
     */
    @TableField("Advertiser")
    private String advertiser;

    @TableField("LastLogonIPAddress")
    private String lastLogonIpAddress;

    /**
     * 试玩平台名
     */
    @TableField("AdvertPlat")
    private String advertPlat;

    @TableField("Qm_SpreaderID")
    private Integer qmSpreaderId;

    @TableField("Zz_Qm_Ratio")
    private BigDecimal zzQmRatio;

    @TableField("Zz_IsAgent")
    private Integer zzIsAgent;

    @TableField("H5AgentId")
    private Integer h5AgentId;

    @TableField("H5SiteCode")
    private String h5SiteCode;

    @TableField("H5Account")
    private String h5Account;

    @TableField("Device")
    private Integer device;

    @TableField("FirstRechargeDate")
    private Date firstRechargeDate;

    @TableField("TotalAgentID")
    private Integer totalAgentId;

    @TableField("PhoneType")
    private String phoneType;

    @TableField("LoginArea")
    private String loginArea;

    @TableField("ChannelAccount")
    private String channelAccount;

    @TableField("ChannelPassword")
    private String channelPassword;

    /**
     * 是否为默认代理
     */
    @TableField("IsDefaultAgent")
    private Integer isDefaultAgent;

    /**
     * QQ号
     */
    @TableField("Qq")
    private String qq;

    /**
     * Email地址
     */
    @TableField("Email")
    private String email;

    /**
     * 备注
     */
    @TableField("Remark")
    private String remark;

    /**
     * 负盈利方案ID
     */
    @TableField("ProgramID")
    private String programId;

    /**
     * 负盈利方案名称
     */
    @TableField("ProgramName")
    private String programName;


}
