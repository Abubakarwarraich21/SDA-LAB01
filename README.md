# SDA-LAB01
Polymorphism is one of the key principles of the GRASP (General Responsibility Assignment Software Patterns) framework, which is a set of guidelines for assigning responsibilities to classes and objects in object-oriented design. Polymorphism enables objects of different classes to be treated as objects of a common superclass. It is particularly useful in promoting flexibility and reusability in code.

Description of Polymorphism in GRASP
Definition: Polymorphism allows methods to do different things based on the object that it is acting upon. This means that a single interface can be used to represent different underlying forms (data types). In GRASP, polymorphism helps to reduce coupling and increase cohesion within a software system.

Types of Polymorphism:

Compile-time Polymorphism (Static Binding):
Achieved through method overloading (same method name with different parameters) and operator overloading.
Run-time Polymorphism (Dynamic Binding):
Achieved through method overriding, typically using inheritance and interfaces. This allows for more flexible and dynamic code execution.
Benefits of Polymorphism
Flexibility: Code can be written to work with objects of a superclass, allowing for the addition of new subclasses with minimal changes to existing code.
Reusability: Common interfaces or abstract classes can be reused across various implementations.
Maintainability: Changes in one part of the system can be isolated and managed without extensive changes throughout the codebase.

Explanation of the Code provided:

Base Class (Animal): This is an abstract class that defines a method make_sound. It raises an exception if not overridden, enforcing derived classes to implement this method.

Derived Classes (Dog, Cat, Cow): Each of these classes inherits from Animal and provides its own implementation of the make_sound method.

Polymorphic Function: The animal_sound function accepts an Animal object. It calls the make_sound method on whatever animal it receives. The actual method executed depends on the specific object passed to the function, demonstrating run-time polymorphism.

Conclusion
Polymorphism, as a principle of GRASP, allows developers to design systems that are flexible, maintainable, and extensible. By leveraging inheritance and interfaces, different implementations can be managed through a common interface, making the code easier to work with and adapt as requirements evolve.
