package com.wenwo.ad.web.entity;

import java.util.List;


/**
 * 问题信息
 * Title:Question
 * Description: 
 * @author hewb
 * @date 2017年12月25日 上午11:30:56
 */
public class Question {

	/**
	 * 问题ID
	 */
	private String id;
	
	/**
	 * 问题内容
	 */
	private String content;
	
	/**
	 * 问题标题
	 */
	private String title;
	
	/**
	 * 病种标识
	 */
	private String mainTagFlag; 
	
	/**
	 * 病种标签
	 */
	private List<String> mainTags;
	
	/**
	 * 问题的排行 
	 */
	private Integer ranking;				

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public List<String> getMainTags() {
		return mainTags;
	}

	public void setMainTags(List<String> mainTags) {
		this.mainTags = mainTags;
	}

	public Integer getRanking() {
		return ranking;
	}

	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}

	public String getMainTagFlag() {
		return mainTagFlag;
	}

	public void setMainTagFlag(String mainTagFlag) {
		this.mainTagFlag = mainTagFlag;
	}  
}
