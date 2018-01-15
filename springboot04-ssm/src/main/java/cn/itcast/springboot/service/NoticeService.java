package cn.itcast.springboot.service;

import java.util.List;
import java.util.Map;

import cn.itcast.springboot.pojo.Notice;

/**
 * NoticeService
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年1月13日 下午6:15:10
 * @version 1.0
 */
public interface NoticeService {
	
	List<Notice> findAll();
	
	Map<String, Object> findByPage(Integer page, Integer rows);

}
