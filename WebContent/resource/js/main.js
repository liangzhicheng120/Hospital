var main =
{
	URL :
	{
		index : function()
		{
			return '/Hospital/main/index';
		},
		doctor : function()
		{
			return '/Hospital/main/doctor';
		}
	},
	message : function(msg)
	{
		$('#message').html(msg);
	},
	ajaxGetPage : function(url)
	{
		$.ajax(
		{
			url : url,
			type : 'GET',
			timeout : 180000,
			dataType : 'html',
			success : function(result)
			{
				$('#main').html(result);
			},
			error : function(XMLHttpRequest,textStatus,errorThrown)
			{
				if (XMLHttpRequest.status == 408)
				{
					main.message('���س�ʱ!');
				}
			},
		});
	},
	main :
	{
		init : function()
		{
			// ������ҳ
			main.ajaxGetPage(main.URL.index());
			// ������ҳ
			$('#index').click(function()
			{
				main.ajaxGetPage(main.URL.index());
			});
			// ����doctor
			$('#doctorManage').click(function()
			{
				main.ajaxGetPage(main.URL.doctor());
			});
		}
	}
}