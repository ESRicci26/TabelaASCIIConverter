Aplicativo Java Swing possui quatro campos JTextField para entrada decimal e saídas binária, hexadecimal e letra alfabética.

Explicação do Código
--------------------
Criação da Janela Principal:
O construtor TabelaASCIIConverter() configura a janela principal com o título "Tabela de Conversão ASCII", define a operação padrão de fechamento e 
configura o layout e tamanho da janela.

Componentes da Interface:
São criados quatro rótulos (JLabel) e quatro campos de texto (JTextField) para decimal, binário, hexadecimal e letra/código.
Os campos binário, hexadecimal e letra/código são configurados como não editáveis (setEditable(false)).

Listener para Entrada Decimal:
Um KeyListener é adicionado ao campo de texto decimal para capturar eventos de tecla liberada (keyReleased) e chamar o método convertDecimal().

Conversão de Decimal:
O método convertDecimal() obtém o texto do campo decimal e tenta convertê-lo para um número inteiro.
Se a conversão for bem-sucedida, os valores binário, hexadecimal e a letra correspondente são calculados e exibidos nos respectivos campos de texto.
Se o valor decimal estiver fora do intervalo de caracteres ASCII (0-255), o campo de letra/código exibirá "N/A".
Se a conversão falhar (por exemplo, se o usuário digitar um valor não numérico), os campos de saída são limpos.

Execução do Programa:
O método main() usa SwingUtilities.invokeLater para garantir que a interface gráfica seja criada e manipulada na thread de despacho de eventos do Swing.
Ao executar esse código, você terá uma interface gráfica onde pode inserir um valor decimal e ver as representações binária, hexadecimal e a letra 
correspondente na tabela ASCII.
