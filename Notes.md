Android App:
An Android application is a software application running on the Android platform.

XML:
XML stands for eXtendible Markup language. It is a metalanguage which allows users to define their own cutomised markup languages, espcially in order to display documents on the internet. It consists of tags which store some information. These tags can be used to present data on a screen.

Target to JVM, Kotlin is a cross-platform, statiscally types, general-purpose programming language with type interfence. Kotlin is designed to interoperate fully with Java but type inference allows its syntax to be more concise.

JVM:
Java Virtual Machine (JVM) is a virtual machine that enables a computer to run Java programs as well as programs written in other languages (Kotlin) that are also compiled to Java bytecode.

What is a statically-typed language:
Statically typed programming languages do type checking (i.e. they verify and enforce the constraints of types) at compile-time. This means that the language is able to tell the datatype of any variable during the compile time and does not allow a variable to have values of different data types in a single program.

Type inference means that the language can automatically detect the data type.

Variables are like names that are used to store data.
There are two types of variables in Kotlin:
Var variables: They are mutable, that is the data stored in them can change.

        Val variables: They are immutable, that is the data stored in them cannot change.

Indentifiers:
Variable names that we create to store the value of a variable.
Naming conventions:

        Indentifier must begin with an undercore or a letter.
        Identifier can have letters, numbers or underscores.
        Uppercase and lowercase characters are distinguihed. So. 'myName' will be different from 'myname'.

Data Type:
An attribute of data which tells the compiler how the programmer intends to use the data.
Data types in Kotlin:

        Int (whole numbers, both positive and negative)
        Double (decimal numbers)
        Boolean (true - false)
        Char (characters)
        String (a sequence of characters)
        Float (decimal numbers)

Operators:
Symbols which are used to perform some operation or a set of opereations on a variable or a set of variables. Kotlin has a set of operators to perform authmetic, assignment, comparison and increment/decrement operations.

    Arithmetic operators (+, -, *, /, %)
    Comparison operators (==. !=, <, >, <=, >=)
    Assignment operatos (=, +=, -=, *=, /=, %=)
    Increment & Decrement operators (++, --)

Nested If-Else < - > When statement

when{
(condition) -> (statement)
}

'In' operator -> '..'

Elvis Operator -> '?:'

Safety operator: '?'
Not-null operator: '!'

Naming conventions for creating classes:

        Use the keyword 'class' before the name of the class
        The name of the class always starts with a capital letter

Constructor:
A constructor is a special kind of member function that is used to initialise the state or propreties of the newly created objects of a class.
The constructor is written inside the class, but it gets invoked when you create an instance of a class (Objects)

Data Classes

        Used to store data
        Perform operations directly on data stored in the objects of a class.
        Help in omitting redundant code.
        Primary constructor of a data class must always have atleast one parameter.

Visibility Modifiers

        public: Anything that is declared public is accessible everywhere in the project

        private: A top-level function or class that is declared private can be accessed only within the file where it is declared
        Any member function, constructor or property that is declared private is visible only within the class where it is declared.

        protected: Any property or member function declared protected is visible or accessible only within the class and its subclasses where it has been declared.
        A top level function cannot be declared protected. Only properties or member functions of a class can be declared protected.

        internal: Anything declared internal is accessible only within the same module. A module is a set of files compiled together

Features of Interfaces:

        Interfaces are similar to classes but they do not have a state. So, they do not have constructors as well.
        They can have functions with or without default implementations. That is, the function definition may not necessarily have to be there.
