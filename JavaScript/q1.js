function reverseWords(sentence) {
    return sentence.split(' ').map(word => word.split('').reverse().join('')).join(' ');
}

// Example usage:
const inputSentence = prompt("Write Your Sentence",'');
const reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence);
