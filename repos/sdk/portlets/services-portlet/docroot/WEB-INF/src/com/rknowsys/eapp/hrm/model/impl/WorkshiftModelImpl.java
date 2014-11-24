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

import com.rknowsys.eapp.hrm.model.Workshift;
import com.rknowsys.eapp.hrm.model.WorkshiftModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Workshift service. Represents a row in the &quot;workshift&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rknowsys.eapp.hrm.model.WorkshiftModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link WorkshiftImpl}.
 * </p>
 *
 * @author rknowsys
 * @see WorkshiftImpl
 * @see com.rknowsys.eapp.hrm.model.Workshift
 * @see com.rknowsys.eapp.hrm.model.WorkshiftModel
 * @generated
 */
public class WorkshiftModelImpl extends BaseModelImpl<Workshift>
	implements WorkshiftModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a workshift model instance should use the {@link com.rknowsys.eapp.hrm.model.Workshift} interface instead.
	 */
	public static final String TABLE_NAME = "workshift";
	public static final Object[][] TABLE_COLUMNS = {
			{ "shiftId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "userId", Types.BIGINT },
			{ "workshiftName", Types.VARCHAR },
			{ "fromWorkHours", Types.TIMESTAMP },
			{ "toWorkHours", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table workshift (shiftId LONG not null primary key,companyId LONG,groupId LONG,createDate DATE null,modifiedDate DATE null,userId LONG,workshiftName VARCHAR(75) null,fromWorkHours DATE null,toWorkHours DATE null)";
	public static final String TABLE_SQL_DROP = "drop table workshift";
	public static final String ORDER_BY_JPQL = " ORDER BY workshift.shiftId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY workshift.shiftId ASC";
	public static final String DATA_SOURCE = "hrmDataSource";
	public static final String SESSION_FACTORY = "hrmSessionFactory";
	public static final String TX_MANAGER = "hrmTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rknowsys.eapp.hrm.model.Workshift"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rknowsys.eapp.hrm.model.Workshift"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.rknowsys.eapp.hrm.model.Workshift"),
			true);
	public static long GROUPID_COLUMN_BITMASK = 1L;
	public static long SHIFTID_COLUMN_BITMASK = 2L;
	public static final String MAPPING_TABLE_HRM_EMP_WORKSHIFT_NAME = "hrm_emp_workshift";
	public static final Object[][] MAPPING_TABLE_HRM_EMP_WORKSHIFT_COLUMNS = {
			{ "shiftId", Types.BIGINT },
			{ "employeeId", Types.BIGINT }
		};
	public static final String MAPPING_TABLE_HRM_EMP_WORKSHIFT_SQL_CREATE = "create table hrm_emp_workshift (employeeId LONG not null,shiftId LONG not null,primary key (employeeId, shiftId))";
	public static final boolean FINDER_CACHE_ENABLED_HRM_EMP_WORKSHIFT = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.hrm_emp_workshift"), true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rknowsys.eapp.hrm.model.Workshift"));

	public WorkshiftModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _shiftId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setShiftId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _shiftId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Workshift.class;
	}

	@Override
	public String getModelClassName() {
		return Workshift.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("shiftId", getShiftId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("userId", getUserId());
		attributes.put("workshiftName", getWorkshiftName());
		attributes.put("fromWorkHours", getFromWorkHours());
		attributes.put("toWorkHours", getToWorkHours());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long shiftId = (Long)attributes.get("shiftId");

		if (shiftId != null) {
			setShiftId(shiftId);
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

		String workshiftName = (String)attributes.get("workshiftName");

		if (workshiftName != null) {
			setWorkshiftName(workshiftName);
		}

		Date fromWorkHours = (Date)attributes.get("fromWorkHours");

		if (fromWorkHours != null) {
			setFromWorkHours(fromWorkHours);
		}

		Date toWorkHours = (Date)attributes.get("toWorkHours");

		if (toWorkHours != null) {
			setToWorkHours(toWorkHours);
		}
	}

	@Override
	public long getShiftId() {
		return _shiftId;
	}

	@Override
	public void setShiftId(long shiftId) {
		_columnBitmask |= SHIFTID_COLUMN_BITMASK;

		if (!_setOriginalShiftId) {
			_setOriginalShiftId = true;

			_originalShiftId = _shiftId;
		}

		_shiftId = shiftId;
	}

	public long getOriginalShiftId() {
		return _originalShiftId;
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
	public String getWorkshiftName() {
		if (_workshiftName == null) {
			return StringPool.BLANK;
		}
		else {
			return _workshiftName;
		}
	}

	@Override
	public void setWorkshiftName(String workshiftName) {
		_workshiftName = workshiftName;
	}

	@Override
	public Date getFromWorkHours() {
		return _fromWorkHours;
	}

	@Override
	public void setFromWorkHours(Date fromWorkHours) {
		_fromWorkHours = fromWorkHours;
	}

	@Override
	public Date getToWorkHours() {
		return _toWorkHours;
	}

	@Override
	public void setToWorkHours(Date toWorkHours) {
		_toWorkHours = toWorkHours;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Workshift.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Workshift toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Workshift)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		WorkshiftImpl workshiftImpl = new WorkshiftImpl();

		workshiftImpl.setShiftId(getShiftId());
		workshiftImpl.setCompanyId(getCompanyId());
		workshiftImpl.setGroupId(getGroupId());
		workshiftImpl.setCreateDate(getCreateDate());
		workshiftImpl.setModifiedDate(getModifiedDate());
		workshiftImpl.setUserId(getUserId());
		workshiftImpl.setWorkshiftName(getWorkshiftName());
		workshiftImpl.setFromWorkHours(getFromWorkHours());
		workshiftImpl.setToWorkHours(getToWorkHours());

		workshiftImpl.resetOriginalValues();

		return workshiftImpl;
	}

	@Override
	public int compareTo(Workshift workshift) {
		long primaryKey = workshift.getPrimaryKey();

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

		if (!(obj instanceof Workshift)) {
			return false;
		}

		Workshift workshift = (Workshift)obj;

		long primaryKey = workshift.getPrimaryKey();

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
		WorkshiftModelImpl workshiftModelImpl = this;

		workshiftModelImpl._originalShiftId = workshiftModelImpl._shiftId;

		workshiftModelImpl._setOriginalShiftId = false;

		workshiftModelImpl._originalGroupId = workshiftModelImpl._groupId;

		workshiftModelImpl._setOriginalGroupId = false;

		workshiftModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Workshift> toCacheModel() {
		WorkshiftCacheModel workshiftCacheModel = new WorkshiftCacheModel();

		workshiftCacheModel.shiftId = getShiftId();

		workshiftCacheModel.companyId = getCompanyId();

		workshiftCacheModel.groupId = getGroupId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			workshiftCacheModel.createDate = createDate.getTime();
		}
		else {
			workshiftCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			workshiftCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			workshiftCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		workshiftCacheModel.userId = getUserId();

		workshiftCacheModel.workshiftName = getWorkshiftName();

		String workshiftName = workshiftCacheModel.workshiftName;

		if ((workshiftName != null) && (workshiftName.length() == 0)) {
			workshiftCacheModel.workshiftName = null;
		}

		Date fromWorkHours = getFromWorkHours();

		if (fromWorkHours != null) {
			workshiftCacheModel.fromWorkHours = fromWorkHours.getTime();
		}
		else {
			workshiftCacheModel.fromWorkHours = Long.MIN_VALUE;
		}

		Date toWorkHours = getToWorkHours();

		if (toWorkHours != null) {
			workshiftCacheModel.toWorkHours = toWorkHours.getTime();
		}
		else {
			workshiftCacheModel.toWorkHours = Long.MIN_VALUE;
		}

		return workshiftCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{shiftId=");
		sb.append(getShiftId());
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
		sb.append(", workshiftName=");
		sb.append(getWorkshiftName());
		sb.append(", fromWorkHours=");
		sb.append(getFromWorkHours());
		sb.append(", toWorkHours=");
		sb.append(getToWorkHours());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.rknowsys.eapp.hrm.model.Workshift");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>shiftId</column-name><column-value><![CDATA[");
		sb.append(getShiftId());
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
			"<column><column-name>workshiftName</column-name><column-value><![CDATA[");
		sb.append(getWorkshiftName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fromWorkHours</column-name><column-value><![CDATA[");
		sb.append(getFromWorkHours());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>toWorkHours</column-name><column-value><![CDATA[");
		sb.append(getToWorkHours());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Workshift.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Workshift.class
		};
	private long _shiftId;
	private long _originalShiftId;
	private boolean _setOriginalShiftId;
	private long _companyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _userId;
	private String _userUuid;
	private String _workshiftName;
	private Date _fromWorkHours;
	private Date _toWorkHours;
	private long _columnBitmask;
	private Workshift _escapedModel;
}