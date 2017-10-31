# DojoN1_Principios
Dojo #1 del programa Chanchi Ninja nivel "Novato" 

Skill técnico: Diseño. 

### Principios introducidos: ###
* Principio de responsabilidad única
* Principio de la menor sorpresa posible

Este ejercicio se ha tomado de un amplio trabajo ya realilizado para trabajar la Kata: [Code Smell](https://github.com/emilybache/GildedRose-Refactoring-Kata)

Presentación: [Dojo 1: Principios de diseño](https://docs.google.com/a/dsindigo.com/presentation/d/1I4FvHsa8FXrNoqswoUk-6hduWaG5tT11aQG5gAFrqdg/edit?usp=sharing) 


### Instrucciones ###
1. Revisa la presentación [Dojo 1: Principios de diseño](https://docs.google.com/a/dsindigo.com/presentation/d/1I4FvHsa8FXrNoqswoUk-6hduWaG5tT11aQG5gAFrqdg/edit?usp=sharing) .
2. Crea una carpeta con tu nombre y apellido (y apellido si es necesario para no repetir archivos) donde clones el código de la carpeta "kataCodeSmell".
3. Leer los requerimientos que detallamos al final de estas instrucciones, para entender el problema planteado.
4. Sigue las reglas especificadas en los requerimientos.
5. Corrige la prueba que está fallando.
6. Utiliza TDD para eliminar los malos olores en el código.
7. Emplea el estándar de Indigo para hacer commit.
8. Deja que el historial de git nos cuente como lo hiciste, organiza tus commits para hacer legibles tus pasos, técnicas, etc empleadas.
9. En este ejercicio puedes aplicar más temas, técnicas, buenas prácticas, etc, de los que ya hemos revisado en el programa estos te harn ganar mas puntos, el límite lo pones tú.
10. No olvides utilizar el estándar de códificación para java de Indigo.

Nota. Si quieres emplear otras herramientas para pruebas, no dudes en hacerlo.

======================================
Gilded Rose Requirements Specification
======================================

Hi and welcome to team Gilded Rose. As you know, we are a small inn with a prime location in a
prominent city ran by a friendly innkeeper named Allison. We also buy and sell only the finest goods.
Unfortunately, our goods are constantly degrading in quality as they approach their sell by date. We
have a system in place that updates our inventory for us. It was developed by a no-nonsense type named
Leeroy, who has moved on to new adventures. Your task is to add the new feature to our system so that
we can begin selling a new category of items. First an introduction to our system:

	- All items have a SellIn value which denotes the number of days we have to sell the item
	- All items have a Quality value which denotes how valuable the item is
	- At the end of each day our system lowers both values for every item

Pretty simple, right? Well this is where it gets interesting:

	- Once the sell by date has passed, Quality degrades twice as fast
	- The Quality of an item is never negative
	- "Aged Brie" actually increases in Quality the older it gets
	- The Quality of an item is never more than 50
	- "Sulfuras", being a legendary item, never has to be sold or decreases in Quality
	- "Backstage passes", like aged brie, increases in Quality as its SellIn value approaches;
	Quality increases by 2 when there are 10 days or less and by 3 when there are 5 days or less but
	Quality drops to 0 after the concert

We have recently signed a supplier of conjured items. This requires an update to our system:

	- "Conjured" items degrade in Quality twice as fast as normal items

Feel free to make any changes to the UpdateQuality method and add any new code as long as everything
still works correctly. However, do not alter the Item class or Items property as those belong to the
goblin in the corner who will insta-rage and one-shot you as he doesn't believe in shared code
ownership (you can make the UpdateQuality method and Items property static if you like, we'll cover
for you).

Just for clarification, an item can never have its Quality increase above 50, however "Sulfuras" is a
legendary item and as such its Quality is 80 and it never alters.
