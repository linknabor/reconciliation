package com.eshequ.reconciliation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.eshequ.reconciliation.common.CommonMapper;
import com.eshequ.reconciliation.model.CodeInfo;

public interface CodeInfoMapper extends CommonMapper<CodeInfo>{

    List<CodeInfo> selectByClass(@Param("ciSpClass") String ciSpClass);
}