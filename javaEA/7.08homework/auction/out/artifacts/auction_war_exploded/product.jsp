<%--
  Created by IntelliJ IDEA.
  User: edz
  Date: 2020/7/8
  Time: 4:53 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <link href="css/common.css" rel="stylesheet" type="text/css" />
    <link href="css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div class="wrap">
    <!-- main begin-->
    <div class="sale">
        <h1 class="lf">在线拍卖系统</h1>
        <div class="logout right"><a href="#" title="注销">注销</a></div>
    </div>
    <div class="forms">
        <label for="name">名称</label>
        <input name="" type="text" class="nwinput" id="name"/>
        <label for="names">描述</label>
        <input name="" type="text" id="names" class="nwinput"/>
        <label for="time">开始时间</label>
        <input name="" type="text" id="time" class="nwinput"/>
        <label for="end-time">结束时间</label>
        <input name="" type="text" id="end-time" class="nwinput" />
        <label for="price">起拍价</label>
        <input name="" type="text" id="price" class="nwinput" />
        <input name="" type="button"  value="查询" class="spbg buttombg f14  sale-buttom"/>
    </div>
    <div class="items">
        <ul class="rows even strong">
            <li>名称</li>
            <li class="list-wd">描述</li>
            <li>开始时间</li>
            <li>结束时间</li>
            <li>起拍价</li>
            <li class="borderno">操作</li>
        </ul>
        <ul class="rows">
            <li><a href="国书" title="">国书</a></li>
            <li class="list-wd">明国藏书</li>
            <li>2010-01-20 12:30:30</li>
            <li>2010-09-08 12:30:30</li>
            <li>2,000</li>
            <li class="borderno red"><a href="#">竞拍</a></li>
        </ul>
        <ul class="rows even">
            <li><a href="国书" title="">国书</a></li>
            <li class="list-wd">明国藏书</li>
            <li>2010-01-20 12:30:30</li>
            <li>2010-09-08 12:30:30</li>
            <li>2,000</li>
            <li class="borderno red"><a href="#">竞拍</a></li>
        </ul>
        <ul class="rows">
            <li><a href="国书" title="">国书</a></li>
            <li class="list-wd">明国藏书</li>
            <li>2010-01-20 12:30:30</li>
            <li>2010-09-08 12:30:30</li>
            <li>2,000</li>
            <li class="borderno red"><a href="#">竞拍</a></li>
        </ul>
        <ul class="rows even">
            <li><a href="国书" title="">国书</a></li>
            <li class="list-wd">明国藏书</li>
            <li>2010-01-20 12:30:30</li>
            <li>2010-09-08 12:30:30</li>
            <li>2,000</li>
            <li class="borderno red"><a href="#">竞拍</a></li>
        </ul>
        <ul class="rows">
            <li><a href="国书" title="">国书</a></li>
            <li class="list-wd">明国藏书</li>
            <li>2010-01-20 12:30:30</li>
            <li>2010-09-08 12:30:30</li>
            <li>2,000</li>
            <li class="borderno red"><a href="#">竞拍</a></li>
        </ul>
        <ul class="rows even">
            <li><a href="国书" title="">国书</a></li>
            <li class="list-wd">明国藏书</li>
            <li>2010-01-20 12:30:30</li>
            <li>2010-09-08 12:30:30</li>
            <li>2,000</li>
            <li class="borderno red"><a href="#">竞拍</a></li>
        </ul>
        <ul class="rows">
            <li><a href="国书" title="">国书</a></li>
            <li class="list-wd">明国藏书</li>
            <li>2010-01-20 12:30:30</li>
            <li>2010-09-08 12:30:30</li>
            <li>2,000</li>
            <li class="borderno red"><a href="#">竞拍</a></li>
        </ul>
        <ul class="rows even">
            <li><a href="国书" title="">国书</a></li>
            <li class="list-wd">明国藏书</li>
            <li>2010-01-20 12:30:30</li>
            <li>2010-09-08 12:30:30</li>
            <li>2,000</li>
            <li class="borderno red"><a href="#">竞拍</a></li>
        </ul>
        <ul class="rows">
            <li><a href="国书" title="">国书</a></li>
            <li class="list-wd">明国藏书</li>
            <li>2010-01-20 12:30:30</li>
            <li>2010-09-08 12:30:30</li>
            <li>2,000</li>
            <li class="borderno red"><a href="#">竞拍</a></li>
        </ul>
        <ul class="rows even">
            <li><a href="国书" title="">国书</a></li>
            <li class="list-wd">明国藏书</li>
            <li>2010-01-20 12:30:30</li>
            <li>2010-09-08 12:30:30</li>
            <li>2,000</li>
            <li class="borderno red"><a href="#">竞拍</a></li>
        </ul>
        <div class="page">
            <a href="#" title="">首页</a>
            <a href="#" title="">上一页</a>
            <span class="red">前5页</span>
            <a href="#" title="">1</a>
            <a href="#" title="">2</a>
            <a href="#" title="">3</a>
            <a href="#" title="">4</a>
            <a href="#" title="">5</a>
            <a href="#" title="">下一页</a>
            <a href="#" title="">尾页</a>
        </div>
    </div>
    <!-- main end-->
</div>
</body>
</html>

