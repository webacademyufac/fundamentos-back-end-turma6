const adicionarEventoExcluir = () => {
    let botoesExcluir = document.querySelectorAll('a.botao_vermelho');
    for (const botao of botoesExcluir) {
        botao.addEventListener('click', (evento) => {
            if (!confirm('Confirma exclusão?')) {
                evento.preventDefault();
            }
        });
    }
}

adicionarEventoExcluir();

const limparTabela = () => {
    let tabela = document.querySelector('table');
    let linhas = tabela.tBodies[0].querySelectorAll('tr');
    for (const linha of linhas) {
        linha.remove();
    }
}

const atualizarTotal = () => {
    let tabela = document.querySelector('table');
    let total = document.querySelector('table #total');
    total.textContent = "Total de registros: " + tabela.tBodies[0].querySelectorAll('tr').length;
}

let botaoCancelar = document.querySelector("input[data-url]");
if (botaoCancelar) {
    botaoCancelar.addEventListener("click", () => {
        let url = botaoCancelar.getAttribute("data-url");
        window.location.href = url;
    });
}
