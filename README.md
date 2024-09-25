# fundamentos-back-end-turma6
Repositório da disciplina Fundamentos de Programação Back-End Turma 6.

> **Leituras preparatórias para a disciplina:**
>
> 1. O que é Java? (Alura): <https://www.alura.com.br/apostila-java-orientacao-objetos/o-que-e-java>
> 2. Iniciando na linguagem Java
 (DevMedia): <https://www.devmedia.com.br/iniciando-na-linguagem-java/21136>
>
> _As leituras indicadas são um pouco antigas, mas continuam sendo excelentes textos de introdução à linguagem Java. Portanto, desconsidere trechos que envolvam termos como "hoje", "atualmente", etc._

## Atualizando seu repositório local

O código produzido em sala de aula, e compartilhado neste repositório, pode ser atualizado em seu repositório local com o comando:

```console
git pull
```

No entando, se você fez alterações no seu repositório local, o comando acima pode gerar conflitos. Para evitar lidar com isso, você pode forçar uma atualização com o repositório remoto por meio dos comandos:

```console
git fetch origin
git reset --hard origin/main
```

O primeiro comando recebe as atualizações mais recentes do repositório remoto, e o segundo descarta todas as alterações locais e atualiza com o histórico mais recente do repositório remoto (branch main).

## Sites de referência

- Jakarta Server Pages Specification: <https://jakarta.ee/specifications/pages/3.1/jakarta-server-pages-spec-3.1.html>
- Jakarta Servlet Specification: <https://jakarta.ee/specifications/servlet/6.0/jakarta-servlet-spec-6.0.html>
- Apostila Java e Orientação a Objetos (Caelum/Alura): <https://www.alura.com.br/apostila-java-orientacao-objetos>
- Apostila Java para Desenvolvimento Web (Caelum/Alura): <https://www.alura.com.br/apostila-java-web>
- Baeldung: <https://www.baeldung.com/>
- Java Tutorial (VS Code): <https://code.visualstudio.com/docs/java/java-tutorial>

## Ferramentas

- **Visual Studio Code**
  - <https://code.visualstudio.com/Download>
- **Extension Pack for Java (Extensão do VS Code)**
  - <https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack>
- **Java Server Pages - JSP (Extensão do VS Code)**
  - <https://marketplace.visualstudio.com/items?itemName=pthorsson.vscode-jsp>
- **XML (Extensão do VS Code)**
  - <https://marketplace.visualstudio.com/items?itemName=redhat.vscode-xml>
- **Git**
  - <https://git-scm.com/downloads>
- **JDK 17**
  - Verificar versão do JDK instalada:
    - ```javac -version```
  - <https://download.oracle.com/java/17/latest/jdk-17_windows-x64_bin.msi>
  - Criar a variável de ambiente JAVA_HOME configurada para o diretório de instalação do JDK. Exemplo: “C:\Program Files\Java\jdk-17”.
  - Adicionar “%JAVA_HOME%\bin” na variável de ambiente PATH.
  - Tutorial de configuração: <https://mkyong.com/java/how-to-set-java_home-on-windows-10/>
- **Maven**
  - Verificar versão do Maven instalada:
    - ```mvn -version```
  - <https://dlcdn.apache.org/maven/maven-3/3.8.8/binaries/apache-maven-3.8.8-bin.zip>
  - Adicionar o diretório de instalação do Maven na variável de ambiente PATH. Exemplo: “C: apache maven bin”.
  - Tutorial de instalação: <https://mkyong.com/maven/how-to-install-maven-in-windows/>
- **Apache Tomcat 10**
  - Verifique se o Tomcat está instalado e funcionando:
    - Localize o aplicativo **Monitor Tomcat**.
    - Acesse a URL **<http://localhost:8080>**, que deve exibir uma página indicando que o Tomcat está funcionando.
  - Link para download: <https://dlcdn.apache.org/tomcat/tomcat-10/v10.1.13/bin/apache-tomcat-10.1.13.exe>
  - [Tutorial de instalação](https://github.com/webacademyufac/tutoriais/blob/main/tomcat/tomcat.md)
- **MySQL**
  - Verificar se o MySQL está funcionando:
    - ```mysql -u root -p```
    - Tentar acessar com senha em branco ou senha igual ao nome de usuário (root).
    - Tutorial para resetar a senha de root: <https://dev.mysql.com/doc/mysql-windows-excerpt/8.0/en/resetting-permissions-windows.html>
  - Link para download: <https://dev.mysql.com/downloads/file/?id=516927>
  - [Tutorial de instalação](https://github.com/webacademyufac/tutoriais/blob/main/mysql/mysql.md)
  - Para criação do banco e importação de dados, a partir do diretório _sql_, executar os comandos:
    - ```mysql -u root -p < sgcm.sql```
    - ```mysql -u root -p sgcm < dados.sql```

## SGCM - Sistema de Gerenciamento de Clínica Médica

A demonstração de uso das ferramentas e tecnologias abordadas na capacitação é baseada em um projeto de exemplo, o SGCM. A documentação básica deste projeto está disponível [em outro repositório](https://github.com/webacademyufac/sgcmdocs) e aborda os seguintes tópicos:

- [Principais funcionalidades](https://github.com/webacademyufac/sgcmdocs#principais-funcionalides)
- [Histórias de usuário](https://github.com/webacademyufac/sgcmdocs#histórias-de-usuário)
- [Diagrama de Classes](https://github.com/webacademyufac/sgcmdocs#diagrama-de-classes)
- [Diagrama Entidade Relacionamento](https://github.com/webacademyufac/sgcmdocs#diagrama-entidade-relacionamento)


1. [INDIVIDUAL] Crie uma classe chamada GerenciadorAlunos. Dentro dessa classe, declare um ArrayList<String> chamado alunos.

Implemente um método chamado adicionarAluno(String nome) que adiciona um nome de aluno à lista.
Ao adicionar, o método deve verificar se o aluno já existe na lista.

Crie um método chamado removerAluno(String nome) que remove o aluno da lista pelo nome. Caso o nome não seja encontrado, exiba uma mensagem apropriada.

Implemente um método chamado atualizarAluno(String nomeAntigo, String nomeNovo) que busca o nome de um aluno na lista e o atualiza. Se o nome não for encontrado, exiba uma mensagem de erro.

Crie um método chamado listarAlunos() que imprime todos os alunos armazenados na lista em ordem alfabética.

Implemente um método chamado buscarAluno(String nome) que verifica se o aluno existe na lista. O método deve retornar uma mensagem dizendo se o aluno foi encontrado ou não.

Adicione um método chamado obterQuantidadeDeAlunos() que retorna o número total de alunos na lista.

Crie um método chamado limparLista() que remove todos os alunos da lista.

Usando Orientação a Objetos, modifique o programa para que, além do nome, cada aluno tenha um número de matrícula e os todos os métodos anteriores continuem funcionando.

Link de entrega: https://classroom.github.com/a/hazTxHsm
Data: 25/09/2024 até 16h


2. [INDIVIDUAL] Finalizar as classes `UnidadeDao` e `ProfissionalDao` de forma semelhante à classe `EspecialideDao` implementando todos os métodos da interface IDao. 

Link de Entrega: https://classroom.github.com/a/mskPBsaE
Data: 27/09/2024 até 16h