<#assign ContextPath=springMacroRequestContext.getContextPath() />
<div id="page-content" class="clearfix">
	<div class="hide">
		<form method="post" action="${ContextPath}/admin/book/add" class="form-horizontal">
			<div class="control-group">
				<label class="control-label">图书名称</label>
				<div class="controls">
					<input name="name" type="text" placeholder="" class="input-xlarge">
				</div>
			</div>
		</form>
	</div>
	<div class="row-fluid">
		<h3 class="header smaller lighter blue">
			图书列表
			<button type="button" class="btn btn-mini btn-primary pull-right" data-action="add">增加图书</button>
		</h3>
		<table id="main-list-table" class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th class="center" style="width:40px;"><input type="checkbox"><span class="lbl"></span></th>
					<th>书名</th>
					<th class="center" style="width:100px;">操作</th>
				</tr>
			</thead>
			<tbody>
				<#list result.items as book>
				<tr>
					<td class="center"><input type="checkbox" value="${book.id}"><span class="lbl"></span></td>
					<td>${book.name!}</td>
					<td class="td-actions center">
						<div class="btn-group">
							<button type="button" class="btn btn-mini btn-danger" title="删除"
								data-action="delete" data-id="${book.id!}" data-name="${book.name!}">
								<i class="icon-trash bigger-120"></i>
							</button>
						</div>
					</td>
				</tr>
				</#list>
			</tbody>
		</table>
	</div>
</div>
<script type="text/javascript">
$('#page-content button[data-action=add]').click(function(){
	var dialog = bootbox.dialog('', [{
		label: '创建',
		callback: function() {
			var success = false;
			$('form', dialog).ajaxSubmit({
				forceSync:true,
				async:false,
				success: function(response, status, xhr, form) {
					success = true;
				},
				error: function(xhr, status, response, form) {
					bootbox.alert('<div class="alert alert-error">' + xhr.responseText + '</div>');
				}
			});
			App.reload('#main-content');
			return success;
		}
	}], {
		header: '增加图书'
	});
	$('.modal-body', dialog).append($('#page-content form').parent().html());
});
$('#page-content button[data-action=delete]').click(function(){
	var id = $(this).data('id');
	var name = $(this).data('name');
	bootbox.confirm('确认删除 [' + name + '] ?', function(result) {
		if (result) {
			$.post('${ContextPath}/admin/book/delete', {
				id: id
			}).done(function(){
				App.reload('#main-content');
			}).fail(function(xhr, status, response, form){
				bootbox.alert('<div class="alert alert-error">' + xhr.responseText + '</div>');
			});
		}
	});
});
$('#main-list-table').dataTable({
	iDeferLoading: ${result.total},
	iDisplayStart: ${result.start},
	iDisplayLength: ${result.pageSize},
	bLengthChange: false,
	bFilter: false,
	bServerSide: true,
	fnServerData: function (sSource, aoData, fnCallback, oSettings) {
		var p = {};
		$.each(aoData, function(i, obj){
			p[obj.name] = obj.value;
		});
		var q = {};
		q.page = p.iDisplayStart / p.iDisplayLength;
		App.go('#main-content', '${ContextPath}/admin/book/all?' + $.param(q));
	}
});
</script>