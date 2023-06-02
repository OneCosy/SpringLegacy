package com.bit.service;

import com.bit.dao.MvcOptionDao;
import com.bit.dto.EmpDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service
public class MvcOptionServiceImp implements MvcOptionService {
    @Resource(name = "mvcOptionDaoImp")
    private MvcOptionDao dao;

    @Override
    public List<EmpDTO> selectEmpList(HashMap<String, Object> map){
        return dao.selectEmpList(map);
    }

    @Override
    public void deleteEmpList(List<String> list) {
        dao.deleteEmpList(list);
    }
}
