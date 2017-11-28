<%--后台登录登录页面--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" trimDirectiveWhitespaces="true"%>
<html lang="zh-CN">

<%@ include file="head.jspf"%>

<body>
<div class="container">


    <div class="row">
        <div class="col-md-12">
            <h2>sniffer监控平台</h2>
            <ul class="list-group">
                <li class="list-group-item list-group-item-success"> 1、可视化页面sniffer接口用例添加与修改。</li>
                <li class="list-group-item list-group-item-success">2、接口监控，每8分钟实时执行情况报表。</li>
                <li class="list-group-item list-group-item-success">3、执行过程异常，邮件，短信，微信推送实时提醒。</li>
                <li class="list-group-item list-group-item-warning">4、近一月，一周，一天，svn提交记录统计及报表，每日23点统计。</li>
                <li class="list-group-item list-group-item-info"> 5、质量服务台问题记录和过程跟踪大表。</li>
                <li class="list-group-item list-group-item-success"> 6、近一周上线统计，研发中上线统计，所有上线统计。</li>

                <li class="list-group-item list-group-item-info"> 7、Maui，各环境接口自动化测试平台。</li>

            </ul>
            <div class="alert alert-danger" role="alert"><h5>警告，执行菜单可以自动执行，请勿随意点击，后续将进行优化权限问题</h5></div>
        </div>

    </div>

</div>

</body>

<%@include file="footer.jspf"%>

</html>