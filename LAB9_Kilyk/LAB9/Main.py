from building import Building
from office_center import OfficeCenter
from rich.console import Console
from rich.panel import Panel

def main():
    console = Console()

    house = Building("вул. Шевченка, 5|", 2, 300, 6)
    house_info = (
        f"[bold cyan]{house.get_info()}[/bold cyan]\n"
        f"Площа одного поверху: [green]{house.calculate_floor_area():.2f}[/green] м²"
    )

    office = OfficeCenter("вул. Лесі Українки, 12|", 10, 1200, 30, 8)
    office_info = (
        f"[bold cyan]{office.get_info()}[/bold cyan]\n"
        f"Середня площа на компанію: [green]{office.average_area_per_company():.2f}[/green] м²"
    )

    console.print(Panel(house_info, title="[bold white]Житловий будинок[/bold white]", border_style="cyan", expand=False))
    console.print()  
    console.print(Panel(office_info, title="[bold white]Офісний центр[/bold white]", border_style="cyan", expand=False))

if __name__ == "__main__":
    main()
