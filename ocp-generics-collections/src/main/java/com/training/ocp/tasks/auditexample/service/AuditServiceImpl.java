package com.training.ocp.tasks.auditexample.service;

import com.training.ocp.tasks.auditexample.pojos.AbstractAuditPojo;

/**
 * That class illustrate possible auditing to some NoSQL database and requiring
 * that every audited class must have index and timestamp attributes.
 * 
 * @author Pavel Seda
 *
 */
public class AuditServiceImpl implements AuditService {

	@Override
	public <T extends AbstractAuditPojo> void save(T t) {
		t.setIndex(t.getClass().getName().toLowerCase());
		t.setTimestamp(System.currentTimeMillis());
		System.out.println(t);
	}

}
