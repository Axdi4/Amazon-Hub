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



























