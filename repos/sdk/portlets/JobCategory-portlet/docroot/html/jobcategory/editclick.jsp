<%@page import="com.rknowsys.eapp.hrm.model.JobCategory"%>
<%@page import="com.rknowsys.eapp.hrm.model.JobTitle"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
    <%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
   <%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>button</title>
</head>
<body>

<%ResultRow rslt=(ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);

JobCategory j = (JobCategory)rslt.getObject();

String prk=String.valueOf(j.getPrimaryKey());
%>
<liferay-ui:icon-menu>
<portlet:actionURL var="editjobcategory" name="editJobcategory">
<portlet:param name="jobCategoryId" value="<%=prk %>"/>
</portlet:actionURL>


<a href="#" onclick="window.location='<%=editjobcategory.toString()%>'"><img
					width="18px" height="18px" alt="loading..." 
					src="<%=request.getContextPath() %>/images/pencil.jpg"></a> 
</liferay-ui:icon-menu>
</body>
</html>