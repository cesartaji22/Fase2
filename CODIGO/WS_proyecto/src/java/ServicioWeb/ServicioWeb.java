/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioWeb;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import iniciar_sesion.*;
import insertar.*;
import catalogo.*;
import consultas.*;
import java.util.List;
/**
 *
 * @author TAJI
 */
@WebService(serviceName = "ServicioWeb")
public class ServicioWeb {

    login log = new login();
    login_empleados log_emp = new login_empleados();
    insertar_cliente ins_clie = new insertar_cliente();
    insertar_trabajador ins_tra = new insertar_trabajador();
    tipo_operador ti_ope = new tipo_operador();
    agencias age = new agencias();
    insertar_agencia ins_age = new insertar_agencia();
    insertar_cuenta ins_cue = new insertar_cuenta();
    retornar_id_cliente re_id_cl = new retornar_id_cliente();
    retornar_saldo saldo = new retornar_saldo();
    deposito depo =  new deposito();
    retirar re = new retirar();
    cuentas_clientes cuentas = new cuentas_clientes();
    suspender_activar sus_act = new suspender_activar();
    modalidades_pago moda = new modalidades_pago();
    insertar_prestamo presta = new insertar_prestamo();
     retornar_id_trabajador trabajo = new retornar_id_trabajador();
     cambiar_trabajador chance = new cambiar_trabajador();
     gerentes ge = new gerentes();
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public String login(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrase\u00f1a") String contraseña) {
        String id = log.logearse(usuario, contraseña); 
        return id;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login_trabajador")
    public String login_trabajador(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrase\u00f1a") String contraseña) {
        String id = log_emp.logearse_empleado(usuario, contraseña);
        return id;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ingresar_clientes")
    public boolean ingresar_clientes(@WebParam(name = "cui") String cui, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "fecha") String fecha, @WebParam(name = "usuario") String usuario, @WebParam(name = "password") String password) {
        boolean respuesta = ins_clie.agregar(cui, nombre, apellido, fecha, usuario, password);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregar_trabajador")
    public boolean agregar_trabajador(@WebParam(name = "cui") String cui, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "fecha") String fecha, @WebParam(name = "usuario") String usuario, @WebParam(name = "password") String password, @WebParam(name = "tipo_de_trabajador") String tipo_de_trabajador, @WebParam(name = "agencia") String agencia) {
        boolean respuesta = ins_tra.agregar_trabajador(cui, nombre, apellido, fecha, usuario, password,tipo_de_trabajador, agencia);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mostrar_tipo_trabajador")
    public List<String> mostrar_tipo_trabajador() {
        List<String> resultado = ti_ope.tipo_empleados();
        return resultado;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mostrar_agencias")
    public List<String> mostrar_agencias() {
        List<String> resultado = age.info_agencias();
        return resultado;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregar_agencias")
    public boolean agregar_agencias(@WebParam(name = "codigo") String codigo, @WebParam(name = "nombre") String nombre, @WebParam(name = "direccion") String direccion, @WebParam(name = "telefono") String telefono) {
        boolean respuesta = ins_age.agregar_agencias(codigo, nombre, direccion, telefono);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertar_cuenta")
    public boolean insertar_cuenta(@WebParam(name = "cliente") int cliente, @WebParam(name = "no_cuenta") String no_cuenta, @WebParam(name = "tipo") String tipo, @WebParam(name = "saldo") double saldo) {
        boolean respuesta = ins_cue.agregar_cuentas(cliente, no_cuenta, tipo, saldo);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "retornar_idcliente")
    public int retornar_idcliente(@WebParam(name = "cui") String cui) {
       int id = re_id_cl.devolver_id_cliente(cui);
        return id;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "retornal_saldo")
    public double retornal_saldo(@WebParam(name = "no_cuenta") String no_cuenta) {
        double respuesta = saldo.devolver_saldo(no_cuenta);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "depositar")
    public boolean depositar(@WebParam(name = "no_cuenta") String no_cuenta, @WebParam(name = "dinero") double dinero) {
        boolean respuesta = depo.realizar_deposito(no_cuenta, dinero);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "retiro_monetario")
    public boolean retiro_monetario(@WebParam(name = "no_cuenta") String no_cuenta, @WebParam(name = "monto") double monto) {
        boolean respuesta = re.retiro_monetario(no_cuenta, monto);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "mostrar_cuentas")
    public List<String> mostrar_cuentas(@WebParam(name = "id_cliente") int id_cliente) {
        List<String> resultado = cuentas.info_cuentas(id_cliente);
        return resultado;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "estado_cuenta")
    public boolean estado_cuenta(@WebParam(name = "no_cuenta") String no_cuenta, @WebParam(name = "estado") String estado) {
        boolean respuesta = sus_act.cambiar_estado(no_cuenta, estado);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "modalidad_pago")
    public List<String> modalidad_pago() {
            List<String> resultado =moda.info_cuoatas();
        return resultado;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "solicitar_prestamo")
    public boolean solicitar_prestamo(@WebParam(name = "id_cliente") int id_cliente, @WebParam(name = "modalidad") String modalidad, @WebParam(name = "monto") double monto) {
        boolean respuesta = presta.agregar_prestamo(id_cliente, modalidad, monto);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "retornar_id_trabajador")
    public int retornar_id_trabajador(@WebParam(name = "cui") String cui) {
        int respuesta = trabajo.devolver_id_trabajador(cui);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cambiar_trabajo")
    public boolean cambiar_trabajo(@WebParam(name = "cui") String cui, @WebParam(name = "puesto") String puesto) {
        boolean respuesta = chance.cambiar_trabajador(cui, puesto);
        return respuesta;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "quitar_gerente_agencia")
    public boolean quitar_gerente_agencia(@WebParam(name = "cui") String cui) {
        boolean respuesta = ge.retirar_gerente(cui);
        return respuesta;
    }
    
    
}
