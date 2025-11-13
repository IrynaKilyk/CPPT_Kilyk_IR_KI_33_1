def right_triangle(n, symbol='*'):
    for i in range(1, n + 1):
        print((symbol * i).rjust(n))


def main():
    symbol = input("Введіть символ-заповнювач: ").strip()

    if not symbol:
        print("Йой, це пустота")
        return

    if len(symbol) != 1:
        print("Трішки забагато")
        return

    try:
        n = int(input("Введіть висоту трикутника: "))
        if n <= 0:
            print("Висота має бути додатня")
            return
    except ValueError:
        print("Це не число")
        return

    right_triangle(n, symbol)


if __name__ == "__main__":
    main()
