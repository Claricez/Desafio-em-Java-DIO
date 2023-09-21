# Repositório de Desafios de Código em Java - Bootcamp AWS


Este repositório foi criado para armazenar e compartilhar soluções para os desafios de programação enfrentados durante o bootcamp.


## Desafios Incluídos

1. [Desafio 1 - Validando a Força de Senhas no IAM
   ](https://github.com/Claricez/Desafio-em-Java-DIO/blob/main/src/ValidandoSenhas.java)
### Descrição do Problema
Você está trabalhando para uma empresa que utiliza extensivamente os serviços da AWS, e após algumas análises a equipe de segurança identificou que algumas senhas dos usuários no IAM são fracas e podem representar um risco à segurança dos dados da empresa. Para resolver esse problema, foi solicitado que você desenvolva um programa capaz de analisar as senhas dos usuários e fornecer uma validação de força com base em critérios predefinidos.

Requisitos de segurança para a senha:

* A senha deve ter no mínimo 8 caracteres.
* A senha deve conter pelo menos uma letra maiúscula (A-Z).
* A senha deve conter pelo menos uma letra minúscula (a-z).
* A senha deve conter pelo menos um número (0-9).
* A senha deve conter pelo menos um caractere especial, como !, @, #, $, %, etc.

2. [Desafio 2 - Velocidade de Download na AWS](https://github.com/Claricez/Desafio-em-Java-DIO/blob/main/src/VelocidadeDownload.java)

### Descrição do Problema
Você foi contratado como desenvolvedor pela "DIOCloudTech Solutions", que é especializada em serviços em nuvem baseados na AWS. 
E sua tarefa será criar uma calculadora de velocidade de download que leve em consideração a localização geográfica do servidor 
de origem e do dispositivo do usuário. Quanto mais próximo o servidor, menor será a latência e, portanto, a velocidade de download 
será melhor. Isso permitirá que os usuários estimem a velocidade de download para diferentes locais e servidores AWS em todo o mundo.

Fórmula para Cálculo da Velocidade de Download (em Mbps): A velocidade de download estimada (VD) será dada pela fórmula:

VD = VelocidadePlano / (1 + (DistanciaServidores / 100))

**Observação:**

A velocidade de download estimada _não pode_ exceder a velocidade do plano de internet contratado.


3. [Desafio 3 - Calculando Seus Custos na AWS](https://github.com/Claricez/Desafio-em-Java-DIO/blob/main/src/CalculandoCustosAWS.java)

### Descrição do Problema
você é um jovem engenheiro de software recém-contratado pela empresa "TechCloud". Sua equipe é responsável por desenvolver aplicativos e serviços que serão implantados na Amazon Web Services (AWS), a principal plataforma de computação em nuvem do mercado.

Sua primeira tarefa é desenvolver um programa simples em Java que auxilie os desenvolvedores a calcular os custos de execução de seus aplicativos na AWS. Para isso, você precisa coletar algumas informações e aplicar uma fórmula para determinar o custo total.

Aqui está como você pode realizar essa missão:

* Defina as taxas:

O custo por hora de um servidor é de **R$ 0,15.**

O custo por hora de um banco de dados é de **R$ 0,05.**

* Coletando informações:

O programa deve solicitar ao usuário a quantidade de servidores e a quantidade de bancos de dados que o aplicativo necessita para funcionar corretamente.
* Calcule os custos:

Multiplique a quantidade de servidores pelo custo por hora de um servidor e a quantidade de bancos de dados pelo custo por hora de um banco de dados. Some esses valores para obter o custo total.


* Exiba o resultado:

Mostre ao usuário o custo total do uso da AWS para executar o aplicativo durante uma hora.


4. [Desafio 4 - Regras Para Dimensionamento de Infraestrutura com EKS](https://github.com/Claricez/Desafio-em-Java-DIO/blob/main/src/RegrasEKS.java)

### Descrição do Problema

Você é um engenheiro responsável por ajudar as equipes de desenvolvimento a calcular o número mínimo de nodes e servidores necessários para suportar seus aplicativos no cluster do EKS..

Regras Básicas:

- Cada node pode suportar até 10 pods.
- Cada servidor (EC2) pode suportar até 4 pods.

Seu objetivo é desenvolver um programa em Java que permita ao usuário fazer uma consulta de dimensionamento. O programa deve receber o número total de pods do aplicativo e calcular o número mínimo de nodes e servidores necessários com base nas regras de dimensionamento.

Aqui estão as etapas que você deve seguir:

* Inicialização:

Defina as regras básicas de dimensionamento, ou seja, a capacidade de pods por node e pods por servidor.
* Recebendo as informações:

Solicite ao usuário que digite o número total de pods do aplicativo (utilize a função Scanner).
* Cálculo:

Calcule o número mínimo de nodes necessários, arredondando para cima o resultado da divisão do número total de pods pelo número de pods por node.
Calcule o número mínimo de servidores necessários, arredondando para cima o resultado da divisão do número total de pods pelo número de pods por servidor.
* Recomendações:

Se o número mínimo de nodes for menor ou igual a 1, exiba a recomendação de usar um único node.
Se o número mínimo de servidores for menor ou igual a 1, exiba a recomendação de usar um único servidor.