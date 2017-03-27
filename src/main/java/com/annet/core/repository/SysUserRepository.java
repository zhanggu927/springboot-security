package com.annet.core.repository;

import com.annet.core.model.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 创建人： Zhang
 * 修改时间：2017/3/24
 * 描述：
 */
public interface SysUserRepository extends JpaRepository<SysUser,Long> {
    //根据用户名查出用户
    SysUser findByUsername(String username);
}
