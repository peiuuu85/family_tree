package com.starfire.familytree.folk.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.starfire.familytree.folk.entity.CategoryContent;
import com.starfire.familytree.folk.entity.People;
import com.starfire.familytree.vo.PageInfo;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author luzh
 * @since 2019-08-09
 */
public interface IPeopleService extends IService<People> {


    public People addWife(People wife,Long husbandId);

    public People addChildren(People child,Long parentId);

    public People getHusband(Long husbandId);

    public People addPeople(People people);


    public List<People> getPeoplesByGeneration(int gen);

    /**
     * 获取祖先第一人
     * @param gen
     * @return
     */
    public People getForefather(int gen);

    public People getFamilyTree(String branch);

    public PageInfo<Map<String, Object>, People> page(PageInfo<Map<String, Object>, People> page);

}
