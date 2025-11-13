from building import Building

class OfficeCenter(Building):
    def __init__(self, address, floors, area, height, company_count):

        super().__init__(address, floors, area, height)
        self.company_count = company_count

    def get_info(self):
        base_info = super().get_info()
        return f"{base_info}, компаній: {self.company_count}"

    def average_area_per_company(self):
        if self.company_count > 0:
            return self.area / self.company_count
        else:
            return 0
