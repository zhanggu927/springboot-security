package com.annet.core.service;

import com.annet.core.model.SysUser;
import com.annet.core.repository.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * 创建人： Zhang
 * 修改时间：2017/3/24
 * 描述：
 */

public class CustomUserService implements UserDetailsService {
    @Autowired
    private SysUserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        SysUser sysUser = userRepository.findByUsername(s);
        if(sysUser==null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        return sysUser;
    }
}
