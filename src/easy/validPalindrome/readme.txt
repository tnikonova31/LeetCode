Фраза является палиндромом , если после преобразования всех прописных букв в строчные
и удаления всех не буквенно-цифровых символов она читается одинаково вперед и назад.
Буквенно-цифровые символы включают буквы и цифры.

Если задана строка s, возврат, trueесли это палиндром , или falseиначе .


Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
Поскольку пустая строка одинаково читается вперед и назад, это палиндром.