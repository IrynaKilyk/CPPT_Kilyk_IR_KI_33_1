# office_center.py
# Похідний клас "Офісний центр" від будинку

from building import Building

class OfficeCenter(Building):
    """
    Похідний клас, що описує офісний центр
    """

    def __init__(self, address, floors, area, company_count):
        """
        Ініціалізація об'єкта офісного центру
        :param company_count: кількість компаній в офісному центрі
        """
        super().__init__(address, floors, area)
        self.company_count = company_count

    def get_info(self):
        """
        Повертає розширену інформацію про офісний центр
        """
        base_info = super().get_info()
        return f"{base_info}, компаній: {self.company_count}"

    def average_area_per_company(self):
        """
        Обчислює середню площу на одну компанію
        """
        if self.company_count > 0:
            return self.area / self.company_count
        else:
            return 0
