def sum_digits():
    num = int(input("Enter a number between 0 and 1000: "))
    if num < 0 or num > 1000:
        print("Number not in range")
        return
    sum = 0
    while num > 0:
        digit = num % 10
        sum += digit
        num = num // 10
    print("The sum of the digits is", sum)

sum_digits()