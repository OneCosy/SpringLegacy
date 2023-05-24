package com.bit.dao;

import com.bit.dto.BitDemoDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface BitDemoDao {
    public void bitDemoInsert(BitDemoDTO dto);
    public List<BitDemoDTO> selectBitDemo();
}
