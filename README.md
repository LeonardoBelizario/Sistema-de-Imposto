# 🏛️ Java Tax Engine (Cálculo de Impostos)

Sistema de processamento tributário desenvolvido em Java para demonstrar a aplicação prática de lógica de negócio e princípios de Programação Orientada a Objetos (POO).

## 🚀 Sobre o Projeto
Este software automatiza o cálculo de impostos como **PIS** e **IPI**, utilizando uma arquitetura modular que permite a adição de novos tributos sem a necessidade de alterar o código principal.

## 🛠️ Destaques Técnicos
- **Polimorfismo & Interfaces:** Uso de `interface Imposto` para garantir o desacoplamento do sistema.
- **Lógica de Negócio Real:** Implementação de cálculo de PIS não-cumulativo (Débito/Crédito) e IPI com base de cálculo composta (frete, seguro e taxas).
- **Collections:** Gerenciamento de múltiplos pagamentos através de `List<Imposto>`.

## 📁 Estrutura
- `src/impostos`: Núcleo do sistema e regras tributárias.
- `Main.java`: Interface CLI para interação com o usuário.

---
*Projeto desenvolvido para portfólio de Desenvolvedor Back-end.*
