var login =
{
	URL :
	{
		login : function()
		{
			return '/Hospital/login/dologin';
		},
		loginKey : function()
		{
			return '/Hospital/login/getLoginKey';
		}
	},
	message : function(msg)
	{
		$('#message').hide().html('<label class="label label-danger">' + msg + '</label>').show(300);
	},
	validata : function(username,password)
	{
		if (username && password)
		{
			return true;
		}
		else
		{
			return false;
		}
	},
	keyValue : null,
	getLoginKey : function(username,password)
	{
		$.ajax(
		{
			url : login.URL.loginKey(),
			dataType : 'json',
			async : false,
			data :
			{
				username : username,
				password : password
			},
			type : 'POST',
			success : function(result)
			{
				if (result && result['success'])
				{
					var data = result['data']
					login.keyValue = data['key'];
				}
			},
			error : function(er)
			{
				console.log(er);
			}
		})
	},
	disableInput : function()
	{
		common.disableInput();
	},
	enterKey : function()
	{
		$(document).keydown(function(a)
		{
			var b = $("#loginBtn"), c = a || window.event, d = c.keyCode || c.which;
			switch (d)
			{
				case 13:
					b.focus()
			}
		});
	},
	dologin :
	{
		init : function()
		{
			login.disableInput();
			login.enterKey();
			$('#loginBtn').click(function()
			{
				var username = $('#username').val();
				var password = $('#password').val();
				login.getLoginKey(username, password);
				if (login.validata(username, password))
				{
					$.ajax(
					{
						url : login.URL.login(),
						type : 'POST',
						dataType : 'json',
						timeout : 60000,
						data :
						{
							loginKey : login.keyValue
						},
						success : function(result)
						{
							if (result && result['success'])
							{
								location.href = result['data']['url'];
							}
							else
							{
								login.message(result['error']);
							}
						},
						error : function(XMLHttpRequest,textStatus,errorThrown)
						{
							if (XMLHttpRequest.status == 408)
							{
								login.message('登陆超时!');
							}
						}
					})
				}
				else
				{
					login.message('用户名或密码未填写！');
				}
			})
		}
	}
}