package com.bit.service;

import com.bit.dto.EmpDTO;

import java.util.HashMap;
import java.util.List;

public interface MvcOptionService {
    public List<EmpDTO> selectEmpList(HashMap<String, Object> map);
    public void deleteEmpList(List<String> list);
}
