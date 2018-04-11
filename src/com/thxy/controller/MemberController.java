package com.thxy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.thxy.entity.PageBean;
import com.thxy.entity.Member;
import com.thxy.service.MemberService;
import com.thxy.util.ResponseUtil;
import com.thxy.util.StringUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * ��ԱController��
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Resource
	private MemberService memberService;
	
	/**
	 * ��ҳ������ѯ��Ա
	 * @param page
	 * @param rows
	 * @param s_member
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String list(@RequestParam(value="page",required=false)String page,@RequestParam(value="rows",required=false)String rows,Member s_member,HttpServletResponse response)throws Exception{
		PageBean pageBean=new PageBean(Integer.parseInt(page),Integer.parseInt(rows));
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("memberName", StringUtil.formatLike(s_member.getMemberName()));
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		List<Member> memberList=memberService.find(map);
		Long total=memberService.getTotal(map);
		JSONObject result=new JSONObject();
		JSONArray jsonArray=JSONArray.fromObject(memberList);
		result.put("rows", jsonArray);
		result.put("total", total);
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * ��ȡ�ͻ�������Ϣ �����������õ�
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/customerManagerComboList")
	public String customerManagerComboList(HttpServletResponse response)throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("roleName", "�ͻ�����");
		List<Member> memberList=memberService.find(map);
		JSONArray row=JSONArray.fromObject(memberList);
		ResponseUtil.write(response, row);
		return null;
	}
	
	/**
	 * ��ӻ����޸Ļ�Ա
	 * @param member
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/save")
	public String save(Member member,HttpServletResponse response)throws Exception{
		int resultTotal=0; // �����ļ�¼����
		if(member.getId()==null){
			resultTotal=memberService.add(member);
		}else{
			resultTotal=memberService.update(member);
		}
		JSONObject result=new JSONObject();
		if(resultTotal>0){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * ɾ����Ա
	 * @param ids
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delete")
	public String delete(@RequestParam(value="ids")String ids,HttpServletResponse response)throws Exception{
		String []idsStr=ids.split(",");
		for(int i=0;i<idsStr.length;i++){
			memberService.delete(Integer.parseInt(idsStr[i]));
		}
		JSONObject result=new JSONObject();
		result.put("success", true);
		ResponseUtil.write(response, result);
		return null;
	}
	
	/**
	 * �޸Ļ�Ա����
	 * @param member
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/modifyPassword")
	public String modifyPassword(Integer id,String newPassword,HttpServletResponse response)throws Exception{
		Member member=new Member();
		member.setId(id);
		member.setPassword(newPassword);
		int resultTotal=memberService.update(member);
		JSONObject result=new JSONObject();
		if(resultTotal>0){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return null;
	}
	
}
