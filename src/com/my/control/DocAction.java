package com.my.control;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FileUtils;

import com.my.bean.InfoPeriodical;
import com.my.bean.InfoThesis;
import com.my.util.PageBean;

public class DocAction extends BaseAction {

	// 此属性对应于表单中文件字段的名称
	private File uploadFile;
	// 下面的这两个属性的命名必须遵守上定的规则，即为"表单中文件字段的名称" + "相应的后缀"
	private String uploadFileContentType; // 得到上传的文件的数据类型,
	private String uploadFileFileName; // 得到上传的文件的名称

	public File getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}

	public String getUploadFileContentType() {
		return uploadFileContentType;
	}

	public void setUploadFileContentType(String uploadFileContentType) {
		this.uploadFileContentType = uploadFileContentType;
	}

	public String getUploadFileFileName() {
		return uploadFileFileName;
	}

	public void setUploadFileFileName(String uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}

	public String addThesis() throws Exception {
		if (uploadFile == null) {
			request.put("message", "请选择word或者pdf类型文件!");
			return "listauthor";
		}
		String realPath = "D:/workspace/documentmanage/WebContent/doc";
		SimpleDateFormat date = new SimpleDateFormat("/yyyy/MM/dd");
		String dateTime = date.format(new Date());
		realPath += dateTime;

		uploadFileFileName = UUID.randomUUID().toString()
				+ uploadFileFileName.substring(uploadFileFileName
						.lastIndexOf('.'));
		// application/pdf
		// application/msword
		System.out.println(uploadFileContentType);
		// 控制上传类型
		if (uploadFileContentType.equals("application/pdf")
				|| uploadFileContentType.equals("application/msword")) {
			// 判断文件是否为空,并且文件不能大于2M
			if (uploadFile != null) {
				// 根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
				File filePath = new File(new File(realPath), uploadFileFileName);
				// 判断路径是否存在
				if (!filePath.getParentFile().exists()) {
					// 如果不存在，则递归创建此路径
					filePath.getParentFile().mkdirs();
				}
				System.out.println(uploadFileFileName);
				System.out.println(filePath.getParentFile());
				System.out.println(filePath);
				thesis.setPath(filePath.toString().substring(38)
						.replace('\\', '/'));
				// 将文件保存到硬盘上,Struts2会帮我们自动删除临时文件
				try {
					FileUtils.copyFile(uploadFile, filePath);
				} catch (IOException e) {
					System.out.println("文件上传失败");
					e.printStackTrace();
				}
			}
		} else {
			request.put("message", "请选择word或者pdf类型文件!");
			return "addauthor";
		}
		if (adminbo.addInfoThesis(thesis)) {
			request.put("message",
					"<script laguage='JavaScript'> alert('添加成功!') </script>");
		} else {
			request.put("message", "添加失败!");
		}
		return "addthesis";
	}

	public String addPeriodical() throws Exception {
		if (uploadFile == null) {
			request.put("message", "请选择word或者pdf类型文件!");
			return "addperiodical";
		}
		String realPath = "D:/workspace/documentmanage/WebContent/doc";
		SimpleDateFormat date = new SimpleDateFormat("/yyyy/MM/dd");
		String dateTime = date.format(new Date());
		realPath += dateTime;

		uploadFileFileName = UUID.randomUUID().toString()
				+ uploadFileFileName.substring(uploadFileFileName
						.lastIndexOf('.'));
		// application/pdf
		// application/msword
		System.out.println(uploadFileContentType);
		// 控制上传类型
		if (uploadFileContentType.equals("application/pdf")
				|| uploadFileContentType.equals("application/msword")) {
			// 判断文件是否为空,并且文件不能大于2M
			if (uploadFile != null) {
				// 根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
				File filePath = new File(new File(realPath), uploadFileFileName);
				// 判断路径是否存在
				if (!filePath.getParentFile().exists()) {
					// 如果不存在，则递归创建此路径
					filePath.getParentFile().mkdirs();
				}
				System.out.println(uploadFileFileName);
				System.out.println(filePath.getParentFile());
				System.out.println(filePath);
				per.setPath(filePath.toString().substring(38)
						.replace('\\', '/'));
				// 将文件保存到硬盘上,Struts2会帮我们自动删除临时文件
				try {
					FileUtils.copyFile(uploadFile, filePath);
				} catch (IOException e) {
					System.out.println("文件上传失败");
					e.printStackTrace();
				}
			}
		} else {
			request.put("message", "请选择word或者pdf类型文件!");
			return "addperiodical";
		}
		if (adminbo.addInfoPeriodical(per)) {
			request.put("message",
					"<script laguage='JavaScript'> alert('添加成功!') </script>");
		} else {
			request.put("message", "添加失败!");
		}
		return "addperiodical";
	}

	public String listThesisPrepare() throws Exception {
		if (pageNo == null || pageNo == 0) {
			pageNo = 1;
		}
		int totalRecords = 0;
		List<InfoThesis> list;
		list = adminbo.getAllInfoThesisByPage(pageNo, 15);
		totalRecords = adminbo.getTotalInfoThesisRecords().intValue();
		PageBean<InfoThesis> pagebean = this.setPageBean(list, totalRecords);
		pagebean.setPageAction("listThesisPrepare_doc");
		return "listthesis";
	}

	public String searchThesis() throws Exception {
		if (pageNo == null || pageNo == 0) {
			pageNo = 1;
		}
		int totalRecords = 0;
		List<InfoThesis> list;
		list = adminbo.searchInfoThesisByPage(pageNo, 15, thesis);
		totalRecords = adminbo.searchTotalInfoThesisRecords(thesis).intValue();
		PageBean<InfoThesis> pagebean = this.setPageBean(list, totalRecords);
		pagebean.setPageAction("searchThesis_doc");
		return "listthesis";
	}

	public String removeThesis() throws Exception {
		adminbo.removeInfoThesis(thesis.getThesisId());
		return this.searchThesis();
	}

	public String editThesisPrepare() throws Exception {
		thesis = adminbo.getInfoThesisById(InfoThesis.class,
				thesis.getThesisId());
		request.put("thesis", thesis);
		return "editthesis";
	}

	public String editThesis() throws Exception {
		if (adminbo.editInfoThesis(thesis)) {
			request.put("message",
					"<script laguage='JavaScript'> alert('修改成功!') </script>");
			return this.listThesisPrepare();
		} else {
			request.put("message", "修改失败!");
		}
		return this.searchThesis();
	}

	public String listPeriodicalPrepare() throws Exception {
		if (pageNo == null || pageNo == 0) {
			pageNo = 1;
		}
		int totalRecords = 0;
		List<InfoPeriodical> list;
		list = adminbo.getAllInfoPeriodicalByPage(pageNo, 15);
		totalRecords = adminbo.getTotalInfoPeriodicalRecords().intValue();
		PageBean<InfoPeriodical> pagebean = this
				.setPageBean(list, totalRecords);
		pagebean.setPageAction("listPeriodicalPrepare_doc");
		return "listperiodical";
	}

	public String searchPeriodical() throws Exception {
		if (pageNo == null || pageNo == 0) {
			pageNo = 1;
		}
		int totalRecords = 0;
		List<InfoPeriodical> list;
		list = adminbo.searchInfoPeriodicalByPage(pageNo, 15, per);
		totalRecords = adminbo.searchTotalInfoPeriodicalRecords(per).intValue();
		PageBean<InfoPeriodical> pagebean = this
				.setPageBean(list, totalRecords);
		pagebean.setPageAction("searchPeriodical_doc");
		return "listperiodical";
	}

	public String removePeriodical() throws Exception {
		adminbo.removeInfoPeriodical(per.getPeriodicalId());
		return this.searchPeriodical();
	}

	public String editPeriodicalPrepare() throws Exception {
		per = adminbo.getInfoPeriodicalById(InfoPeriodical.class,
				per.getPeriodicalId());
		request.put("per", per);
		return "editperiodical";
	}

	public String editPeriodical() throws Exception {
		if (adminbo.editInfoPeriodical(per)) {
			request.put("message",
					"<script laguage='JavaScript'> alert('修改成功!') </script>");
			return this.listPeriodicalPrepare();
		} else {
			request.put("message", "修改失败!");
		}
		return this.searchPeriodical();
	}
}
