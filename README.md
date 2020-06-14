# Configuracao-JSF2.3-CDI-Maven-WildFly
Neste tutorial, você aprenderá como configurar um ambiente de desenvolvimento JSF 2.3 com o IDE Eclipse, Maven e o servidor de aplicativo WildFly. O sistema operacional utilizado nesse tutorial é a Distribuição Linux Mint 19.3 Tina.

## 1. Instalando Java SE
Tenha certeza que já possui instalado uma versão do JDK em sua máquina. A versão atual do java SE é 14. Nesse tutorial vamos fazer a instalação da versão 13. A configuração mínina é Java JDK 8 ou 1.8. Para fazer o download da JDK segue o link: https://docs.oracle.com/en/java/javase/index.html
É importante que após a instalação da JDK você faça a configuração da variável de ambiente JAVA_HOME apontada para JDK. Veja baixo:

### COMANDOS com usuário root #:
1. Abra o arquivo que está localizado no diretório **/etc/environment** e adicione a seguinte linha e salve: JAVA_HOME="/usr/lib/jvm/jdk-13.0.2"
2. Use o comando **source /etc/environment** e sem seguida use o comando **echo $JAVA_HOME**. Tudo concluído, finalizamos esta etapa.
-------------------------------------
gedit /etc/environment
JAVA_HOME="/usr/lib/jvm/jdk-13.0.2"
source /etc/environment
echo $JAVA_HOME

------------------------------------
