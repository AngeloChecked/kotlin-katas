# Roman Numerals

The Romans were a clever bunch. They conquered most of Europe and ruled it for hundreds of years. They invented concrete and straight roads and even bikinis [1]. One thing they never discovered though was the number zero. This made writing and dating extensive histories of their exploits slightly more challenging, but the system of numbers they came up with is still in use today. For example the BBC uses Roman numerals to date their programmes.

The Romans wrote numbers using letters : I, V, X, L, C, D, M. (notice these letters have lots of straight lines and are hence easy to hack into stone tablets)


Given a positive integer number (eg 42) determine its Roman numeral representation as a String (eg "XLII").

You cannot write numerals like IM for 999. Wikipedia states "Modern Roman numerals are written by expressing each arabic digit separately, starting with the leftmost digit, and skipping any digit with a value of zero."
For example:
```
1990 -> "MCMXC" (1000 -> "M"  + 900 -> "CM" + 90 -> "XC")
2008 -> "MMVIII" (2000 -> "MM" + 8 -> "VIII")
99 -> "XCIX" (90 -> "XC" + 9 -> "IX")
47 -> "XLVII" (40 -> "XL" + 7 -> "VII")
```

The 'digits' are as follows:

|1|10|100|1000|
|---|---|---|---|
"I" -> 1|"X" -> 10|"C" -> 100|"M" -> 1000
"II" -> 2|"XX" -> 20|"CC" -> 200|"MM" -> 2000
"III" -> 3|"XXX" -> 30|"CCC" -> 300|"MMM" -> 3000
"IV" -> 4|"XL" -> 40|"CD" -> 400|"MMMM" -> 4000
"V" -> 5|"L" -> 50|"D" -> 500| 
"VI" -> 6|"LX" -> 60|"DC" -> 600| 
"VII" -> 7|"LXX" -> 70|"DCC" -> 700| 
"VIII" -> 8|"LXXX" -> 80|"DCCC" -> 800| 
"IX" -> 9|"XC" -> 90|"CM" -> 900| 
