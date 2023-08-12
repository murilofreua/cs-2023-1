# Tarefa 021 - Teste de Software - 28/07/2023

### Classes de Equivalência:

|CE01| - (faltas <= 0.25*cargaHoraria) && (((nota1 + nota2) / 2 ) >= 6.0 ) |V|

|CE02| - faltas > 0.25*cargaHoraria |I|

|CE03| - ((nota1 + nota2) / 2 ) < 3.0 |I|

|CE04| - 3.0 <= ((nota1 + nota2) / 2 ) < 6.0 |I|

|CE05| - (nota1 < 0.0 || nota1 > 10) || (nota2 < 0.0 || nota2 > 10) ||
         (faltas < 0.0 || faltas > cargaHoraria) || (cargaHoraria < 0.0) |I|

### Casos de Testes:

|CT01| - | 8.0 | 7.6 | 64 | 10 | Aprovado | CE01

|CT02| - | 8.0 | 7.6 | 64 | 24 | Reprovado por Falta | CE02

|CT03| - | 2.2 | 3.0 | 64 | 8 | Reprovado por Média | CE03

|CT04| - | 4.0 | 5.0 | 64 | 8 | Recuperação | CE04

|CT05| - | 8.0 | -7.6 | 64 | 10 | Valor Inválido | CE05
