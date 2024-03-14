# Author: Willie M. Bonavente
# BSIT 2-4
x = int(input("Enter number: "))
primes = [i for i in range(2, x + 1) if all(i % j != 0 for j in range(2, int(i**0.5) + 1))]

if x in primes:
  last_prime = primes[-2]  # Get the prime before x (second last element)
else:
  last_prime = primes[-1]  # Get the last prime in the list

print(f"The last prime number before {x} is {last_prime}.")
