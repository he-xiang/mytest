package cn.itcast.springboot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.springboot.mapper.NoticeMapper;
import cn.itcast.springboot.pojo.Notice;
import cn.itcast.springboot.service.NoticeService;

/**
 * NoticeServiceImpl
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年1月13日 下午6:15:31
 * @version 1.0
 */
@Service
public class NoticeServiceImpl implements NoticeService {
	@Autowired
	private NoticeMapper noticeMapper;
	
	/** 查询所有的公告 */
	@Override
	public List<Notice> findAll() {
		return noticeMapper.findAll();
	}
	
	/** 分页查询公告 */
	public Map<String, Object> findByPage(Integer page, Integer rows){
		
		Map<String, Object> data = new HashMap<>();
		/** {"total" : 1000, "rows" : [{id : , title: '', content:''},{}]} */
		Long count = noticeMapper.count();
		data.put("total", count);
		
		List<Notice> notices = noticeMapper.findByPage((page - 1) * rows, rows);
		data.put("rows", notices);
		
		return data;
		
	}
}
