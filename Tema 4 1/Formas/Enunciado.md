Herencia y polimorfismo

Defina una clase Forma que tenga los siguientes miembros de datos:

    Color
    Coordenada del centro de la forma (objeto Punto)
    Nombre de la forma

Y, al menos, las siguientes funciones miembro:

    Imprimir
    Obtener y cambiar el color
    Mover la forma (o sea, su centro)

Defina una clase derivada Rectangulo que tenga los siguientes miembros como datos:

    Lado menor.
    Lado mayor.

Y, al menos, las siguientes funciones miembro:

    Imprimir. Debe imprimir qué se tr ata de un rectángulo mostrando su nombre, color, centro y lado. Debería usarse la función Imprimir de la clase base para realizar parte de este trabajo.
    Calcular el área (lado menor * lado mayor).
    Calcular el perímetro. (2 * lado menor + 2 * lado mayor).
    Cambiar el tamaño del rectángulo. Recibe como parámetro un factor de escala. Así, por ejemplo, si el factor vale 2, el rectá ngulo duplicará su tamaño y si es 0,5 se reducirá a la mitad.

Realice un programa que pruebe el funcionamiento de estas clases. Debe crear objetos y comprobar el correcto funcionamiento de las funciones miembro.

Defina una clase Elipse derivada de forma. Recordatorio: una elipse queda definida por su radio mayor (R) y su radio menor (r), tal que el área de una elipse es igual a π*(R*r).

Defina una clase Cuadrado derivada de la clase Rectangulo.

Defina una clase Circulo derivada de la clase Elipse.

Realice un programa que defina varias formas diferentes, cree un vector de punteros de la clase Forma que apunten a los objetos creados. El programa debe realizar un bucle que recorra todas las formas, las ponga todas del mismo color y las mueva a una determinada posición.

Analice qué ocurre en el ejercicio anterior si se intenta imprimir la información de cada forma y qué sucede si se intenta obtener en ese bucle el área de todas las formas del vector.