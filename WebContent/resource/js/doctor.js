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
			$('#checkAll').click(function() // TODO ȫѡ
			{
				common.checkBox();
			});
			$('#query').click(function() // TODO ��ѯҽԺ
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
					show : true, // ��ʾ������
					backdrop : 'static', // ��ֹλ�ùر�
					keyboard : false, // �رռ����¼�
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