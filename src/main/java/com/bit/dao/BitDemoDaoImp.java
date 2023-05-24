package com.bit.dao;

import com.bit.dto.BitDemoDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class BitDemoDaoImp implements BitDemoDao {
    // dao는 sqlSessionFactory를 의존
    @Autowired
    private SqlSessionTemplate sqlSession;  // openSession 객체와 동일
    static String nameSpace = "com.bit.dto.basicMapper";

    @Override
    @Transactional
    public void bitDemoInsert(BitDemoDTO dto) {
        // DB접근해서 myBatis 객체 의존
        sqlSession.insert(nameSpace + ".bitDemoInsert", dto);
        dto.setName(dto.getName().concat("Update"));
        sqlSession.update(nameSpace + ".bitDemoUpdate", dto);
    }

    @Override
    public List<BitDemoDTO> selectBitDemo() {
        return sqlSession.selectList(nameSpace + ".selectBitDemo");
    }
}
