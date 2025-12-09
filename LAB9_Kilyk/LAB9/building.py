class Building:
    def __init__(self, address, floors, area, height):
        self.address = address
        self.floors = floors
        self.area = area
        self.height = height

    def get_info(self):
        return f"Будинок за адресою {self.address}, {self.floors} поверхів, площа {self.area} м², висота {self.height} м "

    def calculate_floor_area(self):
        if self.floors > 0:
            return self.area / self.floors
        else:
            return 0
