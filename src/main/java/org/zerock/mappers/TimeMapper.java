package org.zerock.mappers;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	//	@Select("select now()")   (x)
	public String getTime();
}
