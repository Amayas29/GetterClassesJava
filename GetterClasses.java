public enum GetterClasses {

	String(String.class, "java.lang.String", new Object[]{""}, String.class),
	Integer(Integer.class, "java.lang.Integer", new Object[]{0}, int.class);

	private Class<?> classe;
	private String NomClasse;
	private Class<?>[] liste;
	private Object[] params;

	private GetterClasses(Class<?> classe, String NomClasse, Object[] params, Class<?>... liste) {
		this.classe = classe;
		this.NomClasse = NomClasse;
		this.params = params;
		this.liste = liste;
	}

	public static GetterClasses getGetterClasse(String nomClass) {
		for(GetterClasses gcls : values()) {
			if(gcls.name().equals(nomClass))
				return gcls;
		}
		return null;
	}

	public Class<?> getClasse() {
		return classe;
	}

	public String getNomClasse() {
		return NomClasse;
	}

	public Object[] getParam() {
		return params;
	}

	public Class<?>[] getListe() {
		return liste;
	}
}
