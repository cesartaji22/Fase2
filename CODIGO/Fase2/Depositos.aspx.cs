using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Depositos : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        servicio_conectar.ServicioWebClient servicio = new servicio_conectar.ServicioWebClient();

        double saldo_anterior = servicio.retornal_saldo(TextBox1.Text);

        saldo_anterior = saldo_anterior + Double.Parse(TextBox2.Text);

        servicio.depositar(TextBox1.Text, saldo_anterior);

    }
}