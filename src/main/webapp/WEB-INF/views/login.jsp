<%--后台登录登录页面--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" trimDirectiveWhitespaces="true" %>
<html lang="zh-CN">

<%--<jsp:include page="head.jspf" flush="true" />--%>
<%@ include file="head.jspf" %>
<body>
<div class="container" background="<%=path%>/static/img/VCG211128366826.jpg">


    <!--
    登录
    -->
    <div class="container" >


        <form class="form-signin">
            <h2 class="form-signin-heading">Please sign in</h2>
            <label for="inputEmail" class="sr-only">Email address</label>
            <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required
                   autofocus>
            <label for="inputPassword" class="sr-only">Password</label>
            <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
            <div class="checkbox">
                <label>
                    <input type="checkbox" value="remember-me"> Remember me
                </label>
            </div>
            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
        </form>
    </div>


</div> <!-- /container -->


</body>
<%--<jsp:include page="footer.jspf" flush="true" />--%>
<%@ include file="footer.jspf" %>


</html>