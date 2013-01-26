 <style type="text/css">
 @CHARSET "UTF-8";
body {background-color: #EEE8E8}
body, tr, td, select, option, textarea {
	color: #5E5E5E;
	font-family: Calibri, Arial, Helvetica, sans-serif;
	font-size: 13px;
}
table { border-color: white; font-size:12px; vertical-align:middle; border-spacing:5px;
color: #5E5E5E; font-family: Calibri, Arial, Helvetica, sans-serif; font-size: 13px;}
tr.rida {border: none}
tr.rida1 {background-color: #eeeee0; }
td {vertical-align: top; cellspacing: 5px}
#sisu {
    border: double 4px #5C3317;
    position: absolute;
    left: 50%;
    top: 50%;
    background-color: white;
    z-index: 100;
    height: 450px;
    margin-top: -225px;
    width: 900px;
    margin-left: -450px;
    background-color: white;
}

#logo {
	position: absolute; display:block; border: 1px solid #006; height: 56px; width: 160px;
}
#vorm {
	padding-left: 15px; padding-right: 15px; padding-buttom: 15px;
	height: 125px;
	width: 400px;
	vertical-align: middle;
	display:table;
	text-align: justify;
	position: absolute;
	margin: auto;
}
#andmed {
	height: 300px;
	width: 880px;
	overflow-y: scroll;
	overflow-x: hidden;
}
#v1, #v2, #v3, #v4, #v5 {position: absolute; display:none}
tr.pealkiri {background-color: lightgray; color: white; font-weight: bold}
img {border: 0px; padding: 10px;}
table#data td { vertical-align: top; text-align: center;  font-family: Calibri, Arial, Helvetica, sans-serif;} 

input { font-size:13px; color: #5E5E5E; font-family: Arial; border: double; border-color: #E0E0E0; border-width: 1px; cursor: pointer}
.button {
    border: 1px solid #006;
    background: #9cf;
}

a:link {color: #104E8B;text-decoration: none; font-family: Arial;}
a.db {color: red}
a:visited {color:#104E8B;text-decoration: none; font-family: Arial;}
a:active {color: #104E8B;text-decoration: none; font-family: Arial;}
a:hover {text-decoration: underline}
	
div.Table{
  display:table;         
  width:400;         
}
div.Row{
  display:table-row;
  width:auto;
  clear:both;
}
div.Cell{
  float:left;/*fix for  buggy browsers*/
  display:table-column;         
  width:100px;
  text-align: left;
  padding-left: 20px;
  padding-top: 10px;
}
</style>
<script lang="text/javascript">
function kinnita() {
    var vastus = confirm("Kinniti andmebaasi algse seisu taastamine?")
    if (vastus) window.location = "CreateDB";
}
</script>
<table width="880px">
	<tr>
		<td align="left">
			<ul>
				<li>
					<font>
						<i>
							<a href='#' onclick='kinnita()'>
								Taasta andmebaasi algne seis!
							</a>
						</i>
					</font>
					<%if (request.getParameter("loodud") != null) {
			       		out.println("<font style='color:green; font-weight: bold'>(Uuesti) loodud!</font>");
					}%>
				</li>
				<li><a href='VaataAdminAlluvusi'>Vaata admin alluvusi</a></li>
				<li><a href='VaataRiigiAdminYksusi'>Vaata riigi admin üksuseid</a></li>
				<li><a href='VaataRiigiAdminYksuseLiike'>Vaata riigi admin üksuse liike</a></li>
				<li><a href='VaataVoimalikeAlluvusi'>Vaata võimalike alluvusi</a></li>
				<li><b>Realiseeritud vaated: <a href='V1'>V1</a> | <a href='V2'>V2</a> 
				| <a href='V3'>V3</a> | <a href='V4'>V4</a> | <a href='./'>V5</a>
				</b></li>
			</ul>
		</td>
		<td align="right">
			<a href='./' title='mine avalehele'><img src='pildid/ITK.png' align='right'></a>
		</td>
	</tr>
</table>