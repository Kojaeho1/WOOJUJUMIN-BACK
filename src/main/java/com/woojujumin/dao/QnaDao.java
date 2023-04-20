package com.woojujumin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.woojujumin.dto.QnaDto;

@Mapper
@Repository
public interface QnaDao {
	List<QnaDto> myqna(String id,int start);
	int addQna(QnaDto dto);
	int cntqna(String id);
	QnaDto getQna(int qnaSeq);
	List<QnaDto> allnewqna();
	List<QnaDto> typeqna(String qtype);
	List<QnaDto> answeredqns();
	int makeanswer(QnaDto dto);
}
