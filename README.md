# 📋 Sistema de Seminários — Java

> Um sistema simples de organização de seminários, relacionando professores, alunos e local — desenvolvido para praticar Orientação a Objetos em Java.

---

## 📖 Sobre o Projeto

O Sistema de Seminários é um projeto desenvolvido em Java que simula a organização de um seminário acadêmico. O sistema relaciona professores, alunos e locais, praticando os principais conceitos de Programação Orientada a Objetos.

---

## 🧩 Entidades do Sistema

| Classe | Responsabilidade |
|---|---|
| **Professor** | Responsável por um ou mais seminários |
| **Seminario** | Representa o seminário em si |
| **Aluno** | Participante do seminário |
| **Local** | Local onde o seminário será realizado |

### Fluxo de relacionamento

```
Professor
   │
   └── Seminário
          │
          ├── Local
          └── Alunos participantes
```

---

## 🗂️ Estrutura do Projeto

```
SistemaDeSeminario/
└── src/
    ├── domain/
    │   ├── Aluno.java
    │   ├── Professor.java
    │   ├── Seminario.java
    │   └── Local.java
    └── teste/
        └── SeminarioTeste.java
```

---

## ▶️ Como Rodar

### Pré-requisitos
- Java JDK 8 ou superior
- IntelliJ IDEA ou VS Code

### Passo a passo

1. Clone o repositório:
```bash
git clone https://github.com/jonathanleao/Sistema-de-seminarios-Java.git
```

2. Abra o projeto na sua IDE (IntelliJ ou VS Code)

3. Localize o arquivo `SeminarioTeste.java`

4. Execute o método `main` diretamente pela IDE

---

## 📚 Aprendizados

Este projeto foi desenvolvido como exercício prático de Java. Durante a criação, foram aplicados os seguintes conceitos:

- **Criação de classes** — modelagem das entidades do sistema
- **Associação entre objetos** — relacionamento entre Professor, Seminário, Aluno e Local
- **Encapsulamento** — atributos privados com getters e setters
- **Organização em pacotes** — separação entre `domain` e `teste`
- **Instanciação de objetos** — criação e uso dos objetos no método main
- **Sobrecarga de construtores** — diferentes assinaturas para o mesmo método

---

## 👤 Autor

Feito por **Jonathan** — em desenvolvimento, aprendendo Java na prática.

