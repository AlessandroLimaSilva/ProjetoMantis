package com.javaseleniumtemplate.dbsteps;

import com.javaseleniumtemplate.utils.DBUtils;
import com.javaseleniumtemplate.utils.GerarDados;
import com.javaseleniumtemplate.utils.Utils;

public class UsuariosDBSteps {

    private static String queriesPath = "src/test/java/com/javaseleniumtemplate/queries/usuariosqueries/";

    public static String retornaSenhaDoUsuarioDB(String usuario){
        String query = Utils.getFileContent(queriesPath + "retornaSenhaDoUsuario.sql").replace("$usuario", usuario);

        return DBUtils.getQueryResult(query).get(0);
    }

    public static void insereUsuario() {
        String query = Utils.getFileContent(queriesPath + "inserirUsuarioNoBanco.sql");
        query = query.replace("$username", GerarDados.nomeUser());
        query = query.replace("$realname", GerarDados.fullName());
        query = query.replace("$email", GerarDados.email());
        DBUtils.getQueryResult(query);
    }
}
