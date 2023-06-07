<%--
  Created by IntelliJ IDEA.
  User: eunbin
  Date: 2023/01/11
  Time: 5:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ include file="../includes/header.jsp"%>

    <div id="page-wrapper">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Tables</h1>
            </div>
            <!-- /.col-lg-12 -->
        </div>

        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        Board Read Page
                    </div>
                    <div class="panel-body">
                        <form type="form" action="/board/modify" method="post">
                            <div class="form-group">
                                <label>Bno</label>
                                <input class="form-control" name="id" value=<c:out value="${board.id}" /> readonly="readonly">
                            </div>
                            <div class="form-group">
                                <label>Title</label>
                                <input class="form-control" name="title" value=<c:out value="${board.title}"/>>
                            </div>
                            <div class="form-group">
                                <label>Content</label>
                                <textarea class="form-control" rows="3" name="content"><c:out value="${board.content}" /></textarea>
                            </div>
                            <div class="form-group">
                                <label>Writer</label>
                                <input class="form-control" name="writer" value=<c:out value="${board.writer}" /> readonly="readonly">
                            </div>
                            <div class="form-group" hidden="hidden">
                                <label>Register Date</label>
                                <input class="form-control" name="regdate" value=<fmt:formatDate pattern="yyyy/MM/dd" value="${board.regdate}"/> readonly="readonly">
                            </div>
                            <div class="form-group" hidden="hidden">
                                <label>Update Date</label>
                                <input class="form-control" name="updatedate" value=<fmt:formatDate pattern="yyyy/MM/dd" value="${board.updatedate}"/> readonly="readonly">
                            </div>

                            <form role="form" action="/board/modify" method="post">
                                <button type="submit" data-oper="modify" class="btn btn-default">Modify</button>
                                <button type="submit" data-oper="remove" class="btn btn-danger">Remove</button>
                                <button type="submit" data-oper="list" class="btn btn-info" onclick="location.href='/board/list'">List</button>
                                <input type="hidden" name="pageNum" value="<c:out value="${criteria.pageNum}"/>">
                                <input type="hidden" name="amount" value="<c:out value="${criteria.amount}"/>">
                            </form>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

<%@ include file="../includes/footer.jsp"%>

<script type="text/javascript">
    $(document).ready(function () {
        var formObj = $("form");

        $("button").on("click", function(e) {
            e.preventDefault();
            var operation = $(this).data("oper");

            console.log(operation);

            if (operation == "remove") {
                formObj.attr("action", "/board/remove");
            }
            else if (operation == "list") {
                formObj.attr("action", "/board/list").attr("method", "get");
                var pageNumTag = $("input[name='pageNum']").clone();
                var amountTag = $("input[name='amount']").clone();

                formObj.empty();
                formObj.append(pageNumTag);
                formObj.append(amountTag);
            }
            formObj.submit();
        });
    });
</script>