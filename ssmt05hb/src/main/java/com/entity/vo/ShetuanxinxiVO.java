package com.entity.vo;

import com.entity.ShetuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 社团信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-21 18:09:45
 */
public class ShetuanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 社团分类
	 */
	
	private String shetuanfenlei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 社团人数
	 */
	
	private String shetuanrenshu;
		
	/**
	 * 创建时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chuangjianshijian;
		
	/**
	 * 社长姓名
	 */
	
	private String shezhangxingming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 邮箱
	 */
	
	private String youxiang;
		
	/**
	 * 社团简介
	 */
	
	private String shetuanjianjie;
				
	
	/**
	 * 设置：社团分类
	 */
	 
	public void setShetuanfenlei(String shetuanfenlei) {
		this.shetuanfenlei = shetuanfenlei;
	}
	
	/**
	 * 获取：社团分类
	 */
	public String getShetuanfenlei() {
		return shetuanfenlei;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：社团人数
	 */
	 
	public void setShetuanrenshu(String shetuanrenshu) {
		this.shetuanrenshu = shetuanrenshu;
	}
	
	/**
	 * 获取：社团人数
	 */
	public String getShetuanrenshu() {
		return shetuanrenshu;
	}
				
	
	/**
	 * 设置：创建时间
	 */
	 
	public void setChuangjianshijian(Date chuangjianshijian) {
		this.chuangjianshijian = chuangjianshijian;
	}
	
	/**
	 * 获取：创建时间
	 */
	public Date getChuangjianshijian() {
		return chuangjianshijian;
	}
				
	
	/**
	 * 设置：社长姓名
	 */
	 
	public void setShezhangxingming(String shezhangxingming) {
		this.shezhangxingming = shezhangxingming;
	}
	
	/**
	 * 获取：社长姓名
	 */
	public String getShezhangxingming() {
		return shezhangxingming;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：邮箱
	 */
	 
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
				
	
	/**
	 * 设置：社团简介
	 */
	 
	public void setShetuanjianjie(String shetuanjianjie) {
		this.shetuanjianjie = shetuanjianjie;
	}
	
	/**
	 * 获取：社团简介
	 */
	public String getShetuanjianjie() {
		return shetuanjianjie;
	}
			
}
