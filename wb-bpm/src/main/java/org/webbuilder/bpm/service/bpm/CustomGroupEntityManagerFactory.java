package org.webbuilder.bpm.service.bpm;

import org.activiti.engine.impl.interceptor.Session;
import org.activiti.engine.impl.interceptor.SessionFactory;
import org.activiti.engine.impl.persistence.entity.GroupEntityManager;
import org.activiti.engine.impl.persistence.entity.GroupIdentityManager;

import javax.annotation.Resource;

public class CustomGroupEntityManagerFactory implements SessionFactory {
    private GroupEntityManager groupEntityManager;

    @Resource
    public void setGroupEntityManager(GroupEntityManager groupEntityManager) {
    this.groupEntityManager = groupEntityManager;
    }

    public Class getSessionType() {
    return GroupIdentityManager.class;
    }

    public Session openSession() {
    return groupEntityManager;
    }
}
