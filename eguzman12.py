# Eduardo Guzman
# CSC 321
# Lab 12

def areaRec (base,height):
    x = base * height
    return x

base = int(input("Enter value for base of rectangle: "))
height = int(input("Enter value for height of rectangle: "))

area = areaRec (base,height)
print("Area of the rectangle is: ", area)

def areaCirc (radius):
    x = 3.14 * radius * radius
    return x

radius = int(input("Enter value for radius of circle: "))

area = areaCirc (radius)
print("Area of the circle is: ", area)


