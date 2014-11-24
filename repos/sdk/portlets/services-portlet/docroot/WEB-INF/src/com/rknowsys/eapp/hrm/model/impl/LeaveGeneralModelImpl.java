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

package com.rknowsys.eapp.hrm.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.rknowsys.eapp.hrm.model.LeaveGeneral;
import com.rknowsys.eapp.hrm.model.LeaveGeneralModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the LeaveGeneral service. Represents a row in the &quot;leave_general&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rknowsys.eapp.hrm.model.LeaveGeneralModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LeaveGeneralImpl}.
 * </p>
 *
 * @author rknowsys
 * @see LeaveGeneralImpl
 * @see com.rknowsys.eapp.hrm.model.LeaveGeneral
 * @see com.rknowsys.eapp.hrm.model.LeaveGeneralModel
 * @generated
 */
public class LeaveGeneralModelImpl extends BaseModelImpl<LeaveGeneral>
	implements LeaveGeneralModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a leave general model instance should use the {@link com.rknowsys.eapp.hrm.model.LeaveGeneral} interface instead.
	 */
	public static final String TABLE_NAME = "leave_general";
	public static final Object[][] TABLE_COLUMNS = {
			{ "leaveGeneralId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "userId", Types.BIGINT },
			{ "leaveTypeId", Types.BIGINT },
			{ "leavePeriodTypeId", Types.INTEGER },
			{ "startMonth", Types.INTEGER },
			{ "startDayOfMonth", Types.INTEGER },
			{ "duration", Types.VARCHAR },
			{ "ifEmployeesCanApply", Types.BOOLEAN },
			{ "ifAdminCanAssign", Types.BOOLEAN },
			{ "ifAdminCanManageEntitlements", Types.BOOLEAN },
			{ "ifLeaveAccruable", Types.BOOLEAN },
			{ "ifCarryForwardable", Types.BOOLEAN },
			{ "showProjectBalance", Types.BOOLEAN },
			{ "enableAttachment", Types.BOOLEAN },
			{ "isAttachmentMandatory", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table leave_general (leaveGeneralId LONG not null primary key,companyId LONG,groupId LONG,createDate DATE null,modifiedDate DATE null,userId LONG,leaveTypeId LONG,leavePeriodTypeId INTEGER,startMonth INTEGER,startDayOfMonth INTEGER,duration VARCHAR(75) null,ifEmployeesCanApply BOOLEAN,ifAdminCanAssign BOOLEAN,ifAdminCanManageEntitlements BOOLEAN,ifLeaveAccruable BOOLEAN,ifCarryForwardable BOOLEAN,showProjectBalance BOOLEAN,enableAttachment BOOLEAN,isAttachmentMandatory BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table leave_general";
	public static final String ORDER_BY_JPQL = " ORDER BY leaveGeneral.leaveGeneralId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY leave_general.leaveGeneralId ASC";
	public static final String DATA_SOURCE = "hrmDataSource";
	public static final String SESSION_FACTORY = "hrmSessionFactory";
	public static final String TX_MANAGER = "hrmTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rknowsys.eapp.hrm.model.LeaveGeneral"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rknowsys.eapp.hrm.model.LeaveGeneral"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.rknowsys.eapp.hrm.model.LeaveGeneral"),
			true);
	public static long GROUPID_COLUMN_BITMASK = 1L;
	public static long LEAVETYPEID_COLUMN_BITMASK = 2L;
	public static long LEAVEGENERALID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rknowsys.eapp.hrm.model.LeaveGeneral"));

	public LeaveGeneralModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _leaveGeneralId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLeaveGeneralId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _leaveGeneralId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return LeaveGeneral.class;
	}

	@Override
	public String getModelClassName() {
		return LeaveGeneral.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("leaveGeneralId", getLeaveGeneralId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userId", getUserId());
		attributes.put("leaveTypeId", getLeaveTypeId());
		attributes.put("leavePeriodTypeId", getLeavePeriodTypeId());
		attributes.put("startMonth", getStartMonth());
		attributes.put("startDayOfMonth", getStartDayOfMonth());
		attributes.put("duration", getDuration());
		attributes.put("ifEmployeesCanApply", getIfEmployeesCanApply());
		attributes.put("ifAdminCanAssign", getIfAdminCanAssign());
		attributes.put("ifAdminCanManageEntitlements",
			getIfAdminCanManageEntitlements());
		attributes.put("ifLeaveAccruable", getIfLeaveAccruable());
		attributes.put("ifCarryForwardable", getIfCarryForwardable());
		attributes.put("showProjectBalance", getShowProjectBalance());
		attributes.put("enableAttachment", getEnableAttachment());
		attributes.put("isAttachmentMandatory", getIsAttachmentMandatory());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long leaveGeneralId = (Long)attributes.get("leaveGeneralId");

		if (leaveGeneralId != null) {
			setLeaveGeneralId(leaveGeneralId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long leaveTypeId = (Long)attributes.get("leaveTypeId");

		if (leaveTypeId != null) {
			setLeaveTypeId(leaveTypeId);
		}

		Integer leavePeriodTypeId = (Integer)attributes.get("leavePeriodTypeId");

		if (leavePeriodTypeId != null) {
			setLeavePeriodTypeId(leavePeriodTypeId);
		}

		Integer startMonth = (Integer)attributes.get("startMonth");

		if (startMonth != null) {
			setStartMonth(startMonth);
		}

		Integer startDayOfMonth = (Integer)attributes.get("startDayOfMonth");

		if (startDayOfMonth != null) {
			setStartDayOfMonth(startDayOfMonth);
		}

		String duration = (String)attributes.get("duration");

		if (duration != null) {
			setDuration(duration);
		}

		Boolean ifEmployeesCanApply = (Boolean)attributes.get(
				"ifEmployeesCanApply");

		if (ifEmployeesCanApply != null) {
			setIfEmployeesCanApply(ifEmployeesCanApply);
		}

		Boolean ifAdminCanAssign = (Boolean)attributes.get("ifAdminCanAssign");

		if (ifAdminCanAssign != null) {
			setIfAdminCanAssign(ifAdminCanAssign);
		}

		Boolean ifAdminCanManageEntitlements = (Boolean)attributes.get(
				"ifAdminCanManageEntitlements");

		if (ifAdminCanManageEntitlements != null) {
			setIfAdminCanManageEntitlements(ifAdminCanManageEntitlements);
		}

		Boolean ifLeaveAccruable = (Boolean)attributes.get("ifLeaveAccruable");

		if (ifLeaveAccruable != null) {
			setIfLeaveAccruable(ifLeaveAccruable);
		}

		Boolean ifCarryForwardable = (Boolean)attributes.get(
				"ifCarryForwardable");

		if (ifCarryForwardable != null) {
			setIfCarryForwardable(ifCarryForwardable);
		}

		Boolean showProjectBalance = (Boolean)attributes.get(
				"showProjectBalance");

		if (showProjectBalance != null) {
			setShowProjectBalance(showProjectBalance);
		}

		Boolean enableAttachment = (Boolean)attributes.get("enableAttachment");

		if (enableAttachment != null) {
			setEnableAttachment(enableAttachment);
		}

		Boolean isAttachmentMandatory = (Boolean)attributes.get(
				"isAttachmentMandatory");

		if (isAttachmentMandatory != null) {
			setIsAttachmentMandatory(isAttachmentMandatory);
		}
	}

	@Override
	public long getLeaveGeneralId() {
		return _leaveGeneralId;
	}

	@Override
	public void setLeaveGeneralId(long leaveGeneralId) {
		_leaveGeneralId = leaveGeneralId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public long getLeaveTypeId() {
		return _leaveTypeId;
	}

	@Override
	public void setLeaveTypeId(long leaveTypeId) {
		_columnBitmask |= LEAVETYPEID_COLUMN_BITMASK;

		if (!_setOriginalLeaveTypeId) {
			_setOriginalLeaveTypeId = true;

			_originalLeaveTypeId = _leaveTypeId;
		}

		_leaveTypeId = leaveTypeId;
	}

	public long getOriginalLeaveTypeId() {
		return _originalLeaveTypeId;
	}

	@Override
	public int getLeavePeriodTypeId() {
		return _leavePeriodTypeId;
	}

	@Override
	public void setLeavePeriodTypeId(int leavePeriodTypeId) {
		_leavePeriodTypeId = leavePeriodTypeId;
	}

	@Override
	public int getStartMonth() {
		return _startMonth;
	}

	@Override
	public void setStartMonth(int startMonth) {
		_startMonth = startMonth;
	}

	@Override
	public int getStartDayOfMonth() {
		return _startDayOfMonth;
	}

	@Override
	public void setStartDayOfMonth(int startDayOfMonth) {
		_startDayOfMonth = startDayOfMonth;
	}

	@Override
	public String getDuration() {
		if (_duration == null) {
			return StringPool.BLANK;
		}
		else {
			return _duration;
		}
	}

	@Override
	public void setDuration(String duration) {
		_duration = duration;
	}

	@Override
	public boolean getIfEmployeesCanApply() {
		return _ifEmployeesCanApply;
	}

	@Override
	public boolean isIfEmployeesCanApply() {
		return _ifEmployeesCanApply;
	}

	@Override
	public void setIfEmployeesCanApply(boolean ifEmployeesCanApply) {
		_ifEmployeesCanApply = ifEmployeesCanApply;
	}

	@Override
	public boolean getIfAdminCanAssign() {
		return _ifAdminCanAssign;
	}

	@Override
	public boolean isIfAdminCanAssign() {
		return _ifAdminCanAssign;
	}

	@Override
	public void setIfAdminCanAssign(boolean ifAdminCanAssign) {
		_ifAdminCanAssign = ifAdminCanAssign;
	}

	@Override
	public boolean getIfAdminCanManageEntitlements() {
		return _ifAdminCanManageEntitlements;
	}

	@Override
	public boolean isIfAdminCanManageEntitlements() {
		return _ifAdminCanManageEntitlements;
	}

	@Override
	public void setIfAdminCanManageEntitlements(
		boolean ifAdminCanManageEntitlements) {
		_ifAdminCanManageEntitlements = ifAdminCanManageEntitlements;
	}

	@Override
	public boolean getIfLeaveAccruable() {
		return _ifLeaveAccruable;
	}

	@Override
	public boolean isIfLeaveAccruable() {
		return _ifLeaveAccruable;
	}

	@Override
	public void setIfLeaveAccruable(boolean ifLeaveAccruable) {
		_ifLeaveAccruable = ifLeaveAccruable;
	}

	@Override
	public boolean getIfCarryForwardable() {
		return _ifCarryForwardable;
	}

	@Override
	public boolean isIfCarryForwardable() {
		return _ifCarryForwardable;
	}

	@Override
	public void setIfCarryForwardable(boolean ifCarryForwardable) {
		_ifCarryForwardable = ifCarryForwardable;
	}

	@Override
	public boolean getShowProjectBalance() {
		return _showProjectBalance;
	}

	@Override
	public boolean isShowProjectBalance() {
		return _showProjectBalance;
	}

	@Override
	public void setShowProjectBalance(boolean showProjectBalance) {
		_showProjectBalance = showProjectBalance;
	}

	@Override
	public boolean getEnableAttachment() {
		return _enableAttachment;
	}

	@Override
	public boolean isEnableAttachment() {
		return _enableAttachment;
	}

	@Override
	public void setEnableAttachment(boolean enableAttachment) {
		_enableAttachment = enableAttachment;
	}

	@Override
	public boolean getIsAttachmentMandatory() {
		return _isAttachmentMandatory;
	}

	@Override
	public boolean isIsAttachmentMandatory() {
		return _isAttachmentMandatory;
	}

	@Override
	public void setIsAttachmentMandatory(boolean isAttachmentMandatory) {
		_isAttachmentMandatory = isAttachmentMandatory;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			LeaveGeneral.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public LeaveGeneral toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (LeaveGeneral)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LeaveGeneralImpl leaveGeneralImpl = new LeaveGeneralImpl();

		leaveGeneralImpl.setLeaveGeneralId(getLeaveGeneralId());
		leaveGeneralImpl.setCompanyId(getCompanyId());
		leaveGeneralImpl.setGroupId(getGroupId());
		leaveGeneralImpl.setCreateDate(getCreateDate());
		leaveGeneralImpl.setModifiedDate(getModifiedDate());
		leaveGeneralImpl.setUserId(getUserId());
		leaveGeneralImpl.setLeaveTypeId(getLeaveTypeId());
		leaveGeneralImpl.setLeavePeriodTypeId(getLeavePeriodTypeId());
		leaveGeneralImpl.setStartMonth(getStartMonth());
		leaveGeneralImpl.setStartDayOfMonth(getStartDayOfMonth());
		leaveGeneralImpl.setDuration(getDuration());
		leaveGeneralImpl.setIfEmployeesCanApply(getIfEmployeesCanApply());
		leaveGeneralImpl.setIfAdminCanAssign(getIfAdminCanAssign());
		leaveGeneralImpl.setIfAdminCanManageEntitlements(getIfAdminCanManageEntitlements());
		leaveGeneralImpl.setIfLeaveAccruable(getIfLeaveAccruable());
		leaveGeneralImpl.setIfCarryForwardable(getIfCarryForwardable());
		leaveGeneralImpl.setShowProjectBalance(getShowProjectBalance());
		leaveGeneralImpl.setEnableAttachment(getEnableAttachment());
		leaveGeneralImpl.setIsAttachmentMandatory(getIsAttachmentMandatory());

		leaveGeneralImpl.resetOriginalValues();

		return leaveGeneralImpl;
	}

	@Override
	public int compareTo(LeaveGeneral leaveGeneral) {
		long primaryKey = leaveGeneral.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LeaveGeneral)) {
			return false;
		}

		LeaveGeneral leaveGeneral = (LeaveGeneral)obj;

		long primaryKey = leaveGeneral.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		LeaveGeneralModelImpl leaveGeneralModelImpl = this;

		leaveGeneralModelImpl._originalGroupId = leaveGeneralModelImpl._groupId;

		leaveGeneralModelImpl._setOriginalGroupId = false;

		leaveGeneralModelImpl._originalLeaveTypeId = leaveGeneralModelImpl._leaveTypeId;

		leaveGeneralModelImpl._setOriginalLeaveTypeId = false;

		leaveGeneralModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<LeaveGeneral> toCacheModel() {
		LeaveGeneralCacheModel leaveGeneralCacheModel = new LeaveGeneralCacheModel();

		leaveGeneralCacheModel.leaveGeneralId = getLeaveGeneralId();

		leaveGeneralCacheModel.companyId = getCompanyId();

		leaveGeneralCacheModel.groupId = getGroupId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			leaveGeneralCacheModel.createDate = createDate.getTime();
		}
		else {
			leaveGeneralCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			leaveGeneralCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			leaveGeneralCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		leaveGeneralCacheModel.userId = getUserId();

		leaveGeneralCacheModel.leaveTypeId = getLeaveTypeId();

		leaveGeneralCacheModel.leavePeriodTypeId = getLeavePeriodTypeId();

		leaveGeneralCacheModel.startMonth = getStartMonth();

		leaveGeneralCacheModel.startDayOfMonth = getStartDayOfMonth();

		leaveGeneralCacheModel.duration = getDuration();

		String duration = leaveGeneralCacheModel.duration;

		if ((duration != null) && (duration.length() == 0)) {
			leaveGeneralCacheModel.duration = null;
		}

		leaveGeneralCacheModel.ifEmployeesCanApply = getIfEmployeesCanApply();

		leaveGeneralCacheModel.ifAdminCanAssign = getIfAdminCanAssign();

		leaveGeneralCacheModel.ifAdminCanManageEntitlements = getIfAdminCanManageEntitlements();

		leaveGeneralCacheModel.ifLeaveAccruable = getIfLeaveAccruable();

		leaveGeneralCacheModel.ifCarryForwardable = getIfCarryForwardable();

		leaveGeneralCacheModel.showProjectBalance = getShowProjectBalance();

		leaveGeneralCacheModel.enableAttachment = getEnableAttachment();

		leaveGeneralCacheModel.isAttachmentMandatory = getIsAttachmentMandatory();

		return leaveGeneralCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{leaveGeneralId=");
		sb.append(getLeaveGeneralId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", leaveTypeId=");
		sb.append(getLeaveTypeId());
		sb.append(", leavePeriodTypeId=");
		sb.append(getLeavePeriodTypeId());
		sb.append(", startMonth=");
		sb.append(getStartMonth());
		sb.append(", startDayOfMonth=");
		sb.append(getStartDayOfMonth());
		sb.append(", duration=");
		sb.append(getDuration());
		sb.append(", ifEmployeesCanApply=");
		sb.append(getIfEmployeesCanApply());
		sb.append(", ifAdminCanAssign=");
		sb.append(getIfAdminCanAssign());
		sb.append(", ifAdminCanManageEntitlements=");
		sb.append(getIfAdminCanManageEntitlements());
		sb.append(", ifLeaveAccruable=");
		sb.append(getIfLeaveAccruable());
		sb.append(", ifCarryForwardable=");
		sb.append(getIfCarryForwardable());
		sb.append(", showProjectBalance=");
		sb.append(getShowProjectBalance());
		sb.append(", enableAttachment=");
		sb.append(getEnableAttachment());
		sb.append(", isAttachmentMandatory=");
		sb.append(getIsAttachmentMandatory());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append("com.rknowsys.eapp.hrm.model.LeaveGeneral");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>leaveGeneralId</column-name><column-value><![CDATA[");
		sb.append(getLeaveGeneralId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>leaveTypeId</column-name><column-value><![CDATA[");
		sb.append(getLeaveTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>leavePeriodTypeId</column-name><column-value><![CDATA[");
		sb.append(getLeavePeriodTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startMonth</column-name><column-value><![CDATA[");
		sb.append(getStartMonth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>startDayOfMonth</column-name><column-value><![CDATA[");
		sb.append(getStartDayOfMonth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>duration</column-name><column-value><![CDATA[");
		sb.append(getDuration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ifEmployeesCanApply</column-name><column-value><![CDATA[");
		sb.append(getIfEmployeesCanApply());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ifAdminCanAssign</column-name><column-value><![CDATA[");
		sb.append(getIfAdminCanAssign());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ifAdminCanManageEntitlements</column-name><column-value><![CDATA[");
		sb.append(getIfAdminCanManageEntitlements());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ifLeaveAccruable</column-name><column-value><![CDATA[");
		sb.append(getIfLeaveAccruable());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ifCarryForwardable</column-name><column-value><![CDATA[");
		sb.append(getIfCarryForwardable());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>showProjectBalance</column-name><column-value><![CDATA[");
		sb.append(getShowProjectBalance());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>enableAttachment</column-name><column-value><![CDATA[");
		sb.append(getEnableAttachment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>isAttachmentMandatory</column-name><column-value><![CDATA[");
		sb.append(getIsAttachmentMandatory());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = LeaveGeneral.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			LeaveGeneral.class
		};
	private long _leaveGeneralId;
	private long _companyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _userId;
	private String _userUuid;
	private long _leaveTypeId;
	private long _originalLeaveTypeId;
	private boolean _setOriginalLeaveTypeId;
	private int _leavePeriodTypeId;
	private int _startMonth;
	private int _startDayOfMonth;
	private String _duration;
	private boolean _ifEmployeesCanApply;
	private boolean _ifAdminCanAssign;
	private boolean _ifAdminCanManageEntitlements;
	private boolean _ifLeaveAccruable;
	private boolean _ifCarryForwardable;
	private boolean _showProjectBalance;
	private boolean _enableAttachment;
	private boolean _isAttachmentMandatory;
	private long _columnBitmask;
	private LeaveGeneral _escapedModel;
}