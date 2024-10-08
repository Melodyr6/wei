package com.aaa.mapper;

import com.aaa.entity.Ban;
import com.aaa.entity.PaiBanVo;
import com.aaa.entity.Paiban;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaibanMapper {
    List<Paiban> findAllPaiban(Paiban paiban);
    int editPaiban(Paiban paiban);
    List<Ban> findAllBan();
    int insertPaiban(Paiban paiban);
    int count(Integer Id);
    Paiban getTimePeriodByDoctorId(PaiBanVo paiBanVo);
}
