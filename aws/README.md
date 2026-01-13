# 📘 Relatório de Implementação de Serviços AWS

📅 **Data:** 13/01/2026  
🏢 **Empresa:** Abstergo Industries  
👨‍💻 **Responsável:** Donizete Crisostomo  

---

## 📌 Introdução

Este documento descreve o processo de **implementação de serviços AWS** na empresa **Abstergo Industries**, conduzido por **Donizete Crisostomo**, com foco em **redução imediata de custos**, **otimização de desempenho** e **adoção de boas práticas de arquitetura em nuvem**.

O objetivo principal do projeto foi **selecionar e implantar três serviços AWS estratégicos**, alinhados às necessidades do negócio, garantindo escalabilidade, durabilidade e alta disponibilidade.

---

## 🛠️ Descrição do Projeto

A implementação foi dividida em **três etapas**, cada uma voltada para um tipo específico de carga de trabalho.

---

### 🔹 Etapa 1 — Amazon S3

- **Serviço:** Amazon Simple Storage Service (S3)  
- **Foco:** Armazenamento de objetos com alta durabilidade e baixo custo  

#### Caso de uso
A empresa possui aplicações que manipulam **arquivos de grande porte**, como vídeos editados entre **60 e 80 GB**, além de logs e artefatos de processamento.

O **Amazon S3** foi escolhido por oferecer:

- 📦 Armazenamento altamente escalável
- 🔐 Durabilidade de **99,999999999% (11 noves)**
- 💰 Redução significativa de custos
- 🔄 Independência do ciclo de vida das instâncias EC2

Essa abordagem separa a **camada de processamento** da **camada de armazenamento**, permitindo otimizações futuras via **classes de armazenamento** e **políticas de lifecycle**.

---

### 🔹 Etapa 2 — Amazon EBS (st1)

- **Serviço:** Amazon Elastic Block Store — HDD otimizado para throughput (st1)  
- **Foco:** Processamento sequencial de grandes volumes de dados  

#### Caso de uso
Para workloads de **processamento de logs** e **data warehouse**, foi adotado o volume **EBS st1**, ideal para:

- 📊 Grandes volumes de dados
- ➡️ Leitura e escrita sequenciais
- 🚀 Alto throughput
- 💸 Menor custo comparado a SSDs

Essa escolha garante **persistência dos dados**, desempenho adequado e otimização de custos.

---

### 🔹 Etapa 3 — Amazon RDS

- **Serviço:** Amazon Relational Database Service (RDS)  
- **Foco:** Banco de dados relacional gerenciado  

#### Caso de uso
Para dados estruturados da aplicação, foi implementado o **Amazon RDS**, compatível com **MySQL e PostgreSQL**, oferecendo:

- 🔄 Patches automatizados
- 💾 Backups automáticos
- 🛡️ Alta disponibilidade com **Multi-AZ**
- 🔁 Failover automático
- 🚨 Recuperação de desastres integrada

O uso do RDS reduz o **overhead operacional** e aumenta a confiabilidade do ambiente.

---

## ✅ Conclusão

A adoção dos serviços **Amazon S3**, **Amazon EBS (st1)** e **Amazon RDS** proporciona à **Abstergo Industries**:

- 💰 Redução imediata de custos
- 📈 Escalabilidade automática
- 🔐 Alta durabilidade e confiabilidade
- ⚙️ Simplificação do gerenciamento
- ☁️ Arquitetura alinhada às boas práticas da AWS

Recomenda-se a evolução contínua do ambiente com serviços como **S3 Intelligent-Tiering**, **AWS Backup** e **Amazon CloudWatch**.

---

## 📎 Anexos

- 📄 Documentação oficial da AWS
- 🗺️ Diagramas de arquitetura
- 📊 Planilhas comparativas de custos
- 📘 Guia de boas práticas adotadas

---

✍️ **Responsável pelo Projeto:**  
**Donizete Crisostomo**  
*Arquiteto de Soluções AWS*
