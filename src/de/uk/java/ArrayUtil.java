package de.uk.java;

public class ArrayUtil {

	/**
	 * Verkleinert das Array @param toShrink um @param shrinkBy und gibt das verkleinerte Array zurück
	 * Ein neues Array wird erstellt. Die Größe wird anhand der Parameter errechnet.
	 * Es wird über das neue kleinere Array iteriert. Dabei wird der Inhalt des alten Arrays 1:1 kopiert.
	 * Sobald das neue (kleinere) Array voll ist, ist die For-Schleife zuende. 
	 * Somit werden alle Elemente, die nicht in das neue Array passen einfach nicht übernommen.
	 * @param toShrink
	 * @param shrinkBy
	 * @return
	 */
	public static int[] shrinkArray (int[] toShrink, int shrinkBy) {
		int[] newArray = new int[toShrink.length - shrinkBy];
		
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = toShrink[i];
		}
		
		return newArray;
	}
	
	/**
	 * Gibt in einer Zeile der Konsole das Array als String aus.
	 * For-Schleife zum Iterieren über das Array.
	 * Bei jeder Iteration wird das momentane Element des Arrays dem StringBuilder übergeben
	 * Am Anfang und Ende der Methode werden die Klammern gesetzt
	 * in der For-Schleife wird eine Abfrage gemacht, ob man sich beim letzten Element befindet.
	 * Falls nicht wird ein Komma gesetzt. Damit wird verhindert, dass nach dem letzten Element ein Komma eingesetzt wird
	 * @param array
	 */
	public static void printArray (int[] array) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]);
			if (i != array.length-1) {
			sb.append(", ");
			}
		}
		sb.append("]");
		System.out.println(sb);
	}
}
