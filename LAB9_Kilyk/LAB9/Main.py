from building import Building
from office_center import OfficeCenter

def main():

    house = Building("вул. Шевченка, 5|", 2, 300, 6)
    house_info = (
        f"{house.get_info()}n"
        f"{house.calculate_floor_area():.2f}м²"
    )

    office = OfficeCenter("вул. Лесі Українки, 12|", 10, 1200, 30, 8)
    office_info = (
        f"{office.get_info()}\n"
        f"Середня площа на компанію: {office.average_area_per_company():.2f} м²"
    )
    print(house_info,"~ Будинок ~", ) 
    print(office_info,"~ Офісний центр ~",)

if __name__ == "__main__":
    main()
