package cn.itcast.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.itcast.springboot.pojo.Notice;

/**
 * NoticeMapper
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2018年1月13日 下午6:14:55
 * @version 1.0
 */
@Mapper
public interface NoticeMapper {
	
	/** 查询所有的公告 */
	@Select("select * from notice")
	List<Notice> findAll();
	
	/** 统计查询 */
	Long count();
	
	/** 分页查询 */
	List<Notice> findByPage(@Param("page")int page,@Param("rows") int rows);
}
