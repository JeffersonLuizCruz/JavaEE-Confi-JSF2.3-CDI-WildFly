# Configuracao-JSF2.3-CDI-Maven-WildFly
Neste tutorial, você aprenderá como configurar um ambiente de desenvolvimento JSF 2.3 com o IDE Eclipse, Maven e servidor de aplicação WildFly. O sistema operacional utilizado nesse tutorial é a Distribuição Linux Mint 19.3 Tina.

## 1. Instalando Java SE
Tenha certeza que já possui instalado uma versão do JDK em sua máquina. A versão atual do java SE é 14. Nesse tutorial vamos fazer a instalação da versão 13. A configuração mínina é Java JDK 8 ou 1.8. Para fazer o download da JDK segue o link: https://docs.oracle.com/en/java/javase/index.html
É importante que após a instalação da JDK você faça a configuração da variável de ambiente JAVA_HOME apontada para JDK. Veja baixo:

### Adicionando variável de ambiente JAVA_HOME#:
1. Abra o arquivo que está localizado no diretório **_gedit /etc/environment_** e adicione a seguinte linha e salve: **_JAVA_HOME="/usr/lib/jvm/jdk-13.0.2"_**

2. Use o comando **_source /etc/environment_** em seguida use o comando **_echo $JAVA_HOME_** Tudo concluído, finalizamos esta etapa.



## 2. Instalação do Maven
Para baixar o Maven vá no site: https://maven.apache.org/download.cgi 
Para seguir esse tutorial é importante que baixe o Maven com extensão .tar.gz e descompactar no diretório de arquivo _/opt/_ O Maven baixado dentro do diretório Downloads o seguinte comando fará o descopactamento para _/opt/_

**Descompactar o aquivo para _/opt/_**
: tar -zxvf apache-maven-3.6.3-bin.tar.gz /opt/

**Renomear arquivo _apache-maven-3.6.3_ para _maven_**
: mv apache-maven-3.6.3 maven

**Será necessário adiciobar duas linhas no arquivo _/etc/profile_**
: gedit /etc/profile

____________________________
_Adicionar ná ultima linha do arquivo /etc/profile:_

export M3_HOME=/opt/maven

export PATH=$M3_HOME/bin:$PATH
______________________________
**Encerre a sessão do seu Linux ou reinicie**
: mvn -version

_Esse comando fará o teste se o Maven foi instalado ou não. Caso seja exibido a versão Maven tudo foi instalado corretamente._



