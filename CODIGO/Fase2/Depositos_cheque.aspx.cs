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

        double saldo_cuenta_cheque = servicio.retornal_saldo(TextBox1.Text);
        double saldo_cuenta_final = servicio.retornal_saldo(TextBox2.Text);

        if (saldo_cuenta_cheque> Double.Parse(TextBox3.Text))
        {

            double saldoa = saldo_cuenta_cheque - Double.Parse(TextBox3.Text);
            servicio.retiro_monetario(TextBox1.Text, saldoa);

            double saldob = saldo_cuenta_final + Double.Parse(TextBox3.Text);
            servicio.retiro_monetario(TextBox2.Text, saldob);


        }

        

    }
}