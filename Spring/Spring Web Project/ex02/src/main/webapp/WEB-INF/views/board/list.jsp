<%--
  Created by IntelliJ IDEA.
  User: eunbin
  Date: 2023/01/11
  Time: 12:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<%@include file="../includes/header.jsp"%>

<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">Tables</h1>
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    Board List Page
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
                    <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                        <thead>
                        <tr>
                            <th># Number</th>
                            <th>Title</th>
                            <th>Writer</th>
                            <th>Register Date</th>
                            <th>Update Date</th>
                        </tr>
                        </thead>
                        <c:forEach items="${list}" var="board">
                        <tr>
                            <td><c:out value="${board.bno}" /></td>
                            <td><c:out value="${board.title}" /></td>
                            <td><c:out value="${board.writer}" /></td>
                            <td><fmt:formatDate pattern="yyyy-MM-dd" value="${board.regdate}" /></td>
                            <td><fmt:formatDate pattern="yyyy-MM-dd" value="${board.updatedate}" /></td>
                        </tr>
                        </c:forEach>
                    </table>
                </div>
                <!-- /.panel-body -->
            </div>
            <!-- /.panel -->
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
</div>
<!-- /.row -->

<%@include file="../includes/footer.jsp"%>