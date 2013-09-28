<#include "header.ftl">
<#include "menu.ftl">
<div class="breadcrumbs margin-bottom-50">
	<div class="container">
		<h1 class="color-green pull-left">注册</h1>
		<ul class="pull-right breadcrumb">
			<li class="active">拥有帐户后获得免费下载书籍、推送到 Kindle...的权利</li>
		</ul>
	</div>
</div>

<div class="container">		
	<div class="row-fluid margin-bottom-10">
		<form class="reg-page">
			<h3>注册帐户</h3>
			<div class="controls">
				<label>电子邮件 <span class="color-red">*</span></label>
				<input name="email" type="text" class="span12">
			</div>
			<div class="controls">
				<div class="span6">
					<label>密码 <span class="color-red">*</span></label>
					<input name="password" type="password" class="span12">
				</div>
				<div class="span6">
					<label>确认密码 <span class="color-red">*</span></label>
					<input name="rePassword" type="password" class="span12">
				</div>
			</div>
			<div class="controls text-right">
				<button type="submit" class="btn-u">提交注册信息</button>
			</div>
			<hr>
			<p>已经注册过了? 请 <a class="color-green" href="${ContextPath}/login.html">登录</a> 。</p>
		</form>
	</div>
</div>
<#include "copyright.ftl">
<script type="text/javascript">
	window.PageContext = {
		activeNav: 'signup',
		init: function(){
		}
	};
</script>
<#include "footer.ftl">