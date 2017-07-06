using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class menu_atencion : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if (Session["Cuenta"].Equals("Atención al Cliente"))
        {
           // Label2.Text = "Cuante actual:  " + Session["identificador"];
            //Label1.Text = "Cuante actual: " + Session["Cuenta"];
        }
        else //En caso que la varibale de sesion no exista regresa al login
        {
            Response.Redirect("~/Login.aspx");

        }

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        Response.Redirect("~/agregar_cliente.aspx");
    }

    protected void Button2_Click(object sender, EventArgs e)
    {
        Response.Redirect("~/agregar_cuenta.aspx");
    }

    protected void Button3_Click(object sender, EventArgs e)
    {
        Response.Redirect("~/estado_cuenta.aspx");
    }

    protected void Button4_Click(object sender, EventArgs e)
    {
        Response.Redirect("~/prestamo.aspx");
    }
}