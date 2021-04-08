package controlador;

import java.sql.*;
import java.util.*;
import util.MySQLConexion;
import modelo.*;

public class Negocio {

    // listar combo de productos
    public List<Linea> listProductos() {
        List<Linea> lis = new ArrayList<>();
        Connection conn = null;

        try {
            conn = MySQLConexion.getConexion();
            String sql = "SELECT l.Lin_nom FROM linea l";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Linea a = new Linea();
                a.setLin_nom(rs.getString(1));
                lis.add(a);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {

                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e2) {
            }
        }

        return lis;
    }

    // listar combo de clientes
    public List<Cliente> listClientes() {
        List<Cliente> lis = new ArrayList<>();
        Connection conn = null;

        try {
            conn = MySQLConexion.getConexion();
            String sql = "SELECT cli_nom FROM clientes c";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Cliente a = new Cliente();
                a.setCli_nom(rs.getString(1));
                lis.add(a);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {

                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e2) {
            }
        }

        return lis;
    }

    // Listar tabla de Registro de Ventas pasando el nombre del articulo
    public List<Linea_Artefactos> lisRegistro_Vent(String nom) {

        List<Linea_Artefactos> lis = new ArrayList<>();
        Connection conn = null;

        try {

            conn = MySQLConexion.getConexion();
            String sql = "SELECT a.art_cod,a.art_nom,a.art_pre FROM linea l, artefacto a WHERE l.Lin_cod = a.Lin_cod AND l.Lin_nom=?";

            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, nom);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Linea_Artefactos a = new Linea_Artefactos();
                a.setArt_cod(rs.getString(1));
                a.setArt_nom(rs.getString(2));
                a.setArt_pre(rs.getDouble(3));
                lis.add(a);
            }

        } catch (Exception ex) {

            ex.printStackTrace();
        } finally {

            try {

                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e2) {

            }
        }

        return lis;
    }

    // Pasando nombre del cliente devolver el codigo del cliente
    public List<Cliente> devolvercodCliente(String nom) {

        List<Cliente> lis = new ArrayList();
        Connection conn = null;

        try {

            conn = MySQLConexion.getConexion();
            String sql = "SELECT c.cli_cod FROM clientes c WHERE c.cli_nom=?";

            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, nom);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Cliente a = new Cliente();
                a.setCli_cod(rs.getString(1));

                lis.add(a);
            }

        } catch (Exception ex) {

            ex.printStackTrace();
        } finally {

            try {

                if (conn != null) {

                    conn.close();
                }
            } catch (Exception e2) {

            }
        }

        return lis;
    }

    //Registrar una venta
    public int RegistrarVenta(Venta ep) {

        int resp = 0;
        Connection conn = null;

        try {

            String sql = "insert into venta (cli_cod,art_cod,meses) values (?,?,?)";
            conn = MySQLConexion.getConexion();

            PreparedStatement st = conn.prepareStatement(sql);

            st.setString(1, ep.getCli_cod());
            st.setString(2, ep.getArt_cod());
            st.setInt(3, ep.getMeses());

            resp = st.executeUpdate();

        } catch (Exception ex) {

            ex.printStackTrace();
        } finally {

            try {

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e2) {

            }
        }

        return resp;
    }

    // Listar Consultar de Ventas
    public List<Artefactos_Clientes_Venta> lisConsulVentas(String cod) {

        List<Artefactos_Clientes_Venta> lis = new ArrayList();
        Connection conn = null;

        try {

            conn = MySQLConexion.getConexion();
            String sql = "SELECT v.nro_pro,c.cli_nom,a.art_nom,a.art_pre,v.meses FROM venta v INNER JOIN artefacto a ON a.art_cod=v.art_cod INNER JOIN clientes c ON c.cli_cod = v.cli_cod WHERE c.cli_cod =?";

            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, cod);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Artefactos_Clientes_Venta a = new Artefactos_Clientes_Venta();
                a.setNro_pro(rs.getInt(1));
                a.setCli_nom(rs.getString(2));
                a.setArt_nom(rs.getString(3));
                a.setArt_pre(rs.getDouble(4));
                a.setMeses(rs.getInt(5));
                lis.add(a);
            }
        } catch (Exception ex) {

            ex.printStackTrace();
        } finally {

            try {

                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e2) {

            }
        }

        return lis;
    }

    // Listar clientes
    public List<Artefactos_Clientes_Venta> listTodoConsulta() {

        List<Artefactos_Clientes_Venta> lis = new ArrayList<>();
        Connection conn = null;

        try {

            conn = MySQLConexion.getConexion();
            String sql = "SELECT v.nro_pro,c.cli_nom,a.art_nom,a.art_pre,v.meses FROM venta v INNER JOIN artefacto a ON a.art_cod=v.art_cod INNER JOIN clientes c ON c.cli_cod = v.cli_cod";

            PreparedStatement st = conn.prepareStatement(sql);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Artefactos_Clientes_Venta a = new Artefactos_Clientes_Venta();
                a.setNro_pro(rs.getInt(1));
                a.setCli_nom(rs.getString(2));
                a.setArt_nom(rs.getString(3));
                a.setArt_pre(rs.getDouble(4));
                a.setMeses(rs.getInt(5));
                lis.add(a);

            }

        } catch (Exception ex) {

            ex.printStackTrace();
        } finally {

            try {

                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e2) {

            }
        }

        return lis;
    }

}
