<%-- 
    Document   : study
    Created on : Mar 9, 2016, 11:45:27 AM
    Author     : a03538
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${message}</title>
    </head>
    <body>
        <table>
    <c:forEach items ="${studies}" var="study">
    <tr>
        <td><c:out value="${study.eqStudyId}"></c:out></td>
<td><c:out value="${study.eqCoSponId 				}"></c:out></td>
<td><c:out value="${study.nctid 					}"></c:out></td>    
<td><c:out value="${study.euStudyId 				}"></c:out></td>
<td><c:out value="${study.studyAname 				}"></c:out></td>
<td><c:out value="${study.studyTitle 				}"></c:out></td>
<td><c:out value="${study.sponStudyId 			}"></c:out></td>
<td><c:out value="${study.coSponStudyId 			}"></c:out></td>
<td><c:out value="${study.studyStartDate 			}"></c:out></td>
<td><c:out value="${study.studyEndDate 			}"></c:out></td>
<td><c:out value="${study.studyEqInitDate 		}"></c:out></td>
<td><c:out value="${study.studyEqCloseDate 		}"></c:out></td>
<td><c:out value="${study.plannedPatientsNum 		}"></c:out></td>

<td><c:out value="${study.chartGroupId 			}"></c:out></td>
<td><c:out value="${study.studyStatus 			}"></c:out></td>
<td><c:out value="${study.organizationsByEqSponId.eqOrgId 			}"></c:out></td>
<td><c:out value="${study.organizationsByEqIwrsId.eqOrgId 			}"></c:out></td>


    </tr>
    </c:forEach>
    </table>
    </body>
</html>
