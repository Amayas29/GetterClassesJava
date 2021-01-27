public class Test {

	public static void main(String[] args) {

		try {
			String str = "String";
			GetterClasses getStrClass = GetterClasses.getGetterClasse(str);
			Class<?> strClass = Class.forName(getStrClass.getNomClasse());
			Object newStr = strClass.getDeclaredConstructor(getStrClass.getListe()).newInstance(getStrClass.getParam());
			System.out.println(newStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
