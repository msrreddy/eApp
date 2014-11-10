/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rknowsys.eapp.hrm.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the LeavePeriod service. Represents a row in the &quot;leave_period&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rknowsys.eapp.hrm.model.impl.LeavePeriodModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rknowsys.eapp.hrm.model.impl.LeavePeriodImpl}.
 * </p>
 *
 * @author rknowsys
 * @see LeavePeriod
 * @see com.rknowsys.eapp.hrm.model.impl.LeavePeriodImpl
 * @see com.rknowsys.eapp.hrm.model.impl.LeavePeriodModelImpl
 * @generated
 */
public interface LeavePeriodModel extends BaseModel<LeavePeriod> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a leave period model instance should use the {@link LeavePeriod} interface instead.
	 */

	/**
	 * Returns the primary key of this leave period.
	 *
	 * @return the primary key of this leave period
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this leave period.
	 *
	 * @param primaryKey the primary key of this leave period
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the leave period ID of this leave period.
	 *
	 * @return the leave period ID of this leave period
	 */
	public long getLeavePeriodId();

	/**
	 * Sets the leave period ID of this leave period.
	 *
	 * @param leavePeriodId the leave period ID of this leave period
	 */
	public void setLeavePeriodId(long leavePeriodId);

	/**
	 * Returns the company ID of this leave period.
	 *
	 * @return the company ID of this leave period
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this leave period.
	 *
	 * @param companyId the company ID of this leave period
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this leave period.
	 *
	 * @return the group ID of this leave period
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this leave period.
	 *
	 * @param groupId the group ID of this leave period
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the create date of this leave period.
	 *
	 * @return the create date of this leave period
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this leave period.
	 *
	 * @param createDate the create date of this leave period
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this leave period.
	 *
	 * @return the modified date of this leave period
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this leave period.
	 *
	 * @param modifiedDate the modified date of this leave period
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the user ID of this leave period.
	 *
	 * @return the user ID of this leave period
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this leave period.
	 *
	 * @param userId the user ID of this leave period
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this leave period.
	 *
	 * @return the user uuid of this leave period
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this leave period.
	 *
	 * @param userUuid the user uuid of this leave period
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the start month of this leave period.
	 *
	 * @return the start month of this leave period
	 */
	public int getStartMonth();

	/**
	 * Sets the start month of this leave period.
	 *
	 * @param startMonth the start month of this leave period
	 */
	public void setStartMonth(int startMonth);

	/**
	 * Returns the start date of this leave period.
	 *
	 * @return the start date of this leave period
	 */
	public int getStartDate();

	/**
	 * Sets the start date of this leave period.
	 *
	 * @param startDate the start date of this leave period
	 */
	public void setStartDate(int startDate);

	/**
	 * Returns the end date of this leave period.
	 *
	 * @return the end date of this leave period
	 */
	@AutoEscape
	public String getEndDate();

	/**
	 * Sets the end date of this leave period.
	 *
	 * @param endDate the end date of this leave period
	 */
	public void setEndDate(String endDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(LeavePeriod leavePeriod);

	@Override
	public int hashCode();

	@Override
	public CacheModel<LeavePeriod> toCacheModel();

	@Override
	public LeavePeriod toEscapedModel();

	@Override
	public LeavePeriod toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}