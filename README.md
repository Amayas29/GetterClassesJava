# Get an instance of a class from its name 'JAVA'

- *Version 0.1*
- *2020*

*NB : At the moment it's a bit static, but I'm trying to make it dynamic*

It allows you to create an instance (with default parameters) of a class from its name

Example : create a string

```java

    /* it can be a keyboard input or other */
    String nameClass = "String";


    GetterClasses getClass = GetterClasses.getGetterClasse(nameClass);

    Class<?> resultClass = Class.forName(getClass.getNomClasse());
    Object newObj = resultClass.getDeclaredConstructor(getClass.getListe()).newInstance(getClass.getParam());

```