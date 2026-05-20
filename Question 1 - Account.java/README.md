# Question 1: [Account.java]
## My Approach
I do believe my version isn't the most optimized, but that's what I put on the AP exam, so I'll put it here too. 

Part 1a of Question 1 was fairly straightforward in my opinion. All it required was checking if the inputted username was available, and if not, replacing consecutive numbers at the end of the username until it becomes available. Since the constructer required to keep changing something until it was right, the best option was to use the while loop.

Part 1b of Question 1 was more challenging, to be honest I'm not even sure if it works for all cases with preconditions. I think it would have been better to use .split on the username on each hyphen, then adding the strings in the new array without their last indexes, other than the last one. But I think my way might get the job done.
