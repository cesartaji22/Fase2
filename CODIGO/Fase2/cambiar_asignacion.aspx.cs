﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class cambiar_asignacion : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        DropDownList1.Items.Add("Atención al Cliente");
        DropDownList1.Items.Add("Cajero");
    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        servicio_conectar.ServicioWebClient servicio = new servicio_conectar.ServicioWebClient();
        servicio.cambiar_trabajo(TextBox1.Text, DropDownList1.SelectedItem.ToString());

    }
}