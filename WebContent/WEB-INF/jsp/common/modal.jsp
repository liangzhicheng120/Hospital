<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="modal fade" id="yes_modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">×</button>
				<h4>
					<i class="glyphicon glyphicon-warning-sign"></i> 同意
				</h4>
			</div>
			<div class="modal-body" style="text-align: center;">
				<p>确定同意审核？</p>
				<input id="doctorId" type="text">
			</div>
			<div class="modal-footer">
				<a href="javascript:void(0)" class="btn btn-default btn-sm" data-dismiss="modal">关闭</a> <a href="javascript:void(0)" id="yesBtn" class="btn btn-success btn-sm">确定
				</a>
			</div>
		</div>
	</div>
</div>