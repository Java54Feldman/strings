package telran.strings;

public class RegularExpressions {
public static String javaVariable() {
String regex = "[A-Za-z$][A-Za-z0-9_$]*|_[A-Za-z0-9_$]+";
//String regex = "[A-Za-z$][\\w$]*|_[\\w$]+"; same
	return regex;
}
public static String zero_300() {
	//string contains number from 0 - 300; leading zeros are disallowed
	String regex = "[1-9]\\d?|[1-2]\\d\\d|300|0";
	return regex;
}
public static String ipOctet() {
	//string contains 1 - 3 symbols presenting number from 0 - 255; leading zeros allowed
	String regex = "\\d\\d?|[0-1]\\d\\d|2[0-4]\\d|25[0-5]";
	return regex;
}
public static String mobileIsraelPhone() {
	//string contains possible Israel mobile phone number
	//+972-...|+972...<prefix two digits beginning from 5>-<7 digits of number>
	//<prefix three digits: first 0, second 5, third - any>-<7 digits of number>
	String regex = "\\+972-?5\\d-?\\d\\d\\d\\d\\d\\d\\d|05\\d-?\\d\\d\\d\\d\\d\\d\\d";
	return regex;
}
}
