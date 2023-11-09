
# Lista de Tarefas

## Descrição
Este é um aplicativo simples de lista de tarefas criado em Java com a interface gráfica Swing. O aplicativo permite que você adicione tarefas, remova tarefas específicas e liste todas as tarefas na interface do usuário.

## Requisitos
- Java Development Kit (JDK) instalado. O JDK utilizado no desenvolvimento foi o JDK 17.0.7.
- Ambiente de desenvolvimento Java, como Eclipse, IntelliJ IDEA ou qualquer outro de sua escolha.

## Bibliotecas Utilizadas
O projeto utiliza as seguintes bibliotecas Java e suas funções:

1. `javax.swing.*`: Classe responsável por criar interfaces gráficas de usuário (GUI) para aplicativos desktop. Ela fornece classes e componentes para criar janelas, botões, campos de texto, listas e outros elementos de interface gráfica.

2. `java.awt.*`: A biblioteca `java.awt` (Abstract Window Toolkit) é usada em combinação com o Swing para fornecer suporte adicional à criação de interfaces gráficas. Ela inclui classes para gerenciamento de layout, manipulação de eventos e desenho de gráficos.

3. `java.awt.event.*`: Essa biblioteca faz parte do `java.awt` e é usada para lidar com eventos, como cliques de botão e ações do teclado.

4. `java.util.ArrayList`: A classe `ArrayList` está contida no pacote `java.util` e é usada para criar uma lista dinâmica que armazena as tarefas na aplicação.

5. `javax.swing.JOptionPane`: A classe `JOptionPane` faz parte do Swing e é usada para exibir caixas de diálogo com mensagens ou solicitar entrada do usuário.
  
## Como Usar
1. **Compilando e Executando o Projeto:**
   - Abra seu ambiente de desenvolvimento Java.
   - Crie um novo projeto Java ou adicione a classe `ListaDeTarefasGUI.java` a um projeto existente.
   - Compile e execute o projeto.

2. **Interface do Usuário:**
   - A janela da aplicação será aberta, apresentando uma interface simples de lista de tarefas.

3. **Adicionar Tarefa:**
   - Clique no espaço em branco e digite a tarefa desejada.
   - Depois clique no botão "Adicionar Tarefa".
   - A tarefa será adicionada à lista.

4. **Remover Tarefa:**
   - Clique na tarefa que deseja remover.
   - Depois clique no botão "Remover Tarefa".
   - A tarefa será removida da lista.

5. **Listar Tarefas:**
   - As tarefas adicionadas serão listadas na área da interface.
   - Se quiser visualizar todas as tarefas é só clicar no botão "Listar Tarefas".

6. **Sair do Programa:**
   - Clique no botão "Sair" para encerrar o programa.
