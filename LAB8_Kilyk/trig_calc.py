import math
import pickle

def calculate_y(x):
    """
    Обчислює y = tg(x)/ctg(x)
    Аргументи:
        x (float) - значення кута в радіанах
    Повертає:
        y (float) - результат обчислення
    """
    try:
        tan_x = math.tan(x)
        cot_x = 1 / math.tan(x)  # ctg(x) = 1 / tg(x)
        y = tan_x / cot_x
        return y
    except ZeroDivisionError:
        print(f"Ділення на нуль при x = {x}")
        return None

def read_numbers_from_file(filename):
    """
    Зчитує числа з текстового файлу.
    Кожне число має бути на окремому рядку.
    """
    numbers = []
    with open(filename, 'r') as f:
        for line in f:
            try:
                numbers.append(float(line.strip()))
            except ValueError:
                continue
    return numbers

def write_results_to_textfile(filename, results):
    """
    Записує результати у текстовий файл
    """
    with open(filename, 'w') as f:
        for x, y in results:
            f.write(f"x={x:.4f}, y={y}\n")

def write_results_to_binaryfile(filename, results):
    """
    Записує результати у двійковий файл за допомогою pickle
    """
    with open(filename, 'wb') as f:
        pickle.dump(results, f)

def read_results_from_binaryfile(filename):
    """
    Зчитує результати з двійкового файлу, збереженого через pickle
    Повертає список кортежів (x, y)
    """
    import pickle
    with open(filename, 'rb') as f:
        results = pickle.load(f)
    return results

def print_binary_results(filename):
    """
    Виводить на екран дані з бінарного файлу
    """
    results = read_results_from_binaryfile(filename)
    print("Результати з бінарного файлу:")
    for x, y in results:
        print(f"x={x:.4f}, y={y}")        

def main():
    input_file = 'input.txt'
    text_output_file = 'results.txt'
    binary_output_file = 'results.bin'

    # Зчитуємо значення x з файлу
    numbers = read_numbers_from_file(input_file)

    # Обчислюємо y для кожного x
    results = []
    for x in numbers:
        y = calculate_y(x)
        if y is not None:
            results.append((x, y))

    # Записуємо результати у текстовий та двійковий файл
    write_results_to_textfile(text_output_file, results)
    write_results_to_binaryfile(binary_output_file, results)

    print("Обчислення завершено. Результати записано у файли.")
    print_binary_results(binary_output_file)

if __name__ == "__main__":
    main()
