<%-- Inserir tags JSP --%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, user-scalable=no">
        <title>SGCM - Especialidades</title>
        <link rel="icon" href="imagens/logo_azul.png">
        <link rel="stylesheet" href="./css/estilo.css">
        <script src="./js/script.js" defer></script>
        <script src="./js/especialidade.js" defer></script>
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
            <div id="inativo">
                <div id="add">
                    <a href="especialidadeForm.jsp"
                    class="botao_verde">
                        Adicionar
                    </a>
                </div>
                <div>
                    <label for="busca">Busca</label>
                    <input type="search" name="busca" id="busca"
                           placeholder="Digite para buscar">
                </div>
            </div>
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>Ações</th>
                    </tr>
                </thead>
                <tbody>
                    <%-- Inserir corpo da tabela --%>
                </tbody>
                <tfoot>
                    <tr>
                        <%-- Inserir total de registros --%>
                        <%-- <td id="total" colspan="3">Total de registros: </td> --%>
                    </tr>
                </tfoot>
            </table>
        </main>
        <footer>
            <p>Telefone para contato: <span><a href="tel:+556832233030">+556832233030</a></span> | Email: <a
                href="mailto:suporte.sgcm@ufac.br">suporte.sgcm@ufac.br</a></p>
        </footer>
    </body>
</html>