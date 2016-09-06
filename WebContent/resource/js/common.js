var common =
{
	ajaxQueryPage : function(url,data)
	{
		$.ajax(
		{
			url : url,
			type : 'POST',
			data : data,
			timeout : 180000,
			success : function(result)
			{
				$('#main').html(result);
			},
			error : function(XMLHttpRequest,textStatus,errorThrown)
			{
				if (XMLHttpRequest.status == 408)
				{
					common.message('¼ÓÔØ³¬Ê±!');
				}
				else
				{
					common.message('Î´Öª´íÎó£¡');
				}
			}
		});
	},
	message : function()
	{
		$('#message').html(msg);
	},
	disableInput : function()
	{
		$("input").keydown(function(e)
		{
			if (e.keyCode == 32)
			{
				return false;
			}
		});
	},
	checkBox : function()
	{
		var arrSon = document.getElementsByName('checkId');
		var cbAll = $("#checkAll");
		var tempState = cbAll.checked;
		for (i = 0; i < arrSon.length; i++)
		{
			if (arrSon[i].checked != tempState)
				arrSon[i].click();
		}
	},
}