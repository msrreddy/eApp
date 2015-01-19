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
 * The base model interface for the LeaveRestriction service. Represents a row in the &quot;leave_restriction&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rknowsys.eapp.hrm.model.impl.LeaveRestrictionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rknowsys.eapp.hrm.model.impl.LeaveRestrictionImpl}.
 * </p>
 *
 * @author rknowsys
 * @see LeaveRestriction
 * @see com.rknowsys.eapp.hrm.model.impl.LeaveRestrictionImpl
 * @see com.rknowsys.eapp.hrm.model.impl.LeaveRestrictionModelImpl
 * @generated
 */
public interface LeaveRestrictionModel extends BaseModel<LeaveRestriction> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a leave restriction model instance should use the {@link LeaveRestriction} interface instead.
	 */

	/**
	 * Returns the primary key of this leave restriction.
	 *
	 * @return the primary key of this leave restriction
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this leave restriction.
	 *
	 * @param primaryKey the primary key of this leave restriction
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the leave restriction ID of this leave restriction.
	 *
	 * @return the leave restriction ID of this leave restriction
	 */
	public long getLeaveRestrictionId();

	/**
	 * Sets the leave restriction ID of this leave restriction.
	 *
	 * @param leaveRestrictionId the leave restriction ID of this leave restriction
	 */
	public void setLeaveRestrictionId(long leaveRestrictionId);

	/**
	 * Returns the company ID of this leave restriction.
	 *
	 * @return the company ID of this leave restriction
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this leave restriction.
	 *
	 * @param companyId the company ID of this leave restriction
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this leave restriction.
	 *
	 * @return the group ID of this leave restriction
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this leave restriction.
	 *
	 * @param groupId the group ID of this leave restriction
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the create date of this leave restriction.
	 *
	 * @return the create date of this leave restriction
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this leave restriction.
	 *
	 * @param createDate the create date of this leave restriction
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this leave restriction.
	 *
	 * @return the modified date of this leave restriction
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this leave restriction.
	 *
	 * @param modifiedDate the modified date of this leave restriction
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the user ID of this leave restriction.
	 *
	 * @return the user ID of this leave restriction
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this leave restriction.
	 *
	 * @param userId the user ID of this leave restriction
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this leave restriction.
	 *
	 * @return the user uuid of this leave restriction
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this leave restriction.
	 *
	 * @param userUuid the user uuid of this leave restriction
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the leave type ID of this leave restriction.
	 *
	 * @return the leave type ID of this leave restriction
	 */
	public long getLeaveTypeId();

	/**
	 * Sets the leave type ID of this leave restriction.
	 *
	 * @param leaveTypeId the leave type ID of this leave restriction
	 */
	public void setLeaveTypeId(long leaveTypeId);

	/**
	 * Returns the cannot exceed balance of this leave restriction.
	 *
	 * @return the cannot exceed balance of this leave restriction
	 */
	public boolean getCannotExceedBalance();

	/**
	 * Returns <code>true</code> if this leave restriction is cannot exceed balance.
	 *
	 * @return <code>true</code> if this leave restriction is cannot exceed balance; <code>false</code> otherwise
	 */
	public boolean isCannotExceedBalance();

	/**
	 * Sets whether this leave restriction is cannot exceed balance.
	 *
	 * @param cannotExceedBalance the cannot exceed balance of this leave restriction
	 */
	public void setCannotExceedBalance(boolean cannotExceedBalance);

	/**
	 * Returns the cant exceed bal for role IDs of this leave restriction.
	 *
	 * @return the cant exceed bal for role IDs of this leave restriction
	 */
	@AutoEscape
	public String getCantExceedBalForRoleIds();

	/**
	 * Sets the cant exceed bal for role IDs of this leave restriction.
	 *
	 * @param cantExceedBalForRoleIds the cant exceed bal for role IDs of this leave restriction
	 */
	public void setCantExceedBalForRoleIds(String cantExceedBalForRoleIds);

	/**
	 * Returns the cannot apply for partial day of this leave restriction.
	 *
	 * @return the cannot apply for partial day of this leave restriction
	 */
	public boolean getCannotApplyForPartialDay();

	/**
	 * Returns <code>true</code> if this leave restriction is cannot apply for partial day.
	 *
	 * @return <code>true</code> if this leave restriction is cannot apply for partial day; <code>false</code> otherwise
	 */
	public boolean isCannotApplyForPartialDay();

	/**
	 * Sets whether this leave restriction is cannot apply for partial day.
	 *
	 * @param cannotApplyForPartialDay the cannot apply for partial day of this leave restriction
	 */
	public void setCannotApplyForPartialDay(boolean cannotApplyForPartialDay);

	/**
	 * Returns the cant apply partial day for role IDs of this leave restriction.
	 *
	 * @return the cant apply partial day for role IDs of this leave restriction
	 */
	@AutoEscape
	public String getCantApplyPartialDayForRoleIds();

	/**
	 * Sets the cant apply partial day for role IDs of this leave restriction.
	 *
	 * @param cantApplyPartialDayForRoleIds the cant apply partial day for role IDs of this leave restriction
	 */
	public void setCantApplyPartialDayForRoleIds(
		String cantApplyPartialDayForRoleIds);

	/**
	 * Returns the terms question of this leave restriction.
	 *
	 * @return the terms question of this leave restriction
	 */
	@AutoEscape
	public String getTermsQuestion();

	/**
	 * Sets the terms question of this leave restriction.
	 *
	 * @param termsQuestion the terms question of this leave restriction
	 */
	public void setTermsQuestion(String termsQuestion);

	/**
	 * Returns the terms qsn for role IDs of this leave restriction.
	 *
	 * @return the terms qsn for role IDs of this leave restriction
	 */
	@AutoEscape
	public String getTermsQsnForRoleIds();

	/**
	 * Sets the terms qsn for role IDs of this leave restriction.
	 *
	 * @param termsQsnForRoleIds the terms qsn for role IDs of this leave restriction
	 */
	public void setTermsQsnForRoleIds(String termsQsnForRoleIds);

	/**
	 * Returns the error text if terms declined of this leave restriction.
	 *
	 * @return the error text if terms declined of this leave restriction
	 */
	@AutoEscape
	public String getErrorTextIfTermsDeclined();

	/**
	 * Sets the error text if terms declined of this leave restriction.
	 *
	 * @param errorTextIfTermsDeclined the error text if terms declined of this leave restriction
	 */
	public void setErrorTextIfTermsDeclined(String errorTextIfTermsDeclined);

	/**
	 * Returns the minimum service period of this leave restriction.
	 *
	 * @return the minimum service period of this leave restriction
	 */
	@AutoEscape
	public String getMinimumServicePeriod();

	/**
	 * Sets the minimum service period of this leave restriction.
	 *
	 * @param minimumServicePeriod the minimum service period of this leave restriction
	 */
	public void setMinimumServicePeriod(String minimumServicePeriod);

	/**
	 * Returns the min service period for role IDs of this leave restriction.
	 *
	 * @return the min service period for role IDs of this leave restriction
	 */
	@AutoEscape
	public String getMinServicePeriodForRoleIds();

	/**
	 * Sets the min service period for role IDs of this leave restriction.
	 *
	 * @param minServicePeriodForRoleIds the min service period for role IDs of this leave restriction
	 */
	public void setMinServicePeriodForRoleIds(String minServicePeriodForRoleIds);

	/**
	 * Returns the max consecutive leaves of this leave restriction.
	 *
	 * @return the max consecutive leaves of this leave restriction
	 */
	@AutoEscape
	public String getMaxConsecutiveLeaves();

	/**
	 * Sets the max consecutive leaves of this leave restriction.
	 *
	 * @param maxConsecutiveLeaves the max consecutive leaves of this leave restriction
	 */
	public void setMaxConsecutiveLeaves(String maxConsecutiveLeaves);

	/**
	 * Returns the max consec leaves for role IDs of this leave restriction.
	 *
	 * @return the max consec leaves for role IDs of this leave restriction
	 */
	@AutoEscape
	public String getMaxConsecLeavesForRoleIds();

	/**
	 * Sets the max consec leaves for role IDs of this leave restriction.
	 *
	 * @param maxConsecLeavesForRoleIds the max consec leaves for role IDs of this leave restriction
	 */
	public void setMaxConsecLeavesForRoleIds(String maxConsecLeavesForRoleIds);

	/**
	 * Returns the max small child age applicable of this leave restriction.
	 *
	 * @return the max small child age applicable of this leave restriction
	 */
	@AutoEscape
	public String getMaxSmallChildAgeApplicable();

	/**
	 * Sets the max small child age applicable of this leave restriction.
	 *
	 * @param maxSmallChildAgeApplicable the max small child age applicable of this leave restriction
	 */
	public void setMaxSmallChildAgeApplicable(String maxSmallChildAgeApplicable);

	/**
	 * Returns the max small child age for role IDs of this leave restriction.
	 *
	 * @return the max small child age for role IDs of this leave restriction
	 */
	@AutoEscape
	public String getMaxSmallChildAgeForRoleIds();

	/**
	 * Sets the max small child age for role IDs of this leave restriction.
	 *
	 * @param maxSmallChildAgeForRoleIds the max small child age for role IDs of this leave restriction
	 */
	public void setMaxSmallChildAgeForRoleIds(String maxSmallChildAgeForRoleIds);

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
	public int compareTo(LeaveRestriction leaveRestriction);

	@Override
	public int hashCode();

	@Override
	public CacheModel<LeaveRestriction> toCacheModel();

	@Override
	public LeaveRestriction toEscapedModel();

	@Override
	public LeaveRestriction toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}