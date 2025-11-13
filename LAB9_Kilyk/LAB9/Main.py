# main.py
# Точка входу в програму

from building import Building
from office_center import OfficeCenter


def main():
    # Створюємо об'єкт будинку
    house = Building("вул. Шевченка, 10", 3, 300)
    print(house.get_info())
    print(f"Площа одного поверху: {house.calculate_floor_area():.2f} м²\n")

    # Створюємо об'єкт офісного центру
    office = OfficeCenter("вул. Лесі Українки, 5", 10, 1200, 8)
    print(office.get_info())
    print(f"Середня площа на компанію: {office.average_area_per_company():.2f} м²")

if __name__ == "__main__":
    main()
