package com.my.util;

import java.util.List;

public class PageBean<T> {
	/**
	 * totalRecords 总记录数 list 保存分页的数据 pageNo 当前页 pageSize 页大小
	 * query保存用户查询的字符串,查询分页用 pageAction 操作分页的Servlet或Action(struts)或JSP
	 */
	private int totalRecords;
	private List<T> list;
	private int pageNo;
	private int pageSize;
	private String query;
	private String pageAction;

	public void setPageAction(String pageAction) {
		this.pageAction = pageAction;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	/**
	 * 取得总页数的方法 return
	 * totalRecords%pageSize==0?(totalRecords/pageSize):(totalRecords
	 * /pageSize+1)
	 * 
	 * @return
	 */
	public int getTotalPages() {
		return (totalRecords + pageSize - 1) / pageSize;
	}

	/**
	 * 得到首页
	 * 
	 * @return
	 */
	public int getTopPage() {
		return 1;
	}

	/**
	 * 得到上一页
	 * 
	 * @return
	 */
	public int getPreviousPageNo() {
		if (pageNo <= 1)
			return 1;
		else
			return (pageNo - 1);
	}

	/**
	 * 得到下一页
	 */
	public int getNextPageNo() {
		if (pageNo >= getTotalPages()) {
			return getTotalPages() == 0 ? 1 : getTotalPages();
		} else {
			return pageNo + 1;
		}
	}

	/**
	 * 得到尾页
	 */
	public int getBottomPageNo() {
		return getTotalRecords() == 0 ? 1 : getTotalPages();
	}

	/**
	 * 第一页
	 */
	public boolean isFirst() {
		return pageNo == 1;
	}

	/**
	 * 最后一页
	 */
	public boolean isLast() {
		return pageNo == this.getTotalPages();
	}

	public String getPageToolBar() {

		String str = "<div class='next' align='center'>";
		if (isFirst())
			str += "首页  上一页 " + pageNo;
		else {
			str += "<a href='" + pageAction + "?pageNo=" + this.getTopPage()
					+ "'>首页</a> ";
			str += "<a href='" + pageAction + "?pageNo="
					+ this.getPreviousPageNo() + "'>上一页</a>   " + pageNo;
		}
		if (isLast())
			str += "   下一页   尾页 ";
		else {
			str += "   <a href='" + pageAction + "?pageNo="
					+ this.getNextPageNo() + "'>下一页</a> ";
			str += "<a href='" + pageAction + "?pageNo="
					+ this.getBottomPageNo() + "'>尾页</a> ";
		}
		str += " 共<b>" + totalRecords + "</b>条记录 </div>";
		return str;
	}

	// 页面分页导航的链接 方式二

	public String getPageToolBar2() {
		String str = "";
		int pageSplit = (pageNo / this.pageSize) * this.pageSize;
		for (int i = pageSplit - 1; i < (pageSplit + 6); i++) {
			if (i <= 0) {
			} else if (pageNo == i) {
				str += i + "&nbsp;";
			} else if (i > getTotalPages()) {
			} else {
				str += "<a href='" + pageAction + "?userQuery=" + query
						+ "&pageNo=" + i + "&pageSize=" + pageSize + "'>" + i
						+ "</a>" + "&nbsp;";
			}
		}
		return str + " 共<b>" + totalRecords + "</b>条记录 ";
	}

}