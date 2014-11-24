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
 * The base model interface for the Language service. Represents a row in the &quot;language&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rknowsys.eapp.hrm.model.impl.LanguageModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rknowsys.eapp.hrm.model.impl.LanguageImpl}.
 * </p>
 *
 * @author rknowsys
 * @see Language
 * @see com.rknowsys.eapp.hrm.model.impl.LanguageImpl
 * @see com.rknowsys.eapp.hrm.model.impl.LanguageModelImpl
 * @generated
 */
public interface LanguageModel extends BaseModel<Language> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a language model instance should use the {@link Language} interface instead.
	 */

	/**
	 * Returns the primary key of this language.
	 *
	 * @return the primary key of this language
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this language.
	 *
	 * @param primaryKey the primary key of this language
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the language ID of this language.
	 *
	 * @return the language ID of this language
	 */
	public long getLanguageId();

	/**
	 * Sets the language ID of this language.
	 *
	 * @param languageId the language ID of this language
	 */
	public void setLanguageId(long languageId);

	/**
	 * Returns the company ID of this language.
	 *
	 * @return the company ID of this language
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this language.
	 *
	 * @param companyId the company ID of this language
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this language.
	 *
	 * @return the group ID of this language
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this language.
	 *
	 * @param groupId the group ID of this language
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the create date of this language.
	 *
	 * @return the create date of this language
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this language.
	 *
	 * @param createDate the create date of this language
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this language.
	 *
	 * @return the modified date of this language
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this language.
	 *
	 * @param modifiedDate the modified date of this language
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the user ID of this language.
	 *
	 * @return the user ID of this language
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this language.
	 *
	 * @param userId the user ID of this language
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this language.
	 *
	 * @return the user uuid of this language
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this language.
	 *
	 * @param userUuid the user uuid of this language
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the language name of this language.
	 *
	 * @return the language name of this language
	 */
	@AutoEscape
	public String getLanguageName();

	/**
	 * Sets the language name of this language.
	 *
	 * @param languageName the language name of this language
	 */
	public void setLanguageName(String languageName);

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
	public int compareTo(Language language);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Language> toCacheModel();

	@Override
	public Language toEscapedModel();

	@Override
	public Language toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}