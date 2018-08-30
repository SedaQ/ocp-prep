package com.training.ocp.tasks.auditexample.service;

import com.training.ocp.tasks.auditexample.pojos.AbstractAuditPojo;

/**
 * 
 * @author Pavel Seda
 *
 */
public interface AuditService {

	<T extends AbstractAuditPojo> void save(T t);
}
