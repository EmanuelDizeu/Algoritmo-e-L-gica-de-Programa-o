# Fluxograma - Tabuada em Java

Fluxograma do programa `Alg07_1`, que lê um número e exibe sua tabuada de 1 a 10.

```mermaid
flowchart TD
    A([Início]) --> B[Exibir mensagem de entrada]
    B --> C[Ler número - number]
    C --> D[Chamar tabuada - number]
    D --> E[x = 1]
    E --> F{x < 11 ?}
    F -- Sim --> G[n = a * x]
    G --> H[/Exibir: a x x = n/]
    H --> I[x = x + 1]
    I --> F
    F -- Não --> J([Fim])

    style A fill:#f5f5f5,stroke:#666
    style J fill:#f5f5f5,stroke:#666
    style F fill:#f8cecc,stroke:#b85450
    style B fill:#e1d5e7,stroke:#9673a6
    style C fill:#e1d5e7,stroke:#9673a6
    style D fill:#e1d5e7,stroke:#9673a6
    style E fill:#e1d5e7,stroke:#9673a6
    style G fill:#e1d5e7,stroke:#9673a6
    style H fill:#e1d5e7,stroke:#9673a6
    style I fill:#e1d5e7,stroke:#9673a6
```