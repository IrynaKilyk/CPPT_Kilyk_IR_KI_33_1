# building.py
# Базовий клас "Будинок"

class Building:
    """
    Клас для представлення будинку
    """

    def __init__(self, address, floors, area):
        """
        Ініціалізація об'єкта будинку
        :param address: адреса будинку (str)
        :param floors: кількість поверхів (int)
        :param area: площа будинку (float, м²)
        """
        self.address = address
        self.floors = floors
        self.area = area

    def get_info(self):
        """
        Повертає інформацію про будинок
        """
        return f"Будинок за адресою {self.address}, {self.floors} поверхів, площа {self.area} м²"

    def calculate_floor_area(self):
        """
        Обчислює площу одного поверху
        """
        if self.floors > 0:
            return self.area / self.floors
        else:
            return 0
