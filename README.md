# Encryption-Decryption
[JetBrains Academy](https://hyperskill.org) / Java Developer project.
[My profile -> Pozadr](https://hyperskill.org/profile/17362185 "Pozadr")

Source code: *JBA_Encryption_Decryption/Encryption-Decryption/task/src/encryptdecrypt/*

## Description
Program uses shift or unicode algorithm to encode/decode massage from input String or text file.

**Patterns used:** 
* Strategy
* Factory method

##### Shift:
Shift algorithm encodes/decodes only letters (from 'a' to 'z' as the first circle and from 'A' to 'Z' as the second 
circle i.e. after 'z' comes 'a' and after 'Z" comes 'A') using key(Integer) variable.

##### Unicode:
Shift algorithm encodes/decodes all signs from ASCII table using key(Integer) variable.

##### How to run:

User should input data before program run using *String[] args*. 

**Input description:**
* -mode --> *enc, dec*
* -key --> *Integer*
* -in --> *String* or *path to .txt file*
* -out --> *String* or *path to .txt file*

**Example 1:**

    java encryptdecrypt.Main -mode enc -in road_to_treasure.txt -out protected.txt -key 5 -alg unicode
This command must get data from the file road_to_treasure.txt, encrypt the data with the key 5, create a file called protected.txt and write ciphertext to it.

**Example 2:**

    Input:
    
    java Main -mode enc -key 5 -data "Welcome to hyperskill!" -alg unicode
    
    Output:
    
    \jqhtrj%yt%m~ujwxpnqq&
    
**Example 3**

    Input:
    
    java Main -key 5 -alg unicode -data "\jqhtrj%yt%m~ujwxpnqq&" -mode dec
    
    Output:
    
    Welcome to hyperskill!

**Exceptions:**

1. If there is no -mode, the program works in enc mode.
2. If there is no -key, the program considers that key = 0.
3. If there is no -data, and there is no -in the program assumes that the data is an empty string.
4. If there is no -out argument, the program prints data to the standard output.
5. If there are both -data and -in arguments, your program prefers -data over -in.
6. If there is no -alg program uses shift algorithm.



