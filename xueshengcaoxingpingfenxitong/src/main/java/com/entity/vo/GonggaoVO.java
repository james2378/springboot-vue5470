package com.entity.vo;

import com.entity.GonggaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 公告
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gonggao")
public class GonggaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 老师
     */

    @TableField(value = "laoshi_id")
    private Integer laoshiId;


    /**
     * 班级
     */

    @TableField(value = "banji_types")
    private Integer banjiTypes;


    /**
     * 公告名称
     */

    @TableField(value = "gonggao_name")
    private String gonggaoName;


    /**
     * 公告类型
     */

    @TableField(value = "gonggao_types")
    private Integer gonggaoTypes;


    /**
     * 公告发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 公告内容
     */

    @TableField(value = "gonggao_content")
    private String gonggaoContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：老师
	 */
    public Integer getLaoshiId() {
        return laoshiId;
    }


    /**
	 * 获取：老师
	 */

    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }
    /**
	 * 设置：班级
	 */
    public Integer getBanjiTypes() {
        return banjiTypes;
    }


    /**
	 * 获取：班级
	 */

    public void setBanjiTypes(Integer banjiTypes) {
        this.banjiTypes = banjiTypes;
    }
    /**
	 * 设置：公告名称
	 */
    public String getGonggaoName() {
        return gonggaoName;
    }


    /**
	 * 获取：公告名称
	 */

    public void setGonggaoName(String gonggaoName) {
        this.gonggaoName = gonggaoName;
    }
    /**
	 * 设置：公告类型
	 */
    public Integer getGonggaoTypes() {
        return gonggaoTypes;
    }


    /**
	 * 获取：公告类型
	 */

    public void setGonggaoTypes(Integer gonggaoTypes) {
        this.gonggaoTypes = gonggaoTypes;
    }
    /**
	 * 设置：公告发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：公告发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：公告内容
	 */
    public String getGonggaoContent() {
        return gonggaoContent;
    }


    /**
	 * 获取：公告内容
	 */

    public void setGonggaoContent(String gonggaoContent) {
        this.gonggaoContent = gonggaoContent;
    }
    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
