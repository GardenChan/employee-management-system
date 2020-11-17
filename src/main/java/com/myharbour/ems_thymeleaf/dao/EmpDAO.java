package com.myharbour.ems_thymeleaf.dao;

import com.myharbour.ems_thymeleaf.entity.Emp;

import java.util.List;

public interface EmpDAO {
    public List<Emp> findAll();

    void save(Emp emp);

    void delete(String id);

    Emp find(String id);

    void update(Emp emp);

}
