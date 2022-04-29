Control ficheros

Crea una aplicación con las siguientes caracteristicas:

-Una clase Persona con los atributos: nif, nombre y apellidos. Esos atributos deben ser accesibles para las clases hijas y no accesibles para el resto de clases. El acceso a esos atributos se realizará con los settters y getters adecuados.

-Una clase cliente que hereda de Persona con los atributos: id, nif, nombre, apellidos y email. Dichos atributos no pueden ser accesibles desde fuera de la clase. Dicho acceso se realizará con los getters y setters apropiados. 
Sobreescribe el método toString() para mostrar los atributos de forma tabular(cuando se imprima debe aparecer el nombre del atributo\tY el valor).

-Crea una clase PersistenciaCliente con un método write() que recibe un ArrayList de clientes de tal forma que escribe en un fichero clientes.dat todos los clientes recibidos en el ArrayList. Cada cliente se escribe en una linea con los atributos separados por comas. Luego hacer un método read que recibe como parametro el nombre del fichero a cargar y devuelve un ArrayList con los clientes que ha conseguido leer.