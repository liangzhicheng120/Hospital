<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="row">
	<div class="col-md-3" style="margin-top: -20px;">
		<h3>
			<i class="glyphicon glyphicon-user"></i> 医生审核平台
		</h3>
	</div>

	<div class="col-md-12" style="margin-top: -38px; margin-left: 205px;">
		<div class="col-md-2">
			<div class="input-group input-group-sm">
				<span class="input-group-addon">城市</span> 
				<select size="1" onchange="" class="form-control">
					<option value="">城市</option>
					<c:forEach items="${optionCity }" var="optionCity">
						<option <c:if test="${optionCity.city eq city }"> selected="selected"</c:if>>${optionCity.city }</option>
					</c:forEach>
				</select>
			</div>
		</div>
		<div class="col-md-2">
			<div class="input-group input-group-sm">
				<span class="input-group-addon">地区</span> <select onchange="" class="form-control">
					<option>武江区</option>
					<option>番禺区</option>
					<option>天河区</option>
					<option>昭阳区</option>
					<option>龙归</option>
				</select>
			</div>
		</div>
		<div class="col-md-3">
			<div class="input-group input-group-sm">
				<span class="input-group-addon">医院</span> <input id="hospital" value="${hospital }" type="text" class="form-control">
			</div>
		</div>

		<div class="col-md-3">
			<a href="javascript:void(0)" id="query" class="btn btn-primary btn-sm"><i class="glyphicon glyphicon-search"></i>查询</a> <a class="btn btn-success btn-sm" data-toggle="modal" data-target="#"> <i
				class="glyphicon  glyphicon-ok icon-white"> </i> YES
			</a> <a class="btn btn-danger btn-sm" data-toggle="modal" data-target="#"> <i class="glyphicon  glyphicon-remove icon-white"></i> NO
			</a>
		</div>
	</div>

	<div class="col-md-12">
		<table class="table text-center table-hover table-bordered responsive">
			<thead>
				<tr>
					<th><input type="checkbox" id="checkAll"></th>
					<th>姓名</th>
					<th>类型</th>
					<th>手机号码</th>
					<th>证书编号</th>
					<th>性别</th>
					<th>城市</th>
					<th>地区</th>
					<th>医院</th>
					<th>头像</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${doctor }" var="d">
					<tr>
						<td><input type="checkbox" name="checkId" value="${d.id }"></td>
						<td>${d.name }</td>
						<td>${d.ctype }</td>
						<td>${d.phone }</td>
						<td>${d.certificateNO }</td>
						<td>${d.csex }</td>
						<td>${d.city }</td>
						<td>${d.district }</td>
						<td>${d.hospital }</td>
						<td>${d.headpic }</td>
						<td><a class="btn btn-success btn-sm" data-toggle="yes_modal" data-id="${d.id }" id="yes"> <i class="glyphicon  glyphicon-ok icon-white"> </i> YES
						</a> <a class="btn btn-danger btn-sm" data-toggle="no_modal" data-id="${d.id }" id="no"> <i class="glyphicon  glyphicon-remove icon-white"></i> NO
						</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<div class="col-md-12">
		<div class="col-md-6">
			<c:if test="${page.totalNumber != 0 }">
				<div class="dataTables_info">共查询到${page.totalNumber }条记录,当前为第${page.currentPage }/${page.totalPage }页</div>
			</c:if>
			<c:if test="${page.totalNumber == 0 }">
				<div class="dataTables_info">共查询到0条记录,当前为第0/0页</div>
			</c:if>
		</div>

		<div class="col-md-offset-8" style="margin-top: -28px;">
			<div>
				<ul class="pagination">
					<c:if test="${page.currentPage != 1 }">
						<li><a href="javascript:changeCurrentPage(1)">首页</a></li>
						<li><a href="javascript:changeCurrentPage(${page.currentPage-1 })">上一页</a></li>
					</c:if>
					<c:if test="${page.currentPage == 1 }">
						<li class="disabled"><a href="javascript:void(0)">首页</a></li>
						<li class="disabled"><a href="javascript:void(0)">上一页</a></li>
					</c:if>
					<li class="disabled"><a>${page.currentPage }/${page.totalPage }</a></li>
					<c:if test="${page.currentPage != page.totalPage }">
						<li><a href="javascript:changeCurrentPage(${page.currentPage+1 })">下一页</a></li>
						<li><a href="javascript:changeCurrentPage(${page.totalPage })">末页</a></li>
					</c:if>
					<c:if test="${page.currentPage == page.totalPage }">
						<li class="disabled"><a href="javascript:void(0)">下一页</a></li>
						<li class="disabled"><a href="javascript:void(0)">末页</a></li>
					</c:if>
				</ul>
			</div>
		</div>
	</div>
</div>
<input type="text" value="${currentPage }" hidden="hidden">
<c:set var="city" value="${city }"></c:set>
<c:set var="district" value="${district }"></c:set>
<script src="./resource/js/doctor.js" charset="GBK"></script>
<script>
	$(function()
	{
		doctor.doctor.init();
	})
</script>
