package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int index = 0;
		for (int i = 0; i < eggs.size(); i++) {
			index = i;
			if(eggs.get(i)=="cracked") {
				return index;
			}
		}
		return index;	}

	public static int countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		int pearls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i)==true) {
				pearls++;
			}
		}
		return pearls;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		double tallest = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i)>tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		String largest = "";
		for (int i = 0; i < words.size(); i++) {
			if(words.get(i).length()>largest.length()) {
				largest = words.get(i);
			}
		}
		return largest;
	}

	public static boolean containsSOS(List<String> message1) {
		// TODO Auto-generated method stub
		boolean sos = false;
		for (int i = 0; i < message1.size(); i++) {
		if(message1.get(i).contains("... --- ...")) {
			sos = true;
			return sos;
		}
		}
		return sos;
	}

	public static List<Double> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		double[] array = new double[results.size()];
		ArrayList<Double> dubs = new ArrayList<Double>();
		for (int i = 0; i < array.length; i++) {
			array[i] = results.get(i);
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if(array[j]>array[j+1]) {
					double holder = array[j];
					array[j] = array[j+1];
					array[j+1] = holder;
				}
			}
		}
		for(int i = 0; i<array.length; i++) {
			dubs.add(array[i]);
			System.out.println(dubs.get(i));
		}
		return dubs;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		ArrayList<String> Sorted = new ArrayList<String>();
		String[] array = new String[unsortedSequences.size()];
		for (int i = 0; i < array.length; i++) {
			array[i] = unsortedSequences.get(i);
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if(array[j].length()>array[j+1].length()) {
					String holder = array[j];
					array[j] = array[j+1];
					array[j+1] = holder;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			Sorted.add(array[i]);
			System.out.println(Sorted.get(i));
		}
		return Sorted;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		String[] array = new String[words.size()];
		ArrayList<String> sorted = new ArrayList<String>();
		for (int i = 0; i < array.length; i++) {
			array[i] = words.get(i);
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length-1; j++) {
				if(array[j].charAt(0)>array[j+1].charAt(0)) {
					String holder = array[j];
					array[j] = array[j+1];
					array[j+1] = holder;
				}
			}
		}
		for(int i = 0; i < array.length; i++) {
			sorted.add(array[i]);
			System.out.println(sorted.get(i));
		}
		return sorted;
	}
}
