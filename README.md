# EULER_y_RK4
## Descripción
Este proyecto contiene la implementación de dos métodos numéricos para resolver ecuaciones diferenciales ordinarias (EDO) mediante el lenguaje de programación Java.
Los métodos implementados son:
- Método de Euler.
- Método de Runge-Kutta de cuarto orden (RK4).
Ambos programas permiten calcular aproximaciones numéricas,
compararlas con sus soluciones analíticas exactas y determinar
el error absoluto obtenido en cada iteración.

## Requisitos
Para ejecutar los programas se necesita:
- Java Development Kit (JDK).
- Terminal o símbolo del sistema.
- Git para clonar el repositorio.

## Instalación y ejecución
1. Clonar el repositorio
Abrir una terminal y ejecutar:
```bash
git clone URL_DEL_REPOSITORIO
```
2. Compilar el programa de Euler
```bash
javac MetodoEuler.java
```
3. Ejecutar el programa de Euler
```bash
java MetodoEuler
```
4. Compilar el programa Runge-Kutta
```bash
javac MetodoRungeKutta.java
```
5. Ejecutar el programa Runge-Kutta
```bash
java MetodoRungeKutta
```

## Resultados esperados en consola
1. Método de Euler
n	x_n	 y_n(Euler)	 Exacta		 Error
--------------------------------------------------------
0	 0.0000	 1.000000	 1.000000	 0.000000
1	 0.1000	 0.900000	 0.909675	 0.009675
2	 0.2000	 0.820000	 0.837462	 0.017462
3	 0.3000	 0.758000	 0.781636	 0.023636

2. Método Runge-Kutta de cuarto orden
n	x_n	 y_n(RK4)	 Exacta		 Error
--------------------------------------------------------
0	 0.0000	 1.000000	 1.000000	 0.000000
1	 0.1000	 1.110342	 1.110342	 0.000000
2	 0.2000	 1.242805	 1.242806	 0.000000
3	 0.3000	 1.399717	 1.399718	 0.000001
