club
Abre el proyecto club.
La clase Club pretende almacenar una colección de objetos de
tipo MemberShip
1. Dentro de Club, define un campo ArrayList para almacenar
lo miembros del club.
2. Completa el método numberOfMembers para devolver el tamaño
de la colección. Hasta que no dispongas de un método para
añadir elementos a la colección, este método devolverá
siempre 0, pero estará listo para más adelante.
3. Cada miembro de un club está representado en la clase
MemberShip que ya está hecha. Para añadir un objeto
MemberShip se debe usar el método join del objeto Club.
4. Define un método en la clase Club con la siguiente descripción
/**
* Determinar el número de miembros que se han unido en
* el mes indicado
* @param month El mes que nos interesa
* @return El número de miembros que se han unido
* ese mes
*/
public int joinedInMonth(int month)
Si el parámetro month está fuera de rango, debe imprimir un
mensaje y devolver 0.
5. Define un método purge(int month) que elimine de la colección
a todos los miembros que se unieron en un determinado mes
y devuelva la cantidad de miembros eliminados. Usa un
Iterador para recorrer la colección y el método remove del
mismo. Tienes un ejemplo a continuación.

Nota. Ejemplo de Iterador
import java.util.Iterator;
// ...
public void getNextMailItem(String who)
{
Iterator<MailItem> it = items.iterator();
while(it.hasNext()) {
MailItem item = it.next();
if(item.getTo().equals(who)) {
it.remove();
}
}
}