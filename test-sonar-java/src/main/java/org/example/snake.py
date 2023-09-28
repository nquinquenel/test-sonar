class C:
    def __bool__(self):
        return 42

    def __add__(self):  # Noncompliant. Missing one parameter
        return 42

A() * 3  # TypeError: __mul__() missing 1 required positional argument: 'unexpected'
A() + 3  # TypeError: __add__() takes 1 positional argument but 2 were given

