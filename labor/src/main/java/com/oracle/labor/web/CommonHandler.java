package com.oracle.labor.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oracle.labor.common.codetable.ComputergradeOperation;
import com.oracle.labor.common.codetable.Deformity;
import com.oracle.labor.common.codetable.EducationallevelOperation;
import com.oracle.labor.common.codetable.EmploytypeOperation;
import com.oracle.labor.common.codetable.HealthstateOperation;
import com.oracle.labor.common.codetable.IndustryOperation;
import com.oracle.labor.common.codetable.LanguageOperation;
import com.oracle.labor.common.codetable.MarriageOperation;
import com.oracle.labor.common.codetable.NationOperation;
import com.oracle.labor.common.codetable.OrgtypeOperation;
import com.oracle.labor.common.codetable.PersonneltypeOperation;
import com.oracle.labor.common.codetable.PoliticsaspectOperation;
import com.oracle.labor.common.codetable.ProficiencyOperation;
import com.oracle.labor.common.codetable.QualificationOperation;
import com.oracle.labor.common.codetable.RegioncodeOperation;
import com.oracle.labor.common.codetable.RegtypeOperation;
import com.oracle.labor.common.codetable.RprtypeOperation;
import com.oracle.labor.common.codetable.SexOperation;
import com.oracle.labor.common.codetable.SpecialtyOperation;

@Controller
public class CommonHandler {

//	//返回文本;
//	@ResponseBody
//	@RequestMapping(value="/service/language",produces="text/html;charset=UTF-8")
//	public String getLanguage(String val) {
//		String result=LanguageOperation.getOption(val);
//		System.out.println(result);
//		return result;
//	}
	
	/**
	 * 返回性别
	 */
	@ResponseBody
	@RequestMapping(value="/service/sex/{sex}",produces="text/html;charset=UTF-8")
	public String getSex(@PathVariable("sex") String sex){
		return SexOperation.getOption(sex);
	}
	/**
	 * 
	 * @param 返回民族
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/service/nations/{code}",produces="text/html;charset=UTF-8")
	public String  getNation(@PathVariable("code") String code){
		return NationOperation.getOption(code);
	}
	/**
	 * 返回政治面貌
	 */
	@ResponseBody
	@RequestMapping(value="/service/polity/{polity}",produces="text/html;charset=UTF-8")
	public String getPolity(@PathVariable("polity") String polity){
		return PoliticsaspectOperation.getOption(polity);
		
	}
	
	/**
	 * 返回婚姻状况
	 */
	@ResponseBody
	@RequestMapping(value="/service/marry/{marry}",produces="text/html;charset=UTF-8")
	public String getMarry(@PathVariable("marry") String marry){
		return MarriageOperation.getOption(marry);
		
	}
	/**
	 * 返回户籍性质
	 */
	@ResponseBody
	@RequestMapping(value="/service/Rprtype/{Rprtype}",produces="text/html;charset=UTF-8")
	public String getRprtype(@PathVariable("Rprtype") String Rprtype){
		return RprtypeOperation.getOption(Rprtype);
		
	}
	
	/**
	 * 返回人员类别
	 */
	
	
	/**
	 *返回省份状态
	 */
	@ResponseBody
	@RequestMapping(value="/service/province",produces="text/html;charset=UTF-8")
	public String getRegionProvince(){
		return RegioncodeOperation.getProvince();
		
	}
	

	/**
	 * 返回市/县
	 */
	@ResponseBody
	@RequestMapping(value="/service/city/{selectedId}/{region}",produces="text/html;charset=UTF-8")
	public String getCity(@PathVariable("selectedId") String selectedId,@PathVariable("region") String region){
		return RegioncodeOperation.getSelectedRegion(selectedId, region);
	}
	
	/**
	 * 人员类别
	 */
	@ResponseBody
	@RequestMapping(value="/service/person",produces="text/html;charset=UTF-8")
	public String getPersonal(){
		return PersonneltypeOperation.getOption();
	}
	/**
	 * 健康状况
	 */
	@ResponseBody
	@RequestMapping(value="/service/health",produces="text/html;charset=UTF-8")
	public String getHealth(){
		return HealthstateOperation.getOption();
	}
	
	/**
	 * 残疾状况
	 */
	@ResponseBody
	@RequestMapping(value="/service/deformity",produces="text/html;charset=UTF-8")
	public String getDeformity(){
		
		return Deformity.getOption();
	}
	
	/**
	 * 文化程度
	 */
	@ResponseBody
	@RequestMapping(value="/service/education",produces="text/html;charset=UTF-8")
	public String getEducation(){
		return EducationallevelOperation.getOption();
	}
	/**
	 * 外语
	 */
	@ResponseBody
	@RequestMapping(value="/service/language",produces="text/html;charset=UTF-8")
	public String getLanguage(){
		return LanguageOperation.getOption();
	}
	/**
	 * 计算机等级
	 */
	@ResponseBody
	@RequestMapping(value="/service/computer",produces="text/html;charset=UTF-8")
	public String getComputer(){
		return ComputergradeOperation.getOption();
	}
	/**
	 * 熟练程度
	 */
	@ResponseBody
	@RequestMapping(value="/service/proficiency",produces="text/html;charset=UTF-8")
	public String getProficiency(){
		return ProficiencyOperation.getOption();
	}
	
	/**
	 * 职业技能
	 */
	@ResponseBody
	@RequestMapping(value="/service/skill/{skillId}",produces="text/html;charset=UTF-8")
	public String getSkill(@PathVariable("skillId") String skillId){
		return SpecialtyOperation.getGz(skillId);
	}
	/**
	 * 技术等级
	 */
	
	@ResponseBody
	@RequestMapping(value="/service/qualification",produces="text/html;charset=UTF-8")
	public String getQualification(){
		return QualificationOperation.getOption();
	}
	
	/**
	 * 单位性质
	 */

	@ResponseBody
	@RequestMapping(value="/service/unitType",produces="text/html;charset=UTF-8")
	public String getUnitType(){
		return OrgtypeOperation.getOption();
	}
	
	/**
	 * 单位行业
	 */

	@ResponseBody
	@RequestMapping(value="/service/industry",produces="text/html;charset=UTF-8")
	public String getIndustry(){
		return IndustryOperation.getOption();
	}
	/**
	 * 经济类型
	 */
	@ResponseBody
	@RequestMapping(value="/service/economy",produces="text/html;charset=UTF-8")
	public String getEconomy(){
		return RegtypeOperation.getOption();
	}
	/**
	 * 工种信息
	 */
	@ResponseBody
	@RequestMapping(value="/service/work",produces="text/html;charset=UTF-8")
	public String getWork(){
		return SpecialtyOperation.getHy();
	}
	/**
	 * 用工形式
	 */
	@ResponseBody
	@RequestMapping(value="/service/employee",produces="text/html;charset=UTF-8")
	public String getEmployee(){
		return EmploytypeOperation.getOption();
	}
}
