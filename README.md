# 📱 Simulação de iPhone em Java

Um sistema em **Java 8+** que simula as funções do iPhone como:
- 🎵 **Reprodutor Musical**
- 📞 **Aparelho Telefônico**
- 🌐 **Navegador de Internet**

O projeto utiliza **Programação Orientada a Objetos (POO)**, com **interfaces** e **classes**, e conta com um **menu interativo no console** para executar diferentes ações.

---

## 🚀 Funcionalidades
- **Reprodutor Musical**: Tocar, pausar e selecionar música.
- **Aparelho Telefônico**: Fazer e receber chamadas.
- **Navegador**: Exibir páginas da web.
- **Menu Interativo**: Escolha a função desejada de forma prática.

---

## 🛠 Tecnologias Utilizadas
- **Java 8+**
- **Paradigma**: Programação Orientada a Objetos (POO)
- **Interfaces** e **Polimorfismo**

---

## 📂 Estrutura do Projeto
src/<br>
├── Main.java     #**Classe principal com o menu interativo**<br>
├── iPhone.java     #**Classe que implementa todas as interfaces**<br>
├── ReprodutorMusical.java     #**Interface do Reprodutor Musical**<br>
├── AparelhoTelefonico.java     #**Interface do Aparelho Telefônico**<br>
└── NavegadorInternet.java     #**Interface do Navegador de Internet**<br>

**Explicação:**
- **Main.java**: Contém o menu principal e os submenus, chamando os métodos do `iPhone`.  
- **iPhone.java**: Implementa todas as interfaces e define a lógica dos métodos (tocar música, ligar, exibir página etc.).  
- **Interfaces** (`ReprodutorMusical`, `AparelhoTelefonico`, `NavegadorInternet`): Definem os métodos que a classe `iPhone` deve implementar, garantindo **polimorfismo e organização do código**.

---

## ▶️ Como Executar
1. Clone este repositório:
   ```bash
   git clone https://github.com/SEU-USUARIO/nome-do-repositorio.git


