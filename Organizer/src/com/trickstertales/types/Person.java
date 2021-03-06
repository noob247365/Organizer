package com.trickstertales.types;

public class Person {

	private String nameFirst, nameMiddle, nameLast;
	public int id;

	public Person() {
		nameFirst = nameMiddle = nameLast = null;
	}

	public Person(String... names) {
		if (names == null || names.length < 1 || names.length > 3) {
			nameFirst = nameMiddle = nameLast = null;
			return;
		}
		switch (names.length) {
		case 1:
			nameFirst = names[0];
			nameMiddle = nameLast = null;
			break;
		case 2:
			nameFirst = names[0];
			nameMiddle = null;
			nameLast = names[1];
			break;
		case 3:
			nameFirst = names[0];
			nameMiddle = names[1];
			nameLast = names[2];
			break;
		default:
			nameFirst = nameMiddle = nameLast = null;
		}
	}

	public String toString() {
		if (nameMiddle == null) {
			if (nameLast == null) {
				if (nameFirst == null) {
					return "";
				} else {
					return nameFirst + "";
				}
			} else {
				return nameFirst + " " + nameLast;
			}
		} else {
			return nameFirst + " " + nameMiddle + " " + nameLast;
		}
	}

	public String properString() {
		if (nameMiddle == null) {
			if (nameLast == null) {
				if (nameFirst == null) {
					return "";
				} else {
					return nameFirst + "";
				}
			} else {
				return nameLast + ", " + nameFirst;
			}
		} else {
			return nameLast + ", " + nameFirst + " " + nameMiddle;
		}
	}
}
