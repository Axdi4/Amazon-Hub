#### **Learned From:**



###### **https://www.youtube.com/playlist?list=PLsyeobzWxl7oa1WO9n4cP3OY9nOtUcZIg**



### **OOPS:**



It is object oriented programming.



##### **Encapsulation:**



Def- Encapsulation in Java is the OOP principle of bundling data (variables) and methods that operate on that data into a single unit (a class) while restricting direct access to some components to protect data integrity.  It is primarily achieved by declaring class variables as private and providing public getter and setter methods to access and modify them in a controlled manner.



**Key aspects include:**



Data Hiding: Private access modifiers prevent external code from directly accessing or modifying internal state, ensuring that only valid operations are performed via public methods.



Controlled Access: Getters and setters allow for validation logic (e.g., checking for negative balances) before data is read or changed.



Types: This includes Member Variable Encapsulation (protecting fields) and Function Encapsulation (hiding internal helper methods by making them private).



Benefits: It enhances security, modularity, and maintainability by decoupling the internal implementation from the external interface, allowing changes to the internal code without affecting other parts of the application as long as the public interface remains consistent.



**Working:**



The code could be syntax wise right but it should be perfectly protected and encrypted. By using encapsulation it is achieved.



Making the parameters private, using "private" Keyword, no external source can access it.



To access the private parameters, a public method inside the class containing the private parameters should be created.



The private parameters can only be accessed(using a method or any other ways) inside it's own class, you cannot call a private parameter from a different class.



We are binding the data using methods, which makes it encrypted. We are privatizing / encapsulating the parameters and methods.



Refer Encapsulation- OOPS.



###### 

###### **Getter and Setter:**



Def- Getter and setter methods are used to get and set values to or from local private methods in a class and give it to a different class by calling it's object.



Getters and setters are methods in Java used to access and modify private class variables, implementing the encapsulation principle of Object-Oriented Programming.  A getter (accessor) retrieves the value of a private field, typically named getFieldName(), while a setter (mutator) updates it, named setFieldName().



Using these methods instead of public fields allows for data validation, security, and flexibility.  For example, a setter can enforce rules before assigning a value, or a getter can return a transformed value, all without breaking external code that relies on the class interface.



While standard Java requires manual implementation, libraries like Lombok can automatically generate these methods using annotations (e.g., @Getter, @Setter) to reduce boilerplate code.



The method name can be anything it doesn't have to be set() or get(). But the method name should be defining what the method working on because the code should be readable and understandable.



And you don't have to write the setter and getter code for methods, In current java compilers, we have generation inbuilt codes; which contains getter and setter methods(can be generated instead of writing), by mentioning the variables which you have to get and set.



Refer Getter \& Setter- OOPS.



###### **.this Keyword:**



Def- The this keyword in Java is a reference variable that refers to the current object (instance) of the class in which it is used.  It is automatically available in all non-static methods and constructors, allowing the object to refer to itself.



Primary uses of the this keyword include:



Resolving Ambiguity: It distinguishes between instance variables and method parameters or local variables that share the same name (e.g., this.name = name;).



Constructor Chaining: It invokes another constructor within the same class using this(arguments), which must be the first statement in the constructor.



Invoking Methods: It explicitly calls methods of the current class (e.g., this.methodName()), though this is often optional as the compiler adds it implicitly.



Passing Current Object: It passes the current instance as an argument to other methods or constructors (e.g., someMethod(this)).



Returning Current Object: It allows a method to return the current class instance, enabling method chaining.



Important Constraints:



this cannot be used in static methods or static blocks because static contexts belong to the class, not to a specific instance.



In inner classes, this refers to the inner class instance; to refer to the outer class instance, use OuterClassName.this.





Refer .this Keyword- OOPS.



###### **Constructor:**



Def- In Java, a constructor is a special block of code used to initialize objects when they are created.  It shares the same name as the class, has no return type (not even void), and is automatically invoked when the new keyword is used to instantiate a class.



Whenever the object get created, the parameters should be created/initialized with it, instead of producing default null values, you can set up default values for the parameters, To achieve this Constructors are used.



It is used to assign/initialize default values to the object. for e.g. if you want to set limit to the system (set an age limit).



A constructor looks like a method, the only change you don't specify the return type. And there is a compulsion that the constructor name should be the same as the class name.



So, the constructor don't have to be called, every time you initialize the object the constructor gets created. So every object get created, a new constructor gets created.



Key Characteristics and Types:



Automatic Invocation: If no constructor is explicitly defined, the Java compiler provides a default constructor that initializes variables to their default values (e.g., 0 for integers, null for objects).



Parameterized Constructors: These accept arguments to allow for custom initialization of object attributes during creation.



Constructor Overloading: Java supports multiple constructors with different parameter lists, enabling flexible object initialization.



Copy Constructors: Unlike C++, Java does not have a built-in copy constructor; however, developers can manually implement one by creating a constructor that accepts an instance of the same class to copy its values.





**Default vs Parameterized Constructor:**



Def- Default constructors have no parameters and initialize objects with default values (e.g., 0, null or default value given by the user e.g. Aadi, 21), while parameterized constructors accept arguments to initialize objects with specific, user-defined values.



The primary distinctions include:



Parameter Count: Default constructors take zero arguments; parameterized constructors take one or more.



Origin: The compiler automatically provides a default constructor only if no other constructors are defined; parameterized constructors must be explicitly written by the programmer.



Initialization: Default constructors assign default values to instance variables, whereas parameterized constructors allow custom initialization and validation of input data.



Compiler Behavior: Defining a parameterized constructor prevents the compiler from generating a default constructor; if no-argument creation is needed alongside parameters, a no-argument constructor must be explicitly declared.



And you don't have to write the constructor code, In current java compilers, we have generation inbuilt codes; which contains default and parameterized constructors(can be generated instead of writing), by mentioning the variables which you have to create constructor it will create parameterized constructor. Without mentioning the variables it will create default constructor.



Refer default vs Parameterized Constructors.







##### **Inheritance:**



Def- Inheritance in Java is an Object-Oriented Programming (OOP) mechanism where a class (the subclass or child) acquires the fields and methods of another class (the superclass or parent), establishing an IS-A relationship.  This process is implemented using the extends keyword and is primarily used to promote code reusability and logical hierarchical organization.



When a subclass extends a superclass, it inherits all public and protected members, as well as default members if both classes are in the same package; private members remain encapsulated and are not inherited.  The mechanism supports method overriding for runtime polymorphism and utilizes the super keyword to access parent class constructors and methods.



In Java, inheritance is implemented using the extends keyword, which allows a subclass (child class) to inherit fields and methods from a superclass (parent class).  This establishes an IS-A relationship and promotes code reusability.



The basic syntax is:



class Superclass {

&#x20;   // fields and methods

}



class Subclass extends Superclass {

&#x20;   // additional fields and methods

}



To explicitly call a superclass constructor from the subclass, use the super keyword as the first statement in the subclass constructor:



class Subclass extends Superclass {

&#x20;   Subclass() {

&#x20;       super(arguments); // Calls superclass constructor

&#x20;   }

}



Java supports several types of inheritance:



Single Inheritance: One subclass inherits from one superclass.



Multilevel Inheritance: A chain of inheritance (e.g., A → B → C).



Hierarchical Inheritance: Multiple subclasses inherit from a single superclass.



Multiple/Hybrid Inheritance: Java does not support multiple inheritance through classes to avoid the "diamond problem"; instead, it is achieved via interfaces\*\*.\*\*



###### **Need of Inheritance:**



Inheritance in Java is primarily used to establish an IS-A relationship between classes, allowing a subclass to inherit properties and behaviors from a superclass.  Its main purposes include:



Code Reusability: Developers can reuse existing code by creating new classes based on existing ones, reducing redundancy and improving development efficiency.



Extensibility: It allows extending the functionality of a base class by adding new methods or fields in the derived class without modifying the original code.



Method Overriding: Inheritance is essential for achieving runtime polymorphism through method overriding, where a subclass provides a specific implementation of a method defined in its parent.



Logical Organization: It helps structure code hierarchically, making applications more modular, maintainable, and easier to understand by grouping related classes.

While Java does not support multiple inheritance with classes to avoid complexity (like the diamond problem), it supports multiple inheritance via interfaces, enabling classes to inherit type definitions from multiple sources.





###### **Multiple Inheritance:**



Def- Java does not support multiple inheritance with classes to avoid ambiguity issues, specifically the Diamond Problem, where a subclass inherits conflicting method implementations from two parent classes.  For example, if Class C extends Class A, Class B and both A and B define a show() method, the compiler cannot determine which version to use.



This is called Ambiguity. where the class object can't decide which parent class to choose from.



It is solved using interfaces.



Refer OOPS- Multiple Inheritance.





###### **This and Super Method:**



Def- In Java, super is a reserved keyword used to refer to the immediate parent class object.  It is primarily used in three contexts: accessing hidden fields, invoking overridden methods, and calling parent constructors. 



Accessing Fields: Use super.fieldName to access a variable in the parent class when the child class has a variable with the same name.



Invoking Methods: Use super.methodName() to call the parent class's implementation of a method that has been overridden in the subclass. 



Calling Constructors: Use super() or super(args) as the first statement in a subclass constructor to explicitly invoke the parent class's constructor.

&#x20;

The keyword cannot be used in static contexts because it refers to an instance object. Note that super only refers to the direct parent; you cannot use super.super to access the grandparent class.



You have default super methods in parent class as well because, every class in java is extends to the Object class.



this() will execute the constructor of the same class.



First Statement Rule: Both this() and super() must be the first statement inside a constructor. 



Mutual Exclusivity: You cannot use both this() and super() in the same constructor because only one can be the first statement. 



Automatic Call: If a constructor does not explicitly call this() or super(), Java automatically inserts super() to call the parent class's no-argument constructor.





|Features|this|super|
|-|-|-|
|Reference |Current class instance|Parent class instance|
|Variable Access|Current class fields|Parent class fields (if hidden)|
|Method Invocation|Current class methods|Parent class methods (if overridden)|
|Location|Can be used anywhere in instance context|Can be used anywhere in instance context|
|Constructor Restriction|Must be first statement; cannot coexist with super()|Must be first statement; cannot coexist with this()|























