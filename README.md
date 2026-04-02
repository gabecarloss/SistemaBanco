# 💰 Banco Gaúcho - Sistema Simples em Java

SISTEMA EM DESENVOLVIMENTO

Um sistema bancário simples desenvolvido em Java, com foco em lógica de programação, entrada de dados via terminal e controle de fluxo.

---

## 📌 Funcionalidades

### 👤 Cadastro de Cliente

* Registro de novo cliente
* Entrada de:

  * Nome completo
  * Email
  * Telefone (formato brasileiro)
  * Senha com confirmação
* Geração de número de acesso único aleatório

### 🔐 Acesso ao Sistema

* Login via número de acesso único

### 💳 Operações Bancárias

* Depósito de valores
* Saque com validação de saldo
* Consulta de saldo em tempo real
* Encerramento do sistema

---

## 🧠 Conceitos aplicados

* Estruturas de repetição (`for`)
* Condicionais (`if/else`)
* Entrada de dados com `Scanner`
* Manipulação de variáveis e estado (`saldo`)
* Geração de números aleatórios (`Random`)
* Validação de dados (senha e saldo)

---

## 🏗️ Estrutura do Projeto

```
📁 projeto-banco
 ├── Main.java
 ├── Cliente.java
 └── Operacao.java
```

### 🔹 Main.java

Arquivo principal do sistema (estrutura base do projeto)

### 🔹 Cliente.java

Responsável pelo cadastro e autenticação do cliente

### 🔹 Operacao.java

Gerencia as operações bancárias (depósito, saque, saldo)

---

## ▶️ Como executar

1. Compile os arquivos:

```bash
javac *.java
```

2. Execute:

```bash
java Cliente
java Operacao
```

---

## ⚠️ Observações

* O sistema roda via terminal (console)
* Os dados não são persistidos (não usa banco de dados)
* O saldo é mantido apenas durante a execução
* O número de acesso gerado não pode ser recuperado

---

## 🚀 Melhorias futuras

* [ ] Criar classe `Conta` para centralizar o saldo
* [ ] Persistência de dados com banco (PostgreSQL ou MySQL)
* [ ] Interface gráfica (JavaFX ou Web)
* [ ] Sistema de login real com validação
* [ ] Criptografia de senha
* [ ] Histórico de transações

---

## 📚 Objetivo do projeto

Este projeto foi desenvolvido com o objetivo de praticar:

* Lógica de programação
* Estruturação de sistemas simples
* Pensamento orientado a objetos (em evolução)

---

## 👨‍💻 Autor

Gabriel Carlos Rigo Agostinho
Estudante de Ciência da Computação

---

## 💡 Observação final

Este é um projeto inicial, mas já demonstra a base necessária para evoluir para sistemas mais robustos e profissionais.
