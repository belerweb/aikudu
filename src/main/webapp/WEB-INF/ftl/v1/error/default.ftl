<#include "../header.ftl">
<#include "../menu.ftl">
<div class="breadcrumbs margin-bottom-40">
	<div class="container">
		<h1 class="color-green pull-left">错误</h1>
		<ul class="pull-right breadcrumb">
			<li>${uri!}</li>
		</ul>
	</div>
</div>

<div class="container">
	<div class="row-fluid page-404">
		<p><span>${message!}</span></p>
	</div>
</div>
<#include "../copyright.ftl">
<#include "../footer.ftl">