**Primer examen integrador - Programacion II
Lunes Noche - 1C 2025
Profesor Monz´on, Nicol´as Alberto
14 de abril de 2025**

Considere los siguientes predicados sobre los legajos de los integrantes.

**P(a) = la suma de los legajos m´odulo 3 es 0**

~~P(b) = la suma de los legajos m´odulo 3 es 1~~

~~P(c) = la suma de los legajos m´odulo 3 es 2~~

1. Ejercicio 1 (40%)
Crear el TDA VersionedStack, imitando (en lo que se pueda) la implementaci
´on de Stack desarrollada en clase. Ser´a una estructura lineal destructiva,
que adem´as permitir´a moverse entre versiones. Tip: pensar en un CRUD de
versiones.
Cada vez que se realice una operaci´on que modifique la estructura, se deber´a
generar una versi´on. Dado que cada versi´on se refleja con cada acci´on que puede
modificar la estructura, no se pide aplicar inmutabilidad.
Se espera:
Definir un conjunto de m´etodos que permita resolver la mayor cantidad
de algoritmos.
Si P(a), permitir borrar una versi´on. Si P(b), permitir crear una versi´on
nueva a partir de otra existente. Si P(c), a elecci´on.
Agregar a la definici´on de los m´etodos cu´ales son las precondiciones, postcondiciones
y estrategia de implementaci´on.
Indicar adem´as en un archivo txt (pdf y MD tambi´en est´an permitidos)
cu´ales son los invariantes que consideran para la estructura.
2. Ejercicio 2 (20%)
Modificar la estructura del ejercicio 1, tal que
Si P(a), considerar que el total de versiones no puede definir o limitar
el tama˜no del arreglo donde est´an siendo almacenadas. Deber´an crear el
arreglo con tama˜no 1 inicialmente, y cada vez que se crea una versi´on
nueva, el arreglo debe incrementarse 1 en longitud y agregar la nueva
versi´on. Como extender un arreglo no es posible porque tienen tama˜no
fijo, deber´an crear un nuevo arreglo que copie el contenido anterior.
Si P(c), considerar que como las versiones no se van a modificar, el tama
˜no del arreglo creado para almacenar los valores de cada versi´on no
necesita ser m´as grande que la cantidad de elementos de la pila. Guardar
las versiones sin depender de count.
Si P(b), a elecci´on.
3. Ejercicio 3 (10%)
Modificar la implementaci´on est´atica de Queue, para que en lugar de usar
un arreglo nativo, se utilice el TDA VersionedStack.
4. Ejercicio 4 (10%)
Desarrolle un m´etodo map que permita convertir una instancia de VersionedStack
a una instancia de A, y otro m´etodo map que permita convertir una instancia de
A a una VersionedStack.
Si P(b), considerar A = Stack.
Si P(c), considerar A = Queue.
Si P(a), a elecci´on.
5. Ejercicio 5 (10%)
Crear el TDA Coord que cumpla las propiedades usuales de una coordenada
de 3 componentes. Dar una implementaci´on, invariantes, precondiciones, postcondiciones
y definir una clase utilitaria con una funci´on que proyecte la i-´esima
componente (en este caso i = 0, i = 1, o i = 2).
6. Ejercicio 6 (10%)
Crear una clase utilitaria que permita calcular la distancia entre dos coordenadas,
saber si dos coordenadas son iguales y decidir si una coordenada pertenece
al primer octante.
