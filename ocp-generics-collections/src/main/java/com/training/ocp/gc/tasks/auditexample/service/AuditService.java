package com.training.ocp.gc.tasks.auditexample.service;

import com.training.ocp.gc.tasks.auditexample.pojos.AbstractAuditPojo;

/**
 * 
 * @author Pavel Seda
 *
 */
public interface AuditService {

	<T extends AbstractAuditPojo> void save(T t);
}
