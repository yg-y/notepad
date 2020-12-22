package com.young.notepad.web.service.impl;

import com.young.notepad.web.entity.ClientUser;
import com.young.notepad.web.mapper.ClientUserMapper;
import com.young.notepad.web.service.IClientUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author young
 * @since 2020-12-22
 */
@Service
public class ClientUserServiceImpl extends ServiceImpl<ClientUserMapper, ClientUser> implements IClientUserService {

}
