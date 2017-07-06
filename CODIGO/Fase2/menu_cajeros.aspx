<%@ Page Language="C#" AutoEventWireup="true" CodeFile="menu_cajeros.aspx.cs" Inherits="menu_cajeros" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        Menú Cajeros<br />
        <br />
        <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Depositar" />
        <br />
        <br />
        <asp:Button ID="Button2" runat="server" OnClick="Button2_Click" Text="Retiro monetario" />
        <br />
        </div>
    </form>
</body>
</html>
