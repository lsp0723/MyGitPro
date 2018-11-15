package com.wenwo.ad.web.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 广告主数据报表概览
 * Title:AdAllReportBo
 * Description: 
 * @author hewb
 * @date 2017年9月5日 下午2:50:13
 */
public class AdAllReportBo implements Serializable {
	
	/**
	 * 主键
	 */
    private Integer id;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 总消费费用
     */
    private BigDecimal totalCost;

    /**
     * 总PV
     */
    private Integer totalPv;

    /**
     * 总点击量
     */
    private Integer totalClick;

    /**
     * 报表日期
     */
    private Date reportDate;

    /**
     * 创建时间
     */
    private Date createTime;
   
    private List<String> dateList;
    private List<BigDecimal> feeList;
    private List<Integer> pvList;
    private List<Integer> clickList;
    

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public Integer getTotalPv() {
        return totalPv;
    }

    public void setTotalPv(Integer totalPv) {
        this.totalPv = totalPv;
    }

    public Integer getTotalClick() {
        return totalClick;
    }

    public void setTotalClick(Integer totalClick) {
        this.totalClick = totalClick;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	public List<String> getDateList() {
		return dateList;
	}

	public void setDateList(List<String> dateList) {
		this.dateList = dateList;
	}

	public List<BigDecimal> getFeeList() {
		return feeList;
	}

	public void setFeeList(List<BigDecimal> feeList) {
		this.feeList = feeList;
	}

	public List<Integer> getPvList() {
		return pvList;
	}

	public void setPvList(List<Integer> pvList) {
		this.pvList = pvList;
	}

	public List<Integer> getClickList() {
		return clickList;
	}

	public void setClickList(List<Integer> clickList) {
		this.clickList = clickList;
	}



   
}