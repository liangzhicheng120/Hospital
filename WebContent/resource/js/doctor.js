var doctor =
{
	URL :
	{
		doctor : function()
		{
			return '/Hospital/main/doctor';
		}
	},
	message : function(msg)
	{
		$('#message').html(msg);
	},
	ajaxQueryPage : function(url,data)
	{
		common.ajaxQueryPage(url, data);
	},
	doctor :
	{
		init : function()
		{
			common.disableInput();
			$('#checkAll').click(function() // TODO 全选
			{
				common.checkBox();
			});
			$('#query').click(function() // TODO 查询医院
			{
				var hospital = $('#hospital').val();
				doctor.ajaxQueryPage(doctor.URL.doctor(),
				{
					hospital : hospital
				})
			});
			$('#yes').click(function()
			{
				$('#yes_modal').modal(
				{
					show : true, // 显示弹出层
					backdrop : 'static', // 禁止位置关闭
					keyboard : false, // 关闭键盘事件
				});
				$('#yes_modal').on('show.bs.modal', function(event)
				{
					var button = $(event.relatedTarget);
					var id = button.data('id');
					var modal = $('#yes_modal');
					modal.find(findbtn1).val(id);
				});
				$('#yesBtn').click(function()
				{
					var id = console.log('delete');
				});
			});
		}
	}
}