<%-- Inserir tags JSP --%>
<%@page pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Objects"%>
<jsp:useBean id="controller" class="br.ufac.sgcm.controller.EspecialidadeController" scope="page"/>
<jsp:useBean id="registro" class="br.ufac.sgcm.model.Especialidade" scope="page"/>

<% registro = controller.processFormRequest(request, response);%>

<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, user-scalable=no">
        <link rel="icon" href="imagens/logo_azul.png">
        <title>SGCM - Profissionais</title>
        <link rel="stylesheet" href="./css/estilo.css">
        <script src="./js/script.js" defer></script>
    </head>
    <body>
        <header>
            <div id="logo_header">
                <img src="imagens/logo_branco.png" alt="Logo SGCM">
                <p>SGCM - Sistema de Gerenciamento de Consultas Médicas</p>
            </div>
        </header>
        <nav>
            <ul>
            <a href="index.jsp">
                <li>Home</li>
            </a>
            <a href="paciente.jsp">
                <li>Paciente</li>
            </a>
            <a href="atendimento.jsp">
                <li>Atendimento</li>
            </a>
            <a href="profissional.jsp">
                <li>Profissional</li>
            </a>
            <a href="convenio.jsp">
                <li>Convênio</li>
            </a>
            <a href="unidade.jsp">
                <li>Unidade</li>
            </a>
            <a href="especialidade.jsp">
                <li>Especialidade</li>
            </a>
            </ul>
        </nav>
    
        <main>
        <%-- Inserir o form --%>
            <form method="post">
                <input type="hidden" name="id" id="id" 
                value="<%=Objects.toString(registro.getId(),"")%>"/>
                <label for="nome">Nome</label>
                <input type="text" name="nome" id="nome" 
                value="<%=Objects.toString(registro.getNome(),"")%>"/>
                <input class="botao_verde" type="submit" name="submit" value="Salvar"/>
                <input class="botao_vermelho" type="button" value="Cancelar">
            </form>
        </main>
        <footer>
            <p>Telefone para contato: <span><a href="tel:+556832233030">+556832233030</a></span> | Email: <a
                href="mailto:suporte.sgcm@ufac.br">suporte.sgcm@ufac.br</a></p>
        </footer>
    </body>
</html>
