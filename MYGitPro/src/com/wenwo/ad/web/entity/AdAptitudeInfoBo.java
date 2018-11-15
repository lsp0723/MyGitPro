package com.wenwo.ad.web.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户资质信息表
 * Title:AdAptitudeInfoBo
 * Description: 
 * @author hewb
 * @date 2017年2月22日 上午11:40:18
 */
public class AdAptitudeInfoBo implements Serializable {
	
	/**
	 * 用户ID
	 */
    private Integer userId;

    /**
     * ICP备案号
     */
    private String icp;

    /**
     * 推广网址
     */
    private String extensionUrl;

    /**
     * 咨询链接
     */
    private String advisoryLinks;

    /**
     * 营业执照日期
     */
    private Date businessLicenseDate;
    
    /**
     * 营业执照日期展示使用
     */
    private String businessLicenseDateExt;

    /**
     * 是否永久营业期限 Y:是 N：否
     */
    private String isForeverBusiness;

    /**
     * 营业执照图片路径
     */
    private String businessLicensePic;

    /**
     * 行业资质父类名称
     */
    private String industryParentName;

    /**
     * 行业资质父类ID
     */
    private Integer industryParentId;

    /**
     * 行业资质子类名称
     */
    private String industryChildName;

    /**
     * 行业资质子类ID
     */
    private Integer industryChildId;

    /**
     * 资质图片
     */
    private String aptitudePic;

    /**
     * 执业许可期限
     */
    private Date licensePeriod;
    
    /**
     * 职业许可期限展示使用
     */
    private String licensePeriodExt;
    

    /**
     * 母婴许可期限
     */
    private Date maternalLicensePeriod;
    
    /**
     * 母婴许可期限界面传提使用
     */
    private String maternalLicensePeriodExt;

    /**
     * 创建人
     */
    private Integer createId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private Integer modifyId;

    /**
     * 修改时间
     */
    private Date modifyTime;
    
    /**
     * 公司名称
     */
    private String userCompany;
    
    /**
     * 角色关键字
     */
    private Integer roleValue;

    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getIcp() {
        return icp;
    }

    public void setIcp(String icp) {
        this.icp = icp;
    }

    public String getExtensionUrl() {
        return extensionUrl;
    }

    public void setExtensionUrl(String extensionUrl) {
        this.extensionUrl = extensionUrl;
    }

    public String getAdvisoryLinks() {
        return advisoryLinks;
    }

    public void setAdvisoryLinks(String advisoryLinks) {
        this.advisoryLinks = advisoryLinks;
    }

    public Date getBusinessLicenseDate() {
        return businessLicenseDate;
    }

    public void setBusinessLicenseDate(Date businessLicenseDate) {
        this.businessLicenseDate = businessLicenseDate;
    }

    public String getIsForeverBusiness() {
        return isForeverBusiness;
    }

    public void setIsForeverBusiness(String isForeverBusiness) {
        this.isForeverBusiness = isForeverBusiness;
    }

    public String getBusinessLicensePic() {
        return businessLicensePic;
    }

    public void setBusinessLicensePic(String businessLicensePic) {
        this.businessLicensePic = businessLicensePic;
    }

    public String getIndustryParentName() {
        return industryParentName;
    }

    public void setIndustryParentName(String industryParentName) {
        this.industryParentName = industryParentName;
    }

    public Integer getIndustryParentId() {
        return industryParentId;
    }

    public void setIndustryParentId(Integer industryParentId) {
        this.industryParentId = industryParentId;
    }

    public String getIndustryChildName() {
        return industryChildName;
    }

    public void setIndustryChildName(String industryChildName) {
        this.industryChildName = industryChildName;
    }

    public Integer getIndustryChildId() {
        return industryChildId;
    }

    public void setIndustryChildId(Integer industryChildId) {
        this.industryChildId = industryChildId;
    }

    public String getAptitudePic() {
        return aptitudePic;
    }

    public void setAptitudePic(String aptitudePic) {
        this.aptitudePic = aptitudePic;
    }

    public Date getLicensePeriod() {
        return licensePeriod;
    }

    public void setLicensePeriod(Date licensePeriod) {
        this.licensePeriod = licensePeriod;
    }

    public Date getMaternalLicensePeriod() {
        return maternalLicensePeriod;
    }

    public void setMaternalLicensePeriod(Date maternalLicensePeriod) {
        this.maternalLicensePeriod = maternalLicensePeriod;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getModifyId() {
        return modifyId;
    }

    public void setModifyId(Integer modifyId) {
        this.modifyId = modifyId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AdAptitudeInfoBo other = (AdAptitudeInfoBo) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getIcp() == null ? other.getIcp() == null : this.getIcp().equals(other.getIcp()))
            && (this.getExtensionUrl() == null ? other.getExtensionUrl() == null : this.getExtensionUrl().equals(other.getExtensionUrl()))
            && (this.getAdvisoryLinks() == null ? other.getAdvisoryLinks() == null : this.getAdvisoryLinks().equals(other.getAdvisoryLinks()))
            && (this.getBusinessLicenseDate() == null ? other.getBusinessLicenseDate() == null : this.getBusinessLicenseDate().equals(other.getBusinessLicenseDate()))
            && (this.getIsForeverBusiness() == null ? other.getIsForeverBusiness() == null : this.getIsForeverBusiness().equals(other.getIsForeverBusiness()))
            && (this.getBusinessLicensePic() == null ? other.getBusinessLicensePic() == null : this.getBusinessLicensePic().equals(other.getBusinessLicensePic()))
            && (this.getIndustryParentName() == null ? other.getIndustryParentName() == null : this.getIndustryParentName().equals(other.getIndustryParentName()))
            && (this.getIndustryParentId() == null ? other.getIndustryParentId() == null : this.getIndustryParentId().equals(other.getIndustryParentId()))
            && (this.getIndustryChildName() == null ? other.getIndustryChildName() == null : this.getIndustryChildName().equals(other.getIndustryChildName()))
            && (this.getIndustryChildId() == null ? other.getIndustryChildId() == null : this.getIndustryChildId().equals(other.getIndustryChildId()))
            && (this.getAptitudePic() == null ? other.getAptitudePic() == null : this.getAptitudePic().equals(other.getAptitudePic()))
            && (this.getLicensePeriod() == null ? other.getLicensePeriod() == null : this.getLicensePeriod().equals(other.getLicensePeriod()))
            && (this.getMaternalLicensePeriod() == null ? other.getMaternalLicensePeriod() == null : this.getMaternalLicensePeriod().equals(other.getMaternalLicensePeriod()))
            && (this.getCreateId() == null ? other.getCreateId() == null : this.getCreateId().equals(other.getCreateId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyId() == null ? other.getModifyId() == null : this.getModifyId().equals(other.getModifyId()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getIcp() == null) ? 0 : getIcp().hashCode());
        result = prime * result + ((getExtensionUrl() == null) ? 0 : getExtensionUrl().hashCode());
        result = prime * result + ((getAdvisoryLinks() == null) ? 0 : getAdvisoryLinks().hashCode());
        result = prime * result + ((getBusinessLicenseDate() == null) ? 0 : getBusinessLicenseDate().hashCode());
        result = prime * result + ((getIsForeverBusiness() == null) ? 0 : getIsForeverBusiness().hashCode());
        result = prime * result + ((getBusinessLicensePic() == null) ? 0 : getBusinessLicensePic().hashCode());
        result = prime * result + ((getIndustryParentName() == null) ? 0 : getIndustryParentName().hashCode());
        result = prime * result + ((getIndustryParentId() == null) ? 0 : getIndustryParentId().hashCode());
        result = prime * result + ((getIndustryChildName() == null) ? 0 : getIndustryChildName().hashCode());
        result = prime * result + ((getIndustryChildId() == null) ? 0 : getIndustryChildId().hashCode());
        result = prime * result + ((getAptitudePic() == null) ? 0 : getAptitudePic().hashCode());
        result = prime * result + ((getLicensePeriod() == null) ? 0 : getLicensePeriod().hashCode());
        result = prime * result + ((getMaternalLicensePeriod() == null) ? 0 : getMaternalLicensePeriod().hashCode());
        result = prime * result + ((getCreateId() == null) ? 0 : getCreateId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyId() == null) ? 0 : getModifyId().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", icp=").append(icp);
        sb.append(", extensionUrl=").append(extensionUrl);
        sb.append(", advisoryLinks=").append(advisoryLinks);
        sb.append(", businessLicenseDate=").append(businessLicenseDate);
        sb.append(", isForeverBusiness=").append(isForeverBusiness);
        sb.append(", businessLicensePic=").append(businessLicensePic);
        sb.append(", industryParentName=").append(industryParentName);
        sb.append(", industryParentId=").append(industryParentId);
        sb.append(", industryChildName=").append(industryChildName);
        sb.append(", industryChildId=").append(industryChildId);
        sb.append(", aptitudePic=").append(aptitudePic);
        sb.append(", licensePeriod=").append(licensePeriod);
        sb.append(", maternalLicensePeriod=").append(maternalLicensePeriod);
        sb.append(", createId=").append(createId);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyId=").append(modifyId);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

	public String getUserCompany() {
		return userCompany;
	}

	public void setUserCompany(String userCompany) {
		this.userCompany = userCompany;
	}

	public String getBusinessLicenseDateExt() {
		return businessLicenseDateExt;
	}

	public void setBusinessLicenseDateExt(String businessLicenseDateExt) {
		this.businessLicenseDateExt = businessLicenseDateExt;
	}

	public String getLicensePeriodExt() {
		return licensePeriodExt;
	}

	public void setLicensePeriodExt(String licensePeriodExt) {
		this.licensePeriodExt = licensePeriodExt;
	}

	public String getMaternalLicensePeriodExt() {
		return maternalLicensePeriodExt;
	}

	public void setMaternalLicensePeriodExt(String maternalLicensePeriodExt) {
		this.maternalLicensePeriodExt = maternalLicensePeriodExt;
	}

	public Integer getRoleValue() {
		return roleValue;
	}

	public void setRoleValue(Integer roleValue) {
		this.roleValue = roleValue;
	}

}