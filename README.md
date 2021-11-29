# Introdução à Programação (IP) - Trabalho Final

Prazo máximo para definir as equipes: 28/11/2020.  
Prazo máximo para apresentação do trabalho: 09/12/2020 (quinta).  
Equipes: máximo com três alunos.  

## Definições****

- Só é permitido o uso de comandos estudados em sala de aula até o momento.  
- O conteúdo necessário para desenvolver este trabalho em sua grande maioria são conteúdos já abordados nas aulas, mas algumas partes serão explicadas durante as aulas destinadas ao desenvolvimento do trabalho, bem como, uma parte será de pesquisa extra-classe.  
- As dúvidas referente a este trabalho serão respondidas SOMENTE durante os dias/horários das nossas aulas.  
- Lembre de consultar o repositório desta disciplina para ajudar no desenvolvimento deste trabalho.  
- Os trabalhos podem ser desenvolvidos em equipe, mas as avaliações serão individuais, podendo gerar notas diferentes para cada integrante da equipe.  
- Uma vez apresentado o trabalho para avaliação não pode ser reapresentado.  
- A ordem de apresentação dos trabalhos serão definidos pelo professor, e poderão ser somente apresentados durante os dias/horários de aula definidos no cronograma.  
- O professor criar uma chamada com TODOS os integrantes da equipe, e num primeiro momento vai conversar individualmente com cada integrante da equipe, e no final com todos integrantes juntos.  
- Durante a chamada o aluno precisará compartilhar sua tela e, eventualmente, abrir sua câmera para conversar com o professor. No caso do compartilhamento de tela, o aluno deverá mostrar o código desenvolvido na IDE VSCode (ou outra da sua escolha) para permitir editar e executar o referido código se for preciso.  
- Assim que quiserem fazer a apresentação do trabalho final avisem para o professor usando o seu canal individual no MS-Teams.  
- A apresentação só poderá ser feita após a equipe postar os fontes do trabalho no AVA3.  
- O código postado/apresentado não pode ter erros de execução (use comentários para tirar possíveis erros).  

Com base nas seguintes descrições, implemente o problema do: **Caça Palavras**.  

ATENÇÃO: deve seguir fielmente a descrição a baixo.  
Ter três classes descritas a seguir …  

## CacaMain

![CacaMain](out/src/CacaMain/CacaMain.svg "CacaMain")  

- [x] os atributos desta classe são *private*, e são *palavras* e *mapa*;  
- [x] o método main só instância o construtor desta classe;  
- [ ] o método construtor instância os objetos das classes: *CacaPalavras* e *CacaMapa*, para iniciar os atributos *palavras* e *mapa*;  
- [ ] o método construtor chama o método *pesquisa* da classe *CacaMapa* para resolver o caça palavras;
- [ ] o método construtor declarar a única ocorrência do objeto *teclado* da classe *Scanner* para permitir ler dados do console usando o teclado;
- [ ] o método construtor controla o "Menu: Caça Palavras", que deve ser implementado usando um Do/While e seguir as mensagens como demostrado no exemplo de execução. Onde as opções deste menu são:
  - opção 1: chamar o método *imprimir* da classe *CacaPalavras*;
  - opção 2: chamar o método *imprimir* da classe *CacaMapa*;
  - opção 3: chamar o método *repostas* da classe *CacaPalavras*;
  - opção 4: sair;
  - consistir se foi digitado uma opção errada "opção errada!".

## CacaPalavras

![CacaPalavras](out/src/CacaPalavras/CacaPalavras.svg "CacaPalavras")  

- [x] o atributo *qtdLinha* é *private* e *final*, e define a quantidade de linhas da matriz palavras;  
- [x] o atributo *qtdColuna* é *private* e *final*, e define a quantidade de colunas da matriz palavras;  
- [ ] o atributo *palavras* é *private*, e é uma matriz, onde a primeira dimensão é quantidade de palavras a serem reconhecidas, e a segunda dimensão vai conter a linha e coluna da primeira letra quando a palavra for encontrada pelo método *pesquisa* da classe *CacaMapa* (usar o número da linha e coluna para indicar que encontrou, exemplo “[1,4]”, e se não encontrou não fazer nada, deixar como “");  
- [ ] o constructor desta classe deve chamar o método *palavrasEntrada* para iniciar as palavras no atributo palavras;  
- [ ] o método *palavrasMatriz* é *public*, e serve para os outros objetos poderem ter o acesso a matriz de palavras;  
- [ ] o método *palavrasEntrada*  é *private*, e deve conter somente:  
    palavras[0][0] = "IFELSE";  
    palavras[1][0] = “FORA";  
    palavras[2][0] = "WHILE";  
    palavras[3][0] = "OBJETO";  
    palavras[4][0] = "VETOR";  
- o método *imprimir* é *public*, e imprime as palavras da matriz *palavras*;  
- o método *repostas* é *public*, e imprime a lista de palavras identificando se “achou" (no caso mostrando linha/coluna) ou “NÃO achou” a palavra no mapa.  

## CacaMapa

![CacaMapa](out/src/CacaMapa/CacaMapa.svg "CacaMapa")  

- [ ] o atributo *qtdLinha* é *private* e *final*, e define a quantidade de linhas da matriz mapa;  
- [ ] o atributo *qtdColuna* é *private* e *final*, e define a quantidade de colunas da matriz mapa;  
- [ ] o atributo *mapa* é *private*, e é uma matriz, onde as duas dimensões são usadas para conter as letras aleatórias junto com as letras que formam as palavras procuradas;  
- [ ] o constructor desta classe deve chamar o método *mapaEntrada* para iniciar as letras no atributo mapa;  
- [ ] o método *mapaLinha* é *private*, e serve “desenhar" uma linha quando for necessário “desenhar” uma linha horizontal no mapa. Está linha tem o seu comprimento ajustado de acordo com a quantidade de colunas do mapa;  
- [ ] o método *imprimir* é *public*, e imprime todas as letras da matriz mapa conforme demostrado no exemplo de execução;  
- [ ] o método *pesquisa* é *public*, e serve para fazer a busca das palavras da classe *CacaPalavras*, identificando qual linha e coluna inicia a respectiva palavra no mapa;  

ATENÇÃO:

- caso julgue necessário pode ser criado novos métodos *private* para serem chamados pelo método *pesquisa*.  
- a busca por palavras no mapa (método *pesquisa*) só precisam tratar de palavras que podem aparecer na horizontal (da esquerda para direita e da direita para esquerda) e na vertical (de cima para baixo e de baixo para cima).  

o método mapaEntrada é *private*, e deve conter somente:  
    mapa[ 0][ 0]='C';  mapa[ 0][ 1]='C';  mapa[ 0][ 2]='Q';  mapa[ 0][ 3]='W';  mapa[ 0][ 4]='E';  
    mapa[ 1][ 0]='I';  mapa[ 1][ 1]='X';  mapa[ 1][ 2]='F';  mapa[ 1][ 3]='O';  mapa[ 1][ 4]='R';  
    mapa[ 2][ 0]='F';  mapa[ 2][ 1]='F';  mapa[ 2][ 2]='R';  mapa[ 2][ 3]='G';  mapa[ 2][ 4]='F';  
    mapa[ 3][ 0]='E';  mapa[ 3][ 1]='L';  mapa[ 3][ 2]='I';  mapa[ 3][ 3]='H';  mapa[ 3][ 4]='W';  
    mapa[ 4][ 0]='L';  mapa[ 4][ 1]='S';  mapa[ 4][ 2]='F';  mapa[ 4][ 3]='O';  mapa[ 4][ 4]='U';  
    mapa[ 5][ 0]='S';  mapa[ 5][ 1]='D';  mapa[ 5][ 2]='G';  mapa[ 5][ 3]='T';  mapa[ 5][ 4]='S';  
    mapa[ 6][ 0]='E';  mapa[ 6][ 1]='J';  mapa[ 6][ 2]='H';  mapa[ 6][ 3]='E';  mapa[ 6][ 4]='T';  
    mapa[ 7][ 0]='I';  mapa[ 7][ 1]='I';  mapa[ 7][ 2]='I';  mapa[ 7][ 3]='J';  mapa[ 7][ 4]='M';  
    mapa[ 8][ 0]='X';  mapa[ 8][ 1]='C';  mapa[ 8][ 2]='K';  mapa[ 8][ 3]='B';  mapa[ 8][ 4]='G';  
    mapa[ 9][ 0]='V';  mapa[ 9][ 1]='E';  mapa[ 9][ 2]='T';  mapa[ 9][ 3]='O';  mapa[ 9][ 4]='R';  

## Atenção

O código **deve** seguir as informações descritas nos diagramas de Classes referente aos nomes das classes, atributos, métodos, parâmetros e qualificadores (visibilidade: public/private). Novas variáveis primitivas podem ser criadas dentro dos métodos, mas não podem ser criadas novas classes, atributos e métodos (só os que foram definidos no diagrama de classes abaixo).  

![-- Diagrama de Classe --](out/src/CacaMain/CacaMainGeral.svg "-- Diagrama de Classe --")  

![Ícones de Visibilidade - fonte: https://plantuml.com/class-diagram](iconesVisibilidade.png)  

## Exemplo da execução

As mensagens mostradas ao executar o código deste trabalho devem seguir o que é mostrado ao executar o [TrabalhoFinal.jar](TrabalhoFinal.jar).

### Como executar um JAR

- Abra o console do Windows pressionando a tecla Windows e depois digitando “cmd" e pressionar “enter”. Se for Linux ou MacOS abra o “terminal"  
![cmd Windows](cmdWindows.png)  
- Agora mude de pasta, para pasta que tem o **TrabalhoFinal.jar**. No meu caso para pasta de Download  
![pasta download](pastaDownload.png)
- E para executar digitar

  > java -jar TrabalhoFinal.jar

- Pronto, é só usar ... e ver como deve ficar as saídas.
