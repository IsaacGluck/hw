public class StringStuff {
	public String capitalize(String name) {
		int space = name.indexOf(" ");
		return name.substring(0, 1).toUpperCase() + name.substring(1, space + 1) + name.substring(space + 1, space + 2).toUpperCase() + name.substring(space + 2, name.length());
	}
	
	public String bondify(String name) {
		name = capitalize(name);
		return name.substring(0, name.indexOf(" ")) + ", " + name;
	}
}