import math
import pickle

def calculate_y(x):
    """
    Обчислює y = tg(x)/ctg(x)
    """
    try:
        tan_x = math.tan(x)
        if tan_x == 0:
            raise ZeroDivisionError
        
        cot_x = 1 / tan_x 
        
        if cot_x == 0:
            raise ZeroDivisionError

        y = tan_x / cot_x
        return y
    except ZeroDivisionError:
        print(f"Попередження: Ділення на нуль при x = {x:.4f}")
        return None
    except Exception as e:
        print(f"Помилка при x = {x:.4f}: {e}")
        return None

def read_numbers_from_file(filename):
    numbers = []
    try:
        with open(filename, 'r', encoding='utf-8') as f:
            for line in f:
                try:
                    line = line.strip()
                    if line:
                        numbers.append(float(line))
                except ValueError:
                    continue
    except FileNotFoundError:
        print(f"Помилка: Файл {filename} не знайдено.")
    return numbers

def write_results_to_textfile(filename, results):
    """
    Записує результати у текстовий файл з точністю 4 знаки
    """
    try:
        with open(filename, 'w', encoding='utf-8') as f:
            f.write("Результати обчислень (Варіант 10):\n")
            for x, y in results:
                # {:.4f} забезпечує 4 знаки після коми
                f.write(f"x={x:.4f}, y={y:.4f}\n")
        print(f"Текстові дані записано у {filename}")
    except IOError as e:
        print(f"Помилка запису: {e}")

def write_results_to_binaryfile(filename, results):
    """
    Записує результати у бінарний файл (зберігає повну точність)
    """
    try:
        with open(filename, 'wb') as f:
            pickle.dump(results, f)
        print(f"Бінарні дані записано у {filename}")
    except IOError as e:
        print(f"Помилка запису: {e}")

def read_results_from_binaryfile(filename):
    try:
        with open(filename, 'rb') as f:
            results = pickle.load(f)
        return results
    except (IOError, pickle.UnpicklingError) as e:
        return []

def print_binary_results(filename):
    """
    Виводить на екран дані з бінарного файлу з точністю 4 знаки
    """
    results = read_results_from_binaryfile(filename)
    if results:
        print("\n--- Результати ---")
        # Тут додаємо форматування :.4f для обох чисел
        for x, y in results:
            print(f"x={x:.4f}, y={y:.4f}")
    else:
        print("Не вдалося прочитати дані.")

def main():
    input_file = 'input.txt'
    text_output_file = 'results.txt'
    binary_output_file = 'results.bin'

    numbers = read_numbers_from_file(input_file)
    
    if not numbers:
        return

    results = []
    for x in numbers:
        y = calculate_y(x)
        if y is not None:
            results.append((x, y))

    write_results_to_textfile(text_output_file, results)
    write_results_to_binaryfile(binary_output_file, results)

    print_binary_results(binary_output_file)

if __name__ == "__main__":
    main()