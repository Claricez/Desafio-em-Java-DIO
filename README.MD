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
