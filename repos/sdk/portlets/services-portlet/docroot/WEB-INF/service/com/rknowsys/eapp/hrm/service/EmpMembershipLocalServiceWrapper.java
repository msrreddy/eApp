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

package com.rknowsys.eapp.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmpMembershipLocalService}.
 *
 * @author rknowsys
 * @see EmpMembershipLocalService
 * @generated
 */
public class EmpMembershipLocalServiceWrapper
	implements EmpMembershipLocalService,
		ServiceWrapper<EmpMembershipLocalService> {
	public EmpMembershipLocalServiceWrapper(
		EmpMembershipLocalService empMembershipLocalService) {
		_empMembershipLocalService = empMembershipLocalService;
	}

	/**
	* Adds the emp membership to the database. Also notifies the appropriate model listeners.
	*
	* @param empMembership the emp membership
	* @return the emp membership that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.EmpMembership addEmpMembership(
		com.rknowsys.eapp.hrm.model.EmpMembership empMembership)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empMembershipLocalService.addEmpMembership(empMembership);
	}

	/**
	* Creates a new emp membership with the primary key. Does not add the emp membership to the database.
	*
	* @param empMembershipId the primary key for the new emp membership
	* @return the new emp membership
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.EmpMembership createEmpMembership(
		long empMembershipId) {
		return _empMembershipLocalService.createEmpMembership(empMembershipId);
	}

	/**
	* Deletes the emp membership with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param empMembershipId the primary key of the emp membership
	* @return the emp membership that was removed
	* @throws PortalException if a emp membership with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.EmpMembership deleteEmpMembership(
		long empMembershipId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _empMembershipLocalService.deleteEmpMembership(empMembershipId);
	}

	/**
	* Deletes the emp membership from the database. Also notifies the appropriate model listeners.
	*
	* @param empMembership the emp membership
	* @return the emp membership that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.EmpMembership deleteEmpMembership(
		com.rknowsys.eapp.hrm.model.EmpMembership empMembership)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empMembershipLocalService.deleteEmpMembership(empMembership);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _empMembershipLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empMembershipLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rknowsys.eapp.hrm.model.impl.EmpMembershipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _empMembershipLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rknowsys.eapp.hrm.model.impl.EmpMembershipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empMembershipLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empMembershipLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empMembershipLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.rknowsys.eapp.hrm.model.EmpMembership fetchEmpMembership(
		long empMembershipId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empMembershipLocalService.fetchEmpMembership(empMembershipId);
	}

	/**
	* Returns the emp membership with the primary key.
	*
	* @param empMembershipId the primary key of the emp membership
	* @return the emp membership
	* @throws PortalException if a emp membership with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.EmpMembership getEmpMembership(
		long empMembershipId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _empMembershipLocalService.getEmpMembership(empMembershipId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _empMembershipLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the emp memberships.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rknowsys.eapp.hrm.model.impl.EmpMembershipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emp memberships
	* @param end the upper bound of the range of emp memberships (not inclusive)
	* @return the range of emp memberships
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rknowsys.eapp.hrm.model.EmpMembership> getEmpMemberships(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empMembershipLocalService.getEmpMemberships(start, end);
	}

	/**
	* Returns the number of emp memberships.
	*
	* @return the number of emp memberships
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEmpMembershipsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empMembershipLocalService.getEmpMembershipsCount();
	}

	/**
	* Updates the emp membership in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param empMembership the emp membership
	* @return the emp membership that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.EmpMembership updateEmpMembership(
		com.rknowsys.eapp.hrm.model.EmpMembership empMembership)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empMembershipLocalService.updateEmpMembership(empMembership);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _empMembershipLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_empMembershipLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _empMembershipLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public EmpMembershipLocalService getWrappedEmpMembershipLocalService() {
		return _empMembershipLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEmpMembershipLocalService(
		EmpMembershipLocalService empMembershipLocalService) {
		_empMembershipLocalService = empMembershipLocalService;
	}

	@Override
	public EmpMembershipLocalService getWrappedService() {
		return _empMembershipLocalService;
	}

	@Override
	public void setWrappedService(
		EmpMembershipLocalService empMembershipLocalService) {
		_empMembershipLocalService = empMembershipLocalService;
	}

	private EmpMembershipLocalService _empMembershipLocalService;
}