package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.dao.RolesMapper;
import com.woniuxy.domain.Roles;
import com.woniuxy.service.IRolesService;
@Service
public class RolesService implements IRolesService {
	@Autowired
	private RolesMapper rolesMapper;
	@Override
	public void save(Roles role) {
		rolesMapper.insertSelective(role);
	}

	@Override
	public void delete(Integer rolesid) {
		rolesMapper.deleteByPrimaryKey(rolesid);    
	}

	@Override
	public void update(Roles role) {
		rolesMapper.updateByPrimaryKey(role);
	}

	@Override
	public List<Roles> findAll() {
		return rolesMapper.selectByExample(null);
	}

	@Override
	public Roles findOne(Integer rolesid) {
		return rolesMapper.selectByPrimaryKey(rolesid);
	}

}
