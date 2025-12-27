# 💳 Sistema de Controle de Compras no Cartão de Crédito (Java)

Este é um projeto desenvolvido com propósito **pedagógico**, ideal para praticar Programação Orientada a Objetos, uso de coleções, encapsulamento e boas práticas de arquitetura em Java.  
A aplicação simula o uso de um cartão de crédito real, permitindo registrar compras, validar saldo e gerar um extrato final ordenado pelo valor das compras.

---

## ✨ Funcionalidades

- Cadastro de compras com descrição e valor  
- Controle automático de limite e saldo disponível  
- Validação de saldo antes de registrar a compra  
- Débito automático após cada compra  
- Armazenamento das compras em uma `LinkedList`  
- Ordenação das compras por valor usando `Comparator`  
- Implementação de ordenação natural com `Comparable`  
- Impressão do extrato completo ao final da execução  

---

## 🧱 Estrutura do Projeto

### **Compra**
- Representa uma compra individual  
- Atributos: descrição e valor  
- Implementa `Comparable` para ordenação natural  
- Recurso utilizado: `Double.compare()`  

### **CartaoCredito**
- Armazena limite, saldo disponível e lista de compras  
- Inicializa saldo igual ao limite recebido  
- Possui método `debitar()` para atualizar o saldo  
- Mantém uma `LinkedList<Compra>` para registrar compras  

### **ServicoCompra**
- Classe responsável pela lógica de negócio  
- Registrar compras  
- Validar saldo  
- Ordenar lista de compras  
- Exibir relatório final  

### **Main**
- Interface via terminal  
- Lê informações do usuário  
- Processa compras  
- Ordena e exibe resultado ao final  

---

## 🛠 Tecnologias Utilizadas

- **Java 17**  
- **Paradigma Orientado a Objetos (POO)**  
- **Collections Framework**  
- `LinkedList`  
- `Comparator` / `Comparable`  
- Entrada de dados com `Scanner`  

---

## 📂 Estrutura de Diretórios

src/ ├── Compra.java ├── CartaoCredito.java ├── ServicoCompra.java └── Main.java

---

## ▶️ Como Executar

1. Instale o **Java 17 ou superior**.  
2. Compile o projeto:
javac Main.java

3. Execute:
java Main

4. Siga as instruções no terminal:
   - Informe o limite
   - Cadastre compras
   - Finalize para ver o extrato ordenado

---

## 🧪 Exemplo de Execução
- Digite o limite do cartão: 500
- Digite a descrição da compra: Mochila
- Digite o valor da compra: 120
- Digite 0 para sair ou 1 para continuar: 1

- Digite a descrição da compra: Livro
- Livro Digite o valor da compra: 80
- Digite 0 para sair ou 1 para continuar: 0

COMPRAS REALIZADAS: 
- Livro - 80.0
- Mochila - 120.0

Saldo do cartão: 300.0

---

## 🎯 Objetivo Pedagógico

Este projeto foi desenvolvido para consolidar:

- Lógica de programação  
- Uso de classes, objetos e encapsulamento  
- Separação de responsabilidades  
- Prática real com Collections  
- Ordenação usando `Comparable` e `Comparator`  

Agradecimento especial à **Jacqueline Oliveira (Alura)** pela excelente didática e clareza nas explicações, fundamentais para a evolução deste projeto. 

---

## 🚀 Próximas Evoluções

- Ordenar por descrição  
- Calcular total gasto  
- Exportar extrato para arquivo  
- Interface gráfica com JavaFX  
- Persistência em arquivo ou banco de dados  

---

## 👨‍💻 Autor

**William Rodrigues**  
Desenvolvedor em formação, estudando backend e boas práticas de programação.
