<%@ page contentType="text/html; charset=GBK" %>
<jsp:useBean id="GF" scope="session" class="com.bean.GeneralFun" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<link rel="stylesheet" href="../style/PageStyle.css" type="text/css">
</head>


<body topmargin="0" bgcolor="#FFFFFF" text="#000000" >
<%  
  String id=request.getParameter("id");
%>
<form name="form1" method="post" action="../Common/FormReceiveJSP.jsp"> 
								<!-- FormReceiveJSP.jsp ����ͻ����ύ����Ϣ -->
 <TABLE cellSpacing=0 cellPadding=0  width="100%" align=center border=0><!--DWLayoutTable-->
	  <TBODY>  
		  <tr>
		    <TD width="90%" height=53 background="../../images/333.gif">
		      <div align="center"><b><h1>��ǰ��ɫ����<%=GF.getRoleNameFromRoleId(id)%> </h1></B></DIV></TD>
		    <TD width="10%" height=53 background="../../images/333.gif"><img border="0" src="../../images/xtgl.gif"> </TD>
		  </TR>
	  </TBODY>
 </TABLE>
<HR color="#D7EAF8" size="6" noshade>
<!--  ���漸��input�Ǹ���ģ�-->
  <table width="50%" border="1" align="center" height="40" cellpadding="0" cellspacing="0"  bordercolordark="#FFFFFF" bordercolorlight="#102884">
  <!--�Զ���ô�ҳ����������֣���Ϊ���Զ�����ID��UPID ��ֵ-->
    <input type="hidden" name="$org_id" value="<%=GF.getSeq("d_org")%>" size="50" maxlength="20">
	<input type="hidden" name="_up_org_id" value="<%=id%>" size="50" maxlength="20">
	<input type="hidden" name="tableName" value="d_org" >
	<input type="hidden" name="tableAction" value="1" >

    <tr >
      <td width="17%"  nowrap bgcolor="#C4CAE1" >��ɫ����</td>
      <td width="83%" > <!-- org_name ǰ��Ҫ��_ -->
        <input type="text" name="_role_name" value="" size="50" maxlength="20">
        </td>
    </tr>
    <tr >
      <td width="17%"  nowrap bgcolor="#C4CAE1" >��ɫ����</td>
      <td width="83%" > <!-- org_name ǰ��Ҫ��_ -->
        <input type="text" name="_role_describe" value="" size="200" maxlength="100">
        </td>
    </tr>
    <tr >
      <td width="17%"  nowrap bgcolor="#C4CAE1" >˳���</td>
      <td width="83%"  > 
        <input type="text" name="_role_order" value="" size="50" maxlength="10">
        </td>
    </tr>    
  </table>
  <div align="center">
    <input type="image" border="0" name="imageField34" src="../images/ok.gif"  onmouseout="src='../images/ok.gif'" onmouseover="src='../images/ok1.gif'" onclick="">
    <input type="image" border="0" name="imageField32" src="../images/cancel.gif"  onmouseout="src='../images/cancel.gif'" onmouseover="src='../images/cancel1.gif'" onclick="form1.reset(); return false;">    
  </div>
</form>
</body>
</html>